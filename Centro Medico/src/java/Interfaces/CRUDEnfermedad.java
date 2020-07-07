/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Models.Enfermedad;
import java.util.List;

/**
 *
 * @author CASP
 */
public interface CRUDEnfermedad {
    //Metodos
    public List List();
    public Enfermedad List(int id);
    public boolean Add(Enfermedad enfermedad);
    public boolean Edit(Enfermedad enfermedad);
    public boolean Remove(int id);
    
}
