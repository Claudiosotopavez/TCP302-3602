<%-- 
    Document   : List
    Created on : 21-06-2020, 13:19:06
    Author     : CASP
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Models.Paciente"%>
<%@page import="DAO.PacienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <title>Lista de pacientes</title>
    </head>
    <body>
        <div class="container col-md-7">
        <h1>Lista de pacientes</h1>
        <a class="btn btn-primary mb-3" href="PacienteController?action=add">Agregar Nuevo</a>
        <div class="card">
            <table class="table table-border">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Rut</th>
                    <th>Nombre</th>
                    <th>Edad</th>
                    <th>Genero</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
            <%
                PacienteDAO dao = new PacienteDAO();
                List<Paciente> list = dao.List();
                Iterator<Paciente> iter = list.iterator();
                Paciente pac = null;
                while(iter.hasNext()){
                    pac=iter.next();
            %>    
                <tr>
                    <td><%=pac.getPacienteId()%></td>
                    <td><%=pac.getRut()%></td>
                    <td><%=pac.getNombre()%></td>
                    <td><%=pac.getEdad()%></td>
                    <td><%=pac.getGenero()%></td>
                    <td>
                        <a class="btn btn-outline-info" href="PacienteController?action=edit&id=<%=pac.getPacienteId()%>">Modificar</a>
                        <a class="btn btn-outline-danger" href="PacienteController?action=delete&id=<%=pac.getPacienteId()%>">Eliminar</a>
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
