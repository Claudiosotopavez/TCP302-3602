/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author CASP
 */
public class Enfermedad {
    //Atributos 
    int enfermedadId;
     String nombreEnfermedad;
     String tipoEnfermedad;

    //Constructores
    public Enfermedad() {
    }

    public Enfermedad(String nombreEnfermedad, String tipoEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
        this.tipoEnfermedad = tipoEnfermedad;
    }
    //Propiedades
    public int getEnfermedadId() {
        return enfermedadId;
    }

    public void setEnfermedadId(int engermedadId) {
        this.enfermedadId = engermedadId;
    }

    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public String getTipoEnfermedad() {
        return tipoEnfermedad;
    }

    public void setTipoEnfermedad(String tipoEnfermedad) {
        this.tipoEnfermedad = tipoEnfermedad;
    }

}
