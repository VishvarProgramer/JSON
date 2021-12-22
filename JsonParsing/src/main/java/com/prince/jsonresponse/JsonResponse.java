package com.prince.jsonresponse;

import com.prince.request.Request;
import com.prince.response.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JsonResponse {

	private Request request;
	private Response response;
	private String messageId;
	private String correlationId;
	private String version;
	private String clientNumber;
	
	
}
