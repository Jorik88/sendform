
package com.example.sendform.resp260;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Objects;


/**
 * <p>Java class for ResidentPreferentialCategoriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResidentPreferentialCategoriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDateReasons" type="{http://asur/dszn/}ArrayOfReasonDocumentType" minOccurs="0"/>
 *         &lt;element name="Snils" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NamePreferentialCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferentialCategoryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StartDateReasons" type="{http://asur/dszn/}ArrayOfReasonDocumentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidentPreferentialCategoriesType", namespace = "http://asur/dszn/", propOrder = {
    "endDate",
    "endDateReasons",
    "snils",
    "namePreferentialCategory",
    "preferentialCategoryId",
    "startDate",
    "startDateReasons"
})
public class ResidentPreferentialCategoriesType {

    @XmlElement(name = "EndDate", namespace = "http://asur/dszn/", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "EndDateReasons", namespace = "http://asur/dszn/")
    protected ArrayOfReasonDocumentType endDateReasons;
    @XmlElement(name = "Snils", namespace = "http://asur/dszn/")
    protected String snils;
    @XmlElement(name = "NamePreferentialCategory", namespace = "http://asur/dszn/")
    protected String namePreferentialCategory;
    @XmlElement(name = "PreferentialCategoryId", namespace = "http://asur/dszn/")
    protected int preferentialCategoryId;
    @XmlElement(name = "StartDate", namespace = "http://asur/dszn/", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "StartDateReasons", namespace = "http://asur/dszn/")
    protected ArrayOfReasonDocumentType startDateReasons;

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the endDateReasons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReasonDocumentType }
     *     
     */
    public ArrayOfReasonDocumentType getEndDateReasons() {
        return endDateReasons;
    }

    /**
     * Sets the value of the endDateReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReasonDocumentType }
     *     
     */
    public void setEndDateReasons(ArrayOfReasonDocumentType value) {
        this.endDateReasons = value;
    }

    /**
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnils() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnils(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the namePreferentialCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePreferentialCategory() {
        return namePreferentialCategory;
    }

    /**
     * Sets the value of the namePreferentialCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePreferentialCategory(String value) {
        this.namePreferentialCategory = value;
    }

    /**
     * Gets the value of the preferentialCategoryId property.
     * 
     */
    public int getPreferentialCategoryId() {
        return preferentialCategoryId;
    }

    /**
     * Sets the value of the preferentialCategoryId property.
     * 
     */
    public void setPreferentialCategoryId(int value) {
        this.preferentialCategoryId = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the startDateReasons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReasonDocumentType }
     *     
     */
    public ArrayOfReasonDocumentType getStartDateReasons() {
        return startDateReasons;
    }

    /**
     * Sets the value of the startDateReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReasonDocumentType }
     *     
     */
    public void setStartDateReasons(ArrayOfReasonDocumentType value) {
        this.startDateReasons = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResidentPreferentialCategoriesType that = (ResidentPreferentialCategoriesType) o;
        return Objects.equals(snils, that.snils);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snils);
    }
}
