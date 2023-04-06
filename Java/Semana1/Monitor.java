/*
*/
package ar.com.system2023.mundopc;

public class Monitor { 
    //creamos atributos para la classe Monitor
    private final int idMonitor; //variable constante en final
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    //creamos un contructor vacio de manera privada, que llamara desde el constructor publico deonte se encontraran los atributos
    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
//creamos el contructor publico
    public Monitor(String marca, double tamanio){
        this(); // llamado al contructor vacio
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    // getter & setters de marca y tamanio

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }    
    // Ingresamos manualmente el getIdMonitor
    
    public int getIdMonitor(){ // solo generamos el get de solo lectura del idMonitor, al ser final no se modifica
        return this.idMonitor;
    }
    
    //toString

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
    
}
