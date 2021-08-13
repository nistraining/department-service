//package com.departmentalService.security;
//
//import java.util.concurrent.TimeUnit;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//
//import com.departmentalService.entity.Employee;
//import com.departmentalService.jwt.JWTUserNameAndPasswordAuthAndFilter;
//import com.departmentalService.service.ApplicationUserService;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter{
//	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//	
//	private final ApplicationUserService applicationUserService;
//	
//    
//    @Autowired
//	public ApplicationSecurityConfig(PasswordEncoder passwordEncoder,ApplicationUserService applicationUserService) {
//		super();
//		this.passwordEncoder = passwordEncoder;
//		this.applicationUserService= applicationUserService;
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.csrf().disable()
//		//.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())-- use this when browser connectivity
//		//.and()
//		
//		//JWT Filter
//		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//		.and()
//		.addFilter(new JWTUserNameAndPasswordAuthAndFilter(authenticationManager()))
//		.authorizeRequests().antMatchers("/","/index","/css","/js*").permitAll()
//		//.antMatchers("/employees/**").hasRole(ApplicationUserRoles.EMPLOYEE.name())
//		//.antMatchers("/employees/**").hasRole(ApplicationUserRoles.STOREMANAGER.name())
//		//.antMatchers("/departments/**").hasRole(ApplicationUserRoles.STOREMANAGER.name())
//		//.antMatchers(HttpMethod.DELETE,"/departments/**").hasAuthority(ApplicationUserPermissions.STOREMANAGER_WRITE.name())
//		//.antMatchers(HttpMethod.POST,"/departments/**").hasAuthority(ApplicationUserPermissions.STOREMANAGER_WRITE.name())
//		//.antMatchers(HttpMethod.PUT,"/departments/**").hasAuthority(ApplicationUserPermissions.STOREMANAGER_WRITE.name())
//		//.antMatchers(HttpMethod.GET,"/departments/**").hasAnyRole(ApplicationUserRoles.STOREMANAGER.name(),ApplicationUserRoles.EMPLOYEE.name())
//		//.antMatchers(HttpMethod.POST,"/departments/**").hasAnyRole(ApplicationUserRoles.STOREMANAGER.name())
//		//.antMatchers(HttpMethod.GET,"/employees" ).hasAuthority(ApplicationUserPermissions.EMPLOYEE_READ.name())
//		//.antMatchers(HttpMethod.GET,"/employees").hasAnyRole(ApplicationUserRoles.EMPLOYEE.name(),ApplicationUserRoles.STOREMANAGER.name())
//		.anyRequest().authenticated();
//		
////		.and()
////		//.httpBasic();
////		.formLogin()
////		.loginPage("/login").permitAll()
////		.defaultSuccessUrl("/departments",true)
////		.and()
////		.rememberMe()
////		.tokenValiditySeconds((int)(TimeUnit.DAYS.toSeconds(21)))
////		.key("This is a secured one");
//		/*.and()
//		.logout()
//		.logoutUrl("/logout") 
//		.clearAuthentication(true)
//		.invalidateHttpSession(true)
//		.deleteCookies("JSESSIONID","remember-me")
//		.logoutUrl("/login");*/
//		
//
//	}
//
////	@Override
////	@Bean
////	protected UserDetailsService userDetailsService() {
////		UserDetails nisithUser= User.builder()
////		.username("nisith")
////		.password(passwordEncoder.encode("password"))
////		//.roles(ApplicationUserRoles.EMPLOYEE.name())// Employee_Role
////		.authorities(ApplicationUserRoles.EMPLOYEE.getGrantedAuthorities())
////		.build();
////		
////		UserDetails storeManager = User.builder()
////				.username("Surya")
////				.password(passwordEncoder.encode("storemanager"))
////				//.roles(ApplicationUserRoles.STOREMANAGER.name()) //Storemanager_role
////				.authorities(ApplicationUserRoles.STOREMANAGER.getGrantedAuthorities())
////				.build();
////		
////		return new InMemoryUserDetailsManager(nisithUser,storeManager);
////	}
//	
//	//DB authentication
//	
//	public DaoAuthenticationProvider daoAuthenticationProvider()
//	{
//		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//		provider.setPasswordEncoder(passwordEncoder);
//		provider.setUserDetailsService(applicationUserService);
//		return provider;
//	}
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.authenticationProvider(daoAuthenticationProvider());
//	}
//
//	
//	
//	
//	
//
//}
