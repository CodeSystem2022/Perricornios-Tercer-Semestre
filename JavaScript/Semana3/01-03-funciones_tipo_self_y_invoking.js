//una funcion es un código reutilizable
//podemos llamarla antes o desp de definirla. Hoisting
//mueve la definicion al principio del programa
miFuncion(8, 2);

function miFuncion(a, b){
    //console.log("Sumamos: "+ (a + b));
    return a + b;
}

//Llamamos la funcion
miFuncion(5, 4);

let resultado = miFuncion(6, 7);
console.log(resultado);

//Declaramos una función de tipo expresión o anónima
//necesita que se finalice con ;
let x = function(a, b){ return a + b};
resultado = x(5, 6); //para llamarla se pone la variable y ()
console.log(resultado);

//Funciones que se llaman a sí mismas: self y invoking
(function(a, b){
    console.log('Ejecutando la funcion: '+ (a + b));
})(9, 6);
//para ejecutar la funcion, una vez cerrados los paréntesis, volvemos a abrir parentesis