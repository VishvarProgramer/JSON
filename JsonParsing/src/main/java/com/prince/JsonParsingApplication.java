package com.prince;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prince.jsonresponse.JsonResponse;
import com.prince.response.BnuicfwArea;

@SpringBootApplication
public class JsonParsingApplication {
	
	

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		//SpringApplication.run(JsonParsingApplication.class, args);
		
		String inputJson = "{\n" + 
				"	\"request\": {\n" + 
				"		\"requestReturn\": \"Y\",\n" + 
				"		\"bnuicfwArea\": {\n" + 
				"			\"inClientNbr\": \"0096\"\n" + 
				"		},\n" + 
				"		\"turnaround\": {\n" + 
				"			\"encoding\": \"test1\",\n" + 
				"			\"value\": \"Test\"\n" + 
				"		}\n" + 
				"	},\n" + 
				"	\"response\": {\n" + 
				"		\"requestReturn\": \"Y\",\n" + 
				"		\"errorMessages\": {\n" + 
				"			\"msg\": [{\n" + 
				"				\"serverity\": \"\",\n" + 
				"				\"code\": \"0\",\n" + 
				"				\"priority\": \"\",\n" + 
				"				\"message\": \"\",\n" + 
				"				\"value\": \"\"\n" + 
				"			}],\n" + 
				"			\"count\": \"\"\n" + 
				"		},\n" + 
				"		\"bnuicfwArea\": [{\n" + 
				"				\"carrierCd\": \"AAAA\",\n" + 
				"				\"carrierNm\": \"GREAT INSURANCE\"\n" + 
				"			},\n" + 
				"			{\n" + 
				"				\"carrierCd\": \"AABB\",\n" + 
				"				\"carrierNm\": \"GREAT INSURANCEEE\"\n" + 
				"			},\n" + 
				"			{\n" + 
				"				\"carrierCd\": \"ABAA\",\n" + 
				"				\"carrierNm\": \" INSURANCE\"\n" + 
				"			}\n" + 
				"		],\n" + 
				"		\"turnaround\": {\n" + 
				"			\"encoding\": \"test1\",\n" + 
				"			\"value\": \"Test1\",\n" + 
				"			\"value\": \"Test\",\n" + 
				"			\"content\": \"Test\"\n" + 
				"		},\n" + 
				"		\"messages\": {\n" + 
				"			\"msg\": {\n" + 
				"				\"serverity\": \"\",\n" + 
				"				\"code\": \"\",\n" + 
				"				\"message\": \"\",\n" + 
				"				\"value\": \"\"\n" + 
				"			},\n" + 
				"			\"message\": \"\"\n" + 
				"		}\n" + 
				"	},\n" + 
				"	\"messageId\": \"ACOM/INS_BNUIPFW2\",\n" + 
				"	\"correlationId\": \"0000000333222\",\n" + 
				"	\"clientNumber\": \"0096\",\n" + 
				"	\"version\": \"\"\n" + 
				"}";
		
		ObjectMapper obj = new ObjectMapper();	
	
			 JsonResponse response = obj.readValue(inputJson, JsonResponse.class);
			 
			 Map<String,String> cusipMap = new HashMap<>();
			 
			 List<BnuicfwArea> bnuicfwArea = response.getResponse().getBnuicfwArea();
			 
			 bnuicfwArea.forEach(o -> cusipMap.put(o.getCarrierCd(), o.getCarrierNm()));
			 
			 if(cusipMap.containsKey("AAAA")) {
				 String cusipName = cusipMap.get("AAAA");
				 System.out.println(cusipName);
			 }
			 
			
		
	
	


}
}