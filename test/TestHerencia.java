package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;

//import domain.Persona;
public class TestHerencia {

    public static void main(String[] args) {
//             // INSTANCIA DEL OBJETO persona1  DELA CLASE PERSONA
//        Persona persona1 = new Persona("Alonso",'M', 20, "Calle a venida mexico");
//        System.out.println("Persona1: " + persona1);
//
//            // INSTANCIA DEL OBJETO empleado DELA CLASE EMPLEADO
//        Empleado empleado1 = new Empleado("Eduardo", 20, 3000.90);
//        System.out.println("Empleado: " + empleado1);
////        Persona persona2 = new Persona("Eduardo");
////        System.out.println("Persona2 -------->:" + persona2.getNombre());
//	
           // INSTANCIA DEL OBJETO cliente DELA CLASE CLIETE
           var fecha =new Date();
        Cliente cliente1 = new Cliente("Maydelin",'F', 15,"Saturno 369" ,fecha, true);
        System.out.println("Cliente1:" + cliente1);

    }

}
