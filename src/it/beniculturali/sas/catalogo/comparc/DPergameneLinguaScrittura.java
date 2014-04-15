//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.27 at 02:03:47 PM CET 
//


package it.beniculturali.sas.catalogo.comparc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.beniculturali.sas.catalogo.vocabolari_trasv.DVocTipoLingua;
import it.beniculturali.sas.catalogo.vocabolari_trasv.DVocTipoScrittura;


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
 *         &lt;element name="fk_voc_tipo_lingua" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-trasv}d_voc_tipo_lingua"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fk_voc_tipo_scrittura" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-trasv}d_voc_tipo_scrittura"/>
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
    "fkVocTipoLingua",
    "fkVocTipoScrittura"
})
@XmlRootElement(name = "d_pergamene_lingua_scrittura")
public class DPergameneLinguaScrittura {

    @XmlElementRef(name = "fk_voc_tipo_lingua", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class)
    protected JAXBElement<DPergameneLinguaScrittura.FkVocTipoLingua> fkVocTipoLingua;
    @XmlElementRef(name = "fk_voc_tipo_scrittura", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class)
    protected JAXBElement<DPergameneLinguaScrittura.FkVocTipoScrittura> fkVocTipoScrittura;

    /**
     * Gets the value of the fkVocTipoLingua property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DPergameneLinguaScrittura.FkVocTipoLingua }{@code >}
     *     
     */
    public JAXBElement<DPergameneLinguaScrittura.FkVocTipoLingua> getFkVocTipoLingua() {
        return fkVocTipoLingua;
    }

    /**
     * Sets the value of the fkVocTipoLingua property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DPergameneLinguaScrittura.FkVocTipoLingua }{@code >}
     *     
     */
    public void setFkVocTipoLingua(JAXBElement<DPergameneLinguaScrittura.FkVocTipoLingua> value) {
        this.fkVocTipoLingua = ((JAXBElement<DPergameneLinguaScrittura.FkVocTipoLingua> ) value);
    }

    /**
     * Gets the value of the fkVocTipoScrittura property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DPergameneLinguaScrittura.FkVocTipoScrittura }{@code >}
     *     
     */
    public JAXBElement<DPergameneLinguaScrittura.FkVocTipoScrittura> getFkVocTipoScrittura() {
        return fkVocTipoScrittura;
    }

    /**
     * Sets the value of the fkVocTipoScrittura property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DPergameneLinguaScrittura.FkVocTipoScrittura }{@code >}
     *     
     */
    public void setFkVocTipoScrittura(JAXBElement<DPergameneLinguaScrittura.FkVocTipoScrittura> value) {
        this.fkVocTipoScrittura = ((JAXBElement<DPergameneLinguaScrittura.FkVocTipoScrittura> ) value);
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
     *         &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-trasv}d_voc_tipo_lingua"/>
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
        "dVocTipoLingua"
    })
    public static class FkVocTipoLingua {

        @XmlElement(name = "d_voc_tipo_lingua", namespace = "http://sas.beniculturali.it/catalogo/vocabolari-trasv")
        protected DVocTipoLingua dVocTipoLingua;

        /**
         * Gets the value of the dVocTipoLingua property.
         * 
         * @return
         *     possible object is
         *     {@link DVocTipoLingua }
         *     
         */
        public DVocTipoLingua getDVocTipoLingua() {
            return dVocTipoLingua;
        }

        /**
         * Sets the value of the dVocTipoLingua property.
         * 
         * @param value
         *     allowed object is
         *     {@link DVocTipoLingua }
         *     
         */
        public void setDVocTipoLingua(DVocTipoLingua value) {
            this.dVocTipoLingua = value;
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
     *         &lt;element ref="{http://sas.beniculturali.it/catalogo/vocabolari-trasv}d_voc_tipo_scrittura"/>
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
        "dVocTipoScrittura"
    })
    public static class FkVocTipoScrittura {

        @XmlElement(name = "d_voc_tipo_scrittura", namespace = "http://sas.beniculturali.it/catalogo/vocabolari-trasv")
        protected DVocTipoScrittura dVocTipoScrittura;

        /**
         * Gets the value of the dVocTipoScrittura property.
         * 
         * @return
         *     possible object is
         *     {@link DVocTipoScrittura }
         *     
         */
        public DVocTipoScrittura getDVocTipoScrittura() {
            return dVocTipoScrittura;
        }

        /**
         * Sets the value of the dVocTipoScrittura property.
         * 
         * @param value
         *     allowed object is
         *     {@link DVocTipoScrittura }
         *     
         */
        public void setDVocTipoScrittura(DVocTipoScrittura value) {
            this.dVocTipoScrittura = value;
        }

    }

}