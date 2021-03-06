
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Fault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="faultIdentifier" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="faultDescription" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="faultCreationTime" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="faultLastUpdateTime" type="{http://datex2.eu/schema/2/2_0}DateTime"/&gt;
 *         &lt;element name="faultSeverity" type="{http://datex2.eu/schema/2/2_0}FaultSeverityEnum" minOccurs="0"/&gt;
 *         &lt;element name="faultExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fault", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "faultIdentifier",
    "faultDescription",
    "faultCreationTime",
    "faultLastUpdateTime",
    "faultSeverity",
    "faultExtension"
})
@XmlSeeAlso({
    ElaboratedDataFault.class,
    MeasurementEquipmentFault.class,
    VmsFault.class,
    VmsUnitFault.class
})
public class Fault {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected String faultIdentifier;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected String faultDescription;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar faultCreationTime;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar faultLastUpdateTime;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected FaultSeverityEnum faultSeverity;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType faultExtension;

    /**
     * Gets the value of the faultIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultIdentifier() {
        return faultIdentifier;
    }

    /**
     * Sets the value of the faultIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultIdentifier(String value) {
        this.faultIdentifier = value;
    }

    /**
     * Gets the value of the faultDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultDescription() {
        return faultDescription;
    }

    /**
     * Sets the value of the faultDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultDescription(String value) {
        this.faultDescription = value;
    }

    /**
     * Gets the value of the faultCreationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFaultCreationTime() {
        return faultCreationTime;
    }

    /**
     * Sets the value of the faultCreationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFaultCreationTime(XMLGregorianCalendar value) {
        this.faultCreationTime = value;
    }

    /**
     * Gets the value of the faultLastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFaultLastUpdateTime() {
        return faultLastUpdateTime;
    }

    /**
     * Sets the value of the faultLastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFaultLastUpdateTime(XMLGregorianCalendar value) {
        this.faultLastUpdateTime = value;
    }

    /**
     * Gets the value of the faultSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link FaultSeverityEnum }
     *     
     */
    public FaultSeverityEnum getFaultSeverity() {
        return faultSeverity;
    }

    /**
     * Sets the value of the faultSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultSeverityEnum }
     *     
     */
    public void setFaultSeverity(FaultSeverityEnum value) {
        this.faultSeverity = value;
    }

    /**
     * Gets the value of the faultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getFaultExtension() {
        return faultExtension;
    }

    /**
     * Sets the value of the faultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setFaultExtension(ExtensionType value) {
        this.faultExtension = value;
    }

}
