
package package1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Запись об ограничении
 * 
 * <p>Java class for tEmcumbrance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tEmcumbrance">
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
 *         &lt;element name="Type" type="{}dEncumbrances"/>
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShareText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RegDate" type="{}tDate"/>
 *         &lt;element name="Duration" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Started" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{}tDate">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Stopped" type="{}tDate" minOccurs="0"/>
 *                   &lt;element name="Term" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Owner" type="{}tSubject" maxOccurs="unbounded"/>
 *           &lt;element name="AllShareOwner">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="1000"/>
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
@XmlType(name = "tEmcumbrance", propOrder = {
    "idRecord",
    "mdfDate",
    "regNumber",
    "type",
    "name",
    "shareText",
    "regDate",
    "duration",
    "owner",
    "allShareOwner",
    "docFound"
})
@XmlSeeAlso({
    package1.TRightObj.Encumbrance.class,
    package1.TRightSubj.Encumbrance.class
})
public class TEmcumbrance {

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
    @XmlElement(name = "ShareText")
    protected String shareText;
    @XmlElement(name = "RegDate", required = true)
    protected String regDate;
    @XmlElement(name = "Duration")
    protected TEmcumbrance.Duration duration;
    @XmlElement(name = "Owner")
    protected List<TSubject> owner;
    @XmlElement(name = "AllShareOwner")
    protected String allShareOwner;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link TEmcumbrance.Duration }
     *     
     */
    public TEmcumbrance.Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEmcumbrance.Duration }
     *     
     */
    public void setDuration(TEmcumbrance.Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the owner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSubject }
     * 
     * 
     */
    public List<TSubject> getOwner() {
        if (owner == null) {
            owner = new ArrayList<TSubject>();
        }
        return this.owner;
    }

    /**
     * Gets the value of the allShareOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllShareOwner() {
        return allShareOwner;
    }

    /**
     * Sets the value of the allShareOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllShareOwner(String value) {
        this.allShareOwner = value;
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
     *       &lt;sequence>
     *         &lt;element name="Started" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{}tDate">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Stopped" type="{}tDate" minOccurs="0"/>
     *         &lt;element name="Term" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "started",
        "stopped",
        "term"
    })
    public static class Duration {

        @XmlElement(name = "Started")
        protected String started;
        @XmlElement(name = "Stopped")
        protected String stopped;
        @XmlElement(name = "Term")
        protected String term;

        /**
         * Gets the value of the started property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStarted() {
            return started;
        }

        /**
         * Sets the value of the started property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStarted(String value) {
            this.started = value;
        }

        /**
         * Gets the value of the stopped property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStopped() {
            return stopped;
        }

        /**
         * Sets the value of the stopped property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStopped(String value) {
            this.stopped = value;
        }

        /**
         * Gets the value of the term property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTerm() {
            return term;
        }

        /**
         * Sets the value of the term property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTerm(String value) {
            this.term = value;
        }

    }

}
