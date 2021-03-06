
package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangedFlagEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangedFlagEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="catalogue"/&gt;
 *     &lt;enumeration value="filter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChangedFlagEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum ChangedFlagEnum {

    @XmlEnumValue("catalogue")
    CATALOGUE("catalogue"),
    @XmlEnumValue("filter")
    FILTER("filter");
    private final String value;

    ChangedFlagEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangedFlagEnum fromValue(String v) {
        for (ChangedFlagEnum c: ChangedFlagEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
