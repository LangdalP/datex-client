
package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidityStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidityStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="suspended"/&gt;
 *     &lt;enumeration value="definedByValidityTimeSpec"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValidityStatusEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum ValidityStatusEnum {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),
    @XmlEnumValue("definedByValidityTimeSpec")
    DEFINED_BY_VALIDITY_TIME_SPEC("definedByValidityTimeSpec");
    private final String value;

    ValidityStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValidityStatusEnum fromValue(String v) {
        for (ValidityStatusEnum c: ValidityStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
