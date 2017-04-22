package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PreLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.theme.css\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"myscripts/TrainerScript.js\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"myscripts/LearnerScript.js\">\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\" src=\"LatestJQuery.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"newcss.css\">\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("            .bg-1{\n");
      out.write("                background-color:white;\n");
      out.write("                color:#1abc9c;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bg-2{\n");
      out.write("                background-color:#474e5d; /* Dark Blue #474e5d;*/\n");
      out.write("                color: #ffffff;\t\t\t\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .bg-3 { \n");
      out.write("                background-color: #ffffff; /* White */\n");
      out.write("                color: #555555;\n");
      out.write("            }\t\t\t\t\n");
      out.write("\n");
      out.write("            .container-fluid{\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ul li a\n");
      out.write("            {\n");
      out.write("                color:whitesmoke;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container bg-1 \" style=\"padding-top:20px;padding-bottom:20px;\">\n");
      out.write("\n");
      out.write("            <font size=\"7\" face=\"Avenir\" >e-Learning</font>\n");
      out.write("\n");
      out.write("            <div class=\"pull-right\"> \n");
      out.write("                <br>\n");
      out.write("                <form>\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"button\" name=\"btnSignUp\" value=\"Sign Up | Login\" class=\"btn btn-primary\"></td>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid bg-2\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <ul class=\"nav nav-pills\">\n");
      out.write("<!--                    <li > <a href=\"TrainerPreLogin.jsp\">Home</a> </li>-->\n");
      out.write("                     <li > <a href=\"TrainerRegistration.jsp\">Registration</a> </li> \n");
      out.write("                    <li> <a href=\"Login.jsp\">Login</a> </li>\n");
      out.write("                    <li> <a href=\"ContactUs.jsp\">Contact Us</a> </li>\n");
      out.write("                    <li> <a href=\"AboutUs\">About Us</a> </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\t\t\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container bg-3\" style=\"padding:20px 0px 20px 20px;\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-9 col-sm-7\" >\n");
      out.write("\n");
      out.write("              ");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <form>\n");
      out.write("        <table width=\"300px\">\n");
      out.write("            <tr>\n");
      out.write("                <td><a href=\"Login.jsp\">Trainer Login</a></td>\n");
      out.write("                <td><a href=\"LearnerLogin.jsp\">Learner Login</a></td>\n");
      out.write("                \n");
      out.write("                <td><a href=\"TrainerRegistration.jsp\">Trainer Registration</a></td>\n");
      out.write("                <td><a href=\"LearnerRegistration.jsp\">Learner Registration</a></td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-md-3 col-sm-5\"  style=\"border-left:1px solid gray\">\n");
      out.write("    Hello World\t\t\t\t\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid bg-2 text-center\" style=\"padding:10px;\">\n");
      out.write("\n");
      out.write("    Site developed with all the &hearts; in the world by AB Inc\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
