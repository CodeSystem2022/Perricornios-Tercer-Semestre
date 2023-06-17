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

class Orden{
    //atributos estáticos de clase
    static contadorOrdenes = 0;
    static getMAX_PRODUCTOS(){
        return 5
    }

    constructor(...productos){ //para poder iterar los elementos del array
        this._idOrden = ++Orden.contadorOrdenes;
        this._contadorProductosAgregados = 0;
        this._productos = []; //se crea el array para ingresar los productos

        for (let producto of productos) {
            this.agregarProducto(producto);
        }
    }
    
    get idOrden(){
        return this.idOrden;
    }

    agregarProducto(producto){
        if (this._productos.length < Orden.getMAX_PRODUCTOS()) {
            this._productos.push(producto);
            //this._productos[this.contadorProductosAgregados++] = producto; //segunda sintaxis
        } else {
            console.log('No se pueden agregar más productos a la orden. Superaste el límite máximo que es 5');
        }
    }//fin del método agregarProducto

    calcularTotal(){
        let total = 0;
        for(let producto of this._productos){
            total += producto.precio;
        }
        return total; //devuelve el total
    }

    mostrarOrden(){
        let productosOrden = ' ';
        for (let producto of this._productos) {
            productosOrden += '\n{'+producto.toString() + ' }'; //video6
        }
        console.log(`Orden: ${this._idOrden}, Total: $${this.calcularTotal()}, Productos: ${productosOrden}`);
    }
}

let producto1 = new Producto('Pantalon', 200);
let producto2 = new Producto('Camisa', 150);
//10.5 Pruebas con la relación de Agregación - Video 6
let producto3 = new Producto('Cinturon', 50);
let orden1 = new Orden();
let orden2 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden2.agregarProducto(producto1);
orden2.agregarProducto(producto2);
orden2.agregarProducto(producto3);
orden1.mostrarOrden();
orden2.mostrarOrden();
