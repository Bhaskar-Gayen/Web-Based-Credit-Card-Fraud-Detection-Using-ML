/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.48
 * Generated at: 2021-06-28 06:37:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Payment Gateway</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTUsg08uqBiFaXEcnYREzm-bbVRNq_wMvl6sQ&usqp=CAU\"/>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(".container-fluid {\r\n");
      out.write("    background-color: #C5CAE9\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".heading {\r\n");
      out.write("    font-size: 40px;\r\n");
      out.write("    margin-top: 35px;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("    padding-left: 20px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card {\r\n");
      out.write("    border-radius: 10px !important;\r\n");
      out.write("    margin-top: 60px;\r\n");
      out.write("    margin-bottom: 60px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-card {\r\n");
      out.write("    margin-left: 20px;\r\n");
      out.write("    margin-right: 20px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-card input,\r\n");
      out.write(".form-card textarea {\r\n");
      out.write("    padding: 10px 15px 5px 15px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border: 1px solid lightgrey;\r\n");
      out.write("    border-radius: 6px;\r\n");
      out.write("    margin-bottom: 25px;\r\n");
      out.write("    margin-top: 2px;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    font-family: arial;\r\n");
      out.write("    color: #2C3E50;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    letter-spacing: 1px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-card input:focus,\r\n");
      out.write(".form-card textarea:focus {\r\n");
      out.write("    -moz-box-shadow: 0px 0px 0px 1.5px skyblue !important;\r\n");
      out.write("    -webkit-box-shadow: 0px 0px 0px 1.5px skyblue !important;\r\n");
      out.write("    box-shadow: 0px 0px 0px 1.5px skyblue !important;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    border: 1px solid #304FFE;\r\n");
      out.write("    outline-width: 0\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input-group {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    overflow: hidden\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input-group input {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    height: 80px;\r\n");
      out.write("    margin-left: 1px;\r\n");
      out.write("    margin-right: 1px;\r\n");
      out.write("    border-radius: 6px;\r\n");
      out.write("    padding-top: 30px;\r\n");
      out.write("    padding-left: 25px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input-group label {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    height: 24px;\r\n");
      out.write("    background: none;\r\n");
      out.write("    border-radius: 6px;\r\n");
      out.write("    line-height: 48px;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    color: gray;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    font-weight: 100;\r\n");
      out.write("    padding-left: 25px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input:focus+label {\r\n");
      out.write("    color: #304FFE\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-pay {\r\n");
      out.write("    background-color: #304FFE;\r\n");
      out.write("    height: 60px;\r\n");
      out.write("    color: #ffffff !important;\r\n");
      out.write("    font-weight: bold\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-pay:hover {\r\n");
      out.write("    background-color: #3F51B5\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fit-image {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    object-fit: cover\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("    border-radius: 5px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".radio-group {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    margin-bottom: 25px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".radio {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    border-radius: 6px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    border: 2px solid lightgrey;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    margin: 12px 25px 12px 0px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".radio:hover {\r\n");
      out.write("    box-shadow: 0px 0px 0px 1px rgba(0, 0, 0, 0.2)\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".radio.selected {\r\n");
      out.write("    box-shadow: 0px 0px 0px 1px rgba(0, 0, 155, 0.4);\r\n");
      out.write("    border: 2px solid blue\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".label-radio {\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    color: #000000\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("//For Card Number formatted input\r\n");
      out.write("var cardNum = document.getElementById('cr_no');\r\n");
      out.write("cardNum.onkeyup = function (e) {\r\n");
      out.write("if (this.value == this.lastValue) return;\r\n");
      out.write("var caretPosition = this.selectionStart;\r\n");
      out.write("var sanitizedValue = this.value.replace(/[^0-9]/gi, '');\r\n");
      out.write("var parts = [];\r\n");
      out.write("\r\n");
      out.write("for (var i = 0, len = sanitizedValue.length; i < len; i +=4) { parts.push(sanitizedValue.substring(i, i + 4)); } for (var i=caretPosition - 1; i>= 0; i--) {\r\n");
      out.write("    var c = this.value[i];\r\n");
      out.write("    if (c < '0' || c> '9') {\r\n");
      out.write("        caretPosition--;\r\n");
      out.write("        }\r\n");
      out.write("        }\r\n");
      out.write("        caretPosition += Math.floor(caretPosition / 4);\r\n");
      out.write("\r\n");
      out.write("        this.value = this.lastValue = parts.join('-');\r\n");
      out.write("        this.selectionStart = this.selectionEnd = caretPosition;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        //For Date formatted input\r\n");
      out.write("        var expDate = document.getElementById('exp');\r\n");
      out.write("        expDate.onkeyup = function (e) {\r\n");
      out.write("        if (this.value == this.lastValue) return;\r\n");
      out.write("        var caretPosition = this.selectionStart;\r\n");
      out.write("        var sanitizedValue = this.value.replace(/[^0-9]/gi, '');\r\n");
      out.write("        var parts = [];\r\n");
      out.write("\r\n");
      out.write("        for (var i = 0, len = sanitizedValue.length; i < len; i +=2) { parts.push(sanitizedValue.substring(i, i + 2)); } for (var i=caretPosition - 1; i>= 0; i--) {\r\n");
      out.write("            var c = this.value[i];\r\n");
      out.write("            if (c < '0' || c> '9') {\r\n");
      out.write("                caretPosition--;\r\n");
      out.write("                }\r\n");
      out.write("                }\r\n");
      out.write("                caretPosition += Math.floor(caretPosition / 2);\r\n");
      out.write("\r\n");
      out.write("                this.value = this.lastValue = parts.join('/');\r\n");
      out.write("                this.selectionStart = this.selectionEnd = caretPosition;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // Radio button\r\n");
      out.write("                $('.radio-group .radio').click(function(){\r\n");
      out.write("                $(this).parent().parent().find('.radio').removeClass('selected');\r\n");
      out.write("                $(this).addClass('selected');\r\n");
      out.write("                });\r\n");
      out.write("                })\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");

		String amount =request.getParameter("price");
		
		
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row justify-content-center\">\r\n");
      out.write("        <div class=\" col-lg-6 col-md-8\">\r\n");
      out.write("            <div class=\"card p-3\">\r\n");
      out.write("                <div class=\"row justify-content-center\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <h2 class=\"heading text-center\">Payment Gateway</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form action=\"pay\" method=\"GET\" class=\"form-card\">\r\n");
      out.write("                    <div class=\"row justify-content-center mb-4 radio-group\">\r\n");
      out.write("                        <div class=\"col-sm-3 col-5\">\r\n");
      out.write("                            <div class='radio selected mx-auto' data-value=\"dk\"> <img class=\"fit-image\" src=\"https://i.imgur.com/5TqiRQV.jpg\" width=\"105px\" height=\"55px\"> </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-3 col-5\">\r\n");
      out.write("                            <div class='radio mx-auto' data-value=\"visa\"> <img class=\"fit-image\" src=\"https://i.imgur.com/OdxcctP.jpg\" width=\"105px\" height=\"55px\"> </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-3 col-5\">\r\n");
      out.write("                            <div class='radio mx-auto' data-value=\"master\"> <img class=\"fit-image\" src=\"https://i.imgur.com/WIAP9Ku.jpg\" width=\"105px\" height=\"55px\"> </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-3 col-5\">\r\n");
      out.write("                            <div class='radio mx-auto' data-value=\"paypal\"> <img class=\"fit-image\" src=\"https://i.imgur.com/cMk1MtK.jpg\" width=\"105px\" height=\"55px\"> </div>\r\n");
      out.write("                        </div> <br>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   \r\n");
      out.write("                    <div class=\"row justify-content-center\">\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <div class=\"input-group\"> <input type=\"text\" name=\"Name\" placeholder=\"John Doe\"> <label>Name</label> </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row justify-content-center\">\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <div class=\"input-group\"> <input type=\"text\" id=\"cr_no\" name=\"card-no\" placeholder=\"0000 0000 0000 0000\" minlength=\"19\" maxlength=\"19\"> <label>Card Number</label> </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row justify-content-center\">\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-6\">\r\n");
      out.write("                                    <div class=\"input-group\"> <input type=\"text\" id=\"exp\" name=\"expdate\" placeholder=\"MM/YY\" minlength=\"5\" maxlength=\"5\"> <label>Expiry Date</label> </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-6\">\r\n");
      out.write("                                    <div class=\"input-group\"> <input type=\"password\" name=\"cvv\" placeholder=\"&#9679;&#9679;&#9679;\" minlength=\"3\" maxlength=\"3\"> <label>CVV</label> </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input type=\"hidden\" name=\"price\" value=\"");
      out.print(amount);
      out.write("\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"terminal_id\" value=\"40\">\r\n");
      out.write("                    <div class=\"row justify-content-center\">\r\n");
      out.write("                        <div class=\"col-md-12\"> <input id=\"button\" type=\"submit\" value=\"Pay ");
      out.print(amount );
      out.write(" Rupee\" class=\"btn btn-pay placeicon\"> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
