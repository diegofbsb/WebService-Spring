package br.com.webservice.customeradmin.customersadministrator.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.webservice.CustomerDatail;
import br.com.webservice.DeleteCustomerDetailRequest;
import br.com.webservice.DeleteCustomerDetailResponse;
import br.com.webservice.GetAllCustomerDetailRequest;
import br.com.webservice.GetAllCustomerDetailResponse;
import br.com.webservice.GetCustomerDeteilRequest;
import br.com.webservice.GetCustomerDeteilResponse;
import br.com.webservice.Status;
import br.com.webservice.customeradmin.exception.CustomerNotFoundException;
import br.com.webservice.customeradmin.model.Customer;
import br.com.webservice.customeradmin.service.CustomerDetailService;

@Endpoint
public class CustomerDetailEndPoint {
	
	@Autowired
	CustomerDetailService service;

	@PayloadRoot(namespace="http://webservice.com.br", localPart = "GetCustomerDeteilRequest")
	@ResponsePayload
	public GetCustomerDeteilResponse processCustomerDeteilRequest(@RequestPayload GetCustomerDeteilRequest req) throws Exception {
		Customer response = service.findById(req.getId());
		if(response == null) {
			throw new CustomerNotFoundException("Invalid Id "+req.getId());
		}
		return convertToGetCustomerDetailResponse(response);
	}
	
	
	private GetCustomerDeteilResponse convertToGetCustomerDetailResponse(Customer customer) {
		GetCustomerDeteilResponse customerDeteilResponse = new GetCustomerDeteilResponse();
		customerDeteilResponse.setCustomerDatail(convertToCustomerDetail(customer));
		return customerDeteilResponse;
	}
	
	
	public CustomerDatail convertToCustomerDetail(Customer customer) {
		CustomerDatail customerDetail = new CustomerDatail();
		customerDetail.setId(customer.getId());
		customerDetail.setName(customer.getNome());
		customerDetail.setPhone(customer.getPhone());
		customerDetail.setEmail(customer.getEmail());
		return customerDetail;
	}
	
	@PayloadRoot(namespace="http://webservice.com.br", localPart = "GetAllCustomerDetailRequest")
	@ResponsePayload
	public GetAllCustomerDetailResponse processGetAllCustomerDetailRequest(@RequestPayload GetAllCustomerDetailRequest req) {
		List<Customer> customers = service.findAll();
		return ConvetToAllCustomerDetailResponse(customers);
	}
	
	private GetAllCustomerDetailResponse ConvetToAllCustomerDetailResponse(List<Customer> customers) {
		GetAllCustomerDetailResponse response = new GetAllCustomerDetailResponse();
		customers.stream().forEach(c -> response.getCustomerDatail().add(convertToCustomerDetail(c)));
		return response;
	}
	
	@PayloadRoot(namespace="http://webservice.com.br", localPart = "DeleteCustomerDetailRequest")
	@ResponsePayload
	public DeleteCustomerDetailResponse deleteDeleteCustomerDetailRequest(@RequestPayload DeleteCustomerDetailRequest req) {
		DeleteCustomerDetailResponse resp = new DeleteCustomerDetailResponse();
		resp.setStatus(converteStatusSoap(service.deleteById(req.getId())));
		return resp;
	}
	
	
	private Status converteStatusSoap(br.com.webservice.customeradmin.helper.Status status) {
		if(status.equals(status.FAILURE)) {
			return Status.FAILURE;
		}
		return Status.SUCCESS;
	} 
	
}
