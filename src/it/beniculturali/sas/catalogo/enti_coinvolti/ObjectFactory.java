//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.18 at 11:10:43 AM CET 
//


package it.beniculturali.sas.catalogo.enti_coinvolti;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.beniculturali.sas.catalogo.enti_coinvolti package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DPrjdgtEntiCoinvoltiFkVocTipoQualificaEnte_QNAME = new QName("http://sas.beniculturali.it/catalogo/enti_coinvolti", "fk_voc_tipo_qualifica_ente");
    private final static QName _DPrjdgtEntiCoinvoltiTextDescrizione_QNAME = new QName("http://sas.beniculturali.it/catalogo/enti_coinvolti", "text_descrizione");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.beniculturali.sas.catalogo.enti_coinvolti
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DPrjdgtEntiCoinvolti }
     * 
     */
    public DPrjdgtEntiCoinvolti createDPrjdgtEntiCoinvolti() {
        return new DPrjdgtEntiCoinvolti();
    }

    /**
     * Create an instance of {@link DPrjdgtEntiCoinvolti.FkFonte }
     * 
     */
    public DPrjdgtEntiCoinvolti.FkFonte createDPrjdgtEntiCoinvoltiFkFonte() {
        return new DPrjdgtEntiCoinvolti.FkFonte();
    }

    /**
     * Create an instance of {@link DPrjdgtEntiCoinvolti.FkVocTipoQualificaEnte }
     * 
     */
    public DPrjdgtEntiCoinvolti.FkVocTipoQualificaEnte createDPrjdgtEntiCoinvoltiFkVocTipoQualificaEnte() {
        return new DPrjdgtEntiCoinvolti.FkVocTipoQualificaEnte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DPrjdgtEntiCoinvolti.FkVocTipoQualificaEnte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sas.beniculturali.it/catalogo/enti_coinvolti", name = "fk_voc_tipo_qualifica_ente", scope = DPrjdgtEntiCoinvolti.class)
    public JAXBElement<DPrjdgtEntiCoinvolti.FkVocTipoQualificaEnte> createDPrjdgtEntiCoinvoltiFkVocTipoQualificaEnte(DPrjdgtEntiCoinvolti.FkVocTipoQualificaEnte value) {
        return new JAXBElement<DPrjdgtEntiCoinvolti.FkVocTipoQualificaEnte>(_DPrjdgtEntiCoinvoltiFkVocTipoQualificaEnte_QNAME, DPrjdgtEntiCoinvolti.FkVocTipoQualificaEnte.class, DPrjdgtEntiCoinvolti.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sas.beniculturali.it/catalogo/enti_coinvolti", name = "text_descrizione", scope = DPrjdgtEntiCoinvolti.class)
    public JAXBElement<String> createDPrjdgtEntiCoinvoltiTextDescrizione(String value) {
        return new JAXBElement<String>(_DPrjdgtEntiCoinvoltiTextDescrizione_QNAME, String.class, DPrjdgtEntiCoinvolti.class, value);
    }

}
