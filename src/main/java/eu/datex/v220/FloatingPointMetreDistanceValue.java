
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FloatingPointMetreDistanceValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingPointMetreDistanceValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="floatingPointMetreDistance" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat"/&gt;
 *         &lt;element name="floatingPointMetreDistanceValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingPointMetreDistanceValue", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "floatingPointMetreDistance",
    "floatingPointMetreDistanceValueExtension"
})
public class FloatingPointMetreDistanceValue
    extends DataValue
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected float floatingPointMetreDistance;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType floatingPointMetreDistanceValueExtension;

    /**
     * Gets the value of the floatingPointMetreDistance property.
     * 
     */
    public float getFloatingPointMetreDistance() {
        return floatingPointMetreDistance;
    }

    /**
     * Sets the value of the floatingPointMetreDistance property.
     * 
     */
    public void setFloatingPointMetreDistance(float value) {
        this.floatingPointMetreDistance = value;
    }

    /**
     * Gets the value of the floatingPointMetreDistanceValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getFloatingPointMetreDistanceValueExtension() {
        return floatingPointMetreDistanceValueExtension;
    }

    /**
     * Sets the value of the floatingPointMetreDistanceValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setFloatingPointMetreDistanceValueExtension(ExtensionType value) {
        this.floatingPointMetreDistanceValueExtension = value;
    }

}
