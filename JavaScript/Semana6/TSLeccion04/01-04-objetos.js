const { DataObjectOutlined } = require("@mui/icons-material");

let x = 10; // variable de tipo primitiva
console.log(x.lenght);
console.log('Tipos primitivos:');


//Objeto - persona

let persona = { // creamos un objeto, en memoria que contiene una referencia
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'c.gil@mail.com',
    edad: 28,
    idioma: 'es',               //cambia los caracteres en string de minusculas a mayusculas
    nombreCompleto: function(){ //creamos un metodo o funcion para mostrar el nombre completo
        return this.nombre + ' ' + this.apellido;
    },
    altura: 1.70,
    
    //Set -
    
    get lang(){ //get de idioma
        return this.idioma.toUpperCase(); //Convierte las minúsculas a myúsculas con el metodo del parametro que recibe
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },

    //Get - nos permite acceder a los valores de nuestras propiedades
    get nombreEdad(){ //Este es el método get
        return 'El nombre es: '+this.nombre+', Edad: '+this.edad;
    }
    
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona.altura);
console.log(persona);
console.log(persona.nombreCompleto());
console.log('Ejecutando con un objeto:');


// creamos otro objeto


let persona2 = new Object(); //Debe crear un objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '32435532';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto:');


console.log(persona['apellido']); //accedemos como si fuera un arreglo

console.log('Usamos el ciclo for:');

// FOR IN y accedemos al objeto como si fuera un arreglo.

for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}


console.log('Cambiamos y eliminamos un error:');
// Agregamos y eliminamos propiedades en un objeto

//Agregamos una nueva propiuedad al objeto persona

persona.apellido = 'Bartoz';
persona.apellida = 'Gartos'; //Cambiamos dinamicamente un valor del objeto
console.log(persona);

// eliminamos la propiedad

delete persona.apellida; // eliminamos el error
console.log(persona);



// creamo un nuevo objeto index.html en la carpeta

// Vemos distintas formas de imprimir un objeto

//numero 1: la mas sensilla: concatenar cada valor de la propiedad:
console.log('Distinta formas de imprimir un objeto: forma 1.');
console.log(persona.nombre+', '+persona.apellido);


//numero 2: A traves del ciclo for
console.log('Distinta formas de imprimir un objeto: forma 2.');
for(nombrePropiedad in persona){
console.log(persona[nombrePropiedad]);
}

// numero 3: La funcion Object.values()  - regresa nuestro objeto como un arreglo.
console.log('Distinta formas de imprimir un objeto: forma 3.');
let personaArreglo = Object.values(persona);
console.log(personaArreglo);


// numero 4: a traves del metodo JSON.stringify
console.log('Distinta formas de imprimir un objeto: forma 4.');
let personaString = JSON.stringify(persona);
console.log(personaString);


//Get - simplificamos la sintaxis
console.log('Comnenzamos a utilizar el método get');
console.log(persona.nombreEdad);

//Set - establecer o modificar los atributos de los objetos
//Agregamos una nueva propiedad - idioma
console.log('Comenzamos con el método get y set para idioma');
persona.lang = 'en'; 
console.log(persona.lang);


//5.2 - Constructores de objetos

//Reutilizamos el codigo con Constructores que nos permiten crear un nuevo objeto persona
//Para no repetir los atributos y metodos creamos un constructor

//definimos una funcion
function Persona3(nombre, apellido, email){ //constructor donde definimos las propiedades
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
}
// creamos objetos
let padre = new Persona3('Leo', 'Lopez', 'l.lopez@gmail.com'); 
padre.nombre = 'Fabian'; //modificamos el nombre del propio objeto
console.log(padre);
//ninguno de los objetos comparten infomacion.
let madre = new Persona3('Laura', 'Contrera', 'l.contrera@gmail.com');
madre.email = 'contreral@gmail.com';
console.log(madre);













