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
import it.beniculturali.sas.catalogo.vocabolari_comparc.DVocTipoRuoloTitolare;


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
 *         &lt;element name="text_nome">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2147483647"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="text_funzioni">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2147483647"/>
 *               &lt;minLength value="1"/>
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
 *         &lt;element name="text_bibliografia" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2147483647"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="flag_titolare_sigillo_tf">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="s"/>
 *               &lt;enumeration value="n"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fk_voc_tipo_ruolo_titolare">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-comparc}d_voc_tipo_ruolo_titolare"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "textNome",
    "textFunzioni",
    "textNote",
    "textBibliografia",
    "flagTitolareSigilloTf",
    "fkVocTipoRuoloTitolare"
})
@XmlRootElement(name = "d_comparc_titolari_sigilli")
public class DComparcTitolariSigilli {

    @XmlElement(name = "text_nome", required = true)
    protected String textNome;
    @XmlElement(name = "text_funzioni", required = true)
    protected String textFunzioni;
    @XmlElementRef(name = "text_note", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textNote;
    @XmlElementRef(name = "text_bibliografia", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textBibliografia;
    @XmlElement(name = "flag_titolare_sigillo_tf", required = true)
    protected String flagTitolareSigilloTf;
    @XmlElement(name = "fk_voc_tipo_ruolo_titolare", required = true, nillable = true)
    protected DComparcTitolariSigilli.FkVocTipoRuoloTitolare fkVocTipoRuoloTitolare;

    /**
     * Gets the value of the textNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextNome() {
        return textNome;
    }

    /**
     * Sets the value of the textNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextNome(String value) {
        this.textNome = value;
    }

    /**
     * Gets the value of the textFunzioni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextFunzioni() {
        return textFunzioni;
    }

    /**
     * Sets the value of the textFunzioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextFunzioni(String value) {
        this.textFunzioni = value;
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
     * Gets the value of the textBibliografia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextBibliografia() {
        return textBibliografia;
    }

    /**
     * Sets the value of the textBibliografia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextBibliografia(JAXBElement<String> value) {
        this.textBibliografia = value;
    }

    /**
     * Gets the value of the flagTitolareSigilloTf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagTitolareSigilloTf() {
        return flagTitolareSigilloTf;
    }

    /**
     * Sets the value of the flagTitolareSigilloTf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagTitolareSigilloTf(String value) {
        this.flagTitolareSigilloTf = value;
    }

    /**
     * Gets the value of the fkVocTipoRuoloTitolare property.
     * 
     * @return
     *     possible object is
     *     {@link DComparcTitolariSigilli.FkVocTipoRuoloTitolare }
     *     
     */
    public DComparcTitolariSigilli.FkVocTipoRuoloTitolare getFkVocTipoRuoloTitolare() {
        return fkVocTipoRuoloTitolare;
    }

    /**
     * Sets the value of the fkVocTipoRuoloTitolare property.
     * 
     * @param value
     *     allowed object is
     *     {@link DComparcTitolariSigilli.FkVocTipoRuoloTitolare }
     *     
     */
    public void setFkVocTipoRuoloTitolare(DComparcTitolariSigilli.FkVocTipoRuoloTitolare value) {
        this.fkVocTipoRuoloTitolare = value;
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
     *         &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-comparc}d_voc_tipo_ruolo_titolare"/>
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
        "dVocTipoRuoloTitolare"
    })
    public static class FkVocTipoRuoloTitolare {

        @XmlElement(name = "d_voc_tipo_ruolo_titolare", namespace = "http://sas.beniculturali.it/catalogo/vocabolari-comparc")
        protected DVocTipoRuoloTitolare dVocTipoRuoloTitolare;

        /**
         * Gets the value of the dVocTipoRuoloTitolare property.
         * 
         * @return
         *     possible object is
         *     {@link DVocTipoRuoloTitolare }
         *     
         */
        public DVocTipoRuoloTitolare getDVocTipoRuoloTitolare() {
            return dVocTipoRuoloTitolare;
        }

        /**
         * Sets the value of the dVocTipoRuoloTitolare property.
         * 
         * @param value
         *     allowed object is
         *     {@link DVocTipoRuoloTitolare }
         *     
         */
        public void setDVocTipoRuoloTitolare(DVocTipoRuoloTitolare value) {
            this.dVocTipoRuoloTitolare = value;
        }

    }

}
