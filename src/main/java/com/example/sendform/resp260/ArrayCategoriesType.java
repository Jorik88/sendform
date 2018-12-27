
package com.example.sendform.resp260;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayCategoriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayCategoriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DetailsSearchResidentPreferentialCategories" type="{http://asur/dszn/}ResidentPreferentialCategoriesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayCategoriesType", namespace = "http://asur/dszn/", propOrder = {
    "detailsSearchResidentPreferentialCategories"
})
public class ArrayCategoriesType {

    @XmlElement(name = "DetailsSearchResidentPreferentialCategories", namespace = "http://asur/dszn/", nillable = true)
    protected List<ResidentPreferentialCategoriesType> detailsSearchResidentPreferentialCategories;

    /**
     * Gets the value of the detailsSearchResidentPreferentialCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailsSearchResidentPreferentialCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailsSearchResidentPreferentialCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResidentPreferentialCategoriesType }
     * 
     * 
     */
    public List<ResidentPreferentialCategoriesType> getDetailsSearchResidentPreferentialCategories() {
        if (detailsSearchResidentPreferentialCategories == null) {
            detailsSearchResidentPreferentialCategories = new ArrayList<ResidentPreferentialCategoriesType>();
        }
        return this.detailsSearchResidentPreferentialCategories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayCategoriesType that = (ArrayCategoriesType) o;
        return Objects.equals(detailsSearchResidentPreferentialCategories, that.detailsSearchResidentPreferentialCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailsSearchResidentPreferentialCategories);
    }
}
