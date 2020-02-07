//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.07 at 10:12:10 AM CET 
//


package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PollutantTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PollutantTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="benzeneTolueneXylene"/&gt;
 *     &lt;enumeration value="carbonMonoxide"/&gt;
 *     &lt;enumeration value="lead"/&gt;
 *     &lt;enumeration value="methane"/&gt;
 *     &lt;enumeration value="nitricOxide"/&gt;
 *     &lt;enumeration value="nitrogenDioxide"/&gt;
 *     &lt;enumeration value="nitrogenMonoxide"/&gt;
 *     &lt;enumeration value="nitrogenOxides"/&gt;
 *     &lt;enumeration value="nonMethaneHydrocarbons"/&gt;
 *     &lt;enumeration value="ozone"/&gt;
 *     &lt;enumeration value="particulates10"/&gt;
 *     &lt;enumeration value="polycyclicAromaticHydrocarbons"/&gt;
 *     &lt;enumeration value="primaryParticulate"/&gt;
 *     &lt;enumeration value="sulphurDioxide"/&gt;
 *     &lt;enumeration value="totalHydrocarbons"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PollutantTypeEnum")
@XmlEnum
public enum PollutantTypeEnum {

    @XmlEnumValue("benzeneTolueneXylene")
    BENZENE_TOLUENE_XYLENE("benzeneTolueneXylene"),
    @XmlEnumValue("carbonMonoxide")
    CARBON_MONOXIDE("carbonMonoxide"),
    @XmlEnumValue("lead")
    LEAD("lead"),
    @XmlEnumValue("methane")
    METHANE("methane"),
    @XmlEnumValue("nitricOxide")
    NITRIC_OXIDE("nitricOxide"),
    @XmlEnumValue("nitrogenDioxide")
    NITROGEN_DIOXIDE("nitrogenDioxide"),
    @XmlEnumValue("nitrogenMonoxide")
    NITROGEN_MONOXIDE("nitrogenMonoxide"),
    @XmlEnumValue("nitrogenOxides")
    NITROGEN_OXIDES("nitrogenOxides"),
    @XmlEnumValue("nonMethaneHydrocarbons")
    NON_METHANE_HYDROCARBONS("nonMethaneHydrocarbons"),
    @XmlEnumValue("ozone")
    OZONE("ozone"),
    @XmlEnumValue("particulates10")
    PARTICULATES_10("particulates10"),
    @XmlEnumValue("polycyclicAromaticHydrocarbons")
    POLYCYCLIC_AROMATIC_HYDROCARBONS("polycyclicAromaticHydrocarbons"),
    @XmlEnumValue("primaryParticulate")
    PRIMARY_PARTICULATE("primaryParticulate"),
    @XmlEnumValue("sulphurDioxide")
    SULPHUR_DIOXIDE("sulphurDioxide"),
    @XmlEnumValue("totalHydrocarbons")
    TOTAL_HYDROCARBONS("totalHydrocarbons");
    private final String value;

    PollutantTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PollutantTypeEnum fromValue(String v) {
        for (PollutantTypeEnum c: PollutantTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
