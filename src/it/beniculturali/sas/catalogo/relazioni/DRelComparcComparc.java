//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.18 at 11:10:43 AM CET 
//


package it.beniculturali.sas.catalogo.relazioni;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://sas.beniculturali.it/catalogo/relazioni}codi_provenienza_comparc"/>
 *         &lt;element ref="{http://sas.beniculturali.it/catalogo/relazioni}codi_provenienza_comparc_sup"/>
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
    "codiProvenienzaComparc",
    "codiProvenienzaComparcSup"
})
@XmlRootElement(name = "d_rel_comparc_comparc")
public class DRelComparcComparc {

    @XmlElement(name = "codi_provenienza_comparc", required = true)
    protected String codiProvenienzaComparc;
    @XmlElement(name = "codi_provenienza_comparc_sup", required = true)
    protected String codiProvenienzaComparcSup;

    /**
     * Gets the value of the codiProvenienzaComparc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiProvenienzaComparc() {
        return codiProvenienzaComparc;
    }

    /**
     * Sets the value of the codiProvenienzaComparc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiProvenienzaComparc(String value) {
        this.codiProvenienzaComparc = value;
    }

    /**
     * Gets the value of the codiProvenienzaComparcSup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiProvenienzaComparcSup() {
        return codiProvenienzaComparcSup;
    }

    /**
     * Sets the value of the codiProvenienzaComparcSup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiProvenienzaComparcSup(String value) {
        this.codiProvenienzaComparcSup = value;
    }

}
