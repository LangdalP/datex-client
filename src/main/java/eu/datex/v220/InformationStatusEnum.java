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
 * <p>Java class for InformationStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InformationStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="real"/&gt;
 *     &lt;enumeration value="securityExercise"/&gt;
 *     &lt;enumeration value="technicalExercise"/&gt;
 *     &lt;enumeration value="test"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InformationStatusEnum")
@XmlEnum
public enum InformationStatusEnum {

    @XmlEnumValue("real")
    REAL("real"),
    @XmlEnumValue("securityExercise")
    SECURITY_EXERCISE("securityExercise"),
    @XmlEnumValue("technicalExercise")
    TECHNICAL_EXERCISE("technicalExercise"),
    @XmlEnumValue("test")
    TEST("test");
    private final String value;

    InformationStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InformationStatusEnum fromValue(String v) {
        for (InformationStatusEnum c: InformationStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
