package IPL.Helper;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer 
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class[] getServletConfigClasses() {
		Class[] myConfig = {MyConfig.class};
		return myConfig;
	}

	@Override
	protected String[] getServletMappings() {
		String[] arr = {"/"};
		return arr;
	}

}
