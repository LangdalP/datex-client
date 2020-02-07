//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.07 at 10:12:10 AM CET 
//


package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogueReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="keyCatalogueReference" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="catalogueReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueReference", propOrder = {
    "keyCatalogueReference",
    "catalogueReferenceExtension"
})
public class CatalogueReference {

    @XmlElement(required = true)
    protected String keyCatalogueReference;
    protected ExtensionType catalogueReferenceExtension;

    /**
     * Gets the value of the keyCatalogueReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyCatalogueReference() {
        return keyCatalogueReference;
    }

    /**
     * Sets the value of the keyCatalogueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyCatalogueReference(String value) {
        this.keyCatalogueReference = value;
    }

    /**
     * Gets the value of the catalogueReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCatalogueReferenceExtension() {
        return catalogueReferenceExtension;
    }

    /**
     * Sets the value of the catalogueReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCatalogueReferenceExtension(ExtensionType value) {
        this.catalogueReferenceExtension = value;
    }

}
