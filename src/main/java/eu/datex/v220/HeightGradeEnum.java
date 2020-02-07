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
 * <p>Java class for HeightGradeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HeightGradeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="aboveGrade"/&gt;
 *     &lt;enumeration value="atGrade"/&gt;
 *     &lt;enumeration value="belowGrade"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HeightGradeEnum")
@XmlEnum
public enum HeightGradeEnum {

    @XmlEnumValue("aboveGrade")
    ABOVE_GRADE("aboveGrade"),
    @XmlEnumValue("atGrade")
    AT_GRADE("atGrade"),
    @XmlEnumValue("belowGrade")
    BELOW_GRADE("belowGrade");
    private final String value;

    HeightGradeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeightGradeEnum fromValue(String v) {
        for (HeightGradeEnum c: HeightGradeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
