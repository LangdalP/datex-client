
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistanceFromLinearElementStart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistanceFromLinearElementStart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DistanceAlongLinearElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distanceAlong" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat"/&gt;
 *         &lt;element name="distanceFromLinearElementStartExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceFromLinearElementStart", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "distanceAlong",
    "distanceFromLinearElementStartExtension"
})
public class DistanceFromLinearElementStart
    extends DistanceAlongLinearElement
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected float distanceAlong;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType distanceFromLinearElementStartExtension;

    /**
     * Gets the value of the distanceAlong property.
     * 
     */
    public float getDistanceAlong() {
        return distanceAlong;
    }

    /**
     * Sets the value of the distanceAlong property.
     * 
     */
    public void setDistanceAlong(float value) {
        this.distanceAlong = value;
    }

    /**
     * Gets the value of the distanceFromLinearElementStartExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDistanceFromLinearElementStartExtension() {
        return distanceFromLinearElementStartExtension;
    }

    /**
     * Sets the value of the distanceFromLinearElementStartExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDistanceFromLinearElementStartExtension(ExtensionType value) {
        this.distanceFromLinearElementStartExtension = value;
    }

}
