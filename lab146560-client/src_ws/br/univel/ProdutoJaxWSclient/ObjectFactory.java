
package br.univel.ProdutoJaxWSclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.univel.ProdutoJaxWSclient package. 
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

    private final static QName _DeleteProduto_QNAME = new QName("http://webservice.univel.br/", "deleteProduto");
    private final static QName _ReadAllResponse_QNAME = new QName("http://webservice.univel.br/", "readAllResponse");
    private final static QName _UpdateProdutoResponse_QNAME = new QName("http://webservice.univel.br/", "updateProdutoResponse");
    private final static QName _UpdateProduto_QNAME = new QName("http://webservice.univel.br/", "updateProduto");
    private final static QName _DeleteProdutoResponse_QNAME = new QName("http://webservice.univel.br/", "deleteProdutoResponse");
    private final static QName _ReadProdutoResponse_QNAME = new QName("http://webservice.univel.br/", "readProdutoResponse");
    private final static QName _CreateProdutoResponse_QNAME = new QName("http://webservice.univel.br/", "createProdutoResponse");
    private final static QName _ReadAll_QNAME = new QName("http://webservice.univel.br/", "readAll");
    private final static QName _ReadProduto_QNAME = new QName("http://webservice.univel.br/", "readProduto");
    private final static QName _CreateProduto_QNAME = new QName("http://webservice.univel.br/", "createProduto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.univel.ProdutoJaxWSclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadAllResponse }
     * 
     */
    public ReadAllResponse createReadAllResponse() {
        return new ReadAllResponse();
    }

    /**
     * Create an instance of {@link UpdateProdutoResponse }
     * 
     */
    public UpdateProdutoResponse createUpdateProdutoResponse() {
        return new UpdateProdutoResponse();
    }

    /**
     * Create an instance of {@link UpdateProduto }
     * 
     */
    public UpdateProduto createUpdateProduto() {
        return new UpdateProduto();
    }

    /**
     * Create an instance of {@link DeleteProduto }
     * 
     */
    public DeleteProduto createDeleteProduto() {
        return new DeleteProduto();
    }

    /**
     * Create an instance of {@link ReadProduto }
     * 
     */
    public ReadProduto createReadProduto() {
        return new ReadProduto();
    }

    /**
     * Create an instance of {@link CreateProduto }
     * 
     */
    public CreateProduto createCreateProduto() {
        return new CreateProduto();
    }

    /**
     * Create an instance of {@link DeleteProdutoResponse }
     * 
     */
    public DeleteProdutoResponse createDeleteProdutoResponse() {
        return new DeleteProdutoResponse();
    }

    /**
     * Create an instance of {@link ReadProdutoResponse }
     * 
     */
    public ReadProdutoResponse createReadProdutoResponse() {
        return new ReadProdutoResponse();
    }

    /**
     * Create an instance of {@link CreateProdutoResponse }
     * 
     */
    public CreateProdutoResponse createCreateProdutoResponse() {
        return new CreateProdutoResponse();
    }

    /**
     * Create an instance of {@link ReadAll }
     * 
     */
    public ReadAll createReadAll() {
        return new ReadAll();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "deleteProduto")
    public JAXBElement<DeleteProduto> createDeleteProduto(DeleteProduto value) {
        return new JAXBElement<DeleteProduto>(_DeleteProduto_QNAME, DeleteProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "readAllResponse")
    public JAXBElement<ReadAllResponse> createReadAllResponse(ReadAllResponse value) {
        return new JAXBElement<ReadAllResponse>(_ReadAllResponse_QNAME, ReadAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "updateProdutoResponse")
    public JAXBElement<UpdateProdutoResponse> createUpdateProdutoResponse(UpdateProdutoResponse value) {
        return new JAXBElement<UpdateProdutoResponse>(_UpdateProdutoResponse_QNAME, UpdateProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "updateProduto")
    public JAXBElement<UpdateProduto> createUpdateProduto(UpdateProduto value) {
        return new JAXBElement<UpdateProduto>(_UpdateProduto_QNAME, UpdateProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "deleteProdutoResponse")
    public JAXBElement<DeleteProdutoResponse> createDeleteProdutoResponse(DeleteProdutoResponse value) {
        return new JAXBElement<DeleteProdutoResponse>(_DeleteProdutoResponse_QNAME, DeleteProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "readProdutoResponse")
    public JAXBElement<ReadProdutoResponse> createReadProdutoResponse(ReadProdutoResponse value) {
        return new JAXBElement<ReadProdutoResponse>(_ReadProdutoResponse_QNAME, ReadProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "createProdutoResponse")
    public JAXBElement<CreateProdutoResponse> createCreateProdutoResponse(CreateProdutoResponse value) {
        return new JAXBElement<CreateProdutoResponse>(_CreateProdutoResponse_QNAME, CreateProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "readAll")
    public JAXBElement<ReadAll> createReadAll(ReadAll value) {
        return new JAXBElement<ReadAll>(_ReadAll_QNAME, ReadAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "readProduto")
    public JAXBElement<ReadProduto> createReadProduto(ReadProduto value) {
        return new JAXBElement<ReadProduto>(_ReadProduto_QNAME, ReadProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.univel.br/", name = "createProduto")
    public JAXBElement<CreateProduto> createCreateProduto(CreateProduto value) {
        return new JAXBElement<CreateProduto>(_CreateProduto_QNAME, CreateProduto.class, null, value);
    }

}
