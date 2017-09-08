/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_progra2_franklin_garcia;

/**
 *
 * @author Franklin Garcia
 */
public class Personas {
  public String nombre;
  public String id;
  public String lugar; 
  public String edad;
  public String estatura;
  public String profesión;

    public Personas() {
    }

    public Personas(String nombre, String id, String lugar, String edad, String estatura, String profesión) {
        this.nombre = nombre;
        this.id = id;
        this.lugar = lugar;
        this.edad = edad;
        this.estatura = estatura;
        this.profesión = profesión;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getProfesión() {
        return profesión;
    }

    public void setProfesión(String profesión) {
        this.profesión = profesión;
    }

    @Override
    public String toString() {
        return nombre;
    }
  
}
