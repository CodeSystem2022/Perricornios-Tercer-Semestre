
class Persona{        //definimos una clase
    constructor(nombre, apellido) {      //creamos un constructor con dos parametros
        this._nombre = nombre;       //declaramos e inicializamos los atributos
        this._apellido = apellido;   //cambiamos el nombre de los atributos de la clase, las propiedades no pueden llamarse igual al crear los metodos get & set
    }

    //Metodo Get & Set:
    //6.2 Método Get y Set: Parte Get (Obtenemos el atributo)

    get nombre(){   //accedemos al nombre de la clase indirectamente
        return this._nombre;
    }
    get apellido(){   //accedemos al apellido de la clase indirectamente
        return this._apellido;
    }

    //6.2 Parte Set (Modificamos el atributo)

    set nombre(nombre){
        this._nombre = nombre;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

}

//Creamos objetos y los mostramos en consola:

let persona1 = new Persona('Martín', 'Perez'); //creamos un objeto
console.log(persona1.nombre); //obtenemos los datos del objeto
console.log(persona1.apellido);
persona1.nombre = 'Juan Carlos';   //modificamos el valor con el metodo set
console.log(persona1.nombre);
persona1.apellido = 'Filtroso';   
console.log(persona1.apellido);
//console.log(persona1);
let persona2 = new Persona('Carlos', 'Lara');
console.log (persona2.nombre);
console.log(persona2.apellido);
persona2.nombre = 'Maria Laura';   
console.log(persona2.nombre);
persona2.apellido = 'Quintana';   
console.log(persona2.apellido);
//console.log(persona2);

=======
//No se puede crear un objeto cuya clase no sea definida o inicializada antes de su creacion
let persona3 = new Persona('Carla', 'Ponce');

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


