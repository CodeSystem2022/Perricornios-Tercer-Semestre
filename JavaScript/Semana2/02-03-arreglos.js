//let autos = new Array('Ferrari', 'Porsche', 'BMW'); //ya no se recomienda esta sintaxis
const autos = ['Ferrari', 'Porsche', 'BMW']; //podemos utilizar la palabra const y declarar el arreglo dentro de corchetes que no se va a modificar solo el contenido.
console.log(autos);


//Recorremos los elementos de un arreglo de forma manual
console.log(autos[0]);
console.log(autos[1]);
console.log(autos[2]);

//Recorremos los elementos de un arreglo con ciclo for
for(let i = 0; i < autos.length; i++){
    console.log(i+ ' : ' +autos[i]); // iteramos los indices
}

// Modificamos los elementos del arreglo
autos[1] = 'Volvo';
console.log(autos[1]);

//Agregamos nuevos valores al arreglo - metodo push
autos.push('Audi'); // Agregamos el elemento al final de la lista
console.log(autos);

//Otras formas de agregar elementos al arreglo
autos[autos.length] = 'Mercedes Benz';
console.log(autos);

//Tercera forma de agregar elementos: Con esta forma se debe de tener CUIDADO
autos[6] = 'Porsche'//asignamos la pocicion 6 por lo tanto estamos salteando una posicion vacio
console.log(autos);

// Como preguntar si es un Array o Arreglo
console.log(Array.isArray(autos)); //utilizamos la clase Array con la que accedemos al metodo isArray, devuelve un resultado booleano

// Otra forma de consultar si es un Array o Arreglo
console.log(autos instanceof Array); //Preguntamos si la variable es una instancia de la clase Array (True), devolviendo un resultado booleano
