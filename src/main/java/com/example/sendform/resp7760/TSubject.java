
package com.example.sendform.resp7760;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Субъект
 * 
 * <p>Java class for tSubject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSubject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Subject">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="Person" type="{}tPerson"/>
 *           &lt;element name="Organization" type="{}tOrganization"/>
 *           &lt;element name="Governance" type="{}tGovernance"/>
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
@XmlType(name = "tSubject", propOrder = {
    "idSubject",
    "person",
    "organization",
    "governance"
})
@XmlSeeAlso({
    com.example.sendform.resp7760.TRightObj.Owner.class
})
public class TSubject {

    @XmlElement(name = "ID_Subject", required = true)
    protected BigInteger idSubject;
    @XmlElement(name = "Person")
    protected TPerson person;
    @XmlElement(name = "Organization")
    protected TOrganization organization;
    @XmlElement(name = "Governance")
    protected TGovernance governance;

    /**
     * Gets the value of the idSubject property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDSubject() {
        return idSubject;
    }

    /**
     * Sets the value of the idSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDSubject(BigInteger value) {
        this.idSubject = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link TPerson }
     *     
     */
    public TPerson getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPerson }
     *     
     */
    public void setPerson(TPerson value) {
        this.person = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link TOrganization }
     *     
     */
    public TOrganization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOrganization }
     *     
     */
    public void setOrganization(TOrganization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the governance property.
     * 
     * @return
     *     possible object is
     *     {@link TGovernance }
     *     
     */
    public TGovernance getGovernance() {
        return governance;
    }

    /**
     * Sets the value of the governance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TGovernance }
     *     
     */
    public void setGovernance(TGovernance value) {
        this.governance = value;
    }

}
