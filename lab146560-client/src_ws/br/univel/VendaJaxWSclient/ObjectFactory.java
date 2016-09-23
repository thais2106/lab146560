
package br.univel.VendaJaxWSclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.univel.VendaJaxWSclient package. 
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

    private final static QName _OperacaoVenda_QNAME = new QName("http://servlet.univel.br/", "operacaoVenda");
    private final static QName _OperacaoVendaResponse_QNAME = new QName("http://servlet.univel.br/", "operacaoVendaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.univel.VendaJaxWSclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperacaoVenda }
     * 
     */
    public OperacaoVenda createOperacaoVenda() {
        return new OperacaoVenda();
    }

    /**
     * Create an instance of {@link OperacaoVendaResponse }
     * 
     */
    public OperacaoVendaResponse createOperacaoVendaResponse() {
        return new OperacaoVendaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacaoVenda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servlet.univel.br/", name = "operacaoVenda")
    public JAXBElement<OperacaoVenda> createOperacaoVenda(OperacaoVenda value) {
        return new JAXBElement<OperacaoVenda>(_OperacaoVenda_QNAME, OperacaoVenda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacaoVendaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servlet.univel.br/", name = "operacaoVendaResponse")
    public JAXBElement<OperacaoVendaResponse> createOperacaoVendaResponse(OperacaoVendaResponse value) {
        return new JAXBElement<OperacaoVendaResponse>(_OperacaoVendaResponse_QNAME, OperacaoVendaResponse.class, null, value);
    }

}
