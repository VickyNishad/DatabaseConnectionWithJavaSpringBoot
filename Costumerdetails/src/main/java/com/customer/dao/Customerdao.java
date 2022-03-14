package com.customer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.entities.CustomerDetails;
import com.customer.utility.Constents;


/**
 * 
 * @author 33000014
 *
 */

@Repository
public class Customerdao  {
	
	@Autowired
	private EntityManager eManager;
//	String storeString = Constents.test.getProperty("GetCustomerDetail");
	@SuppressWarnings("unchecked")
	public List<CustomerDetails> getCustomerDetail(String CustGuId) {
		
		
		String typeOfStoreProcedure = Constents.test1.getProperty("GetCustomerDetails");
		String parameter = Constents.test1.getProperty("CustGuId");
		
		StoredProcedureQuery query = eManager.createStoredProcedureQuery(typeOfStoreProcedure, "CustomerDetails")
				.registerStoredProcedureParameter(parameter, String.class, ParameterMode.IN)
				.setParameter(parameter, CustGuId);
		query.execute();
		return query.getResultList();
	}


}
