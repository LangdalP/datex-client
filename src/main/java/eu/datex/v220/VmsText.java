
package eu.datex.v220;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsLegendCode" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="vmsTextImageUrl" type="{http://datex2.eu/schema/2/2_0}Url" minOccurs="0"/&gt;
 *         &lt;element name="vmsTextLine" type="{http://datex2.eu/schema/2/2_0}_VmsTextLineIndexVmsTextLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vmsTextExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsText", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "vmsLegendCode",
    "vmsTextImageUrl",
    "vmsTextLine",
    "vmsTextExtension"
})
public class VmsText {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected String vmsLegendCode;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "anyURI")
    protected String vmsTextImageUrl;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<VmsTextLineIndexVmsTextLine> vmsTextLine;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType vmsTextExtension;

    /**
     * Gets the value of the vmsLegendCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsLegendCode() {
        return vmsLegendCode;
    }

    /**
     * Sets the value of the vmsLegendCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsLegendCode(String value) {
        this.vmsLegendCode = value;
    }

    /**
     * Gets the value of the vmsTextImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsTextImageUrl() {
        return vmsTextImageUrl;
    }

    /**
     * Sets the value of the vmsTextImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsTextImageUrl(String value) {
        this.vmsTextImageUrl = value;
    }

    /**
     * Gets the value of the vmsTextLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmsTextLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsTextLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsTextLineIndexVmsTextLine }
     * 
     * 
     */
    public List<VmsTextLineIndexVmsTextLine> getVmsTextLine() {
        if (vmsTextLine == null) {
            vmsTextLine = new ArrayList<VmsTextLineIndexVmsTextLine>();
        }
        return this.vmsTextLine;
    }

    /**
     * Gets the value of the vmsTextExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsTextExtension() {
        return vmsTextExtension;
    }

    /**
     * Sets the value of the vmsTextExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsTextExtension(ExtensionType value) {
        this.vmsTextExtension = value;
    }

}
