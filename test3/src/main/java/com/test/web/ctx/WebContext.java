package com.test.web.ctx;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.test.web.ctx.RootContext;
import com.test.web.ctx.ServletContext;

public class WebContext extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootContext.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletContext.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	

}
