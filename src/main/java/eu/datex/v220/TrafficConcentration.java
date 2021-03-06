
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficConcentration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficConcentration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TrafficData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="concentration" type="{http://datex2.eu/schema/2/2_0}ConcentrationOfVehiclesValue" minOccurs="0"/&gt;
 *         &lt;element name="occupancy" type="{http://datex2.eu/schema/2/2_0}PercentageValue" minOccurs="0"/&gt;
 *         &lt;element name="trafficConcentrationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficConcentration", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "concentration",
    "occupancy",
    "trafficConcentrationExtension"
})
public class TrafficConcentration
    extends TrafficData
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ConcentrationOfVehiclesValue concentration;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected PercentageValue occupancy;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType trafficConcentrationExtension;

    /**
     * Gets the value of the concentration property.
     * 
     * @return
     *     possible object is
     *     {@link ConcentrationOfVehiclesValue }
     *     
     */
    public ConcentrationOfVehiclesValue getConcentration() {
        return concentration;
    }

    /**
     * Sets the value of the concentration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcentrationOfVehiclesValue }
     *     
     */
    public void setConcentration(ConcentrationOfVehiclesValue value) {
        this.concentration = value;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageValue }
     *     
     */
    public PercentageValue getOccupancy() {
        return occupancy;
    }

    /**
     * Sets the value of the occupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageValue }
     *     
     */
    public void setOccupancy(PercentageValue value) {
        this.occupancy = value;
    }

    /**
     * Gets the value of the trafficConcentrationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficConcentrationExtension() {
        return trafficConcentrationExtension;
    }

    /**
     * Sets the value of the trafficConcentrationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficConcentrationExtension(ExtensionType value) {
        this.trafficConcentrationExtension = value;
    }

}
