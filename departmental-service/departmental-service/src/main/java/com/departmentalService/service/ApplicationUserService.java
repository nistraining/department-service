//package com.departmentalService.service;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.security.db.auth.ApplicationUser;
//import com.security.db.auth.ApplicationUserDAO;
//
//@Service
//public class ApplicationUserService implements UserDetailsService {
//
//	
//	private  final ApplicationUserDAO applicationUserDAO;
//	
//	@Autowired
//	public ApplicationUserService(@Qualifier("authentication") ApplicationUserDAO applicationUserDAO) {
//		this.applicationUserDAO = applicationUserDAO;
//	}
//
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		return applicationUserDAO.selectApplicationUserByUserName(username).orElseThrow(()
//				-> new UsernameNotFoundException(String.format("Username %s not found", username))
//				);
//	}
//
//
//
//}
