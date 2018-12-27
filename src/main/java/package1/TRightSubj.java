
package package1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о правах субъекта
 * 
 * <p>Java class for tRightSubj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tRightSubj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Object" type="{}tObject"/>
 *         &lt;element name="Registration" type="{}tOpenRegistration"/>
 *         &lt;element name="Encumbrance" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}tEmcumbrance">
 *                 &lt;attribute name="EncumbNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
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
@XmlType(name = "tRightSubj", propOrder = {
    "object",
    "registration",
    "encumbrance"
})
public class TRightSubj {

    @XmlElement(name = "Object", required = true)
    protected TObject object;
    @XmlElement(name = "Registration", required = true)
    protected TOpenRegistration registration;
    @XmlElement(name = "Encumbrance")
    protected List<TRightSubj.Encumbrance> encumbrance;

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link TObject }
     *     
     */
    public TObject getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link TObject }
     *     
     */
    public void setObject(TObject value) {
        this.object = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link TOpenRegistration }
     *     
     */
    public TOpenRegistration getRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOpenRegistration }
     *     
     */
    public void setRegistration(TOpenRegistration value) {
        this.registration = value;
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
     * {@link TRightSubj.Encumbrance }
     * 
     * 
     */
    public List<TRightSubj.Encumbrance> getEncumbrance() {
        if (encumbrance == null) {
            encumbrance = new ArrayList<TRightSubj.Encumbrance>();
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
     *     &lt;extension base="{}tEmcumbrance">
     *       &lt;attribute name="EncumbNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Encumbrance
        extends TEmcumbrance
    {

        @XmlAttribute(name = "EncumbNumber")
        @XmlSchemaType(name = "anySimpleType")
        protected String encumbNumber;

        /**
         * Gets the value of the encumbNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEncumbNumber() {
            return encumbNumber;
        }

        /**
         * Sets the value of the encumbNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEncumbNumber(String value) {
            this.encumbNumber = value;
        }

    }

}
