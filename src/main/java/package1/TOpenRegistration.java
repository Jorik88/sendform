
package package1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Запись о праве
 * 
 * <p>Java class for tOpenRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tOpenRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Record">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MdfDate" type="{}tDate" minOccurs="0"/>
 *         &lt;element name="RegNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="45"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Type" type="{}dRights"/>
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RegDate" type="{}tDate"/>
 *         &lt;element name="RestorCourt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EndNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="45"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EndDate" type="{}tDate" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Share" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="Numerator" use="required">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;totalDigits value="22"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="Denominator" use="required">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;totalDigits value="22"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="ShareText" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="4000"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="DocFound" type="{}tDocRight" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOpenRegistration", propOrder = {
    "idRecord",
    "mdfDate",
    "regNumber",
    "type",
    "name",
    "regDate",
    "restorCourt",
    "endNumber",
    "endDate",
    "share",
    "shareText",
    "docFound"
})
public class TOpenRegistration {

    @XmlElement(name = "ID_Record", required = true)
    protected BigInteger idRecord;
    @XmlElement(name = "MdfDate")
    protected String mdfDate;
    @XmlElement(name = "RegNumber", required = true)
    protected String regNumber;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "RegDate", required = true)
    protected String regDate;
    @XmlElement(name = "RestorCourt")
    protected String restorCourt;
    @XmlElement(name = "EndNumber")
    protected String endNumber;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "Share")
    protected TOpenRegistration.Share share;
    @XmlElement(name = "ShareText")
    protected String shareText;
    @XmlElement(name = "DocFound")
    protected List<TDocRight> docFound;

    /**
     * Gets the value of the idRecord property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDRecord() {
        return idRecord;
    }

    /**
     * Sets the value of the idRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDRecord(BigInteger value) {
        this.idRecord = value;
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
     * Gets the value of the regNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the restorCourt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestorCourt() {
        return restorCourt;
    }

    /**
     * Sets the value of the restorCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestorCourt(String value) {
        this.restorCourt = value;
    }

    /**
     * Gets the value of the endNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndNumber() {
        return endNumber;
    }

    /**
     * Sets the value of the endNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndNumber(String value) {
        this.endNumber = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the share property.
     * 
     * @return
     *     possible object is
     *     {@link TOpenRegistration.Share }
     *     
     */
    public TOpenRegistration.Share getShare() {
        return share;
    }

    /**
     * Sets the value of the share property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOpenRegistration.Share }
     *     
     */
    public void setShare(TOpenRegistration.Share value) {
        this.share = value;
    }

    /**
     * Gets the value of the shareText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareText() {
        return shareText;
    }

    /**
     * Sets the value of the shareText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareText(String value) {
        this.shareText = value;
    }

    /**
     * Gets the value of the docFound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docFound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocFound().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDocRight }
     * 
     * 
     */
    public List<TDocRight> getDocFound() {
        if (docFound == null) {
            docFound = new ArrayList<TDocRight>();
        }
        return this.docFound;
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
     *       &lt;attribute name="Numerator" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;totalDigits value="22"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Denominator" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;totalDigits value="22"/>
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
    public static class Share {

        @XmlAttribute(name = "Numerator", required = true)
        protected BigInteger numerator;
        @XmlAttribute(name = "Denominator", required = true)
        protected BigInteger denominator;

        /**
         * Gets the value of the numerator property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumerator() {
            return numerator;
        }

        /**
         * Sets the value of the numerator property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumerator(BigInteger value) {
            this.numerator = value;
        }

        /**
         * Gets the value of the denominator property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDenominator() {
            return denominator;
        }

        /**
         * Sets the value of the denominator property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDenominator(BigInteger value) {
            this.denominator = value;
        }

    }

}
