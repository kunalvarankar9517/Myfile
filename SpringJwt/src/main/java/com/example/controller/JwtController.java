package com.example.controller;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {
	
	@Autowired
	private customUserDetailService customeUserDetailService;

	@RequestMapping("/token",method=RequestMethod.POST)
	
	public ResponseEntity<?> generateToken(@RequestBody JwtRequest JwtRequest ) throws Exception{
		
		System.out.println(jwtRequest);
	
		try {
			
			this.authenticatiobManager.authenticated(new usernamePasswordAuthenticationToken(jwtRequest.getUsername(),jwtRequest.getPassword();
			
		}catch(UsernameNotFoundException e) {
			e.printStackTrace();
			throw new Exception ("Bad Credentials");
			
		}catch(BadCredentialException e) {
			
			e.printStackTrace();
			throw new Exception ("Bad Credentials");
			
		}
		
		    UserDetails userDetails=  this.customeUserDetails.loadUserByUsername(jwtRequest.getUsername());
		    
		  String to=  this.jwtUtil.generateToken(userDetails);
		  
		  System.out.println("jwt : "+token);
		  
		  
		  
		  return ResponseEntity.ok(new JwtResponse(token))
		
	}
}
