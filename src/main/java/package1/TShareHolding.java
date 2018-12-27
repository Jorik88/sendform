
package package1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  объекты долевого строительства
 * 
 * <p>Java class for tShareHolding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tShareHolding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_DDU">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShareHolding" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ShareObjects" maxOccurs="unbounded">
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
 *         &lt;element name="Owner" type="{}tSubject" maxOccurs="unbounded"/>
 *         &lt;element name="Encumbrance" type="{}tEmcumbrance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tShareHolding", propOrder = {
    "idddu",
    "shareHolding",
    "owner",
    "encumbrance"
})
public class TShareHolding {

    @XmlElement(name = "ID_DDU", required = true)
    protected BigInteger idddu;
    @XmlElement(name = "ShareHolding")
    protected TShareHolding.ShareHolding shareHolding;
    @XmlElement(name = "Owner", required = true)
    protected List<TSubject> owner;
    @XmlElement(name = "Encumbrance")
    protected List<TEmcumbrance> encumbrance;

    /**
     * Gets the value of the idddu property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDDDU() {
        return idddu;
    }

    /**
     * Sets the value of the idddu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDDDU(BigInteger value) {
        this.idddu = value;
    }

    /**
     * Gets the value of the shareHolding property.
     * 
     * @return
     *     possible object is
     *     {@link TShareHolding.ShareHolding }
     *     
     */
    public TShareHolding.ShareHolding getShareHolding() {
        return shareHolding;
    }

    /**
     * Sets the value of the shareHolding property.
     * 
     * @param value
     *     allowed object is
     *     {@link TShareHolding.ShareHolding }
     *     
     */
    public void setShareHolding(TShareHolding.ShareHolding value) {
        this.shareHolding = value;
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
     * Gets the value of the encumbrance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encumbrance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncumbrance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TEmcumbrance }
     * 
     * 
     */
    public List<TEmcumbrance> getEncumbrance() {
        if (encumbrance == null) {
            encumbrance = new ArrayList<TEmcumbrance>();
        }
        return this.encumbrance;
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
     *         &lt;element name="ShareObjects" maxOccurs="unbounded">
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
        "shareObjects"
    })
    public static class ShareHolding {

        @XmlElement(name = "ShareObjects", required = true)
        protected List<String> shareObjects;

        /**
         * Gets the value of the shareObjects property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shareObjects property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShareObjects().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getShareObjects() {
            if (shareObjects == null) {
                shareObjects = new ArrayList<String>();
            }
            return this.shareObjects;
        }

    }

}
