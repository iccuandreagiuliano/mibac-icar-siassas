//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.27 at 02:03:47 PM CET 
//


package it.beniculturali.sas.catalogo.enti_coinvolti;

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
import it.beniculturali.sas.catalogo.commons.DContatti;
import it.beniculturali.sas.catalogo.commons.DUrl;
import it.beniculturali.sas.catalogo.fonti.ProfGroup;
import it.beniculturali.sas.catalogo.vocabolari_dgt.DVocTipoQualificaEnte;


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
 *         &lt;element name="text_denominazione">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="1024"/>
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
 *         &lt;element name="text_descrizione" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2147483647"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fk_voc_tipo_qualifica_ente" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-dgt}d_voc_tipo_qualifica_ente"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://sas.beniculturali.it/catalogo/commons}d_contatti" maxOccurs="unbounded" minOccurs="0"/>
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
    "textDenominazione",
    "fkFonte",
    "textDescrizione",
    "fkVocTipoQualificaEnte",
    "dContatti",
    "dUrl",
    "dCompilatore"
})
@XmlRootElement(name = "d_prjdgt_enti_coinvolti")
public class DPrjdgtEntiCoinvolti {

    @XmlElement(name = "codi_provenienza", required = true)
    protected String codiProvenienza;
    @XmlElement(name = "text_denominazione", required = true)
    protected String textDenominazione;
    @XmlElement(name = "fk_fonte", required = true, nillable = true)
    protected DPrjdgtEntiCoinvolti.FkFonte fkFonte;
    @XmlElementRef(name = "text_descrizione", namespace = "http://sas.beniculturali.it/catalogo/enti_coinvolti", type = JAXBElement.class)
    protected JAXBElement<String> textDescrizione;
    @XmlElementRef(name = "fk_voc_tipo_qualifica_ente", namespace = "http://sas.beniculturali.it/catalogo/enti_coinvolti", type = JAXBElement.class)
    protected JAXBElement<DPrjdgtEntiCoinvolti.FkVocTipoQualificaEnte> fkVocTipoQualificaEnte;
    @XmlElement(name = "d_contatti", namespace = "http://sas.beniculturali.it/catalogo/commons")
    protected List<DContatti> dContatti;
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
     * Gets the value of the textDenominazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextDenominazione() {
        return textDenominazione;
    }

    /**
     * Sets the value of the textDenominazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextDenominazione(String value) {
        this.textDenominazione = value;
    }

    /**
     * Gets the value of the fkFonte property.
     * 
     * @return
     *     possible object is
     *     {@link DPrjdgtEntiCoinvolti.FkFonte }
     *     
     */
    public DPrjdgtEntiCoinvolti.FkFonte getFkFonte() {
        return fkFonte;
    }

    /**
     * Sets the value of the fkFonte property.
     * 
     * @param value
     *     allowed object is
     *     {@link DPrjdgtEntiCoinvolti.FkFonte }
     *     
     */
    public void setFkFonte(DPrjdgtEntiCoinvolti.FkFonte value) {
        this.fkFonte = value;
    }

    /**
     * Gets the value of the textDescrizione property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextDescrizione() {
        return textDescrizione;
    }

    /**
     * Sets the value of the textDescrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextDescrizione(JAXBElement<String> value) {
        this.textDescrizione = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fkVocTipoQualificaEnte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DPrjdgtEntiCoinvolti.FkVocTipoQualificaEnte }{@code >}
     *     
     */
    public JAXBElement<DPrjdgtEntiCoinvolti.FkVocTipoQualificaEnte> getFkVocTipoQualificaEnte() {
        return fkVocTipoQualificaEnte;
    }

    /**
     * Sets the value of the fkVocTipoQualificaEnte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DPrjdgtEntiCoinvolti.FkVocTipoQualificaEnte }{@code >}
     *     
     */
    public void setFkVocTipoQualificaEnte(JAXBElement<DPrjdgtEntiCoinvolti.FkVocTipoQualificaEnte> value) {
        this.fkVocTipoQualificaEnte = ((JAXBElement<DPrjdgtEntiCoinvolti.FkVocTipoQualificaEnte> ) value);
    }

    /**
     * Gets the value of the dContatti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dContatti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDContatti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DContatti }
     * 
     * 
     */
    public List<DContatti> getDContatti() {
        if (dContatti == null) {
            dContatti = new ArrayList<DContatti>();
        }
        return this.dContatti;
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
     *         &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-dgt}d_voc_tipo_qualifica_ente"/>
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
        "dVocTipoQualificaEnte"
    })
    public static class FkVocTipoQualificaEnte {

        @XmlElement(name = "d_voc_tipo_qualifica_ente", namespace = "http://sas.beniculturali.it/catalogo/vocabolari-dgt")
        protected DVocTipoQualificaEnte dVocTipoQualificaEnte;

        /**
         * Gets the value of the dVocTipoQualificaEnte property.
         * 
         * @return
         *     possible object is
         *     {@link DVocTipoQualificaEnte }
         *     
         */
        public DVocTipoQualificaEnte getDVocTipoQualificaEnte() {
            return dVocTipoQualificaEnte;
        }

        /**
         * Sets the value of the dVocTipoQualificaEnte property.
         * 
         * @param value
         *     allowed object is
         *     {@link DVocTipoQualificaEnte }
         *     
         */
        public void setDVocTipoQualificaEnte(DVocTipoQualificaEnte value) {
            this.dVocTipoQualificaEnte = value;
        }

    }

}