package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <title>MENU</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3 col-md-3\">\n");
      out.write("                    <div class=\"panel-group\" id=\"accordion\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h4 class=\"panel-title\">\n");
      out.write("                                    <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseOne\"><span class=\"glyphicon glyphicon-folder-close\">\n");
      out.write("                                        </span>Inicio</a>\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseOne\" class=\"panel-collapse collapse in\">\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <span class=\"glyphicon glyphicon-pencil text-primary\" ></span><a href=\"http://www.jquery2dotnet.com\">Pupusas</a>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <span class=\"glyphicon glyphicon-file text-info\"></span><a href=\"http://www.jquery2dotnet.com\">Especialidades</a>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h4 class=\"panel-title\">\n");
      out.write("                                    <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwo\"><span class=\"glyphicon glyphicon-th\">\n");
      out.write("                                        </span>Productos</a>\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseTwo\" class=\"panel-collapse collapse\">\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <a href=\"http://www.jquery2dotnet.com\">Orders</a> <span class=\"label label-success\">$ 320</span>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <a href=\"http://www.jquery2dotnet.com\">Invoices</a>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <a href=\"http://www.jquery2dotnet.com\">Shipments</a>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <a href=\"http://www.jquery2dotnet.com\">Tex</a>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h4 class=\"panel-title\">\n");
      out.write("                                    <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseThree\"><span class=\"glyphicon glyphicon-user\">\n");
      out.write("                                        </span>Perfil de Usuario</a>\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseThree\" class=\"panel-collapse collapse\">\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <a href=\"http://www.jquery2dotnet.com\">Change Password</a>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <a href=\"http://www.jquery2dotnet.com\">Notifications</a> <span class=\"label label-info\">5</span>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <a href=\"http://www.jquery2dotnet.com\">Import/Export</a>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <span class=\"glyphicon glyphicon-trash text-danger\"></span><a href=\"http://www.jquery2dotnet.com\" class=\"text-danger\">\n");
      out.write("                                                    Delete Account</a>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h4 class=\"panel-title\">\n");
      out.write("                                    <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseFour\"><span class=\"glyphicon glyphicon-file\">\n");
      out.write("                                        </span>Carrito</a>\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseFour\" class=\"panel-collapse collapse\">\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <span class=\"glyphicon glyphicon-usd\"></span><a href=\"http://www.jquery2dotnet.com\">Sales</a>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <span class=\"glyphicon glyphicon-user\"></span><a href=\"http://www.jquery2dotnet.com\">Customers</a>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <span class=\"glyphicon glyphicon-tasks\"></span><a href=\"http://www.jquery2dotnet.com\">Products</a>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <span class=\"glyphicon glyphicon-shopping-cart\"></span><a href=\"http://www.jquery2dotnet.com\">Shopping Cart</a>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9 col-md-9\">\n");
      out.write("                    <div class=\"well\">\n");
      out.write("                        <h1>\n");
      out.write("                            Productos</h1>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <table class=\"table table-hover shopping-cart-wrap\">\n");
      out.write("                                <thead class=\"text-muted\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"col\" width=\"1000\" >Productos</th>\n");
      out.write("                                        <th scope=\"col\" width=\"900\">Cantidad</th>\n");
      out.write("                                        <th scope=\"col\" width=\"900\">Precio</th>\n");
      out.write("                                        <th scope=\"col\" width=\"900\" class=\"text-right\">Accion</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <h5>Coca-Cola Lata</h5>\n");
      out.write("                                            <figure class=\"media\">\n");
      out.write("\n");
      out.write("                                                <div class=\"img-wrap\"><img src=\"img/cocacola.jpg\" width=\"250\" class=\"img-thumbnail img-sm\"></div>\n");
      out.write("\n");
      out.write("                                                <figcaption class=\"media-body\">\n");
      out.write("                                                    <h6 class=\"title text-truncate\">Coca-cola Lata </h6>\t\t\n");
      out.write("                                                </figcaption>\n");
      out.write("                                            </figure> \n");
      out.write("                                        </td>\n");
      out.write("                                        <td> \n");
      out.write("                                            <select class=\"form-control\">\n");
      out.write("                                                <option>1</option>\n");
      out.write("                                                <option>2</option>\t\n");
      out.write("                                                <option>3</option>\t\n");
      out.write("                                                <option>4</option>\t\n");
      out.write("                                            </select> \n");
      out.write("                                        </td>\n");
      out.write("                                        <td> \n");
      out.write("                                            <div class=\"price-wrap\"> \n");
      out.write("                                                <var class=\"price\">USD 145</var> \n");
      out.write("\n");
      out.write("                                            </div> <!-- price-wrap .// -->\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"text-right\"> \n");
      out.write("                                            <a title=\"\" href=\"\" class=\"btn btn-outline-success\" data-toggle=\"tooltip\" data-original-title=\"Save to Wishlist\"> <i class=\"fa fa-heart\"></i></a> \n");
      out.write("                                            <a href=\"\" class=\"btn btn-outline-danger\"> × Eliminar</a>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <h5>Pepsi Lata</h5>\n");
      out.write("                                            <figure class=\"media\">\n");
      out.write("                                                <div class=\"img-wrap\"><img src=\"img/pepsi.jpg\" class=\"img-thumbnail img-sm\"></div>\n");
      out.write("\n");
      out.write("                                                <figcaption class=\"media-body\">\n");
      out.write("                                                    <h6 class=\"title text-truncate\"> Pepsi Lata </h6>\n");
      out.write("\n");
      out.write("                                                </figcaption>\n");
      out.write("                                            </figure> \n");
      out.write("                                        </td>\n");
      out.write("                                        <td> \n");
      out.write("                                            <select class=\"form-control\">\n");
      out.write("                                                <option>1</option>\n");
      out.write("                                                <option>2</option>\t\n");
      out.write("                                                <option>3</option>\t\n");
      out.write("                                                <option>4</option>\t\n");
      out.write("                                            </select> \n");
      out.write("                                        </td>\n");
      out.write("                                        <td> \n");
      out.write("                                            <div class=\"price-wrap\"> \n");
      out.write("                                                <var class=\"price\">USD 35</var> \n");
      out.write("\n");
      out.write("                                            </div> <!-- price-wrap .// -->\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"text-right\"> \n");
      out.write("                                            <a title=\"\" href=\"\" class=\"btn btn-outline-success\" data-toggle=\"tooltip\" data-original-title=\"Save to Wishlist\"> <i class=\"fa fa-heart\"></i></a> \n");
      out.write("                                            <a href=\"\" class=\"btn btn-outline-danger btn-round\"> × Eliminar</a>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <h5>Horchata</h5>\n");
      out.write("                                            <figure class=\"media\">\n");
      out.write("                                                <div class=\"img-wrap\"><img src=\"img/horchata.jpg\" class=\"img-thumbnail img-sm\"></div>\n");
      out.write("\n");
      out.write("                                                <figcaption class=\"media-body\">\n");
      out.write("                                                    <h6 class=\"title text-truncate\">Horchata </h6>\n");
      out.write("\n");
      out.write("                                                </figcaption>\n");
      out.write("                                            </figure> \n");
      out.write("                                        </td>\n");
      out.write("                                        <td> \n");
      out.write("                                            <select class=\"form-control\">\n");
      out.write("                                                <option>1</option>\n");
      out.write("                                                <option>2</option>\t\n");
      out.write("                                                <option>3</option>\t\n");
      out.write("                                                <option>4</option>\t\n");
      out.write("                                            </select> \n");
      out.write("                                        </td>\n");
      out.write("                                        <td> \n");
      out.write("                                            <div class=\"price-wrap\"> \n");
      out.write("                                                <var class=\"price\">USD 45</var> \n");
      out.write("\n");
      out.write("                                            </div> <!-- price-wrap .// -->\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"text-right\"> \n");
      out.write("                                            <a title=\"\" href=\"\" class=\"btn btn-outline-success\" data-toggle=\"tooltip\" data-original-title=\"Save to Wishlist\"> <i class=\"fa fa-heart\"></i></a> \n");
      out.write("                                            <a href=\"\" class=\"btn btn-outline-danger btn-round\"> × Eliminar</a>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <h5>3 Leches</h5>\n");
      out.write("                                            <figure class=\"media\">\n");
      out.write("                                                <div class=\"\"><img src=\"img/3leches.jpg\" class=\"img-thumbnail img-sm\"></div>\n");
      out.write("\n");
      out.write("                                                <figcaption class=\"media-body\">\n");
      out.write("                                                    <h6 class=\"title text-truncate\">3 Leches </h6>\n");
      out.write("\n");
      out.write("                                                </figcaption>\n");
      out.write("                                            </figure> \n");
      out.write("                                        </td>\n");
      out.write("                                        <td> \n");
      out.write("                                            <select class=\"form-control\">\n");
      out.write("                                                <option>1</option>\n");
      out.write("                                                <option>2</option>\t\n");
      out.write("                                                <option>3</option>\t\n");
      out.write("                                                <option>4</option>\t\n");
      out.write("                                            </select> \n");
      out.write("                                        </td>\n");
      out.write("                                        <td> \n");
      out.write("                                            <div class=\"price-wrap\"> \n");
      out.write("                                                <var class=\"price\">USD 45</var> \n");
      out.write("\n");
      out.write("                                            </div> <!-- price-wrap .// -->\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"text-right\"> \n");
      out.write("                                            <a title=\"\" href=\"\" class=\"btn btn-outline-success\" data-toggle=\"tooltip\" data-original-title=\"Save to Wishlist\"> <i class=\"fa fa-heart\"></i></a> \n");
      out.write("                                            <a href=\"\" class=\"btn btn-outline-danger btn-round\"> × Eliminar</a>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <h5>Budin</h5>\n");
      out.write("                                            <figure class=\"media\">\n");
      out.write("                                                <div class=\"img-wrap\"><img src=\"img/budin.jpg\" class=\"img-thumbnail img-sm\"></div>\n");
      out.write("\n");
      out.write("                                                <figcaption class=\"media-body\">\n");
      out.write("                                                    <h6 class=\"title text-truncate\">Budin </h6>\n");
      out.write("\n");
      out.write("                                                </figcaption>\n");
      out.write("                                            </figure> \n");
      out.write("                                        </td>\n");
      out.write("                                        <td> \n");
      out.write("                                            <select class=\"form-control\">\n");
      out.write("                                                <option>1</option>\n");
      out.write("                                                <option>2</option>\t\n");
      out.write("                                                <option>3</option>\t\n");
      out.write("                                                <option>4</option>\t\n");
      out.write("                                            </select> \n");
      out.write("                                        </td>\n");
      out.write("                                        <td> \n");
      out.write("                                            <div class=\"price-wrap\"> \n");
      out.write("                                                <var class=\"price\">USD 45</var> \n");
      out.write("\n");
      out.write("                                            </div> <!-- price-wrap .// -->\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"text-right\"> \n");
      out.write("                                            <a title=\"\" href=\"\" class=\"btn btn-outline-success\" data-toggle=\"tooltip\" data-original-title=\"Save to Wishlist\"> <i class=\"fa fa-heart\"></i></a> \n");
      out.write("                                            <a href=\"\" class=\"btn btn-outline-danger btn-round\"> × Eliminar</a>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div> <!-- card.// -->\n");
      out.write("\n");
      out.write("                    </div> \n");
      out.write("                    <!--container end.//-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
