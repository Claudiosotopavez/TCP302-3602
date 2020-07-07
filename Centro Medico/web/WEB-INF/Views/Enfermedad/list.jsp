<%-- 
    Document   : List
    Created on : 21-06-2020, 13:19:06
    Author     : CASP
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Models.Enfermedad"%>
<%@page import="DAO.EnfermedadDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <title>Lista de Enfermedad</title>
    </head>
    <body>
        <div class="container col-md-7">
        <h1>Lista de Enfermedad</h1>
        <a class="btn btn-primary mb-3" href="EnfermedadController?action=add">Agregar Nuevo</a>
        <div class="card">
            <table class="table table-border">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Tipo</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
            <%
                EnfermedadDAO dao = new EnfermedadDAO();
                List<Enfermedad> list = dao.List();
                Iterator<Enfermedad> iter = list.iterator();
                Enfermedad enf = null;
                while(iter.hasNext()){
                    enf=iter.next();
            %>    
                <tr>
                    <td><%=enf.getEnfermedadId()%></td>
                    <td><%=enf.getNombreEnfermedad()%></td>
                    <td><%=enf.getTipoEnfermedad()%></td>
                    <td>
                        <a class="btn btn-outline-info" href="EnfermedadController?action=edit&id=<%=enf.getEnfermedadId()%>">Modificar</a>
                        <a class="btn btn-outline-danger" href="EnfermedadController?action=delete&id=<%=enf.getEnfermedadId()%>">Eliminar</a>
                    </td>
                </tr> 
                <%}%>
            </tbody>
            </table>
        </div>
        <br>
        <a class="btn btn-secondary" href="./home.jsp">Inicio</a>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>
    </div>
</html>
