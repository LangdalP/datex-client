
package eu.datex.v220;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegNamedOnlyArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegNamedOnlyArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegAreaLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://datex2.eu/schema/2/2_0}TpegAreaDescriptor" maxOccurs="unbounded"/&gt;
 *         &lt;element name="tpegNamedOnlyAreaExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegNamedOnlyArea", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "name",
    "tpegNamedOnlyAreaExtension"
})
public class TpegNamedOnlyArea
    extends TpegAreaLocation
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected List<TpegAreaDescriptor> name;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType tpegNamedOnlyAreaExtension;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TpegAreaDescriptor }
     * 
     * 
     */
    public List<TpegAreaDescriptor> getName() {
        if (name == null) {
            name = new ArrayList<TpegAreaDescriptor>();
        }
        return this.name;
    }

    /**
     * Gets the value of the tpegNamedOnlyAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegNamedOnlyAreaExtension() {
        return tpegNamedOnlyAreaExtension;
    }

    /**
     * Sets the value of the tpegNamedOnlyAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegNamedOnlyAreaExtension(ExtensionType value) {
        this.tpegNamedOnlyAreaExtension = value;
    }

}
