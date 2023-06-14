
class Producto{
    //atributo estático de clase

    static contadorProducttos = 0;

    constructor(idProducto, nombre, precio){
        this._idProducto = idProducto;
        this._contadorProducttos = ++Producto.contadorProducttos;
        this._nombre = nombre;
        this._precio = precio;
    }

    get idProducto(){
        return this._idProducto;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get precio(){
        return this._precio;
    }

    set precio(precio){
        this._precio = precio;
    }

    toString(){
        return `${this._nombre} ${this._precio}`;
    }
}
