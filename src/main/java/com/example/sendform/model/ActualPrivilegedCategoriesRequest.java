package com.example.sendform.model;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "request")
public class ActualPrivilegedCategoriesRequest {

    /**
     * Фамилия
     */
    @XmlElement
    protected String firstname;

    /**
     * Имя
     */
    @XmlElement
    protected String lastname;

    /**
     * Отчество
     */
    @XmlElement
    protected String middlename;

    /**
     * Дата рождения
     */
//    @XmlElement
//    @XmlSchemaType(name = "dateTime")
//    protected XMLGregorianCalendar birthdate;

    /**
     * Тип документа, удостоверяющего личность
     */
    @XmlElement
    protected BigInteger doctype;

    /**
     * Серия документа, удостоверяющего личность
     */
    @XmlElement(name = "passport_serie")
    protected String docSerie;

    /**
     * Номер документа, удостоверяющего личность
     */
    @XmlElement(name = "passport")
    protected String docNumber;

    /**
     * Код льготной категории
     */
    protected String lgotakat;

    /**
     * СНИЛС
     */
    @XmlElement
    protected String snils;

//    /**
//     * Gets the value of the birthdate property.
//     *
//     * @return possible object is
//     * {@link XMLGregorianCalendar }
//     */
//    public XMLGregorianCalendar getBirthdate() {
//        return birthdate;
//    }
//
//    /**
//     * Sets the value of the birthdate property.
//     *
//     * @param value allowed object is
//     *              {@link XMLGregorianCalendar }
//     */
//    public void setBirthdate(XMLGregorianCalendar value) {
//        this.birthdate = value;
//    }

    /**
     * Gets the value of the doctype property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getDoctype() {
        return doctype;
    }

    /**
     * Sets the value of the doctype property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDoctype(BigInteger value) {
        this.doctype = value;
    }

    /**
     * Gets the value of the firstname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the lgotakat property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLgotakat() {
        return lgotakat;
    }

    /**
     * Sets the value of the lgotakat property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLgotakat(String value) {
        this.lgotakat = value;
    }

    /**
     * Gets the value of the middlename property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMiddlename(String value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the passport property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the passport property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the passportSerie property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocSerie() {
        return docSerie;
    }

    /**
     * Sets the value of the passportSerie property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocSerie(String value) {
        this.docSerie = value;
    }

    /**
     * Gets the value of the snils property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSnils() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSnils(String value) {
        this.snils = value;
    }
}
