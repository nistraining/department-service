//package com.departmentalService.jwt;
//
//import java.time.LocalDate;
//import java.util.Date;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.io.IOException;
//import io.jsonwebtoken.security.Keys;
//
//public class JWTUserNameAndPasswordAuthAndFilter extends UsernamePasswordAuthenticationFilter{
//
//	
//	private final AuthenticationManager authenticationManager;
//	
//	
//	public JWTUserNameAndPasswordAuthAndFilter(AuthenticationManager authenticationManager) {
//		super();
//		this.authenticationManager = authenticationManager;
//	}
//
//
//	@Override
//	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
//			throws AuthenticationException {
//		
//		try
//		{
//			UserNameAndPasswordAuthenticationRequest authenticationRequest =
//					new  ObjectMapper().
//					readValue(request.getInputStream(), UserNameAndPasswordAuthenticationRequest.class);
//			
//			Authentication authentication = new UsernamePasswordAuthenticationToken(
//					authenticationRequest.getUserName(),
//					authenticationRequest.getPassword()
//					);
//			Authentication authenticate=  authenticationManager.authenticate(authentication);
//			return authenticate;
//		}catch(Exception e)
//		{
//			throw new RuntimeException(e);
//		}
//		
//	}
//
//
//	@Override
//	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
//			Authentication authResult) throws java.io.IOException, ServletException {
//		String key = "securesecuresecuresecuresecuresecuresecuresecuresecuresecuresecuresecuresecuresecuresecuresecuresecure";
//		String token = Jwts.builder()
//		    .setSubject(authResult.getName())
//		    .claim("authorities", authResult.getAuthorities())
//		    .setIssuedAt(new Date())
//		    .setExpiration(java.sql.Date.valueOf(LocalDate.now().plusWeeks(2)))
//		    .signWith(Keys.hmacShaKeyFor(key.getBytes()))
//		    .compact();
//		System.out.println("TOKEN IS :" +token);
//		response.setHeader("Authorization","Bearer" + token);
//		 
//		super.successfulAuthentication(request, response, chain, authResult);
//	}
//	
//	
//
//	
//}
