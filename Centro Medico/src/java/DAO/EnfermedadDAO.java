/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
//Data Access Objetc

import Configuration.Conn;
import Interfaces.CRUDEnfermedad;
import Models.Enfermedad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author CASP
 */
public class EnfermedadDAO implements CRUDEnfermedad{
    Conn cn = new Conn();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Enfermedad enfermedad = new Enfermedad();
    
    //Metodos
    @Override
    public java.util.List List() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Enfermedad> list = new ArrayList<>();
        String sql = "SELECT * FROM enfermedad";
        try {
            con =cn.getConnection();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Enfermedad enf = new Enfermedad();
                enf.setEnfermedadId(rs.getInt("enfermedadID"));
                enf.setNombreEnfermedad(rs.getString("nombreEnfermedad"));
                enf.setTipoEnfermedad(rs.getString("tipoEnfermedad"));
                list.add(enf);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return list;
    }

    @Override
    public Enfermedad List(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "SELECT * FROM enfermedad WHERE enfermedadId=" +id;
        try {
            con =cn.getConnection();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                enfermedad.setEnfermedadId(rs.getInt("enfermedadID"));
                enfermedad.setNombreEnfermedad(rs.getString("nombreEnfermedad"));
                enfermedad.setTipoEnfermedad(rs.getString("tipoEnfermedad"));
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return enfermedad;
    }

    @Override
    public boolean Add(Enfermedad enfermedad) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql ="INSERT INTO enfermedad (nombreEnfermedad,tipoEnfermedad) VALUES('"+enfermedad.getNombreEnfermedad()+"','" +enfermedad.getTipoEnfermedad()+"')";
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
    public boolean Edit(Enfermedad enfermedad) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql ="UPDATE enfermedad SET nombreEnfermedad='"+enfermedad.getNombreEnfermedad()+"', tipoEnfermedad'"+enfermedad.getTipoEnfermedad()+"' WHERE enfermedadId="+enfermedad.getEnfermedadId();
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
                String sql ="DELETE FROM enfermedad WHERE enfermedadId="+id;
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
