let sumar  = function(a = 4, b = 2){
    console.log(arguments[0]);
    console.log(arguments[1]);
    return a + b + arguments[2];
}
resultado = sumar(3, 5, 9);
console.log(resultado);
