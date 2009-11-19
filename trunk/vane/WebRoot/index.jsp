<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://vane1003.cn" prefix="v" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>
  <body>
  <v:InputText name="hidden" id="hidden" type="hidden" fvformid="f1"></v:InputText>
  <form id="f1" action="">
  <table>
  	<tr>
  		<td>时间控件：</td>
  		<td><v:my97date name="test" id="test" classstyle="Wdate" onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-M',minDate:'2008-2',maxDate:'2008-10'})"></v:my97date></td>
  		<td><v:my97date name="test1" id="test1" prave="skin:'ext'" isShowImg="yes"></v:my97date></td>
  	</tr>
  	<tr>
  		<td>输入限制控件：</td>
  		<td><v:InputText name="dd" id="dd" type="text" fvtipid="ddTip" fvonshow="请输入大写字母" fvoncorrect="输入正确" fvonfocus="必须是大写字母" fvregexp="letter_u" fvonerror="大写字母格式不正确"></v:InputText></td>
  		<td><div id="ddTip"></div></td>
  	</tr>
  </table>
  </form>
  </body>
</html>
