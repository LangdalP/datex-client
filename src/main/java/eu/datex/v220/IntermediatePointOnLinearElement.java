//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.07 at 10:12:10 AM CET 
//


package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _IntermediatePointOnLinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_IntermediatePointOnLinearElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referent" type="{http://datex2.eu/schema/2/2_0}Referent"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_IntermediatePointOnLinearElement", propOrder = {
    "referent"
})
public class IntermediatePointOnLinearElement {

    @XmlElement(required = true)
    protected Referent referent;
    @XmlAttribute(name = "index", required = true)
    protected int index;

    /**
     * Gets the value of the referent property.
     * 
     * @return
     *     possible object is
     *     {@link Referent }
     *     
     */
    public Referent getReferent() {
        return referent;
    }

    /**
     * Sets the value of the referent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Referent }
     *     
     */
    public void setReferent(Referent value) {
        this.referent = value;
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

}
