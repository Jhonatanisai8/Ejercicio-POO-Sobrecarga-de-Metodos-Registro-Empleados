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

    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.id = ++ultimoId;
    }

    public Empleado(String nombre, String cargo, double salario) {
        this(nombre, cargo);
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

    public void actualizarEmpleado(int id, String nuevoNombre) {
        this.id = id;
        this.nombre = nuevoNombre;
    }

    public void actualizarEmpleado(int id, String nuevoCargo, double nuevoSalario) {
        this.id = id;
        this.cargo = nuevoCargo;
        this.salario = nuevoSalario;
    }
    
    
}
