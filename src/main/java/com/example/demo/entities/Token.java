package com.example.demo.entities;

import java.security.SecureRandom;
import java.util.Date;
import java.util.Base64;
//import java.util.UUID;

public class Token<AccessRequest> {
	private static final SecureRandom secureRandom = new SecureRandom();
	private static final Base64.Encoder base64Encoder = Base64.getUrlEncoder();
//	String encodedValue = getToken();

	public static String getToken() {
		Date date = new Date();
		byte[] randomBytes = new byte[32];
		secureRandom.nextBytes(randomBytes);
		return base64Encoder.encodeToString(randomBytes)+" :"+date.toString();
//		String token = UUID.randomUUID().toString() + ":" + System.currentTimeMillis();
//		String[] t = token.split(":");
//		String token_time = t[1];
//		return token;
	}
//	AccessRequest request= AcessRequest.tokenLocation(tokenUrl);
//	request.addHeader(name "Authorization", header "basic "+ encodedValue);
	
//	public static void main(String[] args) {
//		for(int i=0;i<=5;i++) 
//		System.out.println(getToken());
//		
//	}

}
