//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.27 at 02:03:47 PM CET 
//


package it.beniculturali.sas.catalogo.comparc;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.beniculturali.sas.catalogo.vocabolari_comparc.DVocTipoOggettiCons;


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
 *         &lt;element name="fk_voc_tipo_oggetti_cons">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-comparc}d_voc_tipo_oggetti_cons"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nume_consistenza">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="22"/>
 *               &lt;fractionDigits value="6"/>
 *               &lt;minInclusive value="0.000000"/>
 *               &lt;maxExclusive value="10000000000000000.000000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="text_info_numerazione" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2147483647"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="text_note" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2147483647"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="flg_cartulato_sn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *               &lt;enumeration value="s"/>
 *               &lt;enumeration value="n"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="flg_carte_pagine_cp" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *               &lt;enumeration value="c"/>
 *               &lt;enumeration value="p"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nume_numero_carta" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="22"/>
 *               &lt;fractionDigits value="6"/>
 *               &lt;minInclusive value="0.000000"/>
 *               &lt;maxExclusive value="10000000000000000.0000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="flg_recto_verso" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *               &lt;enumeration value="r"/>
 *               &lt;enumeration value="v"/>
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
    "fkVocTipoOggettiCons",
    "numeConsistenza",
    "textInfoNumerazione",
    "textNote",
    "flgCartulatoSn",
    "flgCartePagineCp",
    "numeNumeroCarta",
    "flgRectoVerso"
})
@XmlRootElement(name = "d_comparc_dati_consistenza")
public class DComparcDatiConsistenza {

    @XmlElement(name = "fk_voc_tipo_oggetti_cons", required = true, nillable = true)
    protected DComparcDatiConsistenza.FkVocTipoOggettiCons fkVocTipoOggettiCons;
    @XmlElement(name = "nume_consistenza", required = true)
    protected BigDecimal numeConsistenza;
    @XmlElementRef(name = "text_info_numerazione", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class)
    protected JAXBElement<String> textInfoNumerazione;
    @XmlElementRef(name = "text_note", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class)
    protected JAXBElement<String> textNote;
    @XmlElementRef(name = "flg_cartulato_sn", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class)
    protected JAXBElement<String> flgCartulatoSn;
    @XmlElementRef(name = "flg_carte_pagine_cp", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class)
    protected JAXBElement<String> flgCartePagineCp;
    @XmlElementRef(name = "nume_numero_carta", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> numeNumeroCarta;
    @XmlElementRef(name = "flg_recto_verso", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class)
    protected JAXBElement<String> flgRectoVerso;

    /**
     * Gets the value of the fkVocTipoOggettiCons property.
     * 
     * @return
     *     possible object is
     *     {@link DComparcDatiConsistenza.FkVocTipoOggettiCons }
     *     
     */
    public DComparcDatiConsistenza.FkVocTipoOggettiCons getFkVocTipoOggettiCons() {
        return fkVocTipoOggettiCons;
    }

    /**
     * Sets the value of the fkVocTipoOggettiCons property.
     * 
     * @param value
     *     allowed object is
     *     {@link DComparcDatiConsistenza.FkVocTipoOggettiCons }
     *     
     */
    public void setFkVocTipoOggettiCons(DComparcDatiConsistenza.FkVocTipoOggettiCons value) {
        this.fkVocTipoOggettiCons = value;
    }

    /**
     * Gets the value of the numeConsistenza property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeConsistenza() {
        return numeConsistenza;
    }

    /**
     * Sets the value of the numeConsistenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeConsistenza(BigDecimal value) {
        this.numeConsistenza = value;
    }

    /**
     * Gets the value of the textInfoNumerazione property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextInfoNumerazione() {
        return textInfoNumerazione;
    }

    /**
     * Sets the value of the textInfoNumerazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextInfoNumerazione(JAXBElement<String> value) {
        this.textInfoNumerazione = ((JAXBElement<String> ) value);
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
     * Gets the value of the flgCartulatoSn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlgCartulatoSn() {
        return flgCartulatoSn;
    }

    /**
     * Sets the value of the flgCartulatoSn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlgCartulatoSn(JAXBElement<String> value) {
        this.flgCartulatoSn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flgCartePagineCp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlgCartePagineCp() {
        return flgCartePagineCp;
    }

    /**
     * Sets the value of the flgCartePagineCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlgCartePagineCp(JAXBElement<String> value) {
        this.flgCartePagineCp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numeNumeroCarta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNumeNumeroCarta() {
        return numeNumeroCarta;
    }

    /**
     * Sets the value of the numeNumeroCarta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNumeNumeroCarta(JAXBElement<BigDecimal> value) {
        this.numeNumeroCarta = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the flgRectoVerso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlgRectoVerso() {
        return flgRectoVerso;
    }

    /**
     * Sets the value of the flgRectoVerso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlgRectoVerso(JAXBElement<String> value) {
        this.flgRectoVerso = ((JAXBElement<String> ) value);
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
     *         &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-comparc}d_voc_tipo_oggetti_cons"/>
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
        "dVocTipoOggettiCons"
    })
    public static class FkVocTipoOggettiCons {

        @XmlElement(name = "d_voc_tipo_oggetti_cons", namespace = "http://sas.beniculturali.it/catalogo/vocabolari-comparc")
        protected DVocTipoOggettiCons dVocTipoOggettiCons;

        /**
         * Gets the value of the dVocTipoOggettiCons property.
         * 
         * @return
         *     possible object is
         *     {@link DVocTipoOggettiCons }
         *     
         */
        public DVocTipoOggettiCons getDVocTipoOggettiCons() {
            return dVocTipoOggettiCons;
        }

        /**
         * Sets the value of the dVocTipoOggettiCons property.
         * 
         * @param value
         *     allowed object is
         *     {@link DVocTipoOggettiCons }
         *     
         */
        public void setDVocTipoOggettiCons(DVocTipoOggettiCons value) {
            this.dVocTipoOggettiCons = value;
        }

    }

}