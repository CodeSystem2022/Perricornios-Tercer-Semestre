//Distintas formas de imprimir un objeto (video 8)
//Numero1: Concatenar cada valor de cada propiedad
console.log('Distintas formas de imprimir un objeto. Forma 1 (video 8)');
console.log(persona.nombre+' '+persona.apellido);

//Numero 2: A traves del ciclo for in
console.log('Distintas formas de imprimir un objeto. Forma 2 (video 8)');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Número 3: a traves del método la función Object.values()
console.log('Distintas formas de imprimir un objeto. Forma 3 (video 8)');
let personaArray = Object.values(persona)
    console.log(personaArray);


//Número 4: Utilizamos el método JSON.stringify
console.log('Distintas formas de imprimir un objeto. Forma 4 (video 8)');
let personaString =  JSON.stringify(persona);
console.log(personaString);