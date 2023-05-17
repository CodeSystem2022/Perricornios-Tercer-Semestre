//agregamos una nueva propiedad al objeto
console.log('Cambiamos y eliminamos un error');
persona.apellida = 'Betancud' //cambiamos dinamicamente un valor del objeto
delete persona.apellida; //eliminamos el error (propiedad y valor)
console.log(persona) //ya no vemos Betancud ni apellida