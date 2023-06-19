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
} //Fín de la clase Producto

// 10.4.2  Creamos la clase Orden 
class Orden{
    static contadorOrdenes = 0;
    static getMAX_PRODUCTOS(){
        return 5;
    }

    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;
    }

    get idOrden(){
        return this._idOrden;
    }

    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto); //Tenemos 2 tipos de sintaxis: 1
            //this._productos[this._contadorProductosAgregados++] = producto; //segunda sintaxis
        }
        else{
            console.log('No se pueden agregar mas productos');
        }
    }//Fin del método agregarProducto
    
    
    
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
    
}//Fin de la clase Orden


