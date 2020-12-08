<%@page session="true" language="java" import="java.util.*" %>
<%@page import="sv.edu.ujmd.conexion" import="java.sql.*" %>
<%@page import="sv.edu.ujmd.verificar" import="java.sql.*" %>
<%
    String correo = request.getParameter("Username");
    String clave = request.getParameter("Password");
    conexion con = new conexion();
con.setRs("select count(email),fname from employees"
 + " where email='"+correo+"' and "
 + "pass='"+ clave +"'");

ResultSet rs = con.getRs();
    rs.next();
if(rs.getInt(1) == 1){
    rs.close();
    con.cerrarConexion();
    //Se asignan parametros de sesión
    HttpSession sesionOk = request.getSession();
    sesionOk.setAttribute("usuario", correo);
    %>
<jsp:forward page="menu.jsp" />
<%
    }
else{
    %>
<jsp:forward page="Login.jsp">
    <jsp:param name="error" value="Usuario y/o clave Incorrecto. Vuelve a intentarlo" />
</jsp:forward>
<%
}
rs.close();
con.cerrarConexion();
    %>
