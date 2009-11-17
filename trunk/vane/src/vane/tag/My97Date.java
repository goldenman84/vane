package vane.tag;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

/**
 * @ClassName: DateTime
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author vane zhaoxiong1003@126.com
 * @date 2009-10-23 上午11:15:38
 * 
 */
public class My97Date extends InputSuper{
	
	private static final long serialVersionUID = -3530533249465083704L;
	private JspWriter jspOut =null;
	private String prave="";
	private String isShowImg="no";
	
	@SuppressWarnings("static-access")
	public int doStartTag()throws JspException{
		jspOut= pageContext.getOut();
		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
		StringBuilder sb = new StringBuilder();
		if(request.getAttribute("VaneMy97Date")==null){
			sb.append("<script language=\"javascript\" src=\""+getPath(request)+"/vanetag/ui/my97/WdatePicker.js\"></script>\n");
			request.setAttribute("VaneMy97Date", "true");
		}
		sb.append("<input type=\"text\" ");
		sb.append(getBaseStr());
		sb.append("/>");
		if(isShowImg.equalsIgnoreCase("yes")){
			if(prave.trim().length()>0)
				sb.append("<img style=\"cursor: pointer;\" src=\""+getPath(request)+"/vanetag/ui/my97/skin/datePicker.gif"+"\" align=\"absmiddle\" width=\"16\" height=\"22\" onClick=\"WdatePicker({skin:'whyGreen',el:'"+getId()+"',"+prave+" })\"/> ");
		}
		 try {
			jspOut.write(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.EVAL_BODY_AGAIN;
	}
	public String getPrave() {
		return prave;
	}
	public void setPrave(String prave) {
		this.prave = prave;
	}
	public String getIsShowImg() {
		return isShowImg;
	}
	public void setIsShowImg(String isShowImg) {
		this.isShowImg = isShowImg;
	}
	public JspWriter getJspOut() {
		return jspOut;
	}
	public void setJspOut(JspWriter jspOut) {
		this.jspOut = jspOut;
	}
}
