package org.jhonatan.app.Models;

/**
 *
 * @author Jhonatan
 */
public class Empleado {

    private int id;
    private String nombre;
    private String cargo;
    private double salario;

    private static int ultimoId;

    public Empleado() {

    }

    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.id = ++ultimoId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

}
