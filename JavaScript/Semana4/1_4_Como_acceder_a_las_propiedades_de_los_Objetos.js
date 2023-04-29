let persona = {
nombre : 'juan',
direccion : 'Salada 14',
telefono : '+542604121212',
}

console.log(persona.nombre);

for (propiedad in persona) { // Se accede como si fuera un arreglo
    console.log(propiedad);
    console.log(persona[propiedad])
}