
package eu.datex.v220;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberOfAxlesCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfAxlesCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/2/2_0}ComparisonOperatorEnum"/&gt;
 *         &lt;element name="numberOfAxles" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="numberOfAxlesCharacteristicExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfAxlesCharacteristic", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "comparisonOperator",
    "numberOfAxles",
    "numberOfAxlesCharacteristicExtension"
})
public class NumberOfAxlesCharacteristic {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected ComparisonOperatorEnum comparisonOperator;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfAxles;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType numberOfAxlesCharacteristicExtension;

    /**
     * Gets the value of the comparisonOperator property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public ComparisonOperatorEnum getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * Sets the value of the comparisonOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public void setComparisonOperator(ComparisonOperatorEnum value) {
        this.comparisonOperator = value;
    }

    /**
     * Gets the value of the numberOfAxles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfAxles() {
        return numberOfAxles;
    }

    /**
     * Sets the value of the numberOfAxles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfAxles(BigInteger value) {
        this.numberOfAxles = value;
    }

    /**
     * Gets the value of the numberOfAxlesCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNumberOfAxlesCharacteristicExtension() {
        return numberOfAxlesCharacteristicExtension;
    }

    /**
     * Sets the value of the numberOfAxlesCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNumberOfAxlesCharacteristicExtension(ExtensionType value) {
        this.numberOfAxlesCharacteristicExtension = value;
    }

}
