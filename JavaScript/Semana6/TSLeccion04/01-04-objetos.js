let x = 10; //variable de tipo primitivo
console.log(x.lenght);
console.log('Tipos primitivos');

//creamos un objeto
let persona = { //se crea un objeto en memoria
    //atributos
    nombre: "Carlos",
    apellido: "Gil",
    email: "egil@gmail.com",
    edad:28,
    idioma: 'ES',
    //Agregamos un metodo set y get para que el Uppercase convierta a mayúscula el idioma
    //Garantizamos que la infomación que se almacena en el objeto, esta ya convertida a mayúscula 
    get lang(){
        return this.idioma.toUpperCase();
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    
    //se agregan métodos a los objetos
    nombreCompleto: function(){ //metodo
        return this.nombre + " " + this.apellido; //apunta a las propiedades del mismo objeto
    },
    get nombreEdad(){ //Este es el metodo get
        return 'El nombre es: ' + this.nombre + ', Edad: ' + this.edad;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona)

console.log(persona.nombreCompleto())

//otra forma de crear objetos es con la palabra new 
//se reserva espacio en memoria para almacenar el objeto

console.log('ejecutando con un objeto');
let persona2 = new Object();

//creamos las propiedades nombre, direccion y telefono
persona2.nombre = "Mabel";
persona2.direccion = "Salada 14";
persona2.telefono = "549341256398";

console.log(persona2.telefono);

//accedemos a las propiedades de los objetos

console.log('Creamos un nuevo objeto');
console.log(persona['apellido']); //accedemos como si fuera un arreglo

//para recorrer cada una de las propiedades del objeto
//for in
console.log('Usamos el ciclo for in');
for(propiedad in persona){
    console.log(propiedad); //accedemos a la propiedad en sí
    console.log(persona[propiedad]) //accedemos al valor
}

//agregamos una nueva propiedad al objeto
console.log('Cambiamos y eliminamos un error');
persona.apellida = 'Betancud' //cambiamos dinamicamente un valor del objeto
delete persona.apellida; //eliminamos el error (propiedad y valor)
console.log(persona)

//distintas formas de imprimir un objeto

//Número 1. La mas sencilla: concatenar cada valor de cada propiedad
console.log("\nDistintas formas de imprimir un objeto: Forma 1")
console.log(persona.nombre + ', ' + persona.apellido)

//Número 2. A traves del ciclo for in
console.log("\nDistintas formas de imprimir un objeto: Forma 2")
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Número 3. Regresa el objeto como un arreglo -> la funcion Object.values()
console.log("\nDistintas formas de imprimir un objeto: Forma 3")
let personaArray = Object.values(persona); //pasamos el objeto persona como parámetro
console.log(personaArray)

//Número 4. Utilizaremos el método JSON.stringify()
//convierte el objeto en una cadena
console.log("\nDistintas formas de imprimir un objeto: Forma 4")
let personaString = JSON.stringify(persona);
console.log(personaString);

//SEMANA 6: CLASE LUNES 8 DE MAYO
//OBJETOS PARTE 2 - CONTINÚA EL MISMO ARCHIVO DE CLASE ANTERIOR

// VIDEO 1 Y VIDEO 2 ~ NADIA
console.log('Comenzamos a utilizar el método get');
console.log(persona.nombreEdad);

console.log('Comenzamos con el método get y set para idiomas');
persona.lang = 'en';
console.log(persona.lang);


//VIDEO 3 ~ GABRIEL
//5.2 - Constructores de objetos

//Reutilizamos el codigo con Constructores que nos permiten crear un nuevo objeto persona
//Para no repetir los atributos y metodos creamos un constructor

//definimos una funcion
function Persona3(nombre, apellido, email){ //constructor donde definimos las propiedades
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+" "+this.apellido;
    }
}
//VIDEO 4 ~ CARLOS
//5.3  Agregar métodos al constructor del objeto
// creamos objetos
let padre = new Persona3('Leo', 'Lopez', 'l.lopez@gmail.com'); 
padre.nombre = 'Luis'; //modificamos el nombre del propio objeto
padre.telefono = '5492618282821'; //Una propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto()); //Utilizamos la función
//ninguno de los objetos comparten infomacion.
let madre = new Persona3('Laura', 'Contrera', 'l.contrera@gmail.com');
madre.email = 'contreral@gmail.com';
console.log(madre);
console.log(madre.telefono); // La propiedad no esta definida
console.log(madre.nombreCompleto());

//Uso de call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono;
    }
}
let persona5 = {
    nombre: 'Carlos'
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic.', 5492618484845)); Lic. : Juan Perez 5492618484845
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.', '5492618585856')); Ing.: Carlos Lara 5492618585856



// VIDEO 5 ~ NOE
//Diferentes formas de crear objetos, se recomiendan las segundas opciones, no las formales.

//caso objeto 1
let miObjeto = new Object(); //opción formal

//caso objeto 2
let miObjeto2 = {}; //opción breve y recomendada

//caso String 1
let miCadena1 = new String("Hola"); //sintaxis formal

//caso String 2
let miCadena2 = 'Hola'; //sintaxis simplificada y recomendada

//caso con números 1
let miNumero = new Number(1); //formal y no recomendable

//caso con números 2
let miNumero2 = 3; //sintaxis recomendada

//caso boolean 1
let miBoolean1 = new Boolean(false); //formal

//caso boolean 2
let miBoolean2 = false; //sintaxis recomendada

//caso arreglos 1
let miArreglo = new Array(); //formal

//caso arreglos 2
let miArreglo2 = []; //sintaxis recomendada

//caso function 1
let miFuncion1 = new Function(); //después de 'new' todo se considera Objeto

//caso function 2
let mifuncion2 = function(){}; //notación simplificada y recomendada

// VIDEO 5 - BRAIAN - El uso de apply
//Método Apply
let arreglo = ['Ing.', '5492378473'];

// VIDEO 6 - FACUNDO - uso de prototype
Persona3.prototype.telefono = '2618383832';
console.log(padre);
console.log(madre.telefono);
madre.telefono = '5492618383832';
console.log(madre.telefono);
