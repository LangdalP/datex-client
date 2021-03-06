
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonManagedCause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonManagedCause"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Cause"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="causeDescription" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="causeType" type="{http://datex2.eu/schema/2/2_0}CauseTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="nonManagedCauseExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonManagedCause", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "causeDescription",
    "causeType",
    "nonManagedCauseExtension"
})
public class NonManagedCause
    extends Cause
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString causeDescription;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected CauseTypeEnum causeType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType nonManagedCauseExtension;

    /**
     * Gets the value of the causeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCauseDescription() {
        return causeDescription;
    }

    /**
     * Sets the value of the causeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCauseDescription(MultilingualString value) {
        this.causeDescription = value;
    }

    /**
     * Gets the value of the causeType property.
     * 
     * @return
     *     possible object is
     *     {@link CauseTypeEnum }
     *     
     */
    public CauseTypeEnum getCauseType() {
        return causeType;
    }

    /**
     * Sets the value of the causeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CauseTypeEnum }
     *     
     */
    public void setCauseType(CauseTypeEnum value) {
        this.causeType = value;
    }

    /**
     * Gets the value of the nonManagedCauseExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNonManagedCauseExtension() {
        return nonManagedCauseExtension;
    }

    /**
     * Sets the value of the nonManagedCauseExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNonManagedCauseExtension(ExtensionType value) {
        this.nonManagedCauseExtension = value;
    }

}
