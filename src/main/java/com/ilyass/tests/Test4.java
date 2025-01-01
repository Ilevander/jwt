package com.ilyass.tests;

import com.ilyass.jwt.TokenManager;

public class Test4 {

	public static final String TOKEN_1 = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTYzODk2ODE5OSwiZXhwIjoxNjM5MDU0NTk5fQ.I9ppVWS9o5ARboIW9W2zqsIb-nX14UustUT-LIHENSMvDg474rWALCvdne1ZALZXvd3sjE0RZWH8kQ9lbeM6vw";
	public static final String TOKEN_2 = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjpbIkFETUlOIiwiQ0xJRU5UIl0sImV4cCI6MTYzOTA1NTM0MiwiaWF0IjoxNjM4OTY4OTQyfQ.5sCCRKFBNXJvGYh-QR9llaJ-g99QIHc_zUQIX5Vjiqp-EqiY9pvQAI9wHomStZqaL-T_ORsf419qgI34Q6CiBw";
	
	public static void main(String[] args) {
		
		TokenManager.getDataFromJwtToken(TOKEN_2);

	}

}
