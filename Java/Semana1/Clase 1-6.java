package mundopc;

public class mundoPC {
    public static void main(String[] args) {
        //Creamos el 1er objeto
        Monitor monitorHP = new Monitor ("HP", 13); //importar clase
        Teclado tecladoHP = new Teclado ("Bluethoot", "HP");
        Raton ratonHP = new Raton ("Bluethoot", "HP");
        Computadora computadoraHP = new computadora("ComputadoraHP", monitorHP, tecladoHP, ratonHP);
        
        //Creamos un 2do objeto
        Monitor monitorGamer = new Monitor ("Gamer", 32);
        Teclado tecladoGamer = new Teclado ("Bluethoot", "Gamer");
        Raton ratonGamer = new Raton ("Bluethoot", "Gamer");
        Computadora computadoraGamer = new computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

        //Creamos 3er objeto
        Monitor monitorLG = new Monitor ("LG", 24);
        Teclado tecladoLG = new Teclado ("Cable", "LG");
        Raton ratonLG = new Raton ("Cable", "LG");
        Computadora computadoraLG = new computadora("Computadora LG", monitorLG, tecladoLG, ratonLG);

        //Creamos 4to objeto
        Monitor monitorAcer = new Monitor ("Acer", 28);
        Teclado tecladoAcer = new Teclado ("Bluethoot", "Acer");
        Raton ratonAcer = new Raton ("Cable", "Acer");
        Computadora computadoraAcer = new computadora("Computadora Acer", monitorAcer, tecladoAcer, ratonAcer);

        //Creamos 5to objeto
        Monitor monitorRazor = new Monitor ("Razor", 32);
        Teclado tecladoRazor = new Teclado ("Bluethoot", "Razor");
        Raton ratonRazor = new Raton ("Bluethoot", "Razor");
        Computadora computadoraRazor = new computadora("Computadora Razor", monitorRazor, tecladoRazor, ratonRazor);

        Orden orden1 = new Orden(); //Iniciamos el arreglo vacio
        Orden orden2 = new Orden(); //Una nueva lista para el orden2
        orden1.agregarComputadora(computadoraHP); 
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();

        Computadora computadorasVarias = new Computadora("Computadoras de diferentes marcas", monitorGamer, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadorasVarias);

        orden1.mostrarOrden();
        orden2.mostrarOrden();
    }   
}