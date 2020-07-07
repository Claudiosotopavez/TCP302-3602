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
public class Paciente {
    //Atributos 
    int pacienteId;
     String Rut;
     String Nombre;
     int Edad;
     String Genero;
    //Constructores
    public Paciente() {
    }

    public Paciente(String Rut, String Nombre, int Edad, String Genero) {
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Genero = Genero;
    }
    //Propiedades
    public int getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(int pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

}
