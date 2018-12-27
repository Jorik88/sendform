
package package2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PreferentialCategoriesFullResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferentialCategoriesFullResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://asur/dszn/}ArrayCategoriesType" minOccurs="0"/>
 *         &lt;element name="DocumentReady" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InputData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='skip'/>
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
@XmlType(name = "PreferentialCategoriesFullResponseType", namespace = "http://asur/dszn/", propOrder = {
    "result",
    "documentReady",
    "inputData"
})
public class PreferentialCategoriesFullResponseType {

    @XmlElement(name = "Result", namespace = "http://asur/dszn/")
    protected ArrayCategoriesType result;
    @XmlElement(name = "DocumentReady", namespace = "http://asur/dszn/")
    protected boolean documentReady;
    @XmlElement(name = "InputData", namespace = "http://asur/dszn/")
    protected PreferentialCategoriesFullResponseType.InputData inputData;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayCategoriesType }
     *     
     */
    public ArrayCategoriesType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayCategoriesType }
     *     
     */
    public void setResult(ArrayCategoriesType value) {
        this.result = value;
    }

    /**
     * Gets the value of the documentReady property.
     * 
     */
    public boolean isDocumentReady() {
        return documentReady;
    }

    /**
     * Sets the value of the documentReady property.
     * 
     */
    public void setDocumentReady(boolean value) {
        this.documentReady = value;
    }

    /**
     * Gets the value of the inputData property.
     * 
     * @return
     *     possible object is
     *     {@link PreferentialCategoriesFullResponseType.InputData }
     *     
     */
    public PreferentialCategoriesFullResponseType.InputData getInputData() {
        return inputData;
    }

    /**
     * Sets the value of the inputData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferentialCategoriesFullResponseType.InputData }
     *     
     */
    public void setInputData(PreferentialCategoriesFullResponseType.InputData value) {
        this.inputData = value;
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
     *         &lt;any processContents='skip'/>
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
        "any"
    })
    public static class InputData {

        @XmlAnyElement
        protected Element any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     
         */
        public Element getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     
         */
        public void setAny(Element value) {
            this.any = value;
        }

    }

}
