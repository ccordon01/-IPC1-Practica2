
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class archivoproyec {
    String tipo;
    String nombre;
    DefaultMutableTreeNode ubicacion;

    public archivoproyec(String tipo, String nombre, DefaultMutableTreeNode ubicacion) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DefaultMutableTreeNode getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(DefaultMutableTreeNode ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}

