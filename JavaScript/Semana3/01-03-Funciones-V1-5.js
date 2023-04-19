// Llamamos la funcion antes de definirla (hosting: mueve la decalracion de la funcion al inicio del programa para poder utilizarla en cualquier parte)
miFuncion(8, 2); // Esto se lo conoce como hosting


// Creamos la funcion
function miFuncion(a, b){
//    console.log("Sumamos: "+(a + b));
    return a + b;  // la funcion regresa un valor. se puede asignar a una variable
} // aunque no estemos retornando automaticamente el compilador utiliza return


// Llamando la funcion
miFuncion(5, 4);

// Creamos la variable
let resultado = miFuncion(6, 7);
console.log(resultado); 


// podemos asignar la fincion a una variable, funciones anonimas de tipo expresion

// Declaramos una funcion de tipo expresión (anónima)
let x = function(a, b){ return a + b}; // se realiza en una sola linea y necesita ser cerrada con punto y coma
resultado = x(8, 3); // ingresamos los argumentos
console.log(resultado);  // reutilizamos la variable resultado y pasamos los argumentos para la funcion anonima

// Funciones tipo self e invoking
// no se puede reutilizar, se manda a llamar a si misma una sola vez
(function(a, b){
    console.log('Ejecutando la funcion: ' + (a + b));
})(9 , 5); // definimos la funcion sin asignarle una variable de hia anonima, se puede llamar a si misma con parametros y con argumentos.



// las funciones pueden ser descritas como objetos y los objetos pueden tener propiedades y metodfos asociados a cada uno de los objetos.
// propiedad arguments: para saber cuantos argumentos se han definido en la funcion
console.log(typeof miFuncion);

function miFuncionDos(a, b){
    console.log(arguments);
    console.log(arguments.length); 
} // a traves de esto recibimos el conteo de argumento asociado con un arreglo.

miFuncionDos(5, 7);  // imprimimos estos argumentos, utilizando la propiedad arguments ya que una funcion es un objeto con propiedades y metodos
miFuncionDos(6, 3, 8, 4, 9);


// toString 
//convierte la funcion a texto
var miFuncionTexto = miFuncionDos.toString();  // asignamos a una variable la funcion como si fuera  texto
console.log(miFuncionTexto);







