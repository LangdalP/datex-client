
package eu.datex.v220;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElaboratedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElaboratedData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="forecast" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://datex2.eu/schema/2/2_0}Source" minOccurs="0"/&gt;
 *         &lt;element name="validity" type="{http://datex2.eu/schema/2/2_0}Validity" minOccurs="0"/&gt;
 *         &lt;element name="elaboratedDataFault" type="{http://datex2.eu/schema/2/2_0}ElaboratedDataFault" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="basicData" type="{http://datex2.eu/schema/2/2_0}BasicData" minOccurs="0"/&gt;
 *         &lt;element name="elaboratedDataExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElaboratedData", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "forecast",
    "source",
    "validity",
    "elaboratedDataFault",
    "basicData",
    "elaboratedDataExtension"
})
public class ElaboratedData {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean forecast;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Source source;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Validity validity;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<ElaboratedDataFault> elaboratedDataFault;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected BasicData basicData;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType elaboratedDataExtension;

    /**
     * Gets the value of the forecast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecast() {
        return forecast;
    }

    /**
     * Sets the value of the forecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecast(Boolean value) {
        this.forecast = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link Validity }
     *     
     */
    public Validity getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Validity }
     *     
     */
    public void setValidity(Validity value) {
        this.validity = value;
    }

    /**
     * Gets the value of the elaboratedDataFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elaboratedDataFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElaboratedDataFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElaboratedDataFault }
     * 
     * 
     */
    public List<ElaboratedDataFault> getElaboratedDataFault() {
        if (elaboratedDataFault == null) {
            elaboratedDataFault = new ArrayList<ElaboratedDataFault>();
        }
        return this.elaboratedDataFault;
    }

    /**
     * Gets the value of the basicData property.
     * 
     * @return
     *     possible object is
     *     {@link BasicData }
     *     
     */
    public BasicData getBasicData() {
        return basicData;
    }

    /**
     * Sets the value of the basicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData }
     *     
     */
    public void setBasicData(BasicData value) {
        this.basicData = value;
    }

    /**
     * Gets the value of the elaboratedDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getElaboratedDataExtension() {
        return elaboratedDataExtension;
    }

    /**
     * Sets the value of the elaboratedDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setElaboratedDataExtension(ExtensionType value) {
        this.elaboratedDataExtension = value;
    }

}
