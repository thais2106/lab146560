
package br.univel.VendaJaxWSclient;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VendaJaxWSService", targetNamespace = "http://servlet.univel.br/", wsdlLocation = "http://localhost:8080/lab146560/VendaJaxWS?wsdl")
public class VendaJaxWSService
    extends Service
{

    private final static URL VENDAJAXWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException VENDAJAXWSSERVICE_EXCEPTION;
    private final static QName VENDAJAXWSSERVICE_QNAME = new QName("http://servlet.univel.br/", "VendaJaxWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/lab146560/VendaJaxWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VENDAJAXWSSERVICE_WSDL_LOCATION = url;
        VENDAJAXWSSERVICE_EXCEPTION = e;
    }

    public VendaJaxWSService() {
        super(__getWsdlLocation(), VENDAJAXWSSERVICE_QNAME);
    }

    public VendaJaxWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VENDAJAXWSSERVICE_QNAME, features);
    }

    public VendaJaxWSService(URL wsdlLocation) {
        super(wsdlLocation, VENDAJAXWSSERVICE_QNAME);
    }

    public VendaJaxWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VENDAJAXWSSERVICE_QNAME, features);
    }

    public VendaJaxWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VendaJaxWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VendaJaxWS
     */
    @WebEndpoint(name = "VendaJaxWSPort")
    public VendaJaxWS getVendaJaxWSPort() {
        return super.getPort(new QName("http://servlet.univel.br/", "VendaJaxWSPort"), VendaJaxWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VendaJaxWS
     */
    @WebEndpoint(name = "VendaJaxWSPort")
    public VendaJaxWS getVendaJaxWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servlet.univel.br/", "VendaJaxWSPort"), VendaJaxWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VENDAJAXWSSERVICE_EXCEPTION!= null) {
            throw VENDAJAXWSSERVICE_EXCEPTION;
        }
        return VENDAJAXWSSERVICE_WSDL_LOCATION;
    }

}
