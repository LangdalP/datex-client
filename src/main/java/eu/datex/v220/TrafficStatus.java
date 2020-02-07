//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.07 at 10:12:10 AM CET 
//


package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}BasicData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trafficTrendType" type="{http://datex2.eu/schema/2/2_0}TrafficTrendTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="trafficStatus" type="{http://datex2.eu/schema/2/2_0}TrafficStatusValue" minOccurs="0"/&gt;
 *         &lt;element name="trafficStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficStatus", propOrder = {
    "trafficTrendType",
    "trafficStatus",
    "trafficStatusExtension"
})
public class TrafficStatus
    extends BasicData
{

    @XmlSchemaType(name = "string")
    protected TrafficTrendTypeEnum trafficTrendType;
    protected TrafficStatusValue trafficStatus;
    protected ExtensionType trafficStatusExtension;

    /**
     * Gets the value of the trafficTrendType property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficTrendTypeEnum }
     *     
     */
    public TrafficTrendTypeEnum getTrafficTrendType() {
        return trafficTrendType;
    }

    /**
     * Sets the value of the trafficTrendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficTrendTypeEnum }
     *     
     */
    public void setTrafficTrendType(TrafficTrendTypeEnum value) {
        this.trafficTrendType = value;
    }

    /**
     * Gets the value of the trafficStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficStatusValue }
     *     
     */
    public TrafficStatusValue getTrafficStatus() {
        return trafficStatus;
    }

    /**
     * Sets the value of the trafficStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficStatusValue }
     *     
     */
    public void setTrafficStatus(TrafficStatusValue value) {
        this.trafficStatus = value;
    }

    /**
     * Gets the value of the trafficStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficStatusExtension() {
        return trafficStatusExtension;
    }

    /**
     * Sets the value of the trafficStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficStatusExtension(ExtensionType value) {
        this.trafficStatusExtension = value;
    }

}
