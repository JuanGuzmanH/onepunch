/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.34
 * Generated at: 2020-05-23 20:16:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1589675572164L));
    _jspx_dependants.put("jar:file:/C:/Users/Wener/Documents/Spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/progavanzada/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153403082000L));
    _jspx_dependants.put("jar:file:/C:/Users/Wener/Documents/Spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/progavanzada/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153403082000L));
  }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Home</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "plantillas/declarations.jsp", out, false);
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("#carouselExampleControls{\r\n");
      out.write("\twidth: 50%;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#table{\r\n");
      out.write("\twidth: 40%;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("<!--Función para darle formato a la Tabla-->\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$('#myTable').DataTable();\r\n");
      out.write("\t\tresponsive = True;\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "plantillas/menu.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"carouselExampleControls\" class=\"carousel slide\" data-ride=\"carousel\" >\r\n");
      out.write("  <div class=\"carousel-inner\">\r\n");
      out.write("    <div class=\"carousel-item active\">\r\n");
      out.write("      <img class=\"d-block w-100\" src=\"https://www.infobae.com/new-resizer/riAZWezSupOg6WKoPizxqILvhDY=/750x0/filters:quality(100)/arc-anglerfish-arc2-prod-infobae.s3.amazonaws.com/public/YYS55ENAV5AIVFW3W3MLV6GINY.bmp\" alt=\"First slide\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img class=\"d-block w-100\" src=\"https://www.xgn.nl/images/articles/2019/201908/_970x545_crop_center-center_82_line/personajes-de-one-punch-man-a-hero-nobody-knows-roster-completo-153296.jpg\" alt=\"Second slide\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img class=\"d-block w-100\" src=\"https://areajugones.sport.es/wp-content/uploads/2020/01/genos-one-punch-man.jpg\" alt=\"Third slide\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("    <span class=\"sr-only\">Previous</span>\r\n");
      out.write("  </a>\r\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("    <span class=\"sr-only\">Next</span>\r\n");
      out.write("  </a>\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("\t\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "plantillas/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
