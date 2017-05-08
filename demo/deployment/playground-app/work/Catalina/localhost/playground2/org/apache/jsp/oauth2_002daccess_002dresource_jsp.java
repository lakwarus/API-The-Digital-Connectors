/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.77
 * Generated at: 2017-05-04 12:59:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.sample.identity.oauth2.OAuth2ServiceClient;
import org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationRequestDTO;
import org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationResponseDTO;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationRequestDTO_OAuth2AccessToken;
import org.wso2.carbon.identity.oauth2.stub.dto.OAuth2TokenValidationRequestDTO_TokenValidationContextParam;
import org.wso2.sample.identity.oauth2.OAuth2Constants;

public final class oauth2_002daccess_002dresource_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public static String executePost(String targetURL, String urlParameters,String accessTokenIdentifier)
    {
        URL url;
        HttpURLConnection connection = null;
        try {
            //Create connection
            url = new URL(targetURL);
            connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");
            connection.setRequestProperty("Authorization","Bearer " + accessTokenIdentifier);

            connection.setRequestProperty("Content-Length", "" +
                    Integer.toString(urlParameters.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");

            connection.setUseCaches (false);
            connection.setDoInput(true);
            connection.setDoOutput(true);

            //Send request
            DataOutputStream wr = new DataOutputStream (
                    connection.getOutputStream ());
            wr.writeBytes (urlParameters);
            wr.flush ();
            wr.close ();

            //Get Response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuffer response = new StringBuffer();
            while((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            return response.toString();

        } catch (Exception e) {

            e.printStackTrace();
            return null;

        } finally {

            if(connection != null) {
                connection.disconnect();
            }
        }
    }

public static String executeGet(String targetURL, String urlParameters,String accessTokenIdentifier){
	try {
	    URL myURL = new URL(targetURL);
	    URLConnection myURLConnection = myURL.openConnection();
	    myURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        myURLConnection.setRequestProperty("Authorization","Bearer " + accessTokenIdentifier);
        myURLConnection.setRequestProperty("Content-Language", "en-US");
        myURLConnection.setUseCaches (false);
        myURLConnection.setDoInput(true);
        myURLConnection.setDoOutput(true);
        
	    BufferedReader br = new BufferedReader(
	                                           new InputStreamReader(myURLConnection.getInputStream()));
	    String line;
        StringBuffer response = new StringBuffer();
        while((line = br.readLine()) != null) {
            response.append(line);
            response.append('\r');
        }
        br.close();
        return response.toString();
	} 
	catch (Exception e) { 
	    // new URL() failed
	    // ...
	} 
	return "";
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    OAuth2ServiceClient client = new OAuth2ServiceClient();
    String accessTokenIdentifier = request.getParameter("accessToken");
    String resource_url = request.getParameter("resource_url");

    if (accessTokenIdentifier ==null || accessTokenIdentifier.trim().length()==0) {

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    window.location = \"oauth2.jsp?reset=true\";\n");
      out.write("</script>\n");

    }

    if(application.getInitParameter("setup").equals("IS")){
        OAuth2TokenValidationRequestDTO  oauthReq = new OAuth2TokenValidationRequestDTO();
        OAuth2TokenValidationRequestDTO_OAuth2AccessToken accessToken =  new OAuth2TokenValidationRequestDTO_OAuth2AccessToken();

        accessToken.setTokenType("bearer");
        accessToken.setIdentifier(accessTokenIdentifier);
        oauthReq.setAccessToken(accessToken);

        try {
            // Validate the OAuth access token.
            OAuth2TokenValidationResponseDTO oauthResponse = client.validateAuthenticationRequest(oauthReq);
            session.setAttribute(OAuth2Constants.TOKEN_VALIDATION, Boolean.toString(oauthResponse.getValid()));

            if (!oauthResponse.getValid()) {
                String errorMsg = oauthResponse.getErrorMsg();
                if(errorMsg == null){
                    errorMsg = "";
                }
                errorMsg = "Invalid Access Attempt : " + errorMsg;

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    window.location = \"oauth2.jsp?reset=true&error=");
      out.print(errorMsg);
      out.write("\";\n");
      out.write("</script>\n");

            }
            else if(resource_url != null && resource_url.contains("userinfo")) {
            	String result = executeGet(resource_url, "", accessTokenIdentifier);
            	session.setAttribute("result", result);
                response.sendRedirect("user-info.jsp");
            } else if (resource_url != null && resource_url.contains("introspect")) {
                String result = executePost(resource_url, "token=" + accessTokenIdentifier, accessTokenIdentifier);
                session.setAttribute("result", result);
                response.sendRedirect("token-info.jsp");
            } else {
                RequestDispatcher view = request.getRequestDispatcher("my-photos.jsp");
                view.forward(request, response);
            }
        } catch(Exception e) {

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    window.location = \"oauth2.jsp?reset=true&error=");
      out.print(e.getMessage());
      out.write("\";\n");
      out.write("</script>\n");

        }
    }else if(getServletConfig().getServletContext().getInitParameter("setup").equals("AM")){
        String result = executePost(resource_url,"", accessTokenIdentifier);
        out.print(result);
    }else{

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    window.location = \"oauth2.jsp?reset=true&error='Invalid Setup value'\";\n");
      out.write("</script>\n");

    }

      out.write('\n');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
