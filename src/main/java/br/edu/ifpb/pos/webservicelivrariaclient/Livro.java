
package br.edu.ifpb.pos.webservicelivrariaclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de livro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="livro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroPaginas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="preco" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "livro", propOrder = {
    "numeroPaginas",
    "preco",
    "titulo"
})
public class Livro {

    protected Integer numeroPaginas;
    protected Double preco;
    protected String titulo;

    /**
     * Obtém o valor da propriedade numeroPaginas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    /**
     * Define o valor da propriedade numeroPaginas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroPaginas(Integer value) {
        this.numeroPaginas = value;
    }

    /**
     * Obtém o valor da propriedade preco.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * Define o valor da propriedade preco.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreco(Double value) {
        this.preco = value;
    }

    /**
     * Obtém o valor da propriedade titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

}
