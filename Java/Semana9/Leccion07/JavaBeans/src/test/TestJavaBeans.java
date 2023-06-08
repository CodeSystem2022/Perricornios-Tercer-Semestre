package test;

import domain.Persona;


public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona(); //Creamos un objeto vacio
        persona.setNombre("Juan"); //utilizamos el metodo set para asignar valores
        persona.setApellido("Perez");
        System.out.println("persona = " + persona);
        
        
        System.out.println("Persona nombre: "+ persona.getNombre());
        System.out.println("Persona apellido: "+ persona.getApellido());
    }
}
