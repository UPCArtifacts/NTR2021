/**
 * Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.uphf;

public class Result  implements java.io.Serializable {
    private int scoreTeamOne;

    private int scoreTeamSecond;

    private java.lang.String teamOneName;

    private java.lang.String teamOneSecond;

    public Result() {
    }

    @Override
	public String toString() {
		return "Result [scoreTeamOne=" + scoreTeamOne + ", scoreTeamSecond=" + scoreTeamSecond + ", teamOneName="
				+ teamOneName + ", teamOneSecond=" + teamOneSecond + "]";
	}

	public Result(
           int scoreTeamOne,
           int scoreTeamSecond,
           java.lang.String teamOneName,
           java.lang.String teamOneSecond) {
           this.scoreTeamOne = scoreTeamOne;
           this.scoreTeamSecond = scoreTeamSecond;
           this.teamOneName = teamOneName;
           this.teamOneSecond = teamOneSecond;
    }


    /**
     * Gets the scoreTeamOne value for this Result.
     * 
     * @return scoreTeamOne
     */
    public int getScoreTeamOne() {
        return scoreTeamOne;
    }


    /**
     * Sets the scoreTeamOne value for this Result.
     * 
     * @param scoreTeamOne
     */
    public void setScoreTeamOne(int scoreTeamOne) {
        this.scoreTeamOne = scoreTeamOne;
    }


    /**
     * Gets the scoreTeamSecond value for this Result.
     * 
     * @return scoreTeamSecond
     */
    public int getScoreTeamSecond() {
        return scoreTeamSecond;
    }


    /**
     * Sets the scoreTeamSecond value for this Result.
     * 
     * @param scoreTeamSecond
     */
    public void setScoreTeamSecond(int scoreTeamSecond) {
        this.scoreTeamSecond = scoreTeamSecond;
    }


    /**
     * Gets the teamOneName value for this Result.
     * 
     * @return teamOneName
     */
    public java.lang.String getTeamOneName() {
        return teamOneName;
    }


    /**
     * Sets the teamOneName value for this Result.
     * 
     * @param teamOneName
     */
    public void setTeamOneName(java.lang.String teamOneName) {
        this.teamOneName = teamOneName;
    }


    /**
     * Gets the teamOneSecond value for this Result.
     * 
     * @return teamOneSecond
     */
    public java.lang.String getTeamOneSecond() {
        return teamOneSecond;
    }


    /**
     * Sets the teamOneSecond value for this Result.
     * 
     * @param teamOneSecond
     */
    public void setTeamOneSecond(java.lang.String teamOneSecond) {
        this.teamOneSecond = teamOneSecond;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Result)) return false;
        Result other = (Result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.scoreTeamOne == other.getScoreTeamOne() &&
            this.scoreTeamSecond == other.getScoreTeamSecond() &&
            ((this.teamOneName==null && other.getTeamOneName()==null) || 
             (this.teamOneName!=null &&
              this.teamOneName.equals(other.getTeamOneName()))) &&
            ((this.teamOneSecond==null && other.getTeamOneSecond()==null) || 
             (this.teamOneSecond!=null &&
              this.teamOneSecond.equals(other.getTeamOneSecond())));
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
        _hashCode += getScoreTeamOne();
        _hashCode += getScoreTeamSecond();
        if (getTeamOneName() != null) {
            _hashCode += getTeamOneName().hashCode();
        }
        if (getTeamOneSecond() != null) {
            _hashCode += getTeamOneSecond().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://uphf.fr", "Result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scoreTeamOne");
        elemField.setXmlName(new javax.xml.namespace.QName("http://uphf.fr", "scoreTeamOne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scoreTeamSecond");
        elemField.setXmlName(new javax.xml.namespace.QName("http://uphf.fr", "scoreTeamSecond"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamOneName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://uphf.fr", "teamOneName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamOneSecond");
        elemField.setXmlName(new javax.xml.namespace.QName("http://uphf.fr", "teamOneSecond"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
