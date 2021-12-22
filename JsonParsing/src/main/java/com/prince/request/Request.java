package com.prince.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Request {
	private String requestReturn;
	private BnuicfwArea bnuicfwArea;
	private Turnaround turnaround;

}
