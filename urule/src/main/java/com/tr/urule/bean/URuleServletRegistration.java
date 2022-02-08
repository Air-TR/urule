package com.tr.urule.bean;

import com.bstek.urule.console.servlet.URuleServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServlet;

/**
 * @author rtao
 * @date 2022/1/29 15:55
 */
@Component
public class URuleServletRegistration {

	/** 以下配置放到启动类中，则该类可以不需要 **/
	@Bean
	public ServletRegistrationBean<HttpServlet> registerURuleServlet(){
		return new ServletRegistrationBean<HttpServlet>(new URuleServlet(),"/urule/*");
	}

}