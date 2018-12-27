
package com.example.sendform.resp7760;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * атрибуты запроса и итогового документа
 * 
 * <p>Java class for tExtrAttribut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tExtrAttribut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReceivName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Representativ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReceivAdress">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ID_KUVI" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="ExtractTypeCode" use="required" type="{}dTypeInfo" />
 *       &lt;attribute name="ExtractTypeText" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ExtractNumber" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ExtractDate" use="required" type="{}tDate" />
 *       &lt;attribute name="RequeryNumber">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RequeryDate" type="{}tDate" />
 *       &lt;attribute name="OfficeNumber">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="OfficeDate" type="{}tDate" />
 *       &lt;attribute name="ExtractCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="NoticeCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="RefuseCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Registrator" use="required">
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
@XmlType(name = "tExtrAttribut", propOrder = {
    "receivName",
    "representativ",
    "receivAdress"
})
public class TExtrAttribut {

    @XmlElement(name = "ReceivName", required = true)
    protected String receivName;
    @XmlElement(name = "Representativ")
    protected String representativ;
    @XmlElement(name = "ReceivAdress", required = true)
    protected String receivAdress;
    @XmlAttribute(name = "ID_KUVI", required = true)
    protected BigDecimal idkuvi;
    @XmlAttribute(name = "ExtractTypeCode", required = true)
    protected String extractTypeCode;
    @XmlAttribute(name = "ExtractTypeText", required = true)
    protected String extractTypeText;
    @XmlAttribute(name = "ExtractNumber", required = true)
    protected String extractNumber;
    @XmlAttribute(name = "ExtractDate", required = true)
    protected String extractDate;
    @XmlAttribute(name = "RequeryNumber")
    protected String requeryNumber;
    @XmlAttribute(name = "RequeryDate")
    protected String requeryDate;
    @XmlAttribute(name = "OfficeNumber")
    protected String officeNumber;
    @XmlAttribute(name = "OfficeDate")
    protected String officeDate;
    @XmlAttribute(name = "ExtractCount", required = true)
    protected int extractCount;
    @XmlAttribute(name = "NoticeCount", required = true)
    protected int noticeCount;
    @XmlAttribute(name = "RefuseCount", required = true)
    protected int refuseCount;
    @XmlAttribute(name = "Registrator", required = true)
    protected String registrator;

    /**
     * Gets the value of the receivName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivName() {
        return receivName;
    }

    /**
     * Sets the value of the receivName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivName(String value) {
        this.receivName = value;
    }

    /**
     * Gets the value of the representativ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentativ() {
        return representativ;
    }

    /**
     * Sets the value of the representativ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentativ(String value) {
        this.representativ = value;
    }

    /**
     * Gets the value of the receivAdress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivAdress() {
        return receivAdress;
    }

    /**
     * Sets the value of the receivAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivAdress(String value) {
        this.receivAdress = value;
    }

    /**
     * Gets the value of the idkuvi property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIDKUVI() {
        return idkuvi;
    }

    /**
     * Sets the value of the idkuvi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIDKUVI(BigDecimal value) {
        this.idkuvi = value;
    }

    /**
     * Gets the value of the extractTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtractTypeCode() {
        return extractTypeCode;
    }

    /**
     * Sets the value of the extractTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtractTypeCode(String value) {
        this.extractTypeCode = value;
    }

    /**
     * Gets the value of the extractTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtractTypeText() {
        return extractTypeText;
    }

    /**
     * Sets the value of the extractTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtractTypeText(String value) {
        this.extractTypeText = value;
    }

    /**
     * Gets the value of the extractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtractNumber() {
        return extractNumber;
    }

    /**
     * Sets the value of the extractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtractNumber(String value) {
        this.extractNumber = value;
    }

    /**
     * Gets the value of the extractDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtractDate() {
        return extractDate;
    }

    /**
     * Sets the value of the extractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtractDate(String value) {
        this.extractDate = value;
    }

    /**
     * Gets the value of the requeryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequeryNumber() {
        return requeryNumber;
    }

    /**
     * Sets the value of the requeryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequeryNumber(String value) {
        this.requeryNumber = value;
    }

    /**
     * Gets the value of the requeryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequeryDate() {
        return requeryDate;
    }

    /**
     * Sets the value of the requeryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequeryDate(String value) {
        this.requeryDate = value;
    }

    /**
     * Gets the value of the officeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeNumber() {
        return officeNumber;
    }

    /**
     * Sets the value of the officeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeNumber(String value) {
        this.officeNumber = value;
    }

    /**
     * Gets the value of the officeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeDate() {
        return officeDate;
    }

    /**
     * Sets the value of the officeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeDate(String value) {
        this.officeDate = value;
    }

    /**
     * Gets the value of the extractCount property.
     * 
     */
    public int getExtractCount() {
        return extractCount;
    }

    /**
     * Sets the value of the extractCount property.
     * 
     */
    public void setExtractCount(int value) {
        this.extractCount = value;
    }

    /**
     * Gets the value of the noticeCount property.
     * 
     */
    public int getNoticeCount() {
        return noticeCount;
    }

    /**
     * Sets the value of the noticeCount property.
     * 
     */
    public void setNoticeCount(int value) {
        this.noticeCount = value;
    }

    /**
     * Gets the value of the refuseCount property.
     * 
     */
    public int getRefuseCount() {
        return refuseCount;
    }

    /**
     * Sets the value of the refuseCount property.
     * 
     */
    public void setRefuseCount(int value) {
        this.refuseCount = value;
    }

    /**
     * Gets the value of the registrator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrator() {
        return registrator;
    }

    /**
     * Sets the value of the registrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrator(String value) {
        this.registrator = value;
    }

}
