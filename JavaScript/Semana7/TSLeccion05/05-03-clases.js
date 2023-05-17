//No se puede crear un objeto cuya clase no sea definida o inicializada antes de su creacion
//let persona3 = new Persona('Carla', 'Ponce'); Si dejamos ésta linea, el código daría error, porque estamos 
//intentando crear un objeto de una clase que aún no está definida. Persona is not defined.

//HOISTING Y CLASES: A diferencia de las funciones, con las clases No se aplica el concepto, 
//primero hay que definir la clase, para poderla utilizar. 

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
}

let persona1 = new Persona("Martín", "Perez"); //Creamos el objeto "persona1".
console.log(persona1.nombre); //llamamos al método get sin necesidad de usar ()
//console.log(persona1); //Mostramos objeto persona1
let persona2 = new Persona("Carlos","Lara"); //Creamos el objeto "persona2".
console.log(persona2.nombre);
//console.log(persona2); //Mostramos objeto persona2

