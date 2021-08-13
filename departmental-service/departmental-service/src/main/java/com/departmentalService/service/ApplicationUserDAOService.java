//package com.departmentalService.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Repository;
//
//import com.departmentalService.security.ApplicationUserRoles;
//import com.google.common.collect.Lists;
//import com.security.db.auth.ApplicationUser;
//import com.security.db.auth.ApplicationUserDAO;
//
//@Repository("authentication")
//public class ApplicationUserDAOService implements ApplicationUserDAO {
//    
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//	
//	
//	private List<ApplicationUser> getApplicationUsers()
//	{
//		List<ApplicationUser> applicationUsers = Lists.newArrayList(
//				new ApplicationUser(
//						ApplicationUserRoles.STOREMANAGER.getGrantedAuthorities(),
//						passwordEncoder.encode("storemanager"),
//						"surya",
//						true,
//						true,
//						true,
//						true),
//				new ApplicationUser(
//						ApplicationUserRoles.EMPLOYEE.getGrantedAuthorities(),
//						passwordEncoder.encode("password"),
//						"nisith",
//						true,
//						true,
//						true,
//						true)	
//						);		
//		return applicationUsers;
//	}
//
//
//	@Override
//	public Optional<ApplicationUser> selectApplicationUserByUserName(String username) {
//		return getApplicationUsers()
//				.stream()
//				.filter(applicationuser-> username.equals(applicationuser.getUsername()))
//				.findFirst();
//	}
//
//}
