
package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplianceOptionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComplianceOptionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="advisory"/&gt;
 *     &lt;enumeration value="mandatory"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComplianceOptionEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum ComplianceOptionEnum {

    @XmlEnumValue("advisory")
    ADVISORY("advisory"),
    @XmlEnumValue("mandatory")
    MANDATORY("mandatory");
    private final String value;

    ComplianceOptionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComplianceOptionEnum fromValue(String v) {
        for (ComplianceOptionEnum c: ComplianceOptionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
