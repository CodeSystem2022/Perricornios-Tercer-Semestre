//Hoistings
let respuesta = sumarTodos(5, 4, 13, 10, 9);
console.log(respuesta);

function sumarTodos(){
    let suma = 0;
    for (let index = 0; index < arguments.length; index++) {
        suma += arguments[index]
    }
    return suma;
}