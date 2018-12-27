
package com.example.sendform.resp7760;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * отказ в выдаче сведений о субъекте
 * 
 * <p>Java class for tRefusalSubj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tRefusalSubj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HeadContent" type="{}tHeadContent"/>
 *         &lt;element name="RefusalSubj" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TypeInfoText" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;choice>
 *                     &lt;element name="Subject" type="{}tSubject"/>
 *                     &lt;element name="SubjectInfo" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;/choice>
 *                   &lt;element name="TextRefusal">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RefusalType" use="required" type="{}dRefusal" />
 *                 &lt;attribute name="RefusalTypeText" use="required">
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
 *         &lt;element name="FootContent" type="{}tFootContent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRefusalSubj", propOrder = {
    "headContent",
    "refusalSubj",
    "footContent"
})
public class TRefusalSubj {

    @XmlElement(name = "HeadContent", required = true)
    protected THeadContent headContent;
    @XmlElement(name = "RefusalSubj", required = true)
    protected List<TRefusalSubj.RefusalSubj> refusalSubj;
    @XmlElement(name = "FootContent", required = true)
    protected TFootContent footContent;

    /**
     * Gets the value of the headContent property.
     * 
     * @return
     *     possible object is
     *     {@link THeadContent }
     *     
     */
    public THeadContent getHeadContent() {
        return headContent;
    }

    /**
     * Sets the value of the headContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link THeadContent }
     *     
     */
    public void setHeadContent(THeadContent value) {
        this.headContent = value;
    }

    /**
     * Gets the value of the refusalSubj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refusalSubj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefusalSubj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRefusalSubj.RefusalSubj }
     * 
     * 
     */
    public List<TRefusalSubj.RefusalSubj> getRefusalSubj() {
        if (refusalSubj == null) {
            refusalSubj = new ArrayList<TRefusalSubj.RefusalSubj>();
        }
        return this.refusalSubj;
    }

    /**
     * Gets the value of the footContent property.
     * 
     * @return
     *     possible object is
     *     {@link TFootContent }
     *     
     */
    public TFootContent getFootContent() {
        return footContent;
    }

    /**
     * Sets the value of the footContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFootContent }
     *     
     */
    public void setFootContent(TFootContent value) {
        this.footContent = value;
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
     *         &lt;element name="TypeInfoText" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;choice>
     *           &lt;element name="Subject" type="{}tSubject"/>
     *           &lt;element name="SubjectInfo" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;/choice>
     *         &lt;element name="TextRefusal">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="RefusalType" use="required" type="{}dRefusal" />
     *       &lt;attribute name="RefusalTypeText" use="required">
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
    @XmlType(name = "", propOrder = {
        "typeInfoText",
        "subject",
        "subjectInfo",
        "textRefusal"
    })
    public static class RefusalSubj {

        @XmlElement(name = "TypeInfoText", required = true)
        protected Object typeInfoText;
        @XmlElement(name = "Subject")
        protected TSubject subject;
        @XmlElement(name = "SubjectInfo")
        protected Object subjectInfo;
        @XmlElement(name = "TextRefusal", required = true)
        protected String textRefusal;
        @XmlAttribute(name = "RefusalType", required = true)
        protected String refusalType;
        @XmlAttribute(name = "RefusalTypeText", required = true)
        protected String refusalTypeText;

        /**
         * Gets the value of the typeInfoText property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTypeInfoText() {
            return typeInfoText;
        }

        /**
         * Sets the value of the typeInfoText property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTypeInfoText(Object value) {
            this.typeInfoText = value;
        }

        /**
         * Gets the value of the subject property.
         * 
         * @return
         *     possible object is
         *     {@link TSubject }
         *     
         */
        public TSubject getSubject() {
            return subject;
        }

        /**
         * Sets the value of the subject property.
         * 
         * @param value
         *     allowed object is
         *     {@link TSubject }
         *     
         */
        public void setSubject(TSubject value) {
            this.subject = value;
        }

        /**
         * Gets the value of the subjectInfo property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSubjectInfo() {
            return subjectInfo;
        }

        /**
         * Sets the value of the subjectInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSubjectInfo(Object value) {
            this.subjectInfo = value;
        }

        /**
         * Gets the value of the textRefusal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTextRefusal() {
            return textRefusal;
        }

        /**
         * Sets the value of the textRefusal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTextRefusal(String value) {
            this.textRefusal = value;
        }

        /**
         * Gets the value of the refusalType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefusalType() {
            return refusalType;
        }

        /**
         * Sets the value of the refusalType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefusalType(String value) {
            this.refusalType = value;
        }

        /**
         * Gets the value of the refusalTypeText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefusalTypeText() {
            return refusalTypeText;
        }

        /**
         * Sets the value of the refusalTypeText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefusalTypeText(String value) {
            this.refusalTypeText = value;
        }

    }

}
