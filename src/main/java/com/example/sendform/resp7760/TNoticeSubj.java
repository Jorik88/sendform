
package com.example.sendform.resp7760;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * уведомление об отсутствии сведений о субъекте
 * 
 * <p>Java class for tNoticeSubj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tNoticeSubj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HeadContent" type="{}tHeadContent"/>
 *         &lt;element name="NoticeSubj" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TypeInfoText" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;choice>
 *                     &lt;element name="Subject" type="{}tSubject"/>
 *                     &lt;element name="SubjectInfo" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;/choice>
 *                   &lt;element name="ArrestInfo" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
@XmlType(name = "tNoticeSubj", propOrder = {
    "headContent",
    "noticeSubj",
    "footContent"
})
public class TNoticeSubj {

    @XmlElement(name = "HeadContent", required = true)
    protected THeadContent headContent;
    @XmlElement(name = "NoticeSubj", required = true)
    protected List<TNoticeSubj.NoticeSubj> noticeSubj;
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
     * Gets the value of the noticeSubj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noticeSubj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoticeSubj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TNoticeSubj.NoticeSubj }
     * 
     * 
     */
    public List<TNoticeSubj.NoticeSubj> getNoticeSubj() {
        if (noticeSubj == null) {
            noticeSubj = new ArrayList<TNoticeSubj.NoticeSubj>();
        }
        return this.noticeSubj;
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
     *         &lt;element name="ArrestInfo" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
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
    @XmlType(name = "", propOrder = {
        "typeInfoText",
        "subject",
        "subjectInfo",
        "arrestInfo"
    })
    public static class NoticeSubj {

        @XmlElement(name = "TypeInfoText", required = true)
        protected Object typeInfoText;
        @XmlElement(name = "Subject")
        protected TSubject subject;
        @XmlElement(name = "SubjectInfo")
        protected Object subjectInfo;
        @XmlElement(name = "ArrestInfo")
        protected String arrestInfo;

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
         * Gets the value of the arrestInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArrestInfo() {
            return arrestInfo;
        }

        /**
         * Sets the value of the arrestInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArrestInfo(String value) {
            this.arrestInfo = value;
        }

    }

}
