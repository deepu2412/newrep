package com.te.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class ResponseDto {
	private boolean err;
	private String msg;
	private Object object;

}
