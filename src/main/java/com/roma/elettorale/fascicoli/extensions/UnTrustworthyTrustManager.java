package com.roma.elettorale.fascicoli.extensions;


import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class UnTrustworthyTrustManager
        implements X509TrustManager
{
    public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}
    public void checkServerTrusted(X509Certificate[] arg0, String arg1)throws CertificateException {}
    public X509Certificate[] getAcceptedIssuers() { return null; }
}