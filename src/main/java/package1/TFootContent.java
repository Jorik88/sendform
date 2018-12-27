
package package1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * эпилог выписки
 * 
 * <p>Java class for tFootContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tFootContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Recipient">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExtractRegion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="CodRegion" type="{}dDepartments" minOccurs="0"/>
 *                   &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExtractDate" type="{}tDate" minOccurs="0"/>
 *         &lt;element name="Content">
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
@XmlType(name = "tFootContent", propOrder = {
    "recipient",
    "extractRegion",
    "extractDate",
    "content"
})
public class TFootContent {

    @XmlElement(name = "Recipient", required = true)
    protected String recipient;
    @XmlElement(name = "ExtractRegion")
    protected TFootContent.ExtractRegion extractRegion;
    @XmlElement(name = "ExtractDate")
    protected String extractDate;
    @XmlElement(name = "Content", required = true)
    protected String content;

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipient(String value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the extractRegion property.
     * 
     * @return
     *     possible object is
     *     {@link TFootContent.ExtractRegion }
     *     
     */
    public TFootContent.ExtractRegion getExtractRegion() {
        return extractRegion;
    }

    /**
     * Sets the value of the extractRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFootContent.ExtractRegion }
     *     
     */
    public void setExtractRegion(TFootContent.ExtractRegion value) {
        this.extractRegion = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="CodRegion" type="{}dDepartments" minOccurs="0"/>
     *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "codRegionAndRegion"
    })
    public static class ExtractRegion {

        @XmlElementRefs({
            @XmlElementRef(name = "CodRegion", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "Region", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<String>> codRegionAndRegion;

        /**
         * Gets the value of the codRegionAndRegion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the codRegionAndRegion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCodRegionAndRegion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<String>> getCodRegionAndRegion() {
            if (codRegionAndRegion == null) {
                codRegionAndRegion = new ArrayList<JAXBElement<String>>();
            }
            return this.codRegionAndRegion;
        }

    }

}
