package com.impares.software;

public class Television extends Electrodomestico{
    private Integer resolucion = 20;
    private boolean sintonizadorTDT = false;

    public Television(){
        super();
    }
    public Television(Integer resolucion, boolean sintonizadorTDT){
        super();
        this.resolucion= resolucion;
        this.sintonizadorTDT= sintonizadorTDT;

    }


    public Integer getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    Integer precioFinal(){
        Integer preciofinal=0;
        if(resolucion > 40)
            preciofinal =+ super.getPrecio_base() + (super.getPrecio_base() * 30)/100;
        else if(sintonizadorTDT == true)
            preciofinal =+ super.getPrecio_base() + (super.getPrecio_base() * 50)/100;

        return preciofinal;
    }
}
