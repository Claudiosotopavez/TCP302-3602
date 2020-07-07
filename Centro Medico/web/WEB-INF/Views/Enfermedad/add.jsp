<%-- 
    Document   : add
    Created on : 28-06-2020, 0:10:32
    Author     : CASP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Enfermedad</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>
        <div class="container col-md-5">
        <h1>Agregar Enfermedad</h1>
        <div class="card">
            <div class="card-body">
                <form>
                    <input type="hidden" name="txtId">
                    <div class="form-group">
                        <label for="txtNombre">Nombre enfermedad</label>
                        <input class="form-control" type="text" name="txtNombre" placeholder="Ej.: Covid 19">
                    </div>
                    <div class="form-group">
                        <label for="txtTipo">Tipo enfermedad</label>
                        <input class="form-control" type="text" name="txtTipo" placeholder="Ej.: Virus">
                    </div>
                    <input class="btn btn-success" type="submit" name="action" value="Agregar">
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
