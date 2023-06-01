//No se puede crear un objeto cuya clase no este definida o inicializada antes de la creacion del objeto
//let persona3 = new Persona('Carla', 'Ponce'); Esto no se debe hacer: Persona is not defined 


class Persona{ //Definimos la clase. //Clase padre

//CLASE 8 STATIC, 8.2 Atributos estáticos:
    static contadorPersonas = 0; //Definimos un atributo static que pertenece a la clase y no pertenece a un objeto
    //email = 'Valor default email'; // Atributo NO estatico

    constructor(nombre, apellido){ //Creamos el método constructor.
        this._nombre = nombre; //Declaramos el atributo "nombre".
        this._apellido = apellido; //Declaramos el atributo "apellido".
        this.idPersona = ++Persona.contadorPersonas;//Se coloca "++" adelante para que el incremento se haga antes
        
        //8.2 Video 3 cada vez que se cree un objeto, va a recibir un id unico que se va a incrementar: 
        //Persona.contadorObjetosPersona++;
        //console.log('Se incrementa el contador: '+' '+Persona.contadorObjetosPersona);
    
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
        return this.idPersona + ' ' + this._nombre + ' ' + this._apellido;
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

//CLASE 8 STATIC, 8.2 Atributos estáticos:
//console.log(persona1.contadorObjetosPersona); //Esta sintaxis muestra un valor undefined, porque intentamos acceder desde un objeto
console.log(Persona.contadorObjetosPersona); //Accedemos desde la clase padre Persona
console.log(Empleado.contadorObjetosPersona); //Accedemos desde la clase hija Empleado

console.log(persona1.email); //Valor por default email
console.log(empleado1.email); //valor por default email
//console.log(Persona.email); undefined, No se puede acceder porque no es un metodo estatico de la clase, sino del objeto

console.log(persona1.toString()); //Llamamos al ToString del objeto persona1 de la clase padre
console.log(persona2.toString()); //Llamamos al ToString del objeto persona2 de la clase padre
console.log(empleado1.toString()); //Consulta al toString del objeto de la clase hija
console.log(Persona.contadorPersonas); //Consulta para saber cuantas instancias hemos hecho
