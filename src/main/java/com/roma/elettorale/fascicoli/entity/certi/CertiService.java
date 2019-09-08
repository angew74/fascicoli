
package com.roma.elettorale.fascicoli.entity.certi;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CertiService", targetNamespace = "http://www.comune.roma.it/certificati", wsdlLocation = "file:/C:/Users/Nick/Documents/javaprojects/ElezioniIdeaProject/fascicoli/src/main/resources/wsdl/Certiws.wsdl")
public class CertiService
    extends Service
{

    private final static URL CERTISERVICE_WSDL_LOCATION;
    private final static WebServiceException CERTISERVICE_EXCEPTION;
    private final static QName CERTISERVICE_QNAME = new QName("http://www.comune.roma.it/certificati", "CertiService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Nick/Documents/javaprojects/ElezioniIdeaProject/fascicoli/src/main/resources/wsdl/Certiws.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CERTISERVICE_WSDL_LOCATION = url;
        CERTISERVICE_EXCEPTION = e;
    }

    public CertiService() {
        super(__getWsdlLocation(), CERTISERVICE_QNAME);
    }

    public CertiService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CERTISERVICE_QNAME, features);
    }

    public CertiService(URL wsdlLocation) {
        super(wsdlLocation, CERTISERVICE_QNAME);
    }

    public CertiService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CERTISERVICE_QNAME, features);
    }

    public CertiService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CertiService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ComuneCertificatiBinding
     */
    @WebEndpoint(name = "ComuneCertificatiBinding")
    public ComuneCertificatiBinding getComuneCertificatiBinding() {
        return super.getPort(new QName("http://www.comune.roma.it/certificati", "ComuneCertificatiBinding"), ComuneCertificatiBinding.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ComuneCertificatiBinding
     */
    @WebEndpoint(name = "ComuneCertificatiBinding")
    public ComuneCertificatiBinding getComuneCertificatiBinding(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.comune.roma.it/certificati", "ComuneCertificatiBinding"), ComuneCertificatiBinding.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CERTISERVICE_EXCEPTION!= null) {
            throw CERTISERVICE_EXCEPTION;
        }
        return CERTISERVICE_WSDL_LOCATION;
    }

}