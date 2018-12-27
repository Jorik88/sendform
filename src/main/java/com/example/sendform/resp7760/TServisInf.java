
package com.example.sendform.resp7760;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сервисная информация
 * 
 * <p>Java class for tServisInf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tServisInf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sender">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Kod" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="12"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Name" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Region" type="{}dRegionsRF" />
 *                 &lt;attribute name="Date_Upload" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="Appointment">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="250"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="FIO">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="100"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="E_Mail">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="60"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Telephone">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="100"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Recipient">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Kod">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="12"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Name">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="CodeType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="06" />
 *       &lt;attribute name="Scope" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="10"/>
 *             &lt;enumeration value="EGRP"/>
 *             &lt;enumeration value="GKN"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tServisInf", propOrder = {
    "sender",
    "recipient"
})
public class TServisInf {

    @XmlElement(name = "Sender", required = true)
    protected TServisInf.Sender sender;
    @XmlElement(name = "Recipient", required = true)
    protected TServisInf.Recipient recipient;
    @XmlAttribute(name = "CodeType", required = true)
    protected String codeType;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "Scope", required = true)
    protected String scope;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link TServisInf.Sender }
     *     
     */
    public TServisInf.Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link TServisInf.Sender }
     *     
     */
    public void setSender(TServisInf.Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link TServisInf.Recipient }
     *     
     */
    public TServisInf.Recipient getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link TServisInf.Recipient }
     *     
     */
    public void setRecipient(TServisInf.Recipient value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the codeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeType() {
        return codeType;
    }

    /**
     * Sets the value of the codeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeType(String value) {
        this.codeType = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "06";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Kod">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;maxLength value="12"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Name">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;maxLength value="255"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Recipient {

        @XmlAttribute(name = "Kod")
        protected String kod;
        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * Gets the value of the kod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKod() {
            return kod;
        }

        /**
         * Sets the value of the kod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKod(String value) {
            this.kod = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Kod" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;maxLength value="12"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Name" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;maxLength value="255"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Region" type="{}dRegionsRF" />
     *       &lt;attribute name="Date_Upload" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="Appointment">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;maxLength value="250"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="FIO">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;maxLength value="100"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="E_Mail">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;maxLength value="60"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Telephone">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;maxLength value="100"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Sender {

        @XmlAttribute(name = "Kod", required = true)
        protected String kod;
        @XmlAttribute(name = "Name", required = true)
        protected String name;
        @XmlAttribute(name = "Region")
        protected String region;
        @XmlAttribute(name = "Date_Upload")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateUpload;
        @XmlAttribute(name = "Appointment")
        protected String appointment;
        @XmlAttribute(name = "FIO")
        protected String fio;
        @XmlAttribute(name = "E_Mail")
        protected String eMail;
        @XmlAttribute(name = "Telephone")
        protected String telephone;

        /**
         * Gets the value of the kod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKod() {
            return kod;
        }

        /**
         * Sets the value of the kod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKod(String value) {
            this.kod = value;
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
         * Gets the value of the dateUpload property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateUpload() {
            return dateUpload;
        }

        /**
         * Sets the value of the dateUpload property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateUpload(XMLGregorianCalendar value) {
            this.dateUpload = value;
        }

        /**
         * Gets the value of the appointment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppointment() {
            return appointment;
        }

        /**
         * Sets the value of the appointment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppointment(String value) {
            this.appointment = value;
        }

        /**
         * Gets the value of the fio property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIO() {
            return fio;
        }

        /**
         * Sets the value of the fio property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFIO(String value) {
            this.fio = value;
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

        /**
         * Gets the value of the telephone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelephone() {
            return telephone;
        }

        /**
         * Sets the value of the telephone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelephone(String value) {
            this.telephone = value;
        }

    }

}
