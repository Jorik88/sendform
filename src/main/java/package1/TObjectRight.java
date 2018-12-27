
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
 *  раздел ЕГРП
 * 
 * <p>Java class for tObjectRight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tObjectRight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectDesc" type="{}tObject"/>
 *         &lt;element name="Right" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}tRightObj">
 *                 &lt;attribute name="RightNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ShareHolding" type="{}tShareHolding" maxOccurs="unbounded"/>
 *           &lt;element name="NoShareHolding" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
@XmlType(name = "tObjectRight", propOrder = {
    "objectDesc",
    "right",
    "shareHolding",
    "noShareHolding"
})
public class TObjectRight {

    @XmlElement(name = "ObjectDesc", required = true)
    protected TObject objectDesc;
    @XmlElement(name = "Right", required = true)
    protected List<TObjectRight.Right> right;
    @XmlElement(name = "ShareHolding")
    protected List<TShareHolding> shareHolding;
    @XmlElement(name = "NoShareHolding")
    protected Object noShareHolding;

    /**
     * Gets the value of the objectDesc property.
     * 
     * @return
     *     possible object is
     *     {@link TObject }
     *     
     */
    public TObject getObjectDesc() {
        return objectDesc;
    }

    /**
     * Sets the value of the objectDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TObject }
     *     
     */
    public void setObjectDesc(TObject value) {
        this.objectDesc = value;
    }

    /**
     * Gets the value of the right property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the right property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TObjectRight.Right }
     * 
     * 
     */
    public List<TObjectRight.Right> getRight() {
        if (right == null) {
            right = new ArrayList<TObjectRight.Right>();
        }
        return this.right;
    }

    /**
     * Gets the value of the shareHolding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareHolding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareHolding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TShareHolding }
     * 
     * 
     */
    public List<TShareHolding> getShareHolding() {
        if (shareHolding == null) {
            shareHolding = new ArrayList<TShareHolding>();
        }
        return this.shareHolding;
    }

    /**
     * Gets the value of the noShareHolding property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNoShareHolding() {
        return noShareHolding;
    }

    /**
     * Sets the value of the noShareHolding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNoShareHolding(Object value) {
        this.noShareHolding = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}tRightObj">
     *       &lt;attribute name="RightNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Right
        extends TRightObj
    {

        @XmlAttribute(name = "RightNumber")
        @XmlSchemaType(name = "anySimpleType")
        protected String rightNumber;

        /**
         * Gets the value of the rightNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRightNumber() {
            return rightNumber;
        }

        /**
         * Sets the value of the rightNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRightNumber(String value) {
            this.rightNumber = value;
        }

    }

}
