let x = 10; //variables de tipo primitiva
console.log(x.length); undefined

//Objeto
let persona = {
    nombre: 'Juani',
    apellido: 'Encinas',
    email: 'asterisko19@proton.me',
    edad: 19,
    nombreCompleto: function(){
        return this.nombre+' '+this.apellido
    }
}

console.log(persona.nombre); Juani
console.log(persona.apellido); Encinas
console.log(persona.email) asterisko19@proton.me
console.log(persona.edad); 19
console.log(persona);
console.log(persona.); { nombre: 'Juani', apellido: 'Encinas', email: 'asterisko19@proton.me', edad: '19'};
console.log(persona.nombreCompleto()); Juani Encinas
