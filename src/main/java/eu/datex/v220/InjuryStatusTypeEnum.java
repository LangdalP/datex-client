
package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InjuryStatusTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InjuryStatusTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="dead"/&gt;
 *     &lt;enumeration value="injured"/&gt;
 *     &lt;enumeration value="seriouslyInjured"/&gt;
 *     &lt;enumeration value="slightlyInjured"/&gt;
 *     &lt;enumeration value="uninjured"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InjuryStatusTypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum InjuryStatusTypeEnum {

    @XmlEnumValue("dead")
    DEAD("dead"),
    @XmlEnumValue("injured")
    INJURED("injured"),
    @XmlEnumValue("seriouslyInjured")
    SERIOUSLY_INJURED("seriouslyInjured"),
    @XmlEnumValue("slightlyInjured")
    SLIGHTLY_INJURED("slightlyInjured"),
    @XmlEnumValue("uninjured")
    UNINJURED("uninjured"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    InjuryStatusTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InjuryStatusTypeEnum fromValue(String v) {
        for (InjuryStatusTypeEnum c: InjuryStatusTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
