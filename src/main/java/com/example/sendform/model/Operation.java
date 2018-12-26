package com.example.sendform.model;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Java class for operation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="house" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationPlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandAndModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxAllowedWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weightWithoutLoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="personType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerBirthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="citizenship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation", namespace = "http://dssi.armd.ru/mvd/gibdd/fis/1.0/", propOrder = {
        "lastName",
        "firstName",
        "middleName",
        "inn",
        "birthday",
        "postalCode",
        "region",
        "area",
        "place",
        "street",
        "house",
        "building",
        "apartment",
        "departmentCode",
        "registrationPlate",
        "brandAndModel",
        "vehicleCategory",
        "vin",
        "organization",
        "kpp",
        "ogrn",
        "maxAllowedWeight",
        "weightWithoutLoad",
        "color",
        "registrationDocument",
        "registrationDate",
        "personType",
        "ownerBirthPlace",
        "citizenship",
        "sex",
        "ownerPhone"
})
public class Operation {

    @XmlElement
    protected String lastName;
    protected String firstName;
    protected String middleName;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    protected String postalCode;
    protected String region;
    protected String area;
    protected String place;
    protected String street;
    protected String house;
    protected String building;
    protected String apartment;
    protected String departmentCode;
    protected String registrationPlate;
    protected String brandAndModel;
    protected String vehicleCategory;
    protected String vin;
    protected String organization;
    @XmlElement(name = "KPP")
    protected String kpp;
    @XmlElement(name = "OGRN")
    protected String ogrn;
    protected String maxAllowedWeight;
    protected String weightWithoutLoad;
    protected String color;
    protected String registrationDocument;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationDate;
    protected String personType;
    protected String ownerBirthPlace;
    protected String citizenship;
    protected String sex;
    protected String ownerPhone;

    /**
     * Gets the value of the lastName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMiddleName(String value) {
        this.middleName = value;
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
     * Gets the value of the birthday property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the postalCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the region property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the area property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the place property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Gets the value of the street property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the house property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHouse(String value) {
        this.house = value;
    }

    /**
     * Gets the value of the building property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the apartment property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApartment() {
        return apartment;
    }

    /**
     * Sets the value of the apartment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApartment(String value) {
        this.apartment = value;
    }

    /**
     * Gets the value of the departmentCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDepartmentCode() {
        return departmentCode;
    }

    /**
     * Sets the value of the departmentCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDepartmentCode(String value) {
        this.departmentCode = value;
    }

    /**
     * Gets the value of the registrationPlate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegistrationPlate() {
        return registrationPlate;
    }

    /**
     * Sets the value of the registrationPlate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegistrationPlate(String value) {
        this.registrationPlate = value;
    }

    /**
     * Gets the value of the brandAndModel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBrandAndModel() {
        return brandAndModel;
    }

    /**
     * Sets the value of the brandAndModel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBrandAndModel(String value) {
        this.brandAndModel = value;
    }

    /**
     * Gets the value of the vehicleCategory property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVehicleCategory() {
        return vehicleCategory;
    }

    /**
     * Sets the value of the vehicleCategory property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVehicleCategory(String value) {
        this.vehicleCategory = value;
    }

    /**
     * Gets the value of the vin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVin() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVin(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the organization property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the kpp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKPP() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKPP(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the ogrn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOGRN(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the maxAllowedWeight property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMaxAllowedWeight() {
        return maxAllowedWeight;
    }

    /**
     * Sets the value of the maxAllowedWeight property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMaxAllowedWeight(String value) {
        this.maxAllowedWeight = value;
    }

    /**
     * Gets the value of the weightWithoutLoad property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWeightWithoutLoad() {
        return weightWithoutLoad;
    }

    /**
     * Sets the value of the weightWithoutLoad property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWeightWithoutLoad(String value) {
        this.weightWithoutLoad = value;
    }

    /**
     * Gets the value of the color property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the registrationDocument property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegistrationDocument() {
        return registrationDocument;
    }

    /**
     * Sets the value of the registrationDocument property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegistrationDocument(String value) {
        this.registrationDocument = value;
    }

    /**
     * Gets the value of the registrationDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the personType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPersonType() {
        return personType;
    }

    /**
     * Sets the value of the personType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPersonType(String value) {
        this.personType = value;
    }

    /**
     * Gets the value of the ownerBirthPlace property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOwnerBirthPlace() {
        return ownerBirthPlace;
    }

    /**
     * Sets the value of the ownerBirthPlace property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOwnerBirthPlace(String value) {
        this.ownerBirthPlace = value;
    }

    /**
     * Gets the value of the citizenship property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCitizenship(String value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the sex property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the ownerPhone property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOwnerPhone() {
        return ownerPhone;
    }

    /**
     * Sets the value of the ownerPhone property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOwnerPhone(String value) {
        this.ownerPhone = value;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", inn='" + inn + '\'' +
                ", birthday=" + birthday +
                ", postalCode='" + postalCode + '\'' +
                ", region='" + region + '\'' +
                ", area='" + area + '\'' +
                ", place='" + place + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                ", registrationPlate='" + registrationPlate + '\'' +
                ", brandAndModel='" + brandAndModel + '\'' +
                ", vehicleCategory='" + vehicleCategory + '\'' +
                ", vin='" + vin + '\'' +
                ", organization='" + organization + '\'' +
                ", kpp='" + kpp + '\'' +
                ", ogrn='" + ogrn + '\'' +
                ", maxAllowedWeight='" + maxAllowedWeight + '\'' +
                ", weightWithoutLoad='" + weightWithoutLoad + '\'' +
                ", color='" + color + '\'' +
                ", registrationDocument='" + registrationDocument + '\'' +
                ", registrationDate=" + registrationDate +
                ", personType='" + personType + '\'' +
                ", ownerBirthPlace='" + ownerBirthPlace + '\'' +
                ", citizenship='" + citizenship + '\'' +
                ", sex='" + sex + '\'' +
                ", ownerPhone='" + ownerPhone + '\'' +
                '}';
    }
}
