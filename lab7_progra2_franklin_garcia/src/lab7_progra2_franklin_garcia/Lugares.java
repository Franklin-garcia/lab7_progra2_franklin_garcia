/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_progra2_franklin_garcia;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

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
    public Principal2 mostrar = new Principal2();
    public Principal ventana = new Principal();
    public ArrayList<Personas> lista = new ArrayList();

    public Lugares() {
    }

    public Lugares(String nombre, String clima, String extensión, String habitantes, String zona, String fundacion, ArrayList<Personas> lista) {
        this.nombre = nombre;
        this.clima = clima;
        this.extensión = extensión;
        this.habitantes = habitantes;
        this.zona = zona;
        this.fundacion = fundacion;
        this.mostrar = mostrar;
        this.ventana = ventana;
        this.lista = lista;
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

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public void run() {
        mostrar.setVisible(true);
        mostrar.lugar.setText(nombre);
        DefaultTableModel modelo = (DefaultTableModel) mostrar.tabla1.getModel();
        while (true) {
            while (mostrar.tabla1.getRowCount() > 0) {
                modelo.removeRow(0);
            }
            mostrar.tabla1.setModel(modelo);
            for (Personas p : lista) {
                if (p.lugar.equals(nombre)) {
                    Object[] newrow = {p.getNombre(), p.getId(), p.getLugar(), p.getEdad(), p.getEstatura(), p.getProfesión()
                    };
                    modelo.addRow(newrow);
                }
            }
            mostrar.tabla1.setModel(modelo);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
