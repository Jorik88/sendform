
package com.example.sendform.resp7760;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="eDocument" type="{}tServisInf"/>
 *         &lt;element name="ReestrExtract">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DeclarAttribute" type="{}tExtrAttribut"/>
 *                   &lt;element name="ExtractObjectRight" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HeadContent" type="{}tHeadContent"/>
 *                             &lt;element name="ExtractObject" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ObjectRight" type="{}tObjectRight"/>
 *                                       &lt;element name="RightAssert">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="RightClaim">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="RightAgainst">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="RightSteal" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FootContent" type="{}tFootContent"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="NoticelObj" type="{}tNoticeObj" minOccurs="0"/>
 *                   &lt;element name="RefusalObj" type="{}tRefusalObj" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "eDocument",
    "reestrExtract"
})
@XmlRootElement(name = "Extract")
public class Extract {

    @XmlElement(required = true)
    protected TServisInf eDocument;
    @XmlElement(name = "ReestrExtract", required = true)
    protected Extract.ReestrExtract reestrExtract;

    /**
     * Gets the value of the eDocument property.
     * 
     * @return
     *     possible object is
     *     {@link TServisInf }
     *     
     */
    public TServisInf getEDocument() {
        return eDocument;
    }

    /**
     * Sets the value of the eDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link TServisInf }
     *     
     */
    public void setEDocument(TServisInf value) {
        this.eDocument = value;
    }

    /**
     * Gets the value of the reestrExtract property.
     * 
     * @return
     *     possible object is
     *     {@link Extract.ReestrExtract }
     *     
     */
    public Extract.ReestrExtract getReestrExtract() {
        return reestrExtract;
    }

    /**
     * Sets the value of the reestrExtract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extract.ReestrExtract }
     *     
     */
    public void setReestrExtract(Extract.ReestrExtract value) {
        this.reestrExtract = value;
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
     *         &lt;element name="DeclarAttribute" type="{}tExtrAttribut"/>
     *         &lt;element name="ExtractObjectRight" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HeadContent" type="{}tHeadContent"/>
     *                   &lt;element name="ExtractObject" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ObjectRight" type="{}tObjectRight"/>
     *                             &lt;element name="RightAssert">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="RightClaim">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="RightAgainst">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="RightSteal" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FootContent" type="{}tFootContent"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="NoticelObj" type="{}tNoticeObj" minOccurs="0"/>
     *         &lt;element name="RefusalObj" type="{}tRefusalObj" minOccurs="0"/>
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
        "declarAttribute",
        "extractObjectRight",
        "noticelObj",
        "refusalObj"
    })
    public static class ReestrExtract {

        @XmlElement(name = "DeclarAttribute", required = true)
        protected TExtrAttribut declarAttribute;
        @XmlElement(name = "ExtractObjectRight")
        protected Extract.ReestrExtract.ExtractObjectRight extractObjectRight;
        @XmlElement(name = "NoticelObj")
        protected TNoticeObj noticelObj;
        @XmlElement(name = "RefusalObj")
        protected TRefusalObj refusalObj;

        /**
         * Gets the value of the declarAttribute property.
         * 
         * @return
         *     possible object is
         *     {@link TExtrAttribut }
         *     
         */
        public TExtrAttribut getDeclarAttribute() {
            return declarAttribute;
        }

        /**
         * Sets the value of the declarAttribute property.
         * 
         * @param value
         *     allowed object is
         *     {@link TExtrAttribut }
         *     
         */
        public void setDeclarAttribute(TExtrAttribut value) {
            this.declarAttribute = value;
        }

        /**
         * Gets the value of the extractObjectRight property.
         * 
         * @return
         *     possible object is
         *     {@link Extract.ReestrExtract.ExtractObjectRight }
         *     
         */
        public Extract.ReestrExtract.ExtractObjectRight getExtractObjectRight() {
            return extractObjectRight;
        }

        /**
         * Sets the value of the extractObjectRight property.
         * 
         * @param value
         *     allowed object is
         *     {@link Extract.ReestrExtract.ExtractObjectRight }
         *     
         */
        public void setExtractObjectRight(Extract.ReestrExtract.ExtractObjectRight value) {
            this.extractObjectRight = value;
        }

        /**
         * Gets the value of the noticelObj property.
         * 
         * @return
         *     possible object is
         *     {@link TNoticeObj }
         *     
         */
        public TNoticeObj getNoticelObj() {
            return noticelObj;
        }

        /**
         * Sets the value of the noticelObj property.
         * 
         * @param value
         *     allowed object is
         *     {@link TNoticeObj }
         *     
         */
        public void setNoticelObj(TNoticeObj value) {
            this.noticelObj = value;
        }

        /**
         * Gets the value of the refusalObj property.
         * 
         * @return
         *     possible object is
         *     {@link TRefusalObj }
         *     
         */
        public TRefusalObj getRefusalObj() {
            return refusalObj;
        }

        /**
         * Sets the value of the refusalObj property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRefusalObj }
         *     
         */
        public void setRefusalObj(TRefusalObj value) {
            this.refusalObj = value;
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
         *         &lt;element name="HeadContent" type="{}tHeadContent"/>
         *         &lt;element name="ExtractObject" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ObjectRight" type="{}tObjectRight"/>
         *                   &lt;element name="RightAssert">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="RightClaim">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="RightAgainst">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="RightSteal" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
        @XmlType(name = "", propOrder = {
            "headContent",
            "extractObject",
            "footContent"
        })
        public static class ExtractObjectRight {

            @XmlElement(name = "HeadContent", required = true)
            protected THeadContent headContent;
            @XmlElement(name = "ExtractObject", required = true)
            protected List<Extract.ReestrExtract.ExtractObjectRight.ExtractObject> extractObject;
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
             * Gets the value of the extractObject property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the extractObject property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExtractObject().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Extract.ReestrExtract.ExtractObjectRight.ExtractObject }
             * 
             * 
             */
            public List<Extract.ReestrExtract.ExtractObjectRight.ExtractObject> getExtractObject() {
                if (extractObject == null) {
                    extractObject = new ArrayList<Extract.ReestrExtract.ExtractObjectRight.ExtractObject>();
                }
                return this.extractObject;
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
             *         &lt;element name="ObjectRight" type="{}tObjectRight"/>
             *         &lt;element name="RightAssert">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="RightClaim">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="RightAgainst">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="RightSteal" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
                "objectRight",
                "rightAssert",
                "rightClaim",
                "rightAgainst",
                "rightSteal"
            })
            public static class ExtractObject {

                @XmlElement(name = "ObjectRight", required = true)
                protected TObjectRight objectRight;
                @XmlElement(name = "RightAssert", required = true)
                protected String rightAssert;
                @XmlElement(name = "RightClaim", required = true)
                protected String rightClaim;
                @XmlElement(name = "RightAgainst", required = true)
                protected String rightAgainst;
                @XmlElement(name = "RightSteal")
                protected String rightSteal;

                /**
                 * Gets the value of the objectRight property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TObjectRight }
                 *     
                 */
                public TObjectRight getObjectRight() {
                    return objectRight;
                }

                /**
                 * Sets the value of the objectRight property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TObjectRight }
                 *     
                 */
                public void setObjectRight(TObjectRight value) {
                    this.objectRight = value;
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
                 * Gets the value of the rightClaim property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRightClaim() {
                    return rightClaim;
                }

                /**
                 * Sets the value of the rightClaim property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRightClaim(String value) {
                    this.rightClaim = value;
                }

                /**
                 * Gets the value of the rightAgainst property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRightAgainst() {
                    return rightAgainst;
                }

                /**
                 * Sets the value of the rightAgainst property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRightAgainst(String value) {
                    this.rightAgainst = value;
                }

                /**
                 * Gets the value of the rightSteal property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRightSteal() {
                    return rightSteal;
                }

                /**
                 * Sets the value of the rightSteal property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRightSteal(String value) {
                    this.rightSteal = value;
                }

            }

        }

    }

}
