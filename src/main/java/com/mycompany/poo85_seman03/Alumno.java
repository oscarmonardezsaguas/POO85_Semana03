package com.mycompany.poo85_seman03;


public class Alumno extends Persona{
    private int matricula;
    private String nivel;
    private Double nota;

    public Alumno() {
    }

    public Alumno(int matricula, String nivel, Double nota, int id, String rut, String nombre, String apellido, String domicilio, String telefono) {
        super(id, rut, nombre, apellido, domicilio, telefono);
        this.matricula = matricula;
        this.nivel = nivel;
        this.nota = nota;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
    
    
    
    
    
    
}
