
package package1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Объект
 * 
 * <p>Java class for tObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Object">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MdfDate" type="{}tDate" minOccurs="0"/>
 *         &lt;choice>
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
 *         &lt;element name="ObjectType">
 *           &lt;simpleType>
 *             &lt;restriction base="{}dRealty">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
 *         &lt;element name="Assignation_Code" type="{}dAssignation" minOccurs="0"/>
 *         &lt;element name="Assignation_Code_Text" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GroundCategory" type="{}dCategories" minOccurs="0"/>
 *         &lt;element name="GroundCategoryText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Area" type="{}tArea" minOccurs="0"/>
 *         &lt;element name="Inv_No" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Floor" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FloorPlan_No" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Explication" maxOccurs="unbounded">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" type="{}tAddress"/>
 *         &lt;element name="Complex" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Explication" maxOccurs="unbounded">
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
 *         &lt;element name="ReEndDate" type="{}tDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tObject", propOrder = {
    "idObject",
    "mdfDate",
    "cadastralNumber",
    "conditionalNumber",
    "objectType",
    "objectTypeText",
    "name",
    "assignationCode",
    "assignationCodeText",
    "groundCategory",
    "groundCategoryText",
    "area",
    "invNo",
    "floor",
    "floorPlanNo",
    "address",
    "complex",
    "reEndDate"
})
public class TObject {

    @XmlElement(name = "ID_Object", required = true)
    protected BigInteger idObject;
    @XmlElement(name = "MdfDate")
    protected String mdfDate;
    @XmlElement(name = "CadastralNumber")
    protected String cadastralNumber;
    @XmlElement(name = "ConditionalNumber")
    protected String conditionalNumber;
    @XmlElement(name = "ObjectType", required = true)
    protected String objectType;
    @XmlElement(name = "ObjectTypeText")
    protected String objectTypeText;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Assignation_Code")
    protected String assignationCode;
    @XmlElement(name = "Assignation_Code_Text")
    protected String assignationCodeText;
    @XmlElement(name = "GroundCategory")
    protected String groundCategory;
    @XmlElement(name = "GroundCategoryText")
    protected String groundCategoryText;
    @XmlElement(name = "Area")
    protected TArea area;
    @XmlElement(name = "Inv_No")
    protected String invNo;
    @XmlElement(name = "Floor")
    protected String floor;
    @XmlElement(name = "FloorPlan_No")
    protected TObject.FloorPlanNo floorPlanNo;
    @XmlElement(name = "Address", required = true)
    protected TAddress address;
    @XmlElement(name = "Complex")
    protected TObject.Complex complex;
    @XmlElement(name = "ReEndDate")
    protected String reEndDate;

    /**
     * Gets the value of the idObject property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDObject() {
        return idObject;
    }

    /**
     * Sets the value of the idObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDObject(BigInteger value) {
        this.idObject = value;
    }

    /**
     * Gets the value of the mdfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdfDate() {
        return mdfDate;
    }

    /**
     * Sets the value of the mdfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdfDate(String value) {
        this.mdfDate = value;
    }

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
     * Gets the value of the assignationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignationCode() {
        return assignationCode;
    }

    /**
     * Sets the value of the assignationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignationCode(String value) {
        this.assignationCode = value;
    }

    /**
     * Gets the value of the assignationCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignationCodeText() {
        return assignationCodeText;
    }

    /**
     * Sets the value of the assignationCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignationCodeText(String value) {
        this.assignationCodeText = value;
    }

    /**
     * Gets the value of the groundCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroundCategory() {
        return groundCategory;
    }

    /**
     * Sets the value of the groundCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroundCategory(String value) {
        this.groundCategory = value;
    }

    /**
     * Gets the value of the groundCategoryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroundCategoryText() {
        return groundCategoryText;
    }

    /**
     * Sets the value of the groundCategoryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroundCategoryText(String value) {
        this.groundCategoryText = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link TArea }
     *     
     */
    public TArea getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link TArea }
     *     
     */
    public void setArea(TArea value) {
        this.area = value;
    }

    /**
     * Gets the value of the invNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvNo() {
        return invNo;
    }

    /**
     * Sets the value of the invNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvNo(String value) {
        this.invNo = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * Gets the value of the floorPlanNo property.
     * 
     * @return
     *     possible object is
     *     {@link TObject.FloorPlanNo }
     *     
     */
    public TObject.FloorPlanNo getFloorPlanNo() {
        return floorPlanNo;
    }

    /**
     * Sets the value of the floorPlanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TObject.FloorPlanNo }
     *     
     */
    public void setFloorPlanNo(TObject.FloorPlanNo value) {
        this.floorPlanNo = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link TAddress }
     *     
     */
    public TAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAddress }
     *     
     */
    public void setAddress(TAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the complex property.
     * 
     * @return
     *     possible object is
     *     {@link TObject.Complex }
     *     
     */
    public TObject.Complex getComplex() {
        return complex;
    }

    /**
     * Sets the value of the complex property.
     * 
     * @param value
     *     allowed object is
     *     {@link TObject.Complex }
     *     
     */
    public void setComplex(TObject.Complex value) {
        this.complex = value;
    }

    /**
     * Gets the value of the reEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReEndDate() {
        return reEndDate;
    }

    /**
     * Sets the value of the reEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReEndDate(String value) {
        this.reEndDate = value;
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
     *         &lt;element name="Explication" maxOccurs="unbounded">
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
        "explication"
    })
    public static class Complex {

        @XmlElement(name = "Explication", required = true)
        protected List<String> explication;

        /**
         * Gets the value of the explication property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the explication property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExplication().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExplication() {
            if (explication == null) {
                explication = new ArrayList<String>();
            }
            return this.explication;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Explication" maxOccurs="unbounded">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="500"/>
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
        "explication"
    })
    public static class FloorPlanNo {

        @XmlElement(name = "Explication", required = true)
        protected List<String> explication;

        /**
         * Gets the value of the explication property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the explication property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExplication().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExplication() {
            if (explication == null) {
                explication = new ArrayList<String>();
            }
            return this.explication;
        }

    }

}
