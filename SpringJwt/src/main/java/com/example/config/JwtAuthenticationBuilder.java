package com.example.config;

import jakarta.servlet.http.HttpServletRequest;

@Component
public class JwtAuthenticationBuilder extends OncePerRequestFilter {

	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private customeUserServiceDetail  customeUserServiceDetail  ;
	
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServlet response response) {
		
		String requestTokenHeader =request.getHeader(_name="Authorization");
		
		String username=null;
		String jwtToken=null;
		
		if(requestTokenHeader=null && requestTokenHeader.startsWith("Bearer")) {
			
			
			
			try {
			
				 this.jwtUtil.getUsernameFromToken(jwtToken);
				
			}catch(Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}
