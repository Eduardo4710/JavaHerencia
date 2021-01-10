package domain;

import java.util.Date;

public class Cliente extends Persona {

    private int idCliente;
    private Date fechRegistro;
    private boolean vin;
    private static int contadoEmpleado;

    public Cliente(String nombre,char genero, int edad, String direccion, Date fechRegistro, boolean vin) {
        super(nombre, genero,edad,direccion);
        this.vin = vin;
        this.idCliente = ++Cliente.contadoEmpleado;
        this.fechRegistro = fechRegistro;

    }

    public int getIdCliente() {
        return this.idCliente;
    }

 

    public Date getFechRegistro() {
        return this.fechRegistro;
    }

    public void setFechRegistro(Date fechRegistro) {
        this.fechRegistro = fechRegistro;
    }

    public boolean isVin() {
        return this.vin;
    }
   
    public void setVin(boolean vin)
    {
        this.vin=vin;
    }
  

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idEmpleado=").append(this.idCliente);
        sb.append(", FechRegistro=").append(this.fechRegistro);
        sb.append(", vin=").append(this.vin);
        sb.append(", ").append(super.toString()).append("}");
        sb.append('}');
        return sb.toString();
    }

}
