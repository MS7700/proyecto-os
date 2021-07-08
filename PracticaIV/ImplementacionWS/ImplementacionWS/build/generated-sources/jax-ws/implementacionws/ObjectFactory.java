
package implementacionws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the implementacionws package. 
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

    private final static QName _ListarPagoResponse_QNAME = new QName("http://WebService/", "listarPagoResponse");
    private final static QName _ListarResponse_QNAME = new QName("http://WebService/", "listarResponse");
    private final static QName _ListarPago2Response_QNAME = new QName("http://WebService/", "listarPago2Response");
    private final static QName _Listar_QNAME = new QName("http://WebService/", "listar");
    private final static QName _ListarPago_QNAME = new QName("http://WebService/", "listarPago");
    private final static QName _ListarPago2_QNAME = new QName("http://WebService/", "listarPago2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: implementacionws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarPago2 }
     * 
     */
    public ListarPago2 createListarPago2() {
        return new ListarPago2();
    }

    /**
     * Create an instance of {@link ListarPago }
     * 
     */
    public ListarPago createListarPago() {
        return new ListarPago();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link ListarPago2Response }
     * 
     */
    public ListarPago2Response createListarPago2Response() {
        return new ListarPago2Response();
    }

    /**
     * Create an instance of {@link ListarPagoResponse }
     * 
     */
    public ListarPagoResponse createListarPagoResponse() {
        return new ListarPagoResponse();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link Pago }
     * 
     */
    public Pago createPago() {
        return new Pago();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "listarPagoResponse")
    public JAXBElement<ListarPagoResponse> createListarPagoResponse(ListarPagoResponse value) {
        return new JAXBElement<ListarPagoResponse>(_ListarPagoResponse_QNAME, ListarPagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPago2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "listarPago2Response")
    public JAXBElement<ListarPago2Response> createListarPago2Response(ListarPago2Response value) {
        return new JAXBElement<ListarPago2Response>(_ListarPago2Response_QNAME, ListarPago2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "listarPago")
    public JAXBElement<ListarPago> createListarPago(ListarPago value) {
        return new JAXBElement<ListarPago>(_ListarPago_QNAME, ListarPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPago2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "listarPago2")
    public JAXBElement<ListarPago2> createListarPago2(ListarPago2 value) {
        return new JAXBElement<ListarPago2>(_ListarPago2_QNAME, ListarPago2 .class, null, value);
    }

}
