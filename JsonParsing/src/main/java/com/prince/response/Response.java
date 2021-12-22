package com.prince.response;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Response {

	private String requestReturn;
	private ErrorMessages errorMessages;
	private List<BnuicfwArea> bnuicfwArea;
	private Turnaround turnaround;
	private Messages messages;
	
}
