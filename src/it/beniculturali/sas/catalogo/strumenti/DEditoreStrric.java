//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.27 at 02:03:47 PM CET 
//


package it.beniculturali.sas.catalogo.strumenti;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.beniculturali.sas.catalogo.commons.DCompilatore;
import it.beniculturali.sas.catalogo.commons.DUrl;
import it.beniculturali.sas.catalogo.fonti.ProfGroup;


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
 *         &lt;element name="codi_provenienza">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="text_anagrafica_editore">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fk_fonte">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://sas.beniculturali.it/catalogo/fonti}prof_group"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="text_note" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2147483647"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://sas.beniculturali.it/catalogo/commons}d_url" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://sas.beniculturali.it/catalogo/commons}d_compilatore" maxOccurs="unbounded" minOccurs="0"/>
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
    "codiProvenienza",
    "textAnagraficaEditore",
    "fkFonte",
    "textNote",
    "dUrl",
    "dCompilatore"
})
@XmlRootElement(name = "d_editore_strric")
public class DEditoreStrric {

    @XmlElement(name = "codi_provenienza", required = true)
    protected String codiProvenienza;
    @XmlElement(name = "text_anagrafica_editore", required = true)
    protected String textAnagraficaEditore;
    @XmlElement(name = "fk_fonte", required = true, nillable = true)
    protected DEditoreStrric.FkFonte fkFonte;
    @XmlElementRef(name = "text_note", namespace = "http://sas.beniculturali.it/catalogo/strumenti", type = JAXBElement.class)
    protected JAXBElement<String> textNote;
    @XmlElement(name = "d_url", namespace = "http://sas.beniculturali.it/catalogo/commons")
    protected List<DUrl> dUrl;
    @XmlElement(name = "d_compilatore", namespace = "http://sas.beniculturali.it/catalogo/commons")
    protected List<DCompilatore> dCompilatore;

    /**
     * Gets the value of the codiProvenienza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiProvenienza() {
        return codiProvenienza;
    }

    /**
     * Sets the value of the codiProvenienza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiProvenienza(String value) {
        this.codiProvenienza = value;
    }

    /**
     * Gets the value of the textAnagraficaEditore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAnagraficaEditore() {
        return textAnagraficaEditore;
    }

    /**
     * Sets the value of the textAnagraficaEditore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAnagraficaEditore(String value) {
        this.textAnagraficaEditore = value;
    }

    /**
     * Gets the value of the fkFonte property.
     * 
     * @return
     *     possible object is
     *     {@link DEditoreStrric.FkFonte }
     *     
     */
    public DEditoreStrric.FkFonte getFkFonte() {
        return fkFonte;
    }

    /**
     * Sets the value of the fkFonte property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEditoreStrric.FkFonte }
     *     
     */
    public void setFkFonte(DEditoreStrric.FkFonte value) {
        this.fkFonte = value;
    }

    /**
     * Gets the value of the textNote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextNote() {
        return textNote;
    }

    /**
     * Sets the value of the textNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextNote(JAXBElement<String> value) {
        this.textNote = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUrl }
     * 
     * 
     */
    public List<DUrl> getDUrl() {
        if (dUrl == null) {
            dUrl = new ArrayList<DUrl>();
        }
        return this.dUrl;
    }

    /**
     * Gets the value of the dCompilatore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dCompilatore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDCompilatore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DCompilatore }
     * 
     * 
     */
    public List<DCompilatore> getDCompilatore() {
        if (dCompilatore == null) {
            dCompilatore = new ArrayList<DCompilatore>();
        }
        return this.dCompilatore;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{http://sas.beniculturali.it/catalogo/fonti}prof_group"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "profGroup"
    })
    public static class FkFonte {

        @XmlElement(name = "prof_group", namespace = "http://sas.beniculturali.it/catalogo/fonti")
        protected ProfGroup profGroup;

        /**
         * Gets the value of the profGroup property.
         * 
         * @return
         *     possible object is
         *     {@link ProfGroup }
         *     
         */
        public ProfGroup getProfGroup() {
            return profGroup;
        }

        /**
         * Sets the value of the profGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProfGroup }
         *     
         */
        public void setProfGroup(ProfGroup value) {
            this.profGroup = value;
        }

    }

}