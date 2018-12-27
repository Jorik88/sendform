
package package1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Уведомление об отсутствии сведений об объектеъ
 * 
 * <p>Java class for tNoticeObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tNoticeObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HeadContent" type="{}tHeadContent"/>
 *         &lt;element name="NoticeObj" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TypeInfoText" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;choice>
 *                     &lt;element name="ObjectDetail">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;choice minOccurs="0">
 *                                 &lt;element name="CadastralNumber">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;maxLength value="3000"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="ConditionalNumber">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;maxLength value="3000"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                               &lt;/choice>
 *                               &lt;element name="ObjectType" type="{}dRealty" minOccurs="0"/>
 *                               &lt;element name="ObjectTypeText" minOccurs="0">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;maxLength value="1000"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="Name">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;maxLength value="4000"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="ObjectAddress" type="{}tAddress" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="ObjectInfo" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;/choice>
 *                   &lt;element name="RightAssert">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ClaimArrests">
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
@XmlType(name = "tNoticeObj", propOrder = {
    "headContent",
    "noticeObj",
    "footContent"
})
public class TNoticeObj {

    @XmlElement(name = "HeadContent", required = true)
    protected THeadContent headContent;
    @XmlElement(name = "NoticeObj", required = true)
    protected List<TNoticeObj.NoticeObj> noticeObj;
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
     * Gets the value of the noticeObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noticeObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoticeObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TNoticeObj.NoticeObj }
     * 
     * 
     */
    public List<TNoticeObj.NoticeObj> getNoticeObj() {
        if (noticeObj == null) {
            noticeObj = new ArrayList<TNoticeObj.NoticeObj>();
        }
        return this.noticeObj;
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
     *           &lt;element name="ObjectDetail">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;choice minOccurs="0">
     *                       &lt;element name="CadastralNumber">
     *                         &lt;simpleType>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                             &lt;maxLength value="3000"/>
     *                           &lt;/restriction>
     *                         &lt;/simpleType>
     *                       &lt;/element>
     *                       &lt;element name="ConditionalNumber">
     *                         &lt;simpleType>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                             &lt;maxLength value="3000"/>
     *                           &lt;/restriction>
     *                         &lt;/simpleType>
     *                       &lt;/element>
     *                     &lt;/choice>
     *                     &lt;element name="ObjectType" type="{}dRealty" minOccurs="0"/>
     *                     &lt;element name="ObjectTypeText" minOccurs="0">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           &lt;maxLength value="1000"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="Name">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           &lt;maxLength value="4000"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="ObjectAddress" type="{}tAddress" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="ObjectInfo" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;/choice>
     *         &lt;element name="RightAssert">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ClaimArrests">
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
        "objectDetail",
        "objectInfo",
        "rightAssert",
        "claimArrests"
    })
    public static class NoticeObj {

        @XmlElement(name = "TypeInfoText", required = true)
        protected Object typeInfoText;
        @XmlElement(name = "ObjectDetail")
        protected TNoticeObj.NoticeObj.ObjectDetail objectDetail;
        @XmlElement(name = "ObjectInfo")
        protected Object objectInfo;
        @XmlElement(name = "RightAssert", required = true)
        protected String rightAssert;
        @XmlElement(name = "ClaimArrests", required = true)
        protected String claimArrests;

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
         * Gets the value of the objectDetail property.
         * 
         * @return
         *     possible object is
         *     {@link TNoticeObj.NoticeObj.ObjectDetail }
         *     
         */
        public TNoticeObj.NoticeObj.ObjectDetail getObjectDetail() {
            return objectDetail;
        }

        /**
         * Sets the value of the objectDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link TNoticeObj.NoticeObj.ObjectDetail }
         *     
         */
        public void setObjectDetail(TNoticeObj.NoticeObj.ObjectDetail value) {
            this.objectDetail = value;
        }

        /**
         * Gets the value of the objectInfo property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getObjectInfo() {
            return objectInfo;
        }

        /**
         * Sets the value of the objectInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setObjectInfo(Object value) {
            this.objectInfo = value;
        }

        /**
         * Gets the value of the rightAssert property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRightAssert() {
            return rightAssert;
        }

        /**
         * Sets the value of the rightAssert property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRightAssert(String value) {
            this.rightAssert = value;
        }

        /**
         * Gets the value of the claimArrests property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClaimArrests() {
            return claimArrests;
        }

        /**
         * Sets the value of the claimArrests property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClaimArrests(String value) {
            this.claimArrests = value;
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
         *         &lt;choice minOccurs="0">
         *           &lt;element name="CadastralNumber">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                 &lt;maxLength value="3000"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="ConditionalNumber">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                 &lt;maxLength value="3000"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *         &lt;/choice>
         *         &lt;element name="ObjectType" type="{}dRealty" minOccurs="0"/>
         *         &lt;element name="ObjectTypeText" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Name">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ObjectAddress" type="{}tAddress" minOccurs="0"/>
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
            "cadastralNumber",
            "conditionalNumber",
            "objectType",
            "objectTypeText",
            "name",
            "objectAddress"
        })
        public static class ObjectDetail {

            @XmlElement(name = "CadastralNumber")
            protected String cadastralNumber;
            @XmlElement(name = "ConditionalNumber")
            protected String conditionalNumber;
            @XmlElement(name = "ObjectType")
            protected String objectType;
            @XmlElement(name = "ObjectTypeText")
            protected String objectTypeText;
            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "ObjectAddress")
            protected TAddress objectAddress;

            /**
             * Gets the value of the cadastralNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCadastralNumber() {
                return cadastralNumber;
            }

            /**
             * Sets the value of the cadastralNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCadastralNumber(String value) {
                this.cadastralNumber = value;
            }

            /**
             * Gets the value of the conditionalNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConditionalNumber() {
                return conditionalNumber;
            }

            /**
             * Sets the value of the conditionalNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConditionalNumber(String value) {
                this.conditionalNumber = value;
            }

            /**
             * Gets the value of the objectType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjectType() {
                return objectType;
            }

            /**
             * Sets the value of the objectType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjectType(String value) {
                this.objectType = value;
            }

            /**
             * Gets the value of the objectTypeText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjectTypeText() {
                return objectTypeText;
            }

            /**
             * Sets the value of the objectTypeText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjectTypeText(String value) {
                this.objectTypeText = value;
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
             * Gets the value of the objectAddress property.
             * 
             * @return
             *     possible object is
             *     {@link TAddress }
             *     
             */
            public TAddress getObjectAddress() {
                return objectAddress;
            }

            /**
             * Sets the value of the objectAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link TAddress }
             *     
             */
            public void setObjectAddress(TAddress value) {
                this.objectAddress = value;
            }

        }

    }

}
