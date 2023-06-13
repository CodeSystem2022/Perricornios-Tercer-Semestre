class Orden{
    
    static contadorOrdenes = 0;


    static get MAX_PRODUCTOS(){
        return 5;
    }

    constructor(productos, contadorProductosAgregados){ 
        this._productos = productos;
        this._contadorProductosAgregados  = contadorProductosAgregados;
        if(Orden.contadorOrdenes < Orden.MAX_PRODUCTOS){
            this._idOrden = ++Persona.contadorOrdenes;
        }
        else{
            console.log('Se ha superado el número maximo de productos permitidos.')
        }
        
    }

    get productos(){   
        return this._productos;
    }
    

    set productos(productos){
        this._productos = productos;
    }

    get contadorProductosAgregados(){
        return this._contadorProductosAgregados;
    }

    set contadorProductosAgregados(contadorProductosAgregados){
        this._contadorProductosAgregados = contadorProductosAgregados;
    }
}









let orden1 = new Orden('Alpargata', '1');
console.log (orden1);

