
package si.hit.sj.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZHRET005U complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZHRET005U">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SPRAS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LAND1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BLAND" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BEZEI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
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
@XmlType(name = "ZHRET005U", propOrder = {
    "spras",
    "land1",
    "bland",
    "bezei"
})
public class ZHRET005U {

    @XmlElement(name = "SPRAS")
    protected String spras;
    @XmlElement(name = "LAND1")
    protected String land1;
    @XmlElement(name = "BLAND")
    protected String bland;
    @XmlElement(name = "BEZEI")
    protected String bezei;

    /**
     * Gets the value of the spras property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRAS() {
        return spras;
    }

    /**
     * Sets the value of the spras property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRAS(String value) {
        this.spras = value;
    }

    /**
     * Gets the value of the land1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAND1() {
        return land1;
    }

    /**
     * Sets the value of the land1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAND1(String value) {
        this.land1 = value;
    }

    /**
     * Gets the value of the bland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLAND() {
        return bland;
    }

    /**
     * Sets the value of the bland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLAND(String value) {
        this.bland = value;
    }

    /**
     * Gets the value of the bezei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEZEI() {
        return bezei;
    }

    /**
     * Sets the value of the bezei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEZEI(String value) {
        this.bezei = value;
    }

}
