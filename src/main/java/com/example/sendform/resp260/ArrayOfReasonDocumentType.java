
package com.example.sendform.resp260;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfReasonDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReasonDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReasonDocument" type="{uri:citsp-br-social-support}ReasonDocument" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReasonDocumentType", namespace = "http://asur/dszn/", propOrder = {
    "reasonDocument"
})
public class ArrayOfReasonDocumentType {

    @XmlElement(name = "ReasonDocument", namespace = "http://asur/dszn/", nillable = true)
    protected List<ReasonDocument> reasonDocument;

    /**
     * Gets the value of the reasonDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReasonDocument }
     * 
     * 
     */
    public List<ReasonDocument> getReasonDocument() {
        if (reasonDocument == null) {
            reasonDocument = new ArrayList<ReasonDocument>();
        }
        return this.reasonDocument;
    }
}
