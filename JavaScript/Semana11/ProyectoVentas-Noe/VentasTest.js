class Orden{

    //atributos estáticos de clase
    static contadorOrdenes = 0;
    static MAX_PRODUCTOS = 5;

    constructor(...productos){ //para poder iterar los elementos del array
        this._idOrden = ++Orden.contadorOrdenes;
        this._contadorProductosAgregados = 0;
        this._productos = [];

        for (let producto of productos) {
            this.agregarProducto(producto);
        }
    }

    agregarProducto(producto){
        if (this._contadorProductosAgregados < Orden.MAX_PRODUCTOS) {
            this._productos.push(producto);
            this._contadorProductosAgregados++;
            console.log(`Se agregó el producto "${producto}" a la orden.`);
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
        return `
        ${this._nombre} 
        ${this._precio}`;
    }
}


let producto1 = new Producto(12378405, 'Maxi Riñonera star', 25);
let producto2 = new Producto(257482210, 'Mochila Rosa Barbie', 150);
let producto3 = new Producto(14548923, 'Bolso de viaje Carola',20);


let orden1 = new Orden(producto1, producto2, producto3);

orden1.mostrarOrden();