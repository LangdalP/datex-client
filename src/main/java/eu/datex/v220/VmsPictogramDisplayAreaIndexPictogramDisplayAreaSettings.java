
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsPictogramDisplayAreaIndexPictogramDisplayAreaSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsPictogramDisplayAreaIndexPictogramDisplayAreaSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pictogramDisplayAreaSettings" type="{http://datex2.eu/schema/2/2_0}PictogramDisplayAreaSettings"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="pictogramDisplayAreaIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_VmsPictogramDisplayAreaIndexPictogramDisplayAreaSettings", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "pictogramDisplayAreaSettings"
})
public class VmsPictogramDisplayAreaIndexPictogramDisplayAreaSettings {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected PictogramDisplayAreaSettings pictogramDisplayAreaSettings;
    @XmlAttribute(name = "pictogramDisplayAreaIndex", required = true)
    protected int pictogramDisplayAreaIndex;

    /**
     * Gets the value of the pictogramDisplayAreaSettings property.
     * 
     * @return
     *     possible object is
     *     {@link PictogramDisplayAreaSettings }
     *     
     */
    public PictogramDisplayAreaSettings getPictogramDisplayAreaSettings() {
        return pictogramDisplayAreaSettings;
    }

    /**
     * Sets the value of the pictogramDisplayAreaSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictogramDisplayAreaSettings }
     *     
     */
    public void setPictogramDisplayAreaSettings(PictogramDisplayAreaSettings value) {
        this.pictogramDisplayAreaSettings = value;
    }

    /**
     * Gets the value of the pictogramDisplayAreaIndex property.
     * 
     */
    public int getPictogramDisplayAreaIndex() {
        return pictogramDisplayAreaIndex;
    }

    /**
     * Sets the value of the pictogramDisplayAreaIndex property.
     * 
     */
    public void setPictogramDisplayAreaIndex(int value) {
        this.pictogramDisplayAreaIndex = value;
    }

}
