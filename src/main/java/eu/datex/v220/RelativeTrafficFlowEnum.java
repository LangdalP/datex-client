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
 * <p>Java class for RelativeTrafficFlowEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelativeTrafficFlowEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="trafficVeryMuchHeavierThanNormal"/&gt;
 *     &lt;enumeration value="trafficHeavierThanNormal"/&gt;
 *     &lt;enumeration value="trafficFlowNormal"/&gt;
 *     &lt;enumeration value="trafficLighterThanNormal"/&gt;
 *     &lt;enumeration value="trafficVeryMuchLighterThanNormal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelativeTrafficFlowEnum")
@XmlEnum
public enum RelativeTrafficFlowEnum {

    @XmlEnumValue("trafficVeryMuchHeavierThanNormal")
    TRAFFIC_VERY_MUCH_HEAVIER_THAN_NORMAL("trafficVeryMuchHeavierThanNormal"),
    @XmlEnumValue("trafficHeavierThanNormal")
    TRAFFIC_HEAVIER_THAN_NORMAL("trafficHeavierThanNormal"),
    @XmlEnumValue("trafficFlowNormal")
    TRAFFIC_FLOW_NORMAL("trafficFlowNormal"),
    @XmlEnumValue("trafficLighterThanNormal")
    TRAFFIC_LIGHTER_THAN_NORMAL("trafficLighterThanNormal"),
    @XmlEnumValue("trafficVeryMuchLighterThanNormal")
    TRAFFIC_VERY_MUCH_LIGHTER_THAN_NORMAL("trafficVeryMuchLighterThanNormal");
    private final String value;

    RelativeTrafficFlowEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelativeTrafficFlowEnum fromValue(String v) {
        for (RelativeTrafficFlowEnum c: RelativeTrafficFlowEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
