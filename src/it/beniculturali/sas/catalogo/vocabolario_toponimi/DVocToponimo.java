//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.18 at 11:10:43 AM CET 
//


package it.beniculturali.sas.catalogo.vocabolario_toponimi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="last_update" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="18/02/2014"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="readme" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Storico vocabolario"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sequ_voc_toponimo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;enumeration value="1000"/>
 *               &lt;enumeration value="1002"/>
 *               &lt;enumeration value="1003"/>
 *               &lt;enumeration value="1004"/>
 *               &lt;enumeration value="1005"/>
 *               &lt;enumeration value="1006"/>
 *               &lt;enumeration value="1007"/>
 *               &lt;enumeration value="1008"/>
 *               &lt;enumeration value="1009"/>
 *               &lt;enumeration value="1010"/>
 *               &lt;enumeration value="1011"/>
 *               &lt;enumeration value="1012"/>
 *               &lt;enumeration value="1013"/>
 *               &lt;enumeration value="1014"/>
 *               &lt;enumeration value="1015"/>
 *               &lt;enumeration value="1016"/>
 *               &lt;enumeration value="1017"/>
 *               &lt;enumeration value="1018"/>
 *               &lt;enumeration value="1019"/>
 *               &lt;enumeration value="1020"/>
 *               &lt;enumeration value="1021"/>
 *               &lt;enumeration value="1022"/>
 *               &lt;enumeration value="1023"/>
 *               &lt;enumeration value="1024"/>
 *               &lt;enumeration value="1025"/>
 *               &lt;enumeration value="1026"/>
 *               &lt;enumeration value="1027"/>
 *               &lt;enumeration value="1028"/>
 *               &lt;enumeration value="1029"/>
 *               &lt;enumeration value="1030"/>
 *               &lt;enumeration value="1031"/>
 *               &lt;enumeration value="1032"/>
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
    "lastUpdate",
    "readme",
    "sequVocToponimo"
})
@XmlRootElement(name = "d_voc_toponimo")
public class DVocToponimo {

    @XmlElement(name = "last_update")
    protected String lastUpdate;
    protected String readme;
    @XmlElement(name = "sequ_voc_toponimo")
    protected long sequVocToponimo;

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdate(String value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the readme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadme() {
        return readme;
    }

    /**
     * Sets the value of the readme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadme(String value) {
        this.readme = value;
    }

    /**
     * Gets the value of the sequVocToponimo property.
     * 
     */
    public long getSequVocToponimo() {
        return sequVocToponimo;
    }

    /**
     * Sets the value of the sequVocToponimo property.
     * 
     */
    public void setSequVocToponimo(long value) {
        this.sequVocToponimo = value;
    }

}
