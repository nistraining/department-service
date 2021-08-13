//package com.departmentalService.security;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//
//import com.google.common.collect.Sets;
//
//public enum ApplicationUserRoles {
//	
//	
//	EMPLOYEE(Sets.newHashSet(ApplicationUserPermissions.EMPLOYEE_READ,ApplicationUserPermissions.STOREMANAGER_READ)),
//	STOREMANAGER(Sets.newHashSet(ApplicationUserPermissions.STOREMANAGER_READ,
//			ApplicationUserPermissions.STOREMANAGER_WRITE,
//			ApplicationUserPermissions.EMPLOYEE_READ,ApplicationUserPermissions.EMPLOYEE_WRTIE));
//	
//	private final Set<ApplicationUserPermissions> permissions;
//	
//	
//
//	private ApplicationUserRoles(Set<ApplicationUserPermissions> permissions) {
//		this.permissions = permissions;
//	}
//	
//
//	public Set<ApplicationUserPermissions> getPermissions() {
//		return permissions;
//	}
//	
//	public Set<SimpleGrantedAuthority> getGrantedAuthorities()
//	{
//	      Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
//	    		  .map(permission-> new SimpleGrantedAuthority(permission.getPermission()))
//	    		  .collect(Collectors.toSet());
//	      
//	      permissions.add(new SimpleGrantedAuthority("ROLE_"+this.name()));
//	      return permissions;
//	    		  
//	}
//	
//	
//	
//	 
//	
//	
//
//}
