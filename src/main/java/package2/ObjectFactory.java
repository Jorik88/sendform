
package package2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the package2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DetailsSearchResidentPreferentialCategoriesFullResponse_QNAME = new QName("http://asur/dszn/", "DetailsSearchResidentPreferentialCategoriesFullResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: package2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PreferentialCategoriesFullResponseType }
     * 
     */
    public PreferentialCategoriesFullResponseType createPreferentialCategoriesFullResponseType() {
        return new PreferentialCategoriesFullResponseType();
    }

    /**
     * Create an instance of {@link ResidentPreferentialCategoriesType }
     * 
     */
    public ResidentPreferentialCategoriesType createResidentPreferentialCategoriesType() {
        return new ResidentPreferentialCategoriesType();
    }

    /**
     * Create an instance of {@link ArrayOfReasonDocumentType }
     * 
     */
    public ArrayOfReasonDocumentType createArrayOfReasonDocumentType() {
        return new ArrayOfReasonDocumentType();
    }

    /**
     * Create an instance of {@link ArrayCategoriesType }
     * 
     */
    public ArrayCategoriesType createArrayCategoriesType() {
        return new ArrayCategoriesType();
    }

    /**
     * Create an instance of {@link ReasonDocument }
     * 
     */
    public ReasonDocument createReasonDocument() {
        return new ReasonDocument();
    }

    /**
     * Create an instance of {@link PreferentialCategoriesFullResponseType.InputData }
     * 
     */
    public PreferentialCategoriesFullResponseType.InputData createPreferentialCategoriesFullResponseTypeInputData() {
        return new PreferentialCategoriesFullResponseType.InputData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreferentialCategoriesFullResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asur/dszn/", name = "DetailsSearchResidentPreferentialCategoriesFullResponse")
    public JAXBElement<PreferentialCategoriesFullResponseType> createDetailsSearchResidentPreferentialCategoriesFullResponse(PreferentialCategoriesFullResponseType value) {
        return new JAXBElement<PreferentialCategoriesFullResponseType>(_DetailsSearchResidentPreferentialCategoriesFullResponse_QNAME, PreferentialCategoriesFullResponseType.class, null, value);
    }

}
