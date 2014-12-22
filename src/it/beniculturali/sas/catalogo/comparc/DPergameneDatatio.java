//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.18 at 11:10:43 AM CET 
//


package it.beniculturali.sas.catalogo.comparc;

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
 *         &lt;element name="text_datatio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="2147483647"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="date_inizio" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="-4713-01-01"/>
 *               &lt;maxInclusive value="5874897-12-31"/>
 *               &lt;pattern value="\p{Nd}{4}-\p{Nd}{2}-\p{Nd}{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="date_fine" minOccurs="0">
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
    "textDatatio",
    "dateInizio",
    "dateFine"
})
@XmlRootElement(name = "d_pergamene_datatio")
public class DPergameneDatatio {

    @XmlElement(name = "text_datatio", required = true)
    protected String textDatatio;
    @XmlElementRef(name = "date_inizio", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateInizio;
    @XmlElementRef(name = "date_fine", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateFine;

    /**
     * Gets the value of the textDatatio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextDatatio() {
        return textDatatio;
    }

    /**
     * Sets the value of the textDatatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextDatatio(String value) {
        this.textDatatio = value;
    }

    /**
     * Gets the value of the dateInizio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateInizio() {
        return dateInizio;
    }

    /**
     * Sets the value of the dateInizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateInizio(JAXBElement<XMLGregorianCalendar> value) {
        this.dateInizio = value;
    }

    /**
     * Gets the value of the dateFine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateFine() {
        return dateFine;
    }

    /**
     * Sets the value of the dateFine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateFine(JAXBElement<XMLGregorianCalendar> value) {
        this.dateFine = value;
    }

}
