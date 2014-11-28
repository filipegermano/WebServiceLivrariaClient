
package br.edu.ifpb.pos.webservicelivrariaclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.webservicelivrariaclient package. 
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

    private final static QName _SalvarResponse_QNAME = new QName("http://webservicelivraria.pos.ifpb.edu.br/", "salvarResponse");
    private final static QName _RecuperarLivro_QNAME = new QName("http://webservicelivraria.pos.ifpb.edu.br/", "recuperarLivro");
    private final static QName _LocalizarLivrosResponse_QNAME = new QName("http://webservicelivraria.pos.ifpb.edu.br/", "localizarLivrosResponse");
    private final static QName _RecuperarLivroResponse_QNAME = new QName("http://webservicelivraria.pos.ifpb.edu.br/", "recuperarLivroResponse");
    private final static QName _LocalizarLivros_QNAME = new QName("http://webservicelivraria.pos.ifpb.edu.br/", "localizarLivros");
    private final static QName _Salvar_QNAME = new QName("http://webservicelivraria.pos.ifpb.edu.br/", "salvar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.webservicelivrariaclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecuperarLivro }
     * 
     */
    public RecuperarLivro createRecuperarLivro() {
        return new RecuperarLivro();
    }

    /**
     * Create an instance of {@link SalvarResponse }
     * 
     */
    public SalvarResponse createSalvarResponse() {
        return new SalvarResponse();
    }

    /**
     * Create an instance of {@link LocalizarLivrosResponse }
     * 
     */
    public LocalizarLivrosResponse createLocalizarLivrosResponse() {
        return new LocalizarLivrosResponse();
    }

    /**
     * Create an instance of {@link LocalizarLivros }
     * 
     */
    public LocalizarLivros createLocalizarLivros() {
        return new LocalizarLivros();
    }

    /**
     * Create an instance of {@link RecuperarLivroResponse }
     * 
     */
    public RecuperarLivroResponse createRecuperarLivroResponse() {
        return new RecuperarLivroResponse();
    }

    /**
     * Create an instance of {@link Salvar }
     * 
     */
    public Salvar createSalvar() {
        return new Salvar();
    }

    /**
     * Create an instance of {@link Livro }
     * 
     */
    public Livro createLivro() {
        return new Livro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicelivraria.pos.ifpb.edu.br/", name = "salvarResponse")
    public JAXBElement<SalvarResponse> createSalvarResponse(SalvarResponse value) {
        return new JAXBElement<SalvarResponse>(_SalvarResponse_QNAME, SalvarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarLivro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicelivraria.pos.ifpb.edu.br/", name = "recuperarLivro")
    public JAXBElement<RecuperarLivro> createRecuperarLivro(RecuperarLivro value) {
        return new JAXBElement<RecuperarLivro>(_RecuperarLivro_QNAME, RecuperarLivro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalizarLivrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicelivraria.pos.ifpb.edu.br/", name = "localizarLivrosResponse")
    public JAXBElement<LocalizarLivrosResponse> createLocalizarLivrosResponse(LocalizarLivrosResponse value) {
        return new JAXBElement<LocalizarLivrosResponse>(_LocalizarLivrosResponse_QNAME, LocalizarLivrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarLivroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicelivraria.pos.ifpb.edu.br/", name = "recuperarLivroResponse")
    public JAXBElement<RecuperarLivroResponse> createRecuperarLivroResponse(RecuperarLivroResponse value) {
        return new JAXBElement<RecuperarLivroResponse>(_RecuperarLivroResponse_QNAME, RecuperarLivroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalizarLivros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicelivraria.pos.ifpb.edu.br/", name = "localizarLivros")
    public JAXBElement<LocalizarLivros> createLocalizarLivros(LocalizarLivros value) {
        return new JAXBElement<LocalizarLivros>(_LocalizarLivros_QNAME, LocalizarLivros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Salvar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicelivraria.pos.ifpb.edu.br/", name = "salvar")
    public JAXBElement<Salvar> createSalvar(Salvar value) {
        return new JAXBElement<Salvar>(_Salvar_QNAME, Salvar.class, null, value);
    }

}
