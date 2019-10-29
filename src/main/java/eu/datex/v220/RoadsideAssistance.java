
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadsideAssistance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadsideAssistance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}OperatorAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadsideAssistanceType" type="{http://datex2.eu/schema/2/2_0}RoadsideAssistanceTypeEnum"/&gt;
 *         &lt;element name="roadsideAssistanceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideAssistance", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "roadsideAssistanceType",
    "roadsideAssistanceExtension"
})
public class RoadsideAssistance
    extends OperatorAction
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected RoadsideAssistanceTypeEnum roadsideAssistanceType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType roadsideAssistanceExtension;

    /**
     * Gets the value of the roadsideAssistanceType property.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideAssistanceTypeEnum }
     *     
     */
    public RoadsideAssistanceTypeEnum getRoadsideAssistanceType() {
        return roadsideAssistanceType;
    }

    /**
     * Sets the value of the roadsideAssistanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideAssistanceTypeEnum }
     *     
     */
    public void setRoadsideAssistanceType(RoadsideAssistanceTypeEnum value) {
        this.roadsideAssistanceType = value;
    }

    /**
     * Gets the value of the roadsideAssistanceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadsideAssistanceExtension() {
        return roadsideAssistanceExtension;
    }

    /**
     * Sets the value of the roadsideAssistanceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadsideAssistanceExtension(ExtensionType value) {
        this.roadsideAssistanceExtension = value;
    }

}