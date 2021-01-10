package domain;

public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorRmpledo;

    public Empleado(String nombre,int edad, double sueldo) {
        super(nombre,edad);
        
        this.idEmpleado = ++Empleado.contadorRmpledo;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() { 
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", nombre=").append(this.nombre);
        sb.append(", ").append(super.toString()).append("}");
        sb.append('}');
        return sb.toString();
    }

}
