//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.18 at 11:10:43 AM CET 
//


package it.beniculturali.sas.catalogo.relazioni;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import it.beniculturali.sas.catalogo.vocabolari_comparc.DVocNaturaColl;
import it.beniculturali.sas.catalogo.vocabolari_trasv.DVocSpecificaSecoli;
import it.beniculturali.sas.catalogo.vocabolari_trasv.DVocValiditaDate;


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
 *         &lt;element ref="{http://sas.beniculturali.it/catalogo/relazioni}codi_provenienza_sogp"/>
 *         &lt;element ref="{http://sas.beniculturali.it/catalogo/relazioni}codi_provenienza_comparc"/>
 *         &lt;element name="fk_voc_natura_coll" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-comparc}d_voc_natura_coll"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="text_estr_crono_testuali" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="date_estremo_remoto" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="-4713-01-01"/>
 *               &lt;maxInclusive value="5874897-12-31"/>
 *               &lt;pattern value="\p{Nd}{4}-\p{Nd}{2}-\p{Nd}{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="text_secolo_rm" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="I"/>
 *               &lt;enumeration value="II"/>
 *               &lt;enumeration value="III"/>
 *               &lt;enumeration value="IV"/>
 *               &lt;enumeration value="IX"/>
 *               &lt;enumeration value="V"/>
 *               &lt;enumeration value="VI"/>
 *               &lt;enumeration value="VII"/>
 *               &lt;enumeration value="VIII"/>
 *               &lt;enumeration value="X"/>
 *               &lt;enumeration value="XI"/>
 *               &lt;enumeration value="XII"/>
 *               &lt;enumeration value="XIII"/>
 *               &lt;enumeration value="XIV"/>
 *               &lt;enumeration value="XIX"/>
 *               &lt;enumeration value="XV"/>
 *               &lt;enumeration value="XVI"/>
 *               &lt;enumeration value="XVII"/>
 *               &lt;enumeration value="XVIII"/>
 *               &lt;enumeration value="XX"/>
 *               &lt;enumeration value="XXI"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fk_voc_validita_dtrm" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-trasv}d_voc_validita_date"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fk_voc_specifica_serm" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-trasv}d_voc_specifica_secoli"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="date_estremo_recente" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="-4713-01-01"/>
 *               &lt;maxInclusive value="5874897-12-31"/>
 *               &lt;pattern value="\p{Nd}{4}-\p{Nd}{2}-\p{Nd}{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="text_secolo_re" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="I"/>
 *               &lt;enumeration value="II"/>
 *               &lt;enumeration value="III"/>
 *               &lt;enumeration value="IV"/>
 *               &lt;enumeration value="IX"/>
 *               &lt;enumeration value="V"/>
 *               &lt;enumeration value="VI"/>
 *               &lt;enumeration value="VII"/>
 *               &lt;enumeration value="VIII"/>
 *               &lt;enumeration value="X"/>
 *               &lt;enumeration value="XI"/>
 *               &lt;enumeration value="XII"/>
 *               &lt;enumeration value="XIII"/>
 *               &lt;enumeration value="XIV"/>
 *               &lt;enumeration value="XIX"/>
 *               &lt;enumeration value="XV"/>
 *               &lt;enumeration value="XVI"/>
 *               &lt;enumeration value="XVII"/>
 *               &lt;enumeration value="XVIII"/>
 *               &lt;enumeration value="XX"/>
 *               &lt;enumeration value="XXI"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fk_voc_validita_dtre" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-trasv}d_voc_validita_date"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fk_voc_specifica_sere" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-trasv}d_voc_specifica_secoli"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="text_note_data" minOccurs="0">
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
    "codiProvenienzaSogp",
    "codiProvenienzaComparc",
    "fkVocNaturaColl",
    "textEstrCronoTestuali",
    "dateEstremoRemoto",
    "textSecoloRm",
    "fkVocValiditaDtrm",
    "fkVocSpecificaSerm",
    "dateEstremoRecente",
    "textSecoloRe",
    "fkVocValiditaDtre",
    "fkVocSpecificaSere",
    "textNoteData"
})
@XmlRootElement(name = "d_rel_sogp_comparc_datazione")
public class DRelSogpComparcDatazione {

