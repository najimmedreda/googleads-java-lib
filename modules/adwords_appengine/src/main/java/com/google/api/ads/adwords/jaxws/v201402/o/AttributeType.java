
package com.google.api.ads.adwords.jaxws.v201402.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="AD_TYPE_SPEC"/>
 *     &lt;enumeration value="APPROX_CONTENT_IMPRESSIONS_PER_DAY"/>
 *     &lt;enumeration value="CATEGORY_PRODUCTS_AND_SERVICES"/>
 *     &lt;enumeration value="COMPETITION"/>
 *     &lt;enumeration value="CRITERION"/>
 *     &lt;enumeration value="EXTRACTED_FROM_WEBPAGE"/>
 *     &lt;enumeration value="IDEA_TYPE"/>
 *     &lt;enumeration value="IN_STREAM_AD_INFO"/>
 *     &lt;enumeration value="KEYWORD_TEXT"/>
 *     &lt;enumeration value="PLACEMENT_NAME"/>
 *     &lt;enumeration value="SAMPLE_URL"/>
 *     &lt;enumeration value="PLACEMENT_CATEGORY"/>
 *     &lt;enumeration value="PLACEMENT_TYPE"/>
 *     &lt;enumeration value="SEARCH_VOLUME"/>
 *     &lt;enumeration value="AVERAGE_CPC"/>
 *     &lt;enumeration value="TARGETED_MONTHLY_SEARCHES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttributeType")
@XmlEnum
public enum AttributeType {


    /**
     * 
     *                 Value substituted in when the actual value is not available in the Web API
     *                 version being used.  (Please upgrade to the latest published WSDL.)
     *                 <p>This element is not supported directly by any {@link IdeaType}.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Represents the various types of ads, sizes of ads, and ad configurations that
     *                 may be specified within the given placement idea.
     *                 
     *                 <p>Resulting attribute is
     *                 {@link com.google.ads.api.services.common.optimization.attributes.AdTypeSpecAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: PLACEMENT.
     *               
     * 
     */
    AD_TYPE_SPEC,

    /**
     * 
     *                 Represents the (approximate) number of impressions per day for this placement idea on
     *                 the content network.
     *                 
     *                 Resulting attribute is
     *                 {@link com.google.ads.api.services.common.optimization.attributes.LongRangeAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: PLACEMENT.
     *               
     * 
     */
    APPROX_CONTENT_IMPRESSIONS_PER_DAY,

    /**
     * 
     *                 Represents a category ID in the "Products and Services" taxonomy.
     *                 
     *                 <p>Resulting attribute is
     *                 {@link com.google.ads.api.services.common.optimization.attributes.IntegerSetAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD.
     *               
     * 
     */
    CATEGORY_PRODUCTS_AND_SERVICES,

    /**
     * 
     *                 Represents the relative amount of competition associated with the given keyword idea,
     *                 relative to other keywords. This value will be between 0 and 1 (inclusive).
     *                 
     *                 <p>Resulting attribute is
     *                 {@link com.google.ads.api.services.common.optimization.attributes.DoubleAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD.
     *               
     * 
     */
    COMPETITION,

    /**
     * 
     *                 Represents a keyword or placement, depending on request type. Starting at
     *                 version v201206, only placement requests can retrieve this attribute.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD, PLACEMENT.
     *               
     * 
     */
    CRITERION,

    /**
     * 
     *                 Represents the webpage from which this keyword idea was extracted (if applicable.)
     *                 
     *                 <p>Resulting attribute is
     *                 {@link com.google.ads.api.services.common.optimization.attributes.WebpageDescriptorAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD.
     *               
     * 
     */
    EXTRACTED_FROM_WEBPAGE,

    /**
     * 
     *                 Represents the type of the given idea.
     *                 
     *                 <p>Resulting attribute is
     *                 {@link com.google.ads.api.services.common.optimization.attributes.IdeaTypeAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD, PLACEMENT.
     *               
     * 
     */
    IDEA_TYPE,

    /**
     * 
     *                 Represents the duration(s)/other instream information, for the given placement idea.
     *                 (if applicable)
     *                 
     *                 <p>Resulting attribute is
     *                 {@link com.google.ads.api.services.common.optimization.attributes.InStreamAdInfoAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: PLACEMENT.
     *               
     * 
     */
    IN_STREAM_AD_INFO,

    /**
     * 
     *                 Represents the keyword text for the given keyword idea.
     *                 
     *                 <p>Resulting attribute is
     *                 {@link com.google.ads.api.services.common.optimization.attributes.StringAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD.
     *               
     * 
     */
    KEYWORD_TEXT,

    /**
     * 
     *                 Represents the publisher given name of the given placement idea (if applicable).
     *                 
     *                 <p>Resulting attribute is
     *                 {@link com.google.ads.api.services.common.optimization.attributes.StringAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: PLACEMENT.
     *               
     * 
     */
    PLACEMENT_NAME,

    /**
     * 
     *                 Represents a sample page upon which the given placement idea shows from the content network.
     *                 
     *                 <p>Resulting attribute is
     *                 {@link com.google.ads.api.services.common.optimization.attributes.StringAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: PLACEMENT.
     *               
     * 
     */
    SAMPLE_URL,

    /**
     * 
     *                 Represents a category id for a category within the category hierarchy for placement ideas.
     *                 
     *                 Resulting attribute is
     *                 {@link com.google.ads.api.services.common.optimization.attributes.IntegerAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: PLACEMENT.
     *               
     * 
     */
    PLACEMENT_CATEGORY,

    /**
     * 
     *                 Represents the type of media of the given placement idea.  Some examples of this could include:
     *                 videos on the web, web sites, flash games on the content network, website feeds, etc.
     *                 
     *                 <p>Resulting attribute is
     *                 {@link com.google.ads.api.services.common.optimization.attributes.PlacementTypeAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: PLACEMENT.
     *               
     * 
     */
    PLACEMENT_TYPE,

    /**
     * 
     *                 Represents either the (approximate) number of searches for the given keyword idea on google.com
     *                 or google.com and partners, depending on the user's targeting.
     *                 
     *                 <p>Resulting attribute is
     *                 {@link com.google.ads.api.services.common.optimization.attributes.LongAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD.
     *               
     * 
     */
    SEARCH_VOLUME,

    /**
     * 
     *                 Represents the average cost per click historically paid for the keyword.
     *                 
     *                 <p>Resulting attribute is
     *                 {@link com.google.ads.api.services.common.optimization.attributes.MoneyAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD.
     *               
     * 
     */
    AVERAGE_CPC,

    /**
     * 
     *                 Represents the (approximated) number of searches on this keyword idea (as available for the
     *                 past twelve months), targeted to the specified geographies.
     *                 
     *                 <p>Resulting attribute is
     *                 {@link com.google.ads.api.services.common.optimization.attributes.MonthlySearchVolumeAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD.
     *               
     * 
     */
    TARGETED_MONTHLY_SEARCHES;

    public String value() {
        return name();
    }

    public static AttributeType fromValue(String v) {
        return valueOf(v);
    }

}
