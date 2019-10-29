
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Linear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Linear"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegLinearLocation" type="{http://datex2.eu/schema/2/2_0}TpegLinearLocation" minOccurs="0"/&gt;
 *         &lt;element name="alertCLinear" type="{http://datex2.eu/schema/2/2_0}AlertCLinear" minOccurs="0"/&gt;
 *         &lt;element name="linearWithinLinearElement" type="{http://datex2.eu/schema/2/2_0}LinearWithinLinearElement" minOccurs="0"/&gt;
 *         &lt;element name="linearExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linear", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "tpegLinearLocation",
    "alertCLinear",
    "linearWithinLinearElement",
    "linearExtension"
})
public class Linear
    extends NetworkLocation
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected TpegLinearLocation tpegLinearLocation;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected AlertCLinear alertCLinear;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected LinearWithinLinearElement linearWithinLinearElement;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType linearExtension;

    /**
     * Gets the value of the tpegLinearLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLinearLocation }
     *     
     */
    public TpegLinearLocation getTpegLinearLocation() {
        return tpegLinearLocation;
    }

    /**
     * Sets the value of the tpegLinearLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLinearLocation }
     *     
     */
    public void setTpegLinearLocation(TpegLinearLocation value) {
        this.tpegLinearLocation = value;
    }

    /**
     * Gets the value of the alertCLinear property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCLinear }
     *     
     */
    public AlertCLinear getAlertCLinear() {
        return alertCLinear;
    }

    /**
     * Sets the value of the alertCLinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCLinear }
     *     
     */
    public void setAlertCLinear(AlertCLinear value) {
        this.alertCLinear = value;
    }

    /**
     * Gets the value of the linearWithinLinearElement property.
     * 
     * @return
     *     possible object is
     *     {@link LinearWithinLinearElement }
     *     
     */
    public LinearWithinLinearElement getLinearWithinLinearElement() {
        return linearWithinLinearElement;
    }

    /**
     * Sets the value of the linearWithinLinearElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearWithinLinearElement }
     *     
     */
    public void setLinearWithinLinearElement(LinearWithinLinearElement value) {
        this.linearWithinLinearElement = value;
    }

    /**
     * Gets the value of the linearExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearExtension() {
        return linearExtension;
    }

    /**
     * Sets the value of the linearExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearExtension(ExtensionType value) {
        this.linearExtension = value;
    }

}