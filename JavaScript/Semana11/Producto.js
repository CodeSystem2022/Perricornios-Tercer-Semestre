class Producto extends Orden{

    static contadorProductos = 0;

    constructor(nombre, precio){
        this,_idProducto = ++Producto.contadorProductos;
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
        return `
        ${super.toString()} 
        ${this._idProducto} 
        ${this._nombre};
        ${this._precio}`;
    }

}