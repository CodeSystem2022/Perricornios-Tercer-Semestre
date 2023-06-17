
class Orden{
    //atributos estáticos de clase
    static contadorOrdenes = 0;
    static MAX_PRODUCTOS = 5;

    constructor(...productos){ //para poder iterar los elementos del array
        this._idOrden = ++Orden.contadorOrdenes;
        this._contadorProductosAgregados = 0;
        this._productos = []; //se crea el array para ingresar los productos

        for (let producto of productos) {
            this.agregarProducto(producto);
        }
    }

    agregarProducto(producto){
        if (this._contadorProductosAgregados < Orden.MAX_PRODUCTOS) {
            this._productos.push(producto);
            this._contadorProductosAgregados++;
            console.log(`Se agregó correctamente el producto "${producto}" a la orden.`);
            console.log(this._contadorProductosAgregados)

        } else {
            console.log('No se pueden agregar más productos a la orden. Superaste el límite máximo que es 5');
        }
    }

    calcularTotal(){
        let total = 0;
        for(let producto of this._productos){
            total += producto.precio;
        }
        return total; //devuelve el total
    }

    mostrarOrden(){
        console.log(`Orden n° ${this._idOrden}`);
        console.log('Productos: ');
        for (let producto of this._productos) {
            console.log(`Id Producto: ${producto._idProducto}, nombre de producto: ${producto.nombre}, precio del producto:  $${producto.precio}`);
        }
        let total = this.calcularTotal();
        console.log(`Total: $${total}`);
    }
}

