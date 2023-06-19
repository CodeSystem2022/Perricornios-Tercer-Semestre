class Persona{

    static contadorPersonas = 0; //atributo estático

    constructor(nombre, apellido, edad){ //propiedades de instancia.
        this._idPersona = ++Persona.contadorPersonas;
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
    }

    //Métodos Getters and setters

    //solo el getter para el atributo idPersona
    get idPersona(){
        return this._idPersona;
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
        return ` //Dato: al convertir a template String, asi mismo se ve en la consola
        ${this._idPersona} 
        ${this._nombre} 
        ${this._apellido} 
        ${this._edad}`;
    }

}