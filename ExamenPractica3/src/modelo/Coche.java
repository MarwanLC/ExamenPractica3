/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author marwa
 */
public class Coche {
    
    private String matricula;
    private LocalDate fechaMatriculacion;
    private float precio;

    public Coche() {
    }

    public Coche(String matricula, LocalDate fechaMatriculacion, float precio) {
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", fechaMatriculacion=" + fechaMatriculacion + ", precio=" + precio + '}';
    }
    
}
