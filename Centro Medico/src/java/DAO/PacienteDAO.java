/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
//Data Access Objetc

import Configuration.Conn;
import Interfaces.CRUDPaciente;
import Models.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author CASP
 */
public class PacienteDAO implements CRUDPaciente{
    Conn cn = new Conn();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Paciente paciente = new Paciente();
    
    //Metodos
    @Override
    public java.util.List List() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Paciente> list = new ArrayList<>();
        String sql = "SELECT * FROM paciente";
        try {
            con =cn.getConnection();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Paciente pac = new Paciente();
                pac.setPacienteId(rs.getInt("pacienteID"));
                pac.setRut(rs.getString("Rut"));
                pac.setNombre(rs.getString("Nombre"));
                pac.setEdad(rs.getInt("Edad"));
                pac.setGenero(rs.getString("Genero"));
                list.add(pac);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return list;
    }

    @Override
    public Paciente List(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "SELECT * FROM paciente WHERE pacienteId=" +id;
        try {
            con =cn.getConnection();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                paciente.setPacienteId(rs.getInt("pacienteID"));
                paciente.setRut(rs.getString("Rut"));
                paciente.setNombre(rs.getString("Nombre"));
                paciente.setEdad(rs.getInt("Edad"));
                paciente.setGenero(rs.getString("Genero"));
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return paciente;
    }

    @Override
    public boolean Add(Paciente paciente) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql ="INSERT INTO paciente (Rut,Nombre,Edad,Genero) VALUES('"+paciente.getRut()+"','" +paciente.getNombre()+"',"+paciente.getEdad()+",'"+paciente.getGenero()+"')";
        try {
            con =cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();     
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean Edit(Paciente paciente) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql ="UPDATE paciente SET Rut='"+paciente.getRut()+"',Nombre='"+paciente.getNombre()+"',Edad="+paciente.getEdad()+",Genero='"+paciente.getGenero()+"' WHERE pacienteId="+paciente.getPacienteId();
        try {
            con =cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();      
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean Remove(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                String sql ="DELETE FROM paciente WHERE pacienteId="+id;
        try {
            con =cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();      
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return false;
    }
    
}
