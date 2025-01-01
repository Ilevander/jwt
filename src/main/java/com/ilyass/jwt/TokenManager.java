package com.ilyass.jwt;

import java.util.Date;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class TokenManager {

	private final static String KEY = "@zerty";

	public static String generateToken(String username, Date dateCreation, Date dateExpiration) {
		String token = null;
		JwtBuilder builder = Jwts.builder();
		builder.setSubject(username);
		builder.setIssuedAt(dateCreation);
		builder.setExpiration(dateExpiration);
		builder.signWith(SignatureAlgorithm.HS512, KEY);
		token = builder.compact();
		return token;
	}
}
