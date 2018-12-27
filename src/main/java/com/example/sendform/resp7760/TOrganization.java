
package com.example.sendform.resp7760;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Юридическое лицо
 * 
 * <p>Java class for tOrganization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tOrganization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code_SP" type="{}dGovernance"/>
 *         &lt;element name="Content">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MdfDate" type="{}tDate" minOccurs="0"/>
 *         &lt;element name="Code_OPF" type="{}dOPF" minOccurs="0"/>
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Country" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="2000"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="INN">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="10"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="Code_OGRN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RegDate" type="{}tDate" minOccurs="0"/>
 *         &lt;element name="AgencyRegistration" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Code_CPP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Location" type="{}tAddress" minOccurs="0"/>
 *         &lt;element name="FactLocation" type="{}tAddress" minOccurs="0"/>
 *         &lt;element name="E-mail" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOrganization", propOrder = {
    "codeSP",
    "content",
    "mdfDate",
    "codeOPF",
    "name",
    "country",
    "inn",
    "codeOGRN",
    "regDate",
    "agencyRegistration",
    "codeCPP",
    "location",
    "factLocation",
    "eMail"
})
public class TOrganization {

    @XmlElement(name = "Code_SP", required = true)
    protected String codeSP;
    @XmlElement(name = "Content", required = true)
    protected String content;
    @XmlElement(name = "MdfDate")
    protected String mdfDate;
    @XmlElement(name = "Code_OPF")
    protected String codeOPF;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "Code_OGRN")
    protected String codeOGRN;
    @XmlElement(name = "RegDate")
    protected String regDate;
    @XmlElement(name = "AgencyRegistration")
    protected String agencyRegistration;
    @XmlElement(name = "Code_CPP")
    protected String codeCPP;
    @XmlElement(name = "Location")
    protected TAddress location;
    @XmlElement(name = "FactLocation")
    protected TAddress factLocation;
    @XmlElement(name = "E-mail")
    protected String eMail;

    /**
     * Gets the value of the codeSP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSP() {
        return codeSP;
    }

    /**
     * Sets the value of the codeSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSP(String value) {
        this.codeSP = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the mdfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdfDate() {
        return mdfDate;
    }

    /**
     * Sets the value of the mdfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdfDate(String value) {
        this.mdfDate = value;
    }

    /**
     * Gets the value of the codeOPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeOPF() {
        return codeOPF;
    }

    /**
     * Sets the value of the codeOPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeOPF(String value) {
        this.codeOPF = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the codeOGRN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeOGRN() {
        return codeOGRN;
    }

    /**
     * Sets the value of the codeOGRN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeOGRN(String value) {
        this.codeOGRN = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDate(String value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the agencyRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyRegistration() {
        return agencyRegistration;
    }

    /**
     * Sets the value of the agencyRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyRegistration(String value) {
        this.agencyRegistration = value;
    }

    /**
     * Gets the value of the codeCPP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeCPP() {
        return codeCPP;
    }

    /**
     * Sets the value of the codeCPP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeCPP(String value) {
        this.codeCPP = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link TAddress }
     *     
     */
    public TAddress getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAddress }
     *     
     */
    public void setLocation(TAddress value) {
        this.location = value;
    }

    /**
     * Gets the value of the factLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TAddress }
     *     
     */
    public TAddress getFactLocation() {
        return factLocation;
    }

    /**
     * Sets the value of the factLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAddress }
     *     
     */
    public void setFactLocation(TAddress value) {
        this.factLocation = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

}
