
package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatingModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatingModeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="operatingMode0"/&gt;
 *     &lt;enumeration value="operatingMode1"/&gt;
 *     &lt;enumeration value="operatingMode2"/&gt;
 *     &lt;enumeration value="operatingMode3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperatingModeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum OperatingModeEnum {

    @XmlEnumValue("operatingMode0")
    OPERATING_MODE_0("operatingMode0"),
    @XmlEnumValue("operatingMode1")
    OPERATING_MODE_1("operatingMode1"),
    @XmlEnumValue("operatingMode2")
    OPERATING_MODE_2("operatingMode2"),
    @XmlEnumValue("operatingMode3")
    OPERATING_MODE_3("operatingMode3");
    private final String value;

    OperatingModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatingModeEnum fromValue(String v) {
        for (OperatingModeEnum c: OperatingModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
