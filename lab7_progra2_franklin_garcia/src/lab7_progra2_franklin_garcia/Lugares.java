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
public class Lugares extends Thread {

    public String nombre;
    public String clima;
    public String extensión;
    public String habitantes;
    public String zona;
    public String fundacion;
    public boolean vive;
    public Principal2 mostrar=new Principal2();

    public Lugares() {
    }

    public Lugares(String nombre, String clima, String extensión, String habitantes, String zona, String fundacion) {
        this.nombre = nombre;
        this.clima = clima;
        this.extensión = extensión;
        this.habitantes = habitantes;
        this.zona = zona;
        this.fundacion = fundacion;
        this.vive = vive;
        this.mostrar = mostrar;
    }

    public Principal2 getMostrar() {
        return mostrar;
    }

    public void setMostrar(Principal2 mostrar) {
        this.mostrar = mostrar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getExtensión() {
        return extensión;
    }

    public void setExtensión(String extensión) {
        this.extensión = extensión;
    }

    public String getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(String habitantes) {
        this.habitantes = habitantes;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getFundacion() {
        return fundacion;
    }

    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public void run() {
        mostrar.setVisible(true);
        mostrar.lugar.setText(nombre);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
        }
    }
}
