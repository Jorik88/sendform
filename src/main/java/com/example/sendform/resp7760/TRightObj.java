
package com.example.sendform.resp7760;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о правах по ОН
 * 
 * <p>Java class for tRightObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tRightObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Owner" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{}tSubject">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="NoOwner" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="Registration" type="{}tOpenRegistration"/>
 *           &lt;element name="NoRegistration" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Encumbrance" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{}tEmcumbrance">
 *                   &lt;attribute name="EncumbNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="NoEncumbrance" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRightObj", propOrder = {
    "owner",
    "noOwner",
    "registration",
    "noRegistration",
    "encumbrance",
    "noEncumbrance"
})
@XmlSeeAlso({
    com.example.sendform.resp7760.TObjectRight.Right.class
})
public class TRightObj {

    @XmlElement(name = "Owner")
    protected List<TRightObj.Owner> owner;
    @XmlElement(name = "NoOwner")
    protected Object noOwner;
    @XmlElement(name = "Registration")
    protected TOpenRegistration registration;
    @XmlElement(name = "NoRegistration")
    protected Object noRegistration;
    @XmlElement(name = "Encumbrance")
    protected List<TRightObj.Encumbrance> encumbrance;
    @XmlElement(name = "NoEncumbrance")
    protected Object noEncumbrance;

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
     * {@link TRightObj.Owner }
     * 
     * 
     */
    public List<TRightObj.Owner> getOwner() {
        if (owner == null) {
            owner = new ArrayList<TRightObj.Owner>();
        }
        return this.owner;
    }

    /**
     * Gets the value of the noOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNoOwner() {
        return noOwner;
    }

    /**
     * Sets the value of the noOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNoOwner(Object value) {
        this.noOwner = value;
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
     * Gets the value of the noRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNoRegistration() {
        return noRegistration;
    }

    /**
     * Sets the value of the noRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNoRegistration(Object value) {
        this.noRegistration = value;
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
     * {@link TRightObj.Encumbrance }
     * 
     * 
     */
    public List<TRightObj.Encumbrance> getEncumbrance() {
        if (encumbrance == null) {
            encumbrance = new ArrayList<TRightObj.Encumbrance>();
        }
        return this.encumbrance;
    }

    /**
     * Gets the value of the noEncumbrance property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNoEncumbrance() {
        return noEncumbrance;
    }

    /**
     * Sets the value of the noEncumbrance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNoEncumbrance(Object value) {
        this.noEncumbrance = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}tSubject">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Owner
        extends TSubject
    {


    }

}
