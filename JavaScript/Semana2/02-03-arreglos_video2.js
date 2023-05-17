//let autos = new Array('Ferrari', 'Porsche', 'BMW'); // sintaxis vieja
const autos = ['Ferrari', 'Porsche', 'BMW']; 
console.log(autos);


//Recorremos los elementos de un arreglo manualmente
console.log(autos[0]);
console.log(autos[1]);
console.log(autos[2]);


for(let i = 0; i < autos.length; i++){
    console.log(i+ ' : ' +autos[i]);
}

