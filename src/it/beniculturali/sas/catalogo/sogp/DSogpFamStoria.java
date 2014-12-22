//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.18 at 11:10:43 AM CET 
//


package it.beniculturali.sas.catalogo.sogp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="text_storia">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2147483647"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="text_titolo_url" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="250"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="text_url">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1024"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="text_descr_url" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1024"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="date_url" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="-4713-01-01"/>
 *               &lt;maxInclusive value="5874897-12-31"/>
 *               &lt;pattern value="\p{Nd}{4}-\p{Nd}{2}-\p{Nd}{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "textStoria",
    "textTitoloUrl",
    "textUrl",
    "textDescrUrl",
    "dateUrl"
})
@XmlRootElement(name = "d_sogp_fam_storia")
public class DSogpFamStoria {

    @XmlElement(name = "text_storia", required = true, nillable = true)
    protected String textStoria;
    @XmlElementRef(name = "text_titolo_url", namespace = "http://sas.beniculturali.it/catalogo/sogp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textTitoloUrl;
    @XmlElement(name = "text_url", required = true)
    protected String textUrl;
    @XmlElementRef(name = "text_descr_url", namespace = "http://sas.beniculturali.it/catalogo/sogp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textDescrUrl;
    @XmlElementRef(name = "date_url", namespace = "http://sas.beniculturali.it/catalogo/sogp", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateUrl;

    /**
     * Gets the value of the textStoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextStoria() {
        return textStoria;
    }

    /**
     * Sets the value of the textStoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextStoria(String value) {
        this.textStoria = value;
    }

    /**
     * Gets the value of the textTitoloUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextTitoloUrl() {
        return textTitoloUrl;
    }

    /**
     * Sets the value of the textTitoloUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextTitoloUrl(JAXBElement<String> value) {
        this.textTitoloUrl = value;
    }

    /**
     * Gets the value of the textUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextUrl() {
        return textUrl;
    }

    /**
     * Sets the value of the textUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextUrl(String value) {
        this.textUrl = value;
    }

    /**
     * Gets the value of the textDescrUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextDescrUrl() {
        return textDescrUrl;
    }

    /**
     * Sets the value of the textDescrUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextDescrUrl(JAXBElement<String> value) {
        this.textDescrUrl = value;
    }

    /**
     * Gets the value of the dateUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateUrl() {
        return dateUrl;
    }

    /**
     * Sets the value of the dateUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateUrl(JAXBElement<XMLGregorianCalendar> value) {
        this.dateUrl = value;
    }

}
