
package eu.datex.v220;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCLocationName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="specificLocation" type="{http://datex2.eu/schema/2/2_0}AlertCLocationCode"/&gt;
 *         &lt;element name="alertCLocationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCLocation", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "alertCLocationName",
    "specificLocation",
    "alertCLocationExtension"
})
public class AlertCLocation {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString alertCLocationName;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger specificLocation;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType alertCLocationExtension;

    /**
     * Gets the value of the alertCLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAlertCLocationName() {
        return alertCLocationName;
    }

    /**
     * Sets the value of the alertCLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAlertCLocationName(MultilingualString value) {
        this.alertCLocationName = value;
    }

    /**
     * Gets the value of the specificLocation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpecificLocation() {
        return specificLocation;
    }

    /**
     * Sets the value of the specificLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpecificLocation(BigInteger value) {
        this.specificLocation = value;
    }

    /**
     * Gets the value of the alertCLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCLocationExtension() {
        return alertCLocationExtension;
    }

    /**
     * Sets the value of the alertCLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCLocationExtension(ExtensionType value) {
        this.alertCLocationExtension = value;
    }

}
