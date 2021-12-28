package com.prince;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String jsonStr = "{\r\n" + 
    			"  \"response\": {\r\n" + 
    			"		\"requestReturn\": \"Y\",\r\n" + 
    			"		\"errorMessages\": {\r\n" + 
    			"			\"msg\": [{\r\n" + 
    			"				\"serverity\": \"\",\r\n" + 
    			"				\"code\": \"0\",\r\n" + 
    			"				\"priority\": \"\",\r\n" + 
    			"				\"message\": \"\",\r\n" + 
    			"				\"value\": \"\"\r\n" + 
    			"			}],\r\n" + 
    			"			\"count\": \"\"\r\n" + 
    			"		},\r\n" + 
    			"		\"bnuicfwArea\": [{\r\n" + 
    			"				\"carrierCd\": \"AAAA \",\r\n" + 
    			"				\"carrierNm\": \"GREAT INSURANCE\"\r\n" + 
    			"			},\r\n" + 
    			"			{\r\n" + 
    			"				\"carrierCd\": \"AABB \",\r\n" + 
    			"				\"carrierNm\": \"GREAT INSURANCEEE\"\r\n" + 
    			"			},\r\n" + 
    			"			{\r\n" + 
    			"				\"carrierCd\": \"ABAA \",\r\n" + 
    			"				\"carrierNm\": \" INSURANCE\"\r\n" + 
    			"			}\r\n" + 
    			"		],\r\n" + 
    			"		\"turnaround\": {\r\n" + 
    			"			\"encoding\": \"test1\",\r\n" + 
    			"			\"value\": \"Test1\",\r\n" + 
    			"			\"content\": \"Test\"\r\n" + 
    			"		},\r\n" + 
    			"		\"messages\": {\r\n" + 
    			"			\"msg\": {\r\n" + 
    			"				\"serverity\": \"\",\r\n" + 
    			"				\"code\": \"\",\r\n" + 
    			"				\"message\": \"\",\r\n" + 
    			"				\"value\": \"\"\r\n" + 
    			"			},\r\n" + 
    			"			\"message\": \"\"\r\n" + 
    			"		}\r\n" + 
    			"	}}" ;
    	
//    	JSONObject jb= new JSONObject(jsonStr);
//    	Object ob = jb.get("list");
//    	System.out.println(ob);
//    	System.out.println("==========================================");
    	
    	JSONObject jb2= new JSONObject(jsonStr);
    	//Object object = jb2.getJ
    	//List alist = new ArrayList();	
    	
  //  	Map<String, String> hmap = new HashMap();
    	
    	JSONObject jsonObject = jb2.getJSONObject("response");
    	Object object = jsonObject.getJSONArray("bnuicfwArea").get(1);
//    	
//    	Object[] ob =  (Object[]) jsonObject.get("bnuicfwArea");
//    	
//    	for (Object o : ob) {
//    	
//    		System.out.println(o);
//    		}
//    	
    	
    	HashMap<String, Object> hmap = new Gson().fromJson(object.toString(), HashMap.class);
    	System.out.println(hmap);
    	
    	
    }
}
