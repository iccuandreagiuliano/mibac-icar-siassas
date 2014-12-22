//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.18 at 11:10:43 AM CET 
//


package it.beniculturali.sas.catalogo.gestionale;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import it.beniculturali.sas.catalogo.commons.DCompilatore;
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
 *         &lt;element name="text_titolo">
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
 *         &lt;element name="descr_progetto" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2147483647"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nume_stanz_richiesto" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="30"/>
 *               &lt;fractionDigits value="6"/>
 *               &lt;minExclusive value="-999999999999999980000000.0000"/>
 *               &lt;maxExclusive value="999999999999999980000000.0000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nume_stanz_effettivo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="30"/>
 *               &lt;fractionDigits value="6"/>
 *               &lt;minExclusive value="-999999999999999980000000.0000"/>
 *               &lt;maxExclusive value="999999999999999980000000.0000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="text_tipo_finanziamento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1024"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="text_capitolo_spesa" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="text_esercizio_finanziario" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="date_inizio_lavori" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="-4713-01-01"/>
 *               &lt;maxInclusive value="5874897-12-31"/>
 *               &lt;pattern value="\p{Nd}{4}-\p{Nd}{2}-\p{Nd}{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="date_fine_lavori" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="-4713-01-01"/>
 *               &lt;maxInclusive value="5874897-12-31"/>
 *               &lt;pattern value="\p{Nd}{4}-\p{Nd}{2}-\p{Nd}{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="text_estremi_contratto" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1024"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://sas.beniculturali.it/catalogo/gestionale}d_contraente" maxOccurs="unbounded" minOccurs="0"/>
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
    "textTitolo",
    "fkFonte",
    "descrProgetto",
    "numeStanzRichiesto",
    "numeStanzEffettivo",
    "textTipoFinanziamento",
    "textCapitoloSpesa",
    "textEsercizioFinanziario",
    "dateInizioLavori",
    "dateFineLavori",
    "textEstremiContratto",
    "dContraente",
    "dCompilatore"
})
@XmlRootElement(name = "d_finanziamenti")
public class DFinanziamenti {

    @XmlElement(name = "codi_provenienza", required = true)
    protected String codiProvenienza;
    @XmlElement(name = "text_titolo", required = true)
    protected String textTitolo;
    @XmlElement(name = "fk_fonte", required = true)
    protected DFinanziamenti.FkFonte fkFonte;
    @XmlElementRef(name = "descr_progetto", namespace = "http://sas.beniculturali.it/catalogo/gestionale", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrProgetto;
    @XmlElementRef(name = "nume_stanz_richiesto", namespace = "http://sas.beniculturali.it/catalogo/gestionale", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> numeStanzRichiesto;
    @XmlElementRef(name = "nume_stanz_effettivo", namespace = "http://sas.beniculturali.it/catalogo/gestionale", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> numeStanzEffettivo;
    @XmlElementRef(name = "text_tipo_finanziamento", namespace = "http://sas.beniculturali.it/catalogo/gestionale", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textTipoFinanziamento;
    @XmlElementRef(name = "text_capitolo_spesa", namespace = "http://sas.beniculturali.it/catalogo/gestionale", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textCapitoloSpesa;
    @XmlElementRef(name = "text_esercizio_finanziario", namespace = "http://sas.beniculturali.it/catalogo/gestionale", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textEsercizioFinanziario;
    @XmlElementRef(name = "date_inizio_lavori", namespace = "http://sas.beniculturali.it/catalogo/gestionale", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateInizioLavori;
    @XmlElementRef(name = "date_fine_lavori", namespace = "http://sas.beniculturali.it/catalogo/gestionale", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateFineLavori;
    @XmlElementRef(name = "text_estremi_contratto", namespace = "http://sas.beniculturali.it/catalogo/gestionale", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textEstremiContratto;
    @XmlElement(name = "d_contraente")
    protected List<DContraente> dContraente;
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
     * Gets the value of the textTitolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextTitolo() {
        return textTitolo;
    }

    /**
     * Sets the value of the textTitolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextTitolo(String value) {
        this.textTitolo = value;
    }

    /**
     * Gets the value of the fkFonte property.
     * 
     * @return
     *     possible object is
     *     {@link DFinanziamenti.FkFonte }
     *     
     */
    public DFinanziamenti.FkFonte getFkFonte() {
        return fkFonte;
    }

    /**
     * Sets the value of the fkFonte property.
     * 
     * @param value
     *     allowed object is
     *     {@link DFinanziamenti.FkFonte }
     *     
     */
    public void setFkFonte(DFinanziamenti.FkFonte value) {
        this.fkFonte = value;
    }

    /**
     * Gets the value of the descrProgetto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescrProgetto() {
        return descrProgetto;
    }

    /**
     * Sets the value of the descrProgetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescrProgetto(JAXBElement<String> value) {
        this.descrProgetto = value;
    }

    /**
     * Gets the value of the numeStanzRichiesto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNumeStanzRichiesto() {
        return numeStanzRichiesto;
    }

    /**
     * Sets the value of the numeStanzRichiesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNumeStanzRichiesto(JAXBElement<BigDecimal> value) {
        this.numeStanzRichiesto = value;
    }

    /**
     * Gets the value of the numeStanzEffettivo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNumeStanzEffettivo() {
        return numeStanzEffettivo;
    }

    /**
     * Sets the value of the numeStanzEffettivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNumeStanzEffettivo(JAXBElement<BigDecimal> value) {
        this.numeStanzEffettivo = value;
    }

    /**
     * Gets the value of the textTipoFinanziamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextTipoFinanziamento() {
        return textTipoFinanziamento;
    }

    /**
     * Sets the value of the textTipoFinanziamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextTipoFinanziamento(JAXBElement<String> value) {
        this.textTipoFinanziamento = value;
    }

    /**
     * Gets the value of the textCapitoloSpesa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextCapitoloSpesa() {
        return textCapitoloSpesa;
    }

    /**
     * Sets the value of the textCapitoloSpesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextCapitoloSpesa(JAXBElement<String> value) {
        this.textCapitoloSpesa = value;
    }

    /**
     * Gets the value of the textEsercizioFinanziario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextEsercizioFinanziario() {
        return textEsercizioFinanziario;
    }

    /**
     * Sets the value of the textEsercizioFinanziario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextEsercizioFinanziario(JAXBElement<String> value) {
        this.textEsercizioFinanziario = value;
    }

    /**
     * Gets the value of the dateInizioLavori property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateInizioLavori() {
        return dateInizioLavori;
    }

    /**
     * Sets the value of the dateInizioLavori property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateInizioLavori(JAXBElement<XMLGregorianCalendar> value) {
        this.dateInizioLavori = value;
    }

    /**
     * Gets the value of the dateFineLavori property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateFineLavori() {
        return dateFineLavori;
    }

    /**
     * Sets the value of the dateFineLavori property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateFineLavori(JAXBElement<XMLGregorianCalendar> value) {
        this.dateFineLavori = value;
    }

    /**
     * Gets the value of the textEstremiContratto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextEstremiContratto() {
        return textEstremiContratto;
    }

    /**
     * Sets the value of the textEstremiContratto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextEstremiContratto(JAXBElement<String> value) {
        this.textEstremiContratto = value;
    }

    /**
     * Gets the value of the dContraente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dContraente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDContraente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DContraente }
     * 
     * 
     */
    public List<DContraente> getDContraente() {
        if (dContraente == null) {
            dContraente = new ArrayList<DContraente>();
        }
        return this.dContraente;
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
