/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Models.Paciente;
import java.util.List;

/**
 *
 * @author CASP
 */
public interface CRUDPaciente {
    //Metodos
    public List List();
    public Paciente List(int id);
    public boolean Add(Paciente paciente);
    public boolean Edit(Paciente paciente);
    public boolean Remove(int id);
    
}
