/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.PacienteDAO;
import Models.Paciente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CASP
 */
public class PacienteController extends HttpServlet {
    String list = "WEB-INF/Views/Paciente/list.jsp";
    String add = "WEB-INF/Views/Paciente/add.jsp";
    String edit = "WEB-INF/Views/Paciente/edit.jsp";
    Paciente paciente = new Paciente();
    PacienteDAO dao = new PacienteDAO();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PacienteController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PacienteController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String access = "";
        String action = request.getParameter("action");
        if (action.equalsIgnoreCase("list")) {
            access = list;
        }
        else if (action.equalsIgnoreCase("add")) {
            access = add;
        }
        else if (action.equalsIgnoreCase("Agregar")) {
            String rut= request.getParameter("txtRut");
            String nombre= request.getParameter("txtNombre");
            Integer edad= Integer.parseInt( request.getParameter("txtEdad"));
            String genero= request.getParameter("txtGenero");
            paciente.setRut(rut);
            paciente.setNombre(nombre);
            paciente.setEdad(edad);
            paciente.setGenero(genero);
            dao.Add(paciente);
            access = list;
        }
        else if (action.equalsIgnoreCase("edit")) {
            request.setAttribute("idPac", request.getParameter("id"));
            access = edit;//edit
        }
        else if (action.equalsIgnoreCase("Actualizar")) {
            Integer id= Integer.parseInt(request.getParameter("txtId"));
            String rut= request.getParameter("txtRut");
            String nombre= request.getParameter("txtNombre");
            Integer edad= Integer.parseInt( request.getParameter("txtEdad"));
            String genero= request.getParameter("txtGenero");
            paciente.setPacienteId(id);
            paciente.setRut(rut);
            paciente.setNombre(nombre);
            paciente.setEdad(edad);
            paciente.setGenero(genero);
            dao.Edit(paciente);
            access=list;
        }
        else if (action.equalsIgnoreCase("delete")) {
            Integer id= Integer.parseInt(request.getParameter("id"));
            paciente.setPacienteId(id);
            dao.Remove(id);
            access=list;
        }
        
        RequestDispatcher vista = request.getRequestDispatcher(access);
        vista.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
