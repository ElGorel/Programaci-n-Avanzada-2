package uce.edu.ec.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(3)
public class DescuentoISD implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando ISD");
        double valorADescontar = valor * 0.10;
        return valor - valorADescontar;
    }


}
