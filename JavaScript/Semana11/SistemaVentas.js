class Producto{

    static contadorProductos = 0; //atributo estático, pertenece a la clase

    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos;
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

    toString(){ //Template Literals: Nos permite insertar código dinámicamente.
        return `idProducto: ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`;
    }



    calcularTotal(){
        let totalVentas = 0;
        for(let producto of this._productos){
            totalVentas += producto.precio;
        }
        return totalVentas;
    }//fin metodo

    mostrarOrden(){
        let productoOrden = '  ';
        for(let  producto of this._productos){
            productoOrden += producto.toString()+' ';
        }
        console.log(`Orden: ${this._idOrden}, Total: ${this.calcularTotal()}, Productos: ${productoOrden}`)
    }

} //Fín de la clase Producto


