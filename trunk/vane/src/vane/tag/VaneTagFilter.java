package vane.tag;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vane.tag.temp.MiniTemplator;

public class VaneTagFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest servletrequest,
			ServletResponse servletresponse, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletrequest;
		HttpServletResponse response = (HttpServletResponse) servletresponse;
		String resourcePath = getServletPath(request);
		if ("".equals(resourcePath) && null != request.getPathInfo()) {
			resourcePath = request.getPathInfo();
		}
		if (resourcePath.startsWith("/vanetag")) {// vanetag
			try {
				String requestfilename = resourcePath.substring("/vanetag".length());
//				System.out.println(requestfilename);
				findStaticResource(requestfilename, request, response);
			} catch (Exception se) {
				chain.doFilter(request, response);
			}
		} else {
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig filterConfig) throws ServletException {

	}

	/**
	 * @Title: getServletPath
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param request
	 * @return String 返回类型
	 * @throws
	 */
	public String getServletPath(HttpServletRequest request) {
		String servletPath = request.getServletPath();
		if (null != servletPath && !"".equals(servletPath)) {
			return servletPath;
		}
		String requestUri = request.getRequestURI();
		int startIndex = request.getContextPath().equals("") ? 0 : request.getContextPath().length();
		int endIndex = request.getPathInfo() == null ? requestUri.length():requestUri.lastIndexOf(request.getPathInfo());
		if (startIndex > endIndex) {
			endIndex = startIndex;
		}
		return requestUri.substring(startIndex, endIndex);
	}

	/**
	 * @Title: getContentType
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param name
	 * @return String 返回类型
	 * @throws
	 */
	protected String getContentType(String name) {
		if (name.endsWith(".js")) {
			return "text/javascript";
		} else if (name.endsWith(".css")) {
			return "text/css";
		} else if (name.endsWith(".html")) {
			return "text/html";
		} else if (name.endsWith(".htm")) {
			return "text/html";
		} else if (name.endsWith(".txt")) {
			return "text/plain";
		} else if (name.endsWith(".gif")) {
			return "image/gif";
		} else if (name.endsWith(".jpg") || name.endsWith(".jpeg")) {
			return "image/jpeg";
		} else if (name.endsWith(".png")) {
			return "image/png";
		} else {
			return null;
		}
	}

	/**
	 * 输出文件到网页上
	 * 
	 * @param name
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	protected void findStaticResource(String name, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		if (name.indexOf(".") != -1) {
			String Prefixes = name.substring(name.lastIndexOf("."),name.length());// 文件扩展名
			InputStream input = findInputStream(name);
			String contentType = getContentType(Prefixes);
			if (contentType != null) {
				response.setContentType(contentType);
			}
			response.setHeader("only-if-cached", "public");
			response.setHeader("Cache-Control", "public");
			try {
				copy(input, response.getOutputStream(), request, name);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				input.close();
			}
		}
	}

	/**
	 * 取得输入流
	 * 
	 * @param name
	 * @param packagePrefix
	 * @return
	 * @throws IOException
	 */
	protected InputStream findInputStream(String resourcePath) {
		try {
			if (resourcePath.startsWith("/"))
				resourcePath = resourcePath.substring(1);
			URL sb = Thread.currentThread().getContextClassLoader().getResource(resourcePath);
			return sb.openStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 文件拷贝输出
	 * 
	 * @param input
	 * @param output
	 * @throws IOException
	 */
	protected void copy(InputStream input, OutputStream output,
			HttpServletRequest request, String name) throws IOException {
		try {

			if (name.endsWith(".js") || name.endsWith(".html")
					|| name.endsWith(".css") || name.endsWith("txt")
					|| name.endsWith(".htm")) {
				MiniTemplator t = new MiniTemplator(input);
				t.generateOutput(output);
			} else {
				byte[] buffer = new byte[1];
				while (input.read(buffer) != -1) {
					output.write(buffer);
				}
			}
			output.flush();
			output.close();
			input.close();
		} catch (Exception e) {
			System.out.println("-------------" + name + "");
			e.printStackTrace();
		}
	}
}
