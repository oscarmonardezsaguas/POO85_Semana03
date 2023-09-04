
package com.mycompany.poo85_seman03;

public class Docente extends Persona{
    private String nombre_docente;
    private int num_docenter;

    public Docente() {
    }

    public Docente(String nombre_docente, int num_docenter, int id, String rut, String nombre, String apellido, String domicilio, String telefono) {
        super(id, rut, nombre, apellido, domicilio, telefono);
        this.nombre_docente = nombre_docente;
        this.num_docenter = num_docenter;
    }

    public String getNombre_docente() {
        return nombre_docente;
    }

    public void setNombre_docente(String nombre_docente) {
        this.nombre_docente = nombre_docente;
    }

    public int getNum_docenter() {
        return num_docenter;
    }

    public void setNum_docenter(int num_docenter) {
        this.num_docenter = num_docenter;
    }
    
    
    
    
}
