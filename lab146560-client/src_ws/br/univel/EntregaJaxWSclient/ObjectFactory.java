
package br.univel.EntregaJaxWSclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.univel.EntregaJaxWSclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OperacaoEntrega_QNAME = new QName("http://servlet.univel.br/", "operacaoEntrega");
    private final static QName _OperacaoEntregaResponse_QNAME = new QName("http://servlet.univel.br/", "operacaoEntregaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.univel.EntregaJaxWSclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperacaoEntrega }
     * 
     */
    public OperacaoEntrega createOperacaoEntrega() {
        return new OperacaoEntrega();
    }

    /**
     * Create an instance of {@link OperacaoEntregaResponse }
     * 
     */
    public OperacaoEntregaResponse createOperacaoEntregaResponse() {
        return new OperacaoEntregaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacaoEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servlet.univel.br/", name = "operacaoEntrega")
    public JAXBElement<OperacaoEntrega> createOperacaoEntrega(OperacaoEntrega value) {
        return new JAXBElement<OperacaoEntrega>(_OperacaoEntrega_QNAME, OperacaoEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacaoEntregaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servlet.univel.br/", name = "operacaoEntregaResponse")
    public JAXBElement<OperacaoEntregaResponse> createOperacaoEntregaResponse(OperacaoEntregaResponse value) {
        return new JAXBElement<OperacaoEntregaResponse>(_OperacaoEntregaResponse_QNAME, OperacaoEntregaResponse.class, null, value);
    }

}
