//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.03.23 às 02:36:04 AM BRT 
//


package br.com.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerDatail" type="{http://webservice.com.br}CustomerDatail"/>
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
    "customerDatail"
})
@XmlRootElement(name = "GetCustomerDeteilResponse")
public class GetCustomerDeteilResponse {

    @XmlElement(name = "CustomerDatail", required = true)
    protected CustomerDatail customerDatail;

    /**
     * Obtém o valor da propriedade customerDatail.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDatail }
     *     
     */
    public CustomerDatail getCustomerDatail() {
        return customerDatail;
    }

    /**
     * Define o valor da propriedade customerDatail.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDatail }
     *     
     */
    public void setCustomerDatail(CustomerDatail value) {
        this.customerDatail = value;
    }

}
