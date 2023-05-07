//For
for (let contando = 0; contando <= 0; contando++){
    console.log(contando);
}
console.log('Fin del ciclo for')

//Break
for (let contando = 0; contando <= 0; contando++){
    if(contando % 2 !==0){
        console.log(contando) //Muestra todos los pares
        break;
    }
}

//Continue
for (let contando = 0; contando <= 0; contando++){
    if(contando % 2 !==0){
        continue; //ir a la siguiente iteracion
    }
    console.log(contando); //0, 2, 4, 6, 8, 10 
}
console.log('Termina el ciclo'); //Termina el ciclo