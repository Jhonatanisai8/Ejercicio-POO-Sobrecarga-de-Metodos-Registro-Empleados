package org.jhonatan.app.Models;

/**
 *
 * @author Jhonatan
 */
public class GestorEmpleado {

    private final Empleado vectorEmpleado[];
    private int totalElementos;

    public GestorEmpleado(int limite) {
        this.vectorEmpleado = new Empleado[limite];
        this.totalElementos = 0;
    }

    public GestorEmpleado() {
        this.vectorEmpleado = new Empleado[100];
        this.totalElementos = 0;
    }

    public Empleado obtenerEmpleado(int indice) {
        return this.vectorEmpleado[indice];
    }

    public boolean agregarEmpleado(Empleado empleado) {
        if (totalElementos < this.vectorEmpleado.length) {
            this.vectorEmpleado[totalElementos] = empleado;
            this.totalElementos++;
            return true;
        } else {
            return false;
        }
    }

    public boolean agregarEmpleado(String nombre, String cargo) {
        if (totalElementos < vectorEmpleado.length) {
            this.vectorEmpleado[totalElementos] = new Empleado(nombre, cargo);
            totalElementos++;
            return true;
        } else {
            return false;
        }
    }

    public boolean agregarEmpleado(String nombre, String cargo, double salario) {
        if (totalElementos < vectorEmpleado.length) {
            this.vectorEmpleado[totalElementos] = new Empleado(nombre, cargo, salario);
            totalElementos++;
            return true;
        } else {
            return false;
        }
    }

}
