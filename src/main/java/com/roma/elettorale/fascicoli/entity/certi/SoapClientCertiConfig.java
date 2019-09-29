package com.roma.elettorale.fascicoli.entity.certi;

import com.roma.elettorale.fascicoli.extensions.LogHttpHeaderClientInterceptor;
import com.roma.elettorale.fascicoli.service.PasswordCallBack;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Configuration
public class SoapClientCertiConfig {

    @Autowired
    Environment env;

   // @Autowired
   // PasswordCallBack passwordCallBack;




    @Bean
    public Wss4jSecurityInterceptor securityInterceptor() throws Exception{

        String key = "comunediroma2007";
        //   String uname = env.getProperty("PortalAccount");
        //   String upwd = env.getProperty("PortalPassword");
        //  String username = transformationFile.Decrypt(uname,key);
        //  String password = transformationFile.Decrypt(upwd,key);
       // String password = env.getProperty("PortalPassword1");
      ///  String username = env.getProperty("PortalAccount1");
        String username = "POSTEGOV";
        String password = "HwREd7uQ5A";
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
                .setContextPath("com.roma.elettorale.fascicoli.entity.certi");

        return jaxb2Marshaller;
    }



    @Bean
    public WebServiceTemplate webServiceTemplate() throws Exception {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(jaxb2Marshaller());
        webServiceTemplate.setUnmarshaller(jaxb2Marshaller());
        ClientInterceptor[] interceptors;
        interceptors = new ClientInterceptor[]{
            securityInterceptor(),new LogHttpHeaderClientInterceptor()
        };
        webServiceTemplate.setInterceptors(interceptors);
        return webServiceTemplate;
    }
}
