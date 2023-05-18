class Persona{ //Definimos la clase.
    constructor(nombre, apellido){ //Creamos el método constructor.
        this._nombre = nombre; //Declaramos el atributo "nombre".
        this._apellido = apellido; //Declaramos el atributo "apellido".
    }
  
    //Método get: NO puede llamarse igual que la propiedad
    //por eso agregamos un _ adelante de los atributos (propiedades)
    get nombre(){
        return this._nombre;
    }
    //6.2 Parte Set (Modificamos el atributo)

    set nombre(nombre){
        this._nombre = nombre;
    }
}

//Creamos objetos y los mostramos en consola:

let persona1 = new Persona("Martín", "Perez"); //Creamos el objeto "persona1".
console.log(persona1.nombre); //llamamos al método get sin necesidad de usar ()
persona1.nombre = 'Juan Carlos';   //modificamos el valor con el metodo set
console.log(persona1.nombre);
//console.log(persona1); //Mostramos objeto persona1
let persona2 = new Persona("Carlos","Lara"); //Creamos el objeto "persona2".
console.log(persona2.nombre);
persona2.nombre = 'Maria Laura';   
console.log(persona2.nombre);
//console.log(persona2); //Mostramos objeto persona2

