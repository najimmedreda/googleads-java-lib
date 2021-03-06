
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineConversionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfflineConversionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNPARSEABLE_GCLID"/>
 *     &lt;enumeration value="CONVERSION_PRECEDES_CLICK"/>
 *     &lt;enumeration value="EXPIRED_CLICK"/>
 *     &lt;enumeration value="TOO_RECENT_CLICK"/>
 *     &lt;enumeration value="INVALID_CLICK"/>
 *     &lt;enumeration value="UNAUTHORIZED_USER"/>
 *     &lt;enumeration value="INVALID_CONVERSION_TYPE"/>
 *     &lt;enumeration value="CLICK_MISSING_CONVERSION_LABEL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OfflineConversionError.Reason")
@XmlEnum
public enum OfflineConversionErrorReason {


    /**
     * 
     *                 This google click ID could not be decoded.
     *               
     * 
     */
    UNPARSEABLE_GCLID,

    /**
     * 
     *                 This conversion is reported to have happened before the click.
     *               
     * 
     */
    CONVERSION_PRECEDES_CLICK,

    /**
     * 
     *                 This click occurred either before the conversion window for the
     *                 concerned conversion name (default is 90 days).
     *               
     * 
     */
    EXPIRED_CLICK,

    /**
     * 
     *                 This click occurred less than 24 hours ago, please try again after a day or so.
     *               
     * 
     */
    TOO_RECENT_CLICK,

    /**
     * 
     *                 This click does not exist in the system. This can occur if google click ids are collected
     *                 for non AdWords clicks (e.g. dart search).
     *               
     * 
     */
    INVALID_CLICK,

    /**
     * 
     *                 This customer is trying to upload conversions for a different customer that it does not
     *                 manage.
     *               
     * 
     */
    UNAUTHORIZED_USER,

    /**
     * 
     *                 This customer does not have an import conversion with a name that matches the label
     *                 of this conversion.
     *               
     * 
     */
    INVALID_CONVERSION_TYPE,

    /**
     * 
     *                 Cannot process clicks that occurred when none of the effective conversion types in the
     *                 account were enabled, to generate conversions.
     *               
     * 
     */
    CLICK_MISSING_CONVERSION_LABEL,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static OfflineConversionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
