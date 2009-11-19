package vane.tag;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

/**
 * @ClassName: InputText
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author vane zhaoxiong1003@126.com
 * @date 2009-10-28 下午04:12:14
 * 
 */
public class InputText extends InputSuper{

	private static final long serialVersionUID = -1813868884741000335L;
	
	/***************************FormValidator属性********************************/
	
	private String fvonshow;		//未验证之前显示的信息
	private String fvonfocus;		//焦点到时显示的信息
	private String fvoncorrect;		//验证成功后显示的信息
	private String fvmin;			//最小值
	private String fvmax;			//最大值
	private String fvonerror;		//错误信息显示
	private String fvregexp;		//正则验证
	private String fvdatatype;		//验证类型
	private String fvdefaultvalue;	//默认值
	private String fvtipid;			//显示验证信息的id
	private String fvformid;		//进行验证的form id
	
	/***************************FormValidator属性********************************/
	
	private String javaScriptStr="";
	
	@SuppressWarnings("static-access")
	public int doStartTag() throws JspException{
		JspWriter jspOut = pageContext.getOut();
		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
		StringBuilder sb=new StringBuilder();
		if(request.getAttribute("VaneInputText")==null){
			sb.append("\t<script src=\""+getPath(request)+"/vanetag/ui/jqueryValidator/jquery_last.js\" type=\"text/javascript\"></script>\n");
			sb.append("\t<script src=\""+getPath(request)+"/vanetag/ui/jqueryValidator/formValidator.js\" type=\"text/javascript\" charset=\"UTF-8\"></script>\n");
			sb.append("\t<script src=\""+getPath(request)+"/vanetag/ui/jqueryValidator/formValidatorRegex.js\" type=\"text/javascript\" charset=\"UTF-8\"></script>\n");
			sb.append("\t<link  href=\""+getPath(request)+"/vanetag/ui/jqueryValidator/style/validator.css\" type=\"text/css\" rel=\"stylesheet\"></link>\n");
			request.setAttribute("VaneInputText","true");
		}
		
		if(null!=fvtipid||!"".equals(fvtipid)||null!=getId()||!"hidden".equals(getId())){
			javaScriptStr+="$(\""+getId()+"\").formValidator({onshow:\""+fvonshow+"\",oncorrect:\""+fvoncorrect+"\"}).regexValidator({regexp:\""+fvregexp+"\",datatype:\"enum\",onerror:\""+fvonerror+"\"});\n";
		}
		System.out.println(javaScriptStr);
		if(request.getAttribute("VaneFormId")==null){
			sb.append("\t<script type=\"text/javascript\">\n");
			sb.append("\t$(document).ready(function(){\n");
			sb.append("\t\t$.formValidator.initConfig({formid:\""+fvformid+"\",onerror:function(){alert(\"校验没有通过，具体错误请看错误提示\")}});\n");
			sb.append("\t\t"+javaScriptStr);
			sb.append("\t});\n");
			sb.append("\t</script>\n");
			request.setAttribute("VaneFormId","true");
		}
		
		sb.append("<input type=\""+getType()+"\"");
		sb.append(getBaseStr());
		sb.append("/>");
		try {
			jspOut.write(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.EVAL_BODY_AGAIN;
	}

	public String getFvonshow() {
		return fvonshow;
	}

	public void setFvonshow(String fvonshow) {
		this.fvonshow = fvonshow;
	}

	public String getFvonfocus() {
		return fvonfocus;
	}

	public void setFvonfocus(String fvonfocus) {
		this.fvonfocus = fvonfocus;
	}

	public String getFvoncorrect() {
		return fvoncorrect;
	}

	public void setFvoncorrect(String fvoncorrect) {
		this.fvoncorrect = fvoncorrect;
	}

	public String getFvmin() {
		return fvmin;
	}

	public void setFvmin(String fvmin) {
		this.fvmin = fvmin;
	}

	public String getFvmax() {
		return fvmax;
	}

	public void setFvmax(String fvmax) {
		this.fvmax = fvmax;
	}

	public String getFvonerror() {
		return fvonerror;
	}

	public void setFvonerror(String fvonerror) {
		this.fvonerror = fvonerror;
	}

	public String getFvregexp() {
		return fvregexp;
	}

	public void setFvregexp(String fvregexp) {
		this.fvregexp = fvregexp;
	}

	public String getFvdefaultvalue() {
		return fvdefaultvalue;
	}

	public void setFvdefaultvalue(String fvdefaultvalue) {
		this.fvdefaultvalue = fvdefaultvalue;
	}

	public String getFvtipid() {
		return fvtipid;
	}

	public void setFvtipid(String fvtipid) {
		this.fvtipid = fvtipid;
	}

	public String getFvformid() {
		return fvformid;
	}

	public void setFvformid(String fvformid) {
		this.fvformid = fvformid;
	}
}