    @XmlElement(name = "codi_provenienza_sogp", required = true)
    protected String codiProvenienzaSogp;
    @XmlElement(name = "codi_provenienza_comparc", required = true)
    protected String codiProvenienzaComparc;
    @XmlElementRef(name = "fk_voc_natura_coll", namespace = "http://sas.beniculturali.it/catalogo/relazioni", type = JAXBElement.class, required = false)
    protected JAXBElement<DRelSogpComparcDatazione.FkVocNaturaColl> fkVocNaturaColl;
    @XmlElementRef(name = "text_estr_crono_testuali", namespace = "http://sas.beniculturali.it/catalogo/relazioni", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textEstrCronoTestuali;
    @XmlElementRef(name = "date_estremo_remoto", namespace = "http://sas.beniculturali.it/catalogo/relazioni", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateEstremoRemoto;
    @XmlElementRef(name = "text_secolo_rm", namespace = "http://sas.beniculturali.it/catalogo/relazioni", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textSecoloRm;
    @XmlElementRef(name = "fk_voc_validita_dtrm", namespace = "http://sas.beniculturali.it/catalogo/relazioni", type = JAXBElement.class, required = false)
    protected JAXBElement<DRelSogpComparcDatazione.FkVocValiditaDtrm> fkVocValiditaDtrm;
    @XmlElementRef(name = "fk_voc_specifica_serm", namespace = "http://sas.beniculturali.it/catalogo/relazioni", type = JAXBElement.class, required = false)
    protected JAXBElement<DRelSogpComparcDatazione.FkVocSpecificaSerm> fkVocSpecificaSerm;
    @XmlElementRef(name = "date_estremo_recente", namespace = "http://sas.beniculturali.it/catalogo/relazioni", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateEstremoRecente;
    @XmlElementRef(name = "text_secolo_re", namespace = "http://sas.beniculturali.it/catalogo/relazioni", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textSecoloRe;
    @XmlElementRef(name = "fk_voc_validita_dtre", namespace = "http://sas.beniculturali.it/catalogo/relazioni", type = JAXBElement.class, required = false)
    protected JAXBElement<DRelSogpComparcDatazione.FkVocValiditaDtre> fkVocValiditaDtre;
    @XmlElementRef(name = "fk_voc_specifica_sere", namespace = "http://sas.beniculturali.it/catalogo/relazioni", type = JAXBElement.class, required = false)
    protected JAXBElement<DRelSogpComparcDatazione.FkVocSpecificaSere> fkVocSpecificaSere;
    @XmlElementRef(name = "text_note_data", namespace = "http://sas.beniculturali.it/catalogo/relazioni", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textNoteData;

    /**
     * Gets the value of the codiProvenienzaSogp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiProvenienzaSogp() {
        return codiProvenienzaSogp;
    }

    /**
     * Sets the value of the codiProvenienzaSogp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiProvenienzaSogp(String value) {
        this.codiProvenienzaSogp = value;
    }

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
     * Gets the value of the fkVocNaturaColl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DRelSogpComparcDatazione.FkVocNaturaColl }{@code >}
     *     
     */
    public JAXBElement<DRelSogpComparcDatazione.FkVocNaturaColl> getFkVocNaturaColl() {
        return fkVocNaturaColl;
    }

    /**
     * Sets the value of the fkVocNaturaColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DRelSogpComparcDatazione.FkVocNaturaColl }{@code >}
     *     
     */
    public void setFkVocNaturaColl(JAXBElement<DRelSogpComparcDatazione.FkVocNaturaColl> value) {
        this.fkVocNaturaColl = value;
    }

    /**
     * Gets the value of the textEstrCronoTestuali property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextEstrCronoTestuali() {
        return textEstrCronoTestuali;
    }

    /**
     * Sets the value of the textEstrCronoTestuali property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextEstrCronoTestuali(JAXBElement<String> value) {
        this.textEstrCronoTestuali = value;
    }

    /**
     * Gets the value of the dateEstremoRemoto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateEstremoRemoto() {
        return dateEstremoRemoto;
    }

    /**
     * Sets the value of the dateEstremoRemoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateEstremoRemoto(JAXBElement<XMLGregorianCalendar> value) {
        this.dateEstremoRemoto = value;
    }

    /**
     * Gets the value of the textSecoloRm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextSecoloRm() {
        return textSecoloRm;
    }

    /**
     * Sets the value of the textSecoloRm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextSecoloRm(JAXBElement<String> value) {
        this.textSecoloRm = value;
    }

    /**
     * Gets the value of the fkVocValiditaDtrm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DRelSogpComparcDatazione.FkVocValiditaDtrm }{@code >}
     *     
     */
    public JAXBElement<DRelSogpComparcDatazione.FkVocValiditaDtrm> getFkVocValiditaDtrm() {
        return fkVocValiditaDtrm;
    }

    /**
     * Sets the value of the fkVocValiditaDtrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DRelSogpComparcDatazione.FkVocValiditaDtrm }{@code >}
     *     
     */
    public void setFkVocValiditaDtrm(JAXBElement<DRelSogpComparcDatazione.FkVocValiditaDtrm> value) {
        this.fkVocValiditaDtrm = value;
    }

    /**
     * Gets the value of the fkVocSpecificaSerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DRelSogpComparcDatazione.FkVocSpecificaSerm }{@code >}
     *     
     */
    public JAXBElement<DRelSogpComparcDatazione.FkVocSpecificaSerm> getFkVocSpecificaSerm() {
        return fkVocSpecificaSerm;
    }

    /**
     * Sets the value of the fkVocSpecificaSerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DRelSogpComparcDatazione.FkVocSpecificaSerm }{@code >}
     *     
     */
    public void setFkVocSpecificaSerm(JAXBElement<DRelSogpComparcDatazione.FkVocSpecificaSerm> value) {
        this.fkVocSpecificaSerm = value;
    }

    /**
     * Gets the value of the dateEstremoRecente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateEstremoRecente() {
        return dateEstremoRecente;
    }

    /**
     * Sets the value of the dateEstremoRecente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateEstremoRecente(JAXBElement<XMLGregorianCalendar> value) {
        this.dateEstremoRecente = value;
    }

    /**
     * Gets the value of the textSecoloRe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextSecoloRe() {
        return textSecoloRe;
    }

    /**
     * Sets the value of the textSecoloRe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextSecoloRe(JAXBElement<String> value) {
        this.textSecoloRe = value;
    }

    /**
     * Gets the value of the fkVocValiditaDtre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DRelSogpComparcDatazione.FkVocValiditaDtre }{@code >}
     *     
     */
    public JAXBElement<DRelSogpComparcDatazione.FkVocValiditaDtre> getFkVocValiditaDtre() {
        return fkVocValiditaDtre;
    }

    /**
     * Sets the value of the fkVocValiditaDtre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DRelSogpComparcDatazione.FkVocValiditaDtre }{@code >}
     *     
     */
    public void setFkVocValiditaDtre(JAXBElement<DRelSogpComparcDatazione.FkVocValiditaDtre> value) {
        this.fkVocValiditaDtre = value;
    }

    /**
     * Gets the value of the fkVocSpecificaSere property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DRelSogpComparcDatazione.FkVocSpecificaSere }{@code >}
     *     
     */
    public JAXBElement<DRelSogpComparcDatazione.FkVocSpecificaSere> getFkVocSpecificaSere() {
        return fkVocSpecificaSere;
    }

    /**
     * Sets the value of the fkVocSpecificaSere property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DRelSogpComparcDatazione.FkVocSpecificaSere }{@code >}
     *     
     */
    public void setFkVocSpecificaSere(JAXBElement<DRelSogpComparcDatazione.FkVocSpecificaSere> value) {
        this.fkVocSpecificaSere = value;
    }

    /**
     * Gets the value of the textNoteData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextNoteData() {
        return textNoteData;
    }

    /**
     * Sets the value of the textNoteData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextNoteData(JAXBElement<String> value) {
        this.textNoteData = value;
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
     *         &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-comparc}d_voc_natura_coll"/>
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
        "dVocNaturaColl"
    })
    public static class FkVocNaturaColl {

        @XmlElement(name = "d_voc_natura_coll", namespace = "http://sas.beniculturali.it/catalogo/vocabolari-comparc")
        protected DVocNaturaColl dVocNaturaColl;

        /**
         * Gets the value of the dVocNaturaColl property.
         * 
         * @return
         *     possible object is
         *     {@link DVocNaturaColl }
         *     
         */
        public DVocNaturaColl getDVocNaturaColl() {
            return dVocNaturaColl;
        }

        /**
         * Sets the value of the dVocNaturaColl property.
         * 
         * @param value
         *     allowed object is
         *     {@link DVocNaturaColl }
         *     
         */
        public void setDVocNaturaColl(DVocNaturaColl value) {
            this.dVocNaturaColl = value;
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
     *         &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-trasv}d_voc_specifica_secoli"/>
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
        "dVocSpecificaSecoli"
    })
    public static class FkVocSpecificaSere {

        @XmlElement(name = "d_voc_specifica_secoli", namespace = "http://sas.beniculturali.it/catalogo/vocabolari-trasv")
        protected DVocSpecificaSecoli dVocSpecificaSecoli;

        /**
         * Gets the value of the dVocSpecificaSecoli property.
         * 
         * @return
         *     possible object is
         *     {@link DVocSpecificaSecoli }
         *     
         */
        public DVocSpecificaSecoli getDVocSpecificaSecoli() {
            return dVocSpecificaSecoli;
        }

        /**
         * Sets the value of the dVocSpecificaSecoli property.
         * 
         * @param value
         *     allowed object is
         *     {@link DVocSpecificaSecoli }
         *     
         */
        public void setDVocSpecificaSecoli(DVocSpecificaSecoli value) {
            this.dVocSpecificaSecoli = value;
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
     *         &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-trasv}d_voc_specifica_secoli"/>
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
        "dVocSpecificaSecoli"
    })
    public static class FkVocSpecificaSerm {

        @XmlElement(name = "d_voc_specifica_secoli", namespace = "http://sas.beniculturali.it/catalogo/vocabolari-trasv")
        protected DVocSpecificaSecoli dVocSpecificaSecoli;

        /**
         * Gets the value of the dVocSpecificaSecoli property.
         * 
         * @return
         *     possible object is
         *     {@link DVocSpecificaSecoli }
         *     
         */
        public DVocSpecificaSecoli getDVocSpecificaSecoli() {
            return dVocSpecificaSecoli;
        }

        /**
         * Sets the value of the dVocSpecificaSecoli property.
         * 
         * @param value
         *     allowed object is
         *     {@link DVocSpecificaSecoli }
         *     
         */
        public void setDVocSpecificaSecoli(DVocSpecificaSecoli value) {
            this.dVocSpecificaSecoli = value;
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
     *         &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-trasv}d_voc_validita_date"/>
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
        "dVocValiditaDate"
    })
    public static class FkVocValiditaDtre {

        @XmlElement(name = "d_voc_validita_date", namespace = "http://sas.beniculturali.it/catalogo/vocabolari-trasv")
        protected DVocValiditaDate dVocValiditaDate;

        /**
         * Gets the value of the dVocValiditaDate property.
         * 
         * @return
         *     possible object is
         *     {@link DVocValiditaDate }
         *     
         */
        public DVocValiditaDate getDVocValiditaDate() {
            return dVocValiditaDate;
        }

        /**
         * Sets the value of the dVocValiditaDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DVocValiditaDate }
         *     
         */
        public void setDVocValiditaDate(DVocValiditaDate value) {
            this.dVocValiditaDate = value;
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
     *         &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-trasv}d_voc_validita_date"/>
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
        "dVocValiditaDate"
    })
    public static class FkVocValiditaDtrm {

        @XmlElement(name = "d_voc_validita_date", namespace = "http://sas.beniculturali.it/catalogo/vocabolari-trasv")
        protected DVocValiditaDate dVocValiditaDate;

        /**
         * Gets the value of the dVocValiditaDate property.
         * 
         * @return
         *     possible object is
         *     {@link DVocValiditaDate }
         *     
         */
        public DVocValiditaDate getDVocValiditaDate() {
            return dVocValiditaDate;
        }

        /**
         * Sets the value of the dVocValiditaDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DVocValiditaDate }
         *     
         */
        public void setDVocValiditaDate(DVocValiditaDate value) {
            this.dVocValiditaDate = value;
        }

    }

}
