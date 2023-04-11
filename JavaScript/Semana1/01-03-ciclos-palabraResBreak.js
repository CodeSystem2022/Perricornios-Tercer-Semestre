//Palabra reservada Break
for(let contando = 0; contando <= 10; contando ++){
    if(contando % 2 == 0){
        console.log(contando); //muestra las entradas pares
        break; //rompe el ciclo y termina la búsqueda
    }
}
console.log("Termina el ciclo al encontrar el primer número par");
