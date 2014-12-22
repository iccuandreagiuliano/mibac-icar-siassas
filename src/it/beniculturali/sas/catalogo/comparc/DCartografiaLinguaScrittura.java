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
    "fkVocTipoScrittura",
    "fkVocTipoLingua"
})
@XmlRootElement(name = "d_cartografia_lingua_scrittura")
public class DCartografiaLinguaScrittura {

    @XmlElementRef(name = "fk_voc_tipo_scrittura", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class, required = false)
    protected JAXBElement<DCartografiaLinguaScrittura.FkVocTipoScrittura> fkVocTipoScrittura;
    @XmlElementRef(name = "fk_voc_tipo_lingua", namespace = "http://sas.beniculturali.it/catalogo/comparc", type = JAXBElement.class, required = false)
    protected JAXBElement<DCartografiaLinguaScrittura.FkVocTipoLingua> fkVocTipoLingua;

    /**
     * Gets the value of the fkVocTipoScrittura property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DCartografiaLinguaScrittura.FkVocTipoScrittura }{@code >}
     *     
     */
    public JAXBElement<DCartografiaLinguaScrittura.FkVocTipoScrittura> getFkVocTipoScrittura() {
        return fkVocTipoScrittura;
    }

    /**
     * Sets the value of the fkVocTipoScrittura property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DCartografiaLinguaScrittura.FkVocTipoScrittura }{@code >}
     *     
     */
    public void setFkVocTipoScrittura(JAXBElement<DCartografiaLinguaScrittura.FkVocTipoScrittura> value) {
        this.fkVocTipoScrittura = value;
    }

    /**
     * Gets the value of the fkVocTipoLingua property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DCartografiaLinguaScrittura.FkVocTipoLingua }{@code >}
     *     
     */
    public JAXBElement<DCartografiaLinguaScrittura.FkVocTipoLingua> getFkVocTipoLingua() {
        return fkVocTipoLingua;
    }

    /**
     * Sets the value of the fkVocTipoLingua property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DCartografiaLinguaScrittura.FkVocTipoLingua }{@code >}
     *     
     */
    public void setFkVocTipoLingua(JAXBElement<DCartografiaLinguaScrittura.FkVocTipoLingua> value) {
        this.fkVocTipoLingua = value;
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
