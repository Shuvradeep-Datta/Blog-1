//package com.deep.blogapis.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import com.deep.blogapis.security.CustomUserDetailService;
//import com.deep.blogapis.security.JwtAuthenticationEntryPoint;
//import com.deep.blogapis.security.JwtAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig  {
//	
//	@Autowired
//	private CustomUserDetailService customUserDetailsService;
//	
//	
//	@Autowired
//	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
//	
//	@Autowired
//	private JwtAuthenticationFilter jwtAuthenticationFilter;
//
//	 	@SuppressWarnings("removal")
//		@Bean
//	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//	 		
//	 		
//	 		
////	 		 http.
////             csrf()
////             .disable()
////             .authorizeHttpRequests()
////             .permitAll()
////             .requestMatchers(HttpMethod.POST)
////             .permitAll()
////             .anyRequest()
////             .authenticated()
////             .and().exceptionHandling()
////             .authenticationEntryPoint(this.jwtAuthenticationEntryPoint)
////             .and()
////             .sessionManagement()
////             .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
////	 		
////	 		http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
////	 		
////	 		http.authenticationProvider(daoAuthenticationProvider());
////	        DefaultSecurityFilterChain defaultSecurityFilterChain = http.build();
////
////	        return defaultSecurityFilterChain;
//
//	        
//
//	 }
//	 	
//	 	
//	    @Bean
//	    public AuthenticationManager authenticationManagerBean(AuthenticationConfiguration configuration) throws Exception {
//	        return configuration.getAuthenticationManager();
//	    }
//	    
//	    
//	 	@Bean
//		public DaoAuthenticationProvider daoAuthenticationProvider() {
//			 DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//		        provider.setUserDetailsService(this.customUserDetailsService);
//		        provider.setPasswordEncoder(passwordEncoder());
//		        return provider;
//		}
//	 	@Bean
//		public PasswordEncoder passwordEncoder() {
//			return new BCryptPasswordEncoder();
//		}
//	 	
//	
//	 	
//	
//	
//	}
