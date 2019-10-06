package com.roma.elettorale.fascicoli.configuration;


import com.roma.elettorale.fascicoli.extensions.LogHttpHeaderClientInterceptor;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.ws.security.WSConstants;
import org.apache.xml.security.utils.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;
import org.springframework.ws.transport.http.HttpComponentsMessageSender.RemoveSoapHeadersInterceptor;

import javax.net.ssl.SSLContext;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SoapClientPAPConfig {

    @Autowired
    Environment env;


    @Value("${client.default-uri}")
    private String defaultUri;

    @Value("${client.ssl.trust-store}")
    private Resource trustStore;

    @Value("${client.ssl.trust-store-password}")
    private String trustStorePassword;

    @Bean
    public Wss4jSecurityInterceptor securityInterceptor() throws Exception{

        String key = "comunediroma2007";
        //   String uname = env.getProperty("PortalAccount");
        //   String upwd = env.getProperty("PortalPassword");
        //  String username = transformationFile.Decrypt(uname,key);
        //  String password = transformationFile.Decrypt(upwd,key);
        // String password = env.getProperty("PortalPassword1");
        ///  String username = env.getProperty("PortalAccount1");
        String username = "PortaInterna1";
        String password = "nuovapanet1cdr";
        String passwordFinal = password;
        byte[] b = password.getBytes("UTF-8");
        MessageDigest sha = null;
        try {
            sha = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        sha.reset();
        sha.update(b);
        String passwordhash = (Base64.encode(sha.digest()));
        // passwordCallBack = new PasswordCallBack();
        Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
        wss4jSecurityInterceptor.setSecurementUsername(username);
        wss4jSecurityInterceptor.setSecurementPasswordType(WSConstants.PW_TEXT);
        wss4jSecurityInterceptor.setSecurementPassword(passwordhash);
        wss4jSecurityInterceptor.setSecurementActions("Timestamp UsernameToken");
        wss4jSecurityInterceptor.setSecurementUsernameTokenCreated(true);
        wss4jSecurityInterceptor.setSecurementUsernameTokenNonce(true);
        return wss4jSecurityInterceptor;
    }


    public Jaxb2Marshaller jaxb2Marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller
                .setContextPath("com.roma.elettorale.fascicoli.entity.pap");

        return jaxb2Marshaller;
    }



    @Bean
    public WebServiceTemplate webServiceTemplate() throws Exception {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(jaxb2Marshaller());
        webServiceTemplate.setUnmarshaller(jaxb2Marshaller());
        webServiceTemplate.setDefaultUri(defaultUri);
        ClientInterceptor[] interceptors;
        interceptors = new ClientInterceptor[]{
                securityInterceptor(),new LogHttpHeaderClientInterceptor()
        };
        webServiceTemplate.setInterceptors(interceptors);
        return webServiceTemplate;
    }

    @Bean
    public HttpComponentsMessageSender httpComponentsMessageSender() throws Exception {
        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
        httpComponentsMessageSender.setHttpClient(httpClient());

        return httpComponentsMessageSender;
    }

    public HttpClient httpClient() throws Exception {
        return HttpClientBuilder.create().setSSLSocketFactory(sslConnectionSocketFactory())
                .addInterceptorFirst(new RemoveSoapHeadersInterceptor()).build();
    }

    public SSLConnectionSocketFactory sslConnectionSocketFactory() throws Exception {
        // NoopHostnameVerifier essentially turns hostname verification off as otherwise following error
        // is thrown: java.security.cert.CertificateException: No name matching localhost found
        return new SSLConnectionSocketFactory(sslContext(), NoopHostnameVerifier.INSTANCE);
    }

    public SSLContext sslContext() throws Exception {
        return SSLContextBuilder.create()
                .loadTrustMaterial(trustStore.getFile(), trustStorePassword.toCharArray()).build();
    }

}
