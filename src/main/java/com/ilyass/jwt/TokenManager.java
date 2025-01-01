package com.ilyass.jwt;

import java.util.Date;
import java.util.Map;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

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
	
	public static String generateTokenwithRoles(Map<String, Object> credentials, Date dateCreation,Date dateExpiration) {
		String token = null;
		JwtBuilder builder = Jwts.builder();
		builder.setClaims(credentials);
		builder.setIssuedAt(dateCreation);
		builder.setExpiration(dateExpiration);
		builder.signWith(SignatureAlgorithm.HS512, KEY);
		token = builder.compact();
		return token;
	}
	
	public static boolean validateJwtToken(String authToken) {
		try {
			Jwts.parser().setSigningKey(KEY).parseClaimsJws(authToken);
			return true;
		} catch (SignatureException e) {
			e.printStackTrace();
		} catch (MalformedJwtException e) {
			e.printStackTrace();
		} catch (ExpiredJwtException e) {
			e.printStackTrace();
		} catch (UnsupportedJwtException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return false;
	}
}
