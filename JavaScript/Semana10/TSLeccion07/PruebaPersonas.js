class Persona{

    static contadorPersonas = 0; //atributo estático

    constructor(nombre, apellido, edad){ //propiedades de instancia.
        this._idPErsona = ++Persona.contadorPersonas;
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
    }
    //Métodos Getters and setters

    //solo el getter para el atributo idPersona
    get idPersona(){
        return this._idPErsona;
    }

    //getter y setter para el atributo nombre
    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    //getter y setter para el atributo apellido
    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    //getter y setter para el atributo edad
    get edad(){
        return this._edad;
    }

    set edad(edad){
        this._edad = edad;
    }

    //agregamos el toString()
    toString(){ 
        return ` 
        ${this._idPErsona} 
        ${this._nombre} 
        ${this._apellido} 
        ${this._edad}`;
    }

}

class Empleado extends Persona{

    static contadorEmpleados = 0;

    constructor(nombre, apellido, edad, sueldo){
        super(nombre, apellido, edad);
        this._idEmpleado = ++Empleado.contadorEmpleados;
        this._sueldo = sueldo;
    }

    get idEmpleado(){
        return this.idEmpleado;
    }

    get sueldo(){
        this._sueldo;
    }
    
    set sueldo(sueldo){
        this._sueldo = sueldo;
    }

    toString(){
        return `
        ${super.toString()} ${this._idEmpleado} ${this._sueldo}`;
    }

}

class Cliente extends Persona{

    static contadorClientes = 0;

    constructor(nombre, apellido, edad, fecharegistro){
        super(nombre, apellido, edad);
        this._idCliente = ++Cliente.contadorClientes;
        this._fechaRegistro = fecharegistro;
    }

    get idCLiente(){
        return this._idCLiente;
    }

    get fecharegistro(){
        return this._fechaRegistro;
    }

    set fecharegistro(fecharegistro){
        this._fechaRegistro = fecharegistro;
    }

    toString(){
        return `
        ${super.toString()} 
        ${this._idCLiente} 
        ${this._fechaRegistro}`;
    }

}








//Prueba clase Empleado
let empleado1 = new Empleado('Pedro', 'Román', 18, 5000);
console.log(empleado1.toString());

let empleado2 = new Empleado('Jonas', 'Torres', 30, 7000);
console.log(empleado2.toString());