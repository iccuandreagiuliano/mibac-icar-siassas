//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.18 at 11:10:43 AM CET 
//


package it.beniculturali.sas.catalogo.luoghi;

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
 *         &lt;element name="codi_provincia">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="084"/>
 *               &lt;enumeration value="006"/>
 *               &lt;enumeration value="042"/>
 *               &lt;enumeration value="007"/>
 *               &lt;enumeration value="051"/>
 *               &lt;enumeration value="044"/>
 *               &lt;enumeration value="005"/>
 *               &lt;enumeration value="064"/>
 *               &lt;enumeration value="072"/>
 *               &lt;enumeration value="110"/>
 *               &lt;enumeration value="025"/>
 *               &lt;enumeration value="062"/>
 *               &lt;enumeration value="016"/>
 *               &lt;enumeration value="096"/>
 *               &lt;enumeration value="037"/>
 *               &lt;enumeration value="021"/>
 *               &lt;enumeration value="017"/>
 *               &lt;enumeration value="074"/>
 *               &lt;enumeration value="092"/>
 *               &lt;enumeration value="085"/>
 *               &lt;enumeration value="070"/>
 *               &lt;enumeration value="107"/>
 *               &lt;enumeration value="061"/>
 *               &lt;enumeration value="087"/>
 *               &lt;enumeration value="079"/>
 *               &lt;enumeration value="069"/>
 *               &lt;enumeration value="013"/>
 *               &lt;enumeration value="078"/>
 *               &lt;enumeration value="019"/>
 *               &lt;enumeration value="101"/>
 *               &lt;enumeration value="004"/>
 *               &lt;enumeration value="086"/>
 *               &lt;enumeration value="109"/>
 *               &lt;enumeration value="038"/>
 *               &lt;enumeration value="048"/>
 *               &lt;enumeration value="071"/>
 *               &lt;enumeration value="040"/>
 *               &lt;enumeration value="060"/>
 *               &lt;enumeration value="010"/>
 *               &lt;enumeration value="031"/>
 *               &lt;enumeration value="053"/>
 *               &lt;enumeration value="008"/>
 *               &lt;enumeration value="094"/>
 *               &lt;enumeration value="066"/>
 *               &lt;enumeration value="011"/>
 *               &lt;enumeration value="059"/>
 *               &lt;enumeration value="075"/>
 *               &lt;enumeration value="097"/>
 *               &lt;enumeration value="049"/>
 *               &lt;enumeration value="098"/>
 *               &lt;enumeration value="046"/>
 *               &lt;enumeration value="043"/>
 *               &lt;enumeration value="020"/>
 *               &lt;enumeration value="045"/>
 *               &lt;enumeration value="077"/>
 *               &lt;enumeration value="106"/>
 *               &lt;enumeration value="083"/>
 *               &lt;enumeration value="015"/>
 *               &lt;enumeration value="036"/>
 *               &lt;enumeration value="108"/>
 *               &lt;enumeration value="063"/>
 *               &lt;enumeration value="003"/>
 *               &lt;enumeration value="091"/>
 *               &lt;enumeration value="105"/>
 *               &lt;enumeration value="104"/>
 *               &lt;enumeration value="095"/>
 *               &lt;enumeration value="028"/>
 *               &lt;enumeration value="082"/>
 *               &lt;enumeration value="034"/>
 *               &lt;enumeration value="018"/>
 *               &lt;enumeration value="054"/>
 *               &lt;enumeration value="041"/>
 *               &lt;enumeration value="068"/>
 *               &lt;enumeration value="033"/>
 *               &lt;enumeration value="050"/>
 *               &lt;enumeration value="047"/>
 *               &lt;enumeration value="093"/>
 *               &lt;enumeration value="076"/>
 *               &lt;enumeration value="100"/>
 *               &lt;enumeration value="088"/>
 *               &lt;enumeration value="039"/>
 *               &lt;enumeration value="080"/>
 *               &lt;enumeration value="035"/>
 *               &lt;enumeration value="057"/>
 *               &lt;enumeration value="099"/>
 *               &lt;enumeration value="058"/>
 *               &lt;enumeration value="029"/>
 *               &lt;enumeration value="065"/>
 *               &lt;enumeration value="090"/>
 *               &lt;enumeration value="009"/>
 *               &lt;enumeration value="052"/>
 *               &lt;enumeration value="089"/>
 *               &lt;enumeration value="014"/>
 *               &lt;enumeration value="073"/>
 *               &lt;enumeration value="067"/>
 *               &lt;enumeration value="055"/>
 *               &lt;enumeration value="001"/>
 *               &lt;enumeration value="081"/>
 *               &lt;enumeration value="022"/>
 *               &lt;enumeration value="026"/>
 *               &lt;enumeration value="032"/>
 *               &lt;enumeration value="030"/>
 *               &lt;enumeration value="012"/>
 *               &lt;enumeration value="027"/>
 *               &lt;enumeration value="103"/>
 *               &lt;enumeration value="002"/>
 *               &lt;enumeration value="023"/>
 *               &lt;enumeration value="102"/>
 *               &lt;enumeration value="024"/>
 *               &lt;enumeration value="056"/>
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
    "codiProvincia"
})
@XmlRootElement(name = "d_provincia")
public class DProvincia {

    @XmlElement(name = "codi_provincia", required = true)
    protected String codiProvincia;

    /**
     * Gets the value of the codiProvincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiProvincia() {
        return codiProvincia;
    }

    /**
     * Sets the value of the codiProvincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiProvincia(String value) {
        this.codiProvincia = value;
    }

}
