<%-- 
    Document   : edit
    Created on : 28-06-2020, 19:06:18
    Author     : CASP
--%>

<%@page import="Models.Enfermedad"%>
<%@page import="DAO.EnfermedadDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Enfermedad</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>
        <div class="container col-md-5">
        <%
            EnfermedadDAO dao = new EnfermedadDAO();
            int id=Integer.parseInt((String)request.getAttribute("idEnf"));
            Enfermedad e = (Enfermedad)dao.List(id);
        %>
        <h1>Editar Enfermedad</h1>
        <div class="card">
            <div class="card-body">
                <form>
                    <input type="hidden" name="txtId" value="<%=e.getEnfermedadId()%>">
                    <div class="form-group">
                        <label for="txtRut">Nombre enfermedad</label>
                        <input class="form-control" type="text" name="txtRut" value="<%=e.getNombreEnfermedad()%>" placeholder="Ej.: Corona Virus">
                    </div>
                    <div class="form-group">
                        <label for="txtNombre">Tipo Enfermedad</label>
                        <input class="form-control" type="text" name="txtNombre" value="<%=e.getTipoEnfermedad()%>" placeholder="Ej.: Virus">
                    </div>
                    <input class="btn btn-success" type="submit" name="action" value="Actualizar">
                    <a class="btn btn-secondary"href="EnfermedadController?action=list">Volver</a>
                </form>
            </div>
        </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>
</html>
