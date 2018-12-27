
package package1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Физическое лицо
 * 
 * <p>Java class for tPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tPerson">
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
 *         &lt;element name="FIO" type="{}tFIO"/>
 *         &lt;element name="DateBirth" type="{}tDate" minOccurs="0"/>
 *         &lt;element name="Place_Birth" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Citizen" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Sex" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Document" type="{}tDocPerson" minOccurs="0"/>
 *         &lt;element name="INN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Location" type="{}tAddress" minOccurs="0"/>
 *         &lt;element name="FactLocation" type="{}tAddress" minOccurs="0"/>
 *         &lt;element name="SNILS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="14"/>
 *               &lt;pattern value="\d{3}-\d{3}-\d{3}( |-)\d{2}"/>
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
@XmlType(name = "tPerson", propOrder = {
    "codeSP",
    "content",
    "mdfDate",
    "fio",
    "dateBirth",
    "placeBirth",
    "citizen",
    "sex",
    "document",
    "inn",
    "location",
    "factLocation",
    "snils"
})
public class TPerson {

    @XmlElement(name = "Code_SP", required = true)
    protected String codeSP;
    @XmlElement(name = "Content", required = true)
    protected String content;
    @XmlElement(name = "MdfDate")
    protected String mdfDate;
    @XmlElement(name = "FIO", required = true)
    protected TFIO fio;
    @XmlElementRef(name = "DateBirth", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateBirth;
    @XmlElement(name = "Place_Birth")
    protected String placeBirth;
    @XmlElement(name = "Citizen")
    protected String citizen;
    @XmlElement(name = "Sex")
    protected String sex;
    @XmlElement(name = "Document")
    protected TDocPerson document;
    @XmlElementRef(name = "INN", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inn;
    @XmlElement(name = "Location")
    protected TAddress location;
    @XmlElement(name = "FactLocation")
    protected TAddress factLocation;
    @XmlElement(name = "SNILS")
    protected String snils;

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
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link TFIO }
     *     
     */
    public TFIO getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFIO }
     *     
     */
    public void setFIO(TFIO value) {
        this.fio = value;
    }

    /**
     * Gets the value of the dateBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateBirth() {
        return dateBirth;
    }

    /**
     * Sets the value of the dateBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateBirth(JAXBElement<String> value) {
        this.dateBirth = value;
    }

    /**
     * Gets the value of the placeBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceBirth() {
        return placeBirth;
    }

    /**
     * Sets the value of the placeBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceBirth(String value) {
        this.placeBirth = value;
    }

    /**
     * Gets the value of the citizen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizen() {
        return citizen;
    }

    /**
     * Sets the value of the citizen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizen(String value) {
        this.citizen = value;
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
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link TDocPerson }
     *     
     */
    public TDocPerson getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDocPerson }
     *     
     */
    public void setDocument(TDocPerson value) {
        this.document = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINN(JAXBElement<String> value) {
        this.inn = value;
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
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNILS() {
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
    public void setSNILS(String value) {
        this.snils = value;
    }

}
