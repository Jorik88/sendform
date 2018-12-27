
package package1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * пролог выписки
 * 
 * <p>Java class for tHeadContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tHeadContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_REC_KUVI" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Title">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeptName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExtractTitle">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Content">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
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
@XmlType(name = "tHeadContent", propOrder = {
    "idreckuvi",
    "title",
    "deptName",
    "extractTitle",
    "content"
})
public class THeadContent {

    @XmlElement(name = "ID_REC_KUVI", required = true)
    protected Object idreckuvi;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "DeptName", required = true)
    protected String deptName;
    @XmlElement(name = "ExtractTitle", required = true)
    protected String extractTitle;
    @XmlElement(name = "Content", required = true)
    protected String content;

    /**
     * Gets the value of the idreckuvi property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIDRECKUVI() {
        return idreckuvi;
    }

    /**
     * Sets the value of the idreckuvi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIDRECKUVI(Object value) {
        this.idreckuvi = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the deptName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * Sets the value of the deptName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptName(String value) {
        this.deptName = value;
    }

    /**
     * Gets the value of the extractTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtractTitle() {
        return extractTitle;
    }

    /**
     * Sets the value of the extractTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtractTitle(String value) {
        this.extractTitle = value;
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

}
