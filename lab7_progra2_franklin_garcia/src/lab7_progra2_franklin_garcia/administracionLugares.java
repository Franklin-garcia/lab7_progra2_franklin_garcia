/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_progra2_franklin_garcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Franklin Garcia
 */
public class administracionLugares {
       private ArrayList<Lugares> listaLugares = new ArrayList();
    private File archivo = null;

    public administracionLugares(String Path) {
        archivo = new File(Path);
    }

    public ArrayList<Lugares> getListaPersonas() {
        return listaLugares;
    }

    public void setListaPersonas(ArrayList<Lugares> listaPersonas) {
        this.listaLugares = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Lista persoans" + listaLugares;
    }

    //Mutador extra
    public void setPersona(Lugares P) {
        this.listaLugares.add(P);
    }

    public void cargarArchivo() {
        try {
            listaLugares = new ArrayList();
            Lugares temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Lugares) objeto.readObject()) != null) {
                        listaLugares.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }//fin if
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Lugares t : listaLugares) {
                bw.writeObject(t);
            }
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }

}
