//No se puede crear un objeto cuya clase no este definida o inicializada antes de la creacion del objeto
//let persona3 = new Persona('Carla', 'Ponce'); Esto no se debe hacer: Persona is not defined 


class Persona{ //Definimos la clase. //Clase padre
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
    //Tarea Asignada
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }
    
    //sobreescribiendo el método dela clase padre (Object)
    toString(){ //Regresa un string
        //se aplica el polimorfismo que significa = múltiples formas en tiempo de ejecución.
        //El método que se ejecuta depende si es una referencia de tipo padre o hija (depende del objeto).
        return this.nombreCompleto();
    }

    //Clase 8: Lunes 29/5
    //Método estático, se asocia a la clase y no a los objetos
    static saludar(){
        console.log('Saludos desde este metodo static');
    }

    static saludar2(persona){
        console.log(persona.nombre + ' ' + persona.apellido);
    }
}

class Empleado extends Persona{ //Clase hija
    constructor(nombre, apellido, departamento){
        super(nombre,apellido);
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = this.departamento;
    }

    //7.2 Sobreescritura:
    //La clase hija aplica el concepto de sobreescritura
    //Modifica el comportamiento definido del metodo de la clase padre.

    nombreCompleto(){
        //return this.nombre+' '+this._apellido+', departamento: '+ this.departamento;
        return super.nombreCompleto()+', '+this._departamento; 
    }
}


//Creamos objetos y los mostramos en consola:

let persona1 = new Persona("Martín", "Perez"); //Creamos el objeto "persona1".
//console.log(persona1.nombre); //llamamos al método get sin necesidad de usar ()
persona1.nombre = 'Juan Carlos';   //modificamos el valor con el metodo set
//console.log(persona1.nombre);
persona1.apellido = 'Rodriguez';   //Modificamos el atributo "apellido" con el metodo set
//console.log(persona1.apellido);    //Mostramos los cambios  para finalizar tarea asignada.
//console.log(persona1); //Mostramos objeto persona1

let persona2 = new Persona("Carlos","Lara"); //Creamos el objeto "persona2".
//console.log(persona2.nombre);
//persona2.nombre = 'Maria Laura';   
//console.log(persona2.nombre);
//console.log(persona2); //Mostramos objeto persona2

let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
//console.log(empleado1);
console.log(empleado1.nombreCompleto()); 

//Object.prototype.toString Esta es la manenera de acceder a metodos y atributos de forma dinamica
console.log(empleado1.toString());
console.log(persona1.toString()); //referencia de la clase padre

//persona1.saludar(); no se utiliza desde el objeto
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1); //pasamos una referencia de clase hija