
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointCoordinates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointCoordinates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latitude" type="{http://datex2.eu/schema/2/2_0}Float"/&gt;
 *         &lt;element name="longitude" type="{http://datex2.eu/schema/2/2_0}Float"/&gt;
 *         &lt;element name="pointCoordinatesExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointCoordinates", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "latitude",
    "longitude",
    "pointCoordinatesExtension"
})
public class PointCoordinates {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected float latitude;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected float longitude;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType pointCoordinatesExtension;

    /**
     * Gets the value of the latitude property.
     * 
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(float value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(float value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the pointCoordinatesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointCoordinatesExtension() {
        return pointCoordinatesExtension;
    }

    /**
     * Sets the value of the pointCoordinatesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointCoordinatesExtension(ExtensionType value) {
        this.pointCoordinatesExtension = value;
    }

}
