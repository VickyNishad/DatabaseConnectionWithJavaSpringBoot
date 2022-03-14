package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dao.Customerdao;
import com.customer.entities.CustomerDetails;
import com.customer.entities.Response;
import com.customer.utility.Constents;
//import com.microservices.entitiesModel.CustomerMaster;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private Customerdao customerdao;

	
	@Override
	public Response getCustomerDetails(String custGuId) {
		// TODO Auto-generated method stub
		
		List<CustomerDetails> list = customerdao.getCustomerDetail(custGuId);
		CustomerDetails customerDetails = list != null && list.size() > 0 ? list.get(0) : null;
		Response response  = new Response(customerDetails);

	    response.setStatus( Integer.parseInt( Constents.test.getProperty("Status")));
	    response.setErrorCode(Integer.parseInt( Constents.test.getProperty("ErrorCode")));
	    response.setMessageType( Constents.test.getProperty("MessageType"));
	    response.setMessage( Constents.test.getProperty("Message"));
	    
//		Response response = new Response();
		return response;
	}




}
