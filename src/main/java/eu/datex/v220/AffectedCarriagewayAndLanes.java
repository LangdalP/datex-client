
package eu.datex.v220;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AffectedCarriagewayAndLanes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedCarriagewayAndLanes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carriageway" type="{http://datex2.eu/schema/2/2_0}CarriagewayEnum"/&gt;
 *         &lt;element name="lane" type="{http://datex2.eu/schema/2/2_0}LaneEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="footpath" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="lengthAffected" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="affectedCarriagewayAndLanesExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedCarriagewayAndLanes", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "carriageway",
    "lane",
    "footpath",
    "lengthAffected",
    "affectedCarriagewayAndLanesExtension"
})
public class AffectedCarriagewayAndLanes {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected CarriagewayEnum carriageway;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected List<LaneEnum> lane;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean footpath;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float lengthAffected;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType affectedCarriagewayAndLanesExtension;

    /**
     * Gets the value of the carriageway property.
     * 
     * @return
     *     possible object is
     *     {@link CarriagewayEnum }
     *     
     */
    public CarriagewayEnum getCarriageway() {
        return carriageway;
    }

    /**
     * Sets the value of the carriageway property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarriagewayEnum }
     *     
     */
    public void setCarriageway(CarriagewayEnum value) {
        this.carriageway = value;
    }

    /**
     * Gets the value of the lane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaneEnum }
     * 
     * 
     */
    public List<LaneEnum> getLane() {
        if (lane == null) {
            lane = new ArrayList<LaneEnum>();
        }
        return this.lane;
    }

    /**
     * Gets the value of the footpath property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFootpath() {
        return footpath;
    }

    /**
     * Sets the value of the footpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFootpath(Boolean value) {
        this.footpath = value;
    }

    /**
     * Gets the value of the lengthAffected property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLengthAffected() {
        return lengthAffected;
    }

    /**
     * Sets the value of the lengthAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLengthAffected(Float value) {
        this.lengthAffected = value;
    }

    /**
     * Gets the value of the affectedCarriagewayAndLanesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAffectedCarriagewayAndLanesExtension() {
        return affectedCarriagewayAndLanesExtension;
    }

    /**
     * Sets the value of the affectedCarriagewayAndLanesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAffectedCarriagewayAndLanesExtension(ExtensionType value) {
        this.affectedCarriagewayAndLanesExtension = value;
    }

}
