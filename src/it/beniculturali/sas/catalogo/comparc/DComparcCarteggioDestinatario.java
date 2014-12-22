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
import it.beniculturali.sas.catalogo.vocabolari_comparc.DVocQualificaAttoreCarteggio;
import it.beniculturali.sas.catalogo.vocabolari_comparc.DVocRuoloAttoreCarteggio;


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
 *         &lt;element name="text_nome_destinatario_carteggio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1024"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fk_voc_qualifica_attore_carteggio" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-comparc}d_voc_qualifica_attore_carteggio"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fk_voc_ruolo_attore_carteggio" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-comparc}d_voc_ruolo_attore_carteggio"/>
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
    "textNomeDestinatarioCarteggio",
    "fkVocQualificaAttoreCarteggio",
    "fkVocRuoloAttoreCarteggio",
    "textNote"
})
@XmlRootElement(name = "d_comparc_carteggio_destinatario")
public class DComparcCarteggioDestinatario {

    @XmlElement(name = "text_nome_destinatario_carteggio", required = true)
    protected String textNomeDestinatarioCarteggio;
    @XmlElementRef(name = "fk_voc_qualifica_attore_carteggio", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class, required = false)
    protected JAXBElement<DComparcCarteggioDestinatario.FkVocQualificaAttoreCarteggio> fkVocQualificaAttoreCarteggio;
    @XmlElementRef(name = "fk_voc_ruolo_attore_carteggio", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class, required = false)
    protected JAXBElement<DComparcCarteggioDestinatario.FkVocRuoloAttoreCarteggio> fkVocRuoloAttoreCarteggio;
    @XmlElementRef(name = "text_note", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textNote;

    /**
     * Gets the value of the textNomeDestinatarioCarteggio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextNomeDestinatarioCarteggio() {
        return textNomeDestinatarioCarteggio;
    }

    /**
     * Sets the value of the textNomeDestinatarioCarteggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextNomeDestinatarioCarteggio(String value) {
        this.textNomeDestinatarioCarteggio = value;
    }

    /**
     * Gets the value of the fkVocQualificaAttoreCarteggio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DComparcCarteggioDestinatario.FkVocQualificaAttoreCarteggio }{@code >}
     *     
     */
    public JAXBElement<DComparcCarteggioDestinatario.FkVocQualificaAttoreCarteggio> getFkVocQualificaAttoreCarteggio() {
        return fkVocQualificaAttoreCarteggio;
    }

    /**
     * Sets the value of the fkVocQualificaAttoreCarteggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DComparcCarteggioDestinatario.FkVocQualificaAttoreCarteggio }{@code >}
     *     
     */
    public void setFkVocQualificaAttoreCarteggio(JAXBElement<DComparcCarteggioDestinatario.FkVocQualificaAttoreCarteggio> value) {
        this.fkVocQualificaAttoreCarteggio = value;
    }

    /**
     * Gets the value of the fkVocRuoloAttoreCarteggio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DComparcCarteggioDestinatario.FkVocRuoloAttoreCarteggio }{@code >}
     *     
     */
    public JAXBElement<DComparcCarteggioDestinatario.FkVocRuoloAttoreCarteggio> getFkVocRuoloAttoreCarteggio() {
        return fkVocRuoloAttoreCarteggio;
    }

    /**
     * Sets the value of the fkVocRuoloAttoreCarteggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DComparcCarteggioDestinatario.FkVocRuoloAttoreCarteggio }{@code >}
     *     
     */
    public void setFkVocRuoloAttoreCarteggio(JAXBElement<DComparcCarteggioDestinatario.FkVocRuoloAttoreCarteggio> value) {
        this.fkVocRuoloAttoreCarteggio = value;
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
        this.textNote = value;
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
     *         &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-comparc}d_voc_qualifica_attore_carteggio"/>
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
        "dVocQualificaAttoreCarteggio"
    })
    public static class FkVocQualificaAttoreCarteggio {

        @XmlElement(name = "d_voc_qualifica_attore_carteggio", namespace = "http://sas.beniculturali.it/catalogo/vocabolari-comparc")
        protected DVocQualificaAttoreCarteggio dVocQualificaAttoreCarteggio;

        /**
         * Gets the value of the dVocQualificaAttoreCarteggio property.
         * 
         * @return
         *     possible object is
         *     {@link DVocQualificaAttoreCarteggio }
         *     
         */
        public DVocQualificaAttoreCarteggio getDVocQualificaAttoreCarteggio() {
            return dVocQualificaAttoreCarteggio;
        }

        /**
         * Sets the value of the dVocQualificaAttoreCarteggio property.
         * 
         * @param value
         *     allowed object is
         *     {@link DVocQualificaAttoreCarteggio }
         *     
         */
        public void setDVocQualificaAttoreCarteggio(DVocQualificaAttoreCarteggio value) {
            this.dVocQualificaAttoreCarteggio = value;
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
     *         &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-comparc}d_voc_ruolo_attore_carteggio"/>
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
        "dVocRuoloAttoreCarteggio"
    })
    public static class FkVocRuoloAttoreCarteggio {

        @XmlElement(name = "d_voc_ruolo_attore_carteggio", namespace = "http://sas.beniculturali.it/catalogo/vocabolari-comparc")
        protected DVocRuoloAttoreCarteggio dVocRuoloAttoreCarteggio;

        /**
         * Gets the value of the dVocRuoloAttoreCarteggio property.
         * 
         * @return
         *     possible object is
         *     {@link DVocRuoloAttoreCarteggio }
         *     
         */
        public DVocRuoloAttoreCarteggio getDVocRuoloAttoreCarteggio() {
            return dVocRuoloAttoreCarteggio;
        }

        /**
         * Sets the value of the dVocRuoloAttoreCarteggio property.
         * 
         * @param value
         *     allowed object is
         *     {@link DVocRuoloAttoreCarteggio }
         *     
         */
        public void setDVocRuoloAttoreCarteggio(DVocRuoloAttoreCarteggio value) {
            this.dVocRuoloAttoreCarteggio = value;
        }

    }

}
