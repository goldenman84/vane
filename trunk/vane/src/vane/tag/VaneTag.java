package vane.tag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.tagext.TagSupport;

public class VaneTag extends TagSupport{

	private static final long serialVersionUID = 6394588898484550753L;
	
	protected String getPath(HttpServletRequest request){
		String path = request.getContextPath();
		return path;
	}
}
