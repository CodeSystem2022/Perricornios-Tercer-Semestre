const persona = {  //Definimos una variable constante con sus atributos
    nombre: 'Juan',
    apellido: 'Lopez'
}
console.log(persona); //Mostramos la persona
function cambiarValorObjeto(p1){ //Recibe un objeto de tipo persona por referencia y modifica sus atributos
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez';
}
cambiarValorObjeto(persona); //pasamos el objeto persona a la funcion cambiar valor
console.log(persona); // mostramos la persona