//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.03.23 às 02:36:04 AM BRT 
//


package br.com.webservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.webservice package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllCustomerDetailRequest }
     * 
     */
    public GetAllCustomerDetailRequest createGetAllCustomerDetailRequest() {
        return new GetAllCustomerDetailRequest();
    }

    /**
     * Create an instance of {@link GetAllCustomerDetailResponse }
     * 
     */
    public GetAllCustomerDetailResponse createGetAllCustomerDetailResponse() {
        return new GetAllCustomerDetailResponse();
    }

    /**
     * Create an instance of {@link CustomerDatail }
     * 
     */
    public CustomerDatail createCustomerDatail() {
        return new CustomerDatail();
    }

    /**
     * Create an instance of {@link DeleteCustomerDetailResponse }
     * 
     */
    public DeleteCustomerDetailResponse createDeleteCustomerDetailResponse() {
        return new DeleteCustomerDetailResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomerDetailRequest }
     * 
     */
    public DeleteCustomerDetailRequest createDeleteCustomerDetailRequest() {
        return new DeleteCustomerDetailRequest();
    }

    /**
     * Create an instance of {@link GetCustomerDeteilRequest }
     * 
     */
    public GetCustomerDeteilRequest createGetCustomerDeteilRequest() {
        return new GetCustomerDeteilRequest();
    }

    /**
     * Create an instance of {@link GetCustomerDeteilResponse }
     * 
     */
    public GetCustomerDeteilResponse createGetCustomerDeteilResponse() {
        return new GetCustomerDeteilResponse();
    }

}
