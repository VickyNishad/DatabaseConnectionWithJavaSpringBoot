package com.customer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.customer.utility.Constents;

@SpringBootApplication
public class CostumerdetailsApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CostumerdetailsApplication.class, args);
		
//		Response res = new Response();
		
		
//		   FileReader reader=new FileReader(System.getProperty("user.dir") + "//src//main//java//com//customer//properties//test.properties");  
		   // fs = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//Pages//TorusEngine//test.properties");
		   
		   FileInputStream fStream  = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//customer//properties//test.properties");
		   
		   Constents.test =new Properties();
		   Constents.test.load(fStream);
		   
		   FileInputStream fStream1  = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//customer//properties//test1.properties");
		   
		   Constents.test1 =new Properties();
		   Constents.test1.load(fStream1);
		   
		   
		   
		   
//		    Properties p=new Properties();  
//		    p.load(reader);
//		   
//		    res.setStatus( Integer.parseInt( Constents.testProperties.getProperty("Status")));
//		    res.setErrorCode(Integer.parseInt( Constents.testProperties.getProperty("ErrorCode")));
//		    res.setMessageType( Constents.testProperties.getProperty("MessageType"));
//		    res.setMessage( Constents.testProperties.getProperty("Message"));
//		    
//		    
//		    
//		    
//		    System.out.println(res);
//		    
		       
//		    System.out.println(p.getProperty("test"));  
//		    System.out.println(p.getProperty("password"));  
//		    System.out.println(p.getProperty("response"));
	}

}
