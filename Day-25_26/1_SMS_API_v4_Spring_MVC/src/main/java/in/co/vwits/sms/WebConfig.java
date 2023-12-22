package in.co.vwits.sms;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// This is the class executed first by web container (TomCat)
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new  Class[] {StudentManagementWebConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"}; // This is the URL pattern which delegates request to DispatureServlet
	}

}
