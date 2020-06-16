package com.ashokit;

import org.springframework.stereotype.Component;

@Component
public class Addition {
	
	int a,b;
	int addResult(int a,int b) {
		
		this.a=a;
		this.b=b;
		
		return a+b;
		
	
	}

}
