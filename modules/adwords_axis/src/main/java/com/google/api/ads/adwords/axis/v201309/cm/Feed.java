/**
 * Feed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * A Feed identifies a source of data and its schema. The data for
 * the Feed can either be
 *             user-entered via the FeedItemService or system-generated,
 * in which case the data is provided
 *             automatically.
 */
public class Feed  implements java.io.Serializable {
    /* Id of the Feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : REMOVE, SET.</span> */
    private java.lang.Long id;

    /* Name of the Feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 128, inclusive, (trimmed).</span> */
    private java.lang.String name;

    /* The Feed's schema. In SET operations, these attributes will
     * be considered new attributes and
     *                 will be appended to the existing list of attributes
     * unless this list is an exact copy of the
     *                 existing list (as would be obtained via {@link FeedService#get}).
     * <span class="constraint Selectable">This field can be selected using
     * the value "Attributes".</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.FeedAttribute[] attributes;

    /* Status of the Feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.FeedStatus status;

    /* Specifies who manages the {@link FeedAttribute}s for the {@link
     * Feed}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Origin".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.FeedOrigin origin;

    public Feed() {
    }

    public Feed(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201309.cm.FeedAttribute[] attributes,
           com.google.api.ads.adwords.axis.v201309.cm.FeedStatus status,
           com.google.api.ads.adwords.axis.v201309.cm.FeedOrigin origin) {
           this.id = id;
           this.name = name;
           this.attributes = attributes;
           this.status = status;
           this.origin = origin;
    }


    /**
     * Gets the id value for this Feed.
     * 
     * @return id   * Id of the Feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : REMOVE, SET.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Feed.
     * 
     * @param id   * Id of the Feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : REMOVE, SET.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Feed.
     * 
     * @return name   * Name of the Feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 128, inclusive, (trimmed).</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Feed.
     * 
     * @param name   * Name of the Feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 128, inclusive, (trimmed).</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the attributes value for this Feed.
     * 
     * @return attributes   * The Feed's schema. In SET operations, these attributes will
     * be considered new attributes and
     *                 will be appended to the existing list of attributes
     * unless this list is an exact copy of the
     *                 existing list (as would be obtained via {@link FeedService#get}).
     * <span class="constraint Selectable">This field can be selected using
     * the value "Attributes".</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.FeedAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this Feed.
     * 
     * @param attributes   * The Feed's schema. In SET operations, these attributes will
     * be considered new attributes and
     *                 will be appended to the existing list of attributes
     * unless this list is an exact copy of the
     *                 existing list (as would be obtained via {@link FeedService#get}).
     * <span class="constraint Selectable">This field can be selected using
     * the value "Attributes".</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public void setAttributes(com.google.api.ads.adwords.axis.v201309.cm.FeedAttribute[] attributes) {
        this.attributes = attributes;
    }

    public com.google.api.ads.adwords.axis.v201309.cm.FeedAttribute getAttributes(int i) {
        return this.attributes[i];
    }

    public void setAttributes(int i, com.google.api.ads.adwords.axis.v201309.cm.FeedAttribute _value) {
        this.attributes[i] = _value;
    }


    /**
     * Gets the status value for this Feed.
     * 
     * @return status   * Status of the Feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.FeedStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Feed.
     * 
     * @param status   * Status of the Feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201309.cm.FeedStatus status) {
        this.status = status;
    }


    /**
     * Gets the origin value for this Feed.
     * 
     * @return origin   * Specifies who manages the {@link FeedAttribute}s for the {@link
     * Feed}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Origin".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.FeedOrigin getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this Feed.
     * 
     * @param origin   * Specifies who manages the {@link FeedAttribute}s for the {@link
     * Feed}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Origin".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setOrigin(com.google.api.ads.adwords.axis.v201309.cm.FeedOrigin origin) {
        this.origin = origin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Feed)) return false;
        Feed other = (Feed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Feed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Feed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "FeedAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Feed.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Feed.Origin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
