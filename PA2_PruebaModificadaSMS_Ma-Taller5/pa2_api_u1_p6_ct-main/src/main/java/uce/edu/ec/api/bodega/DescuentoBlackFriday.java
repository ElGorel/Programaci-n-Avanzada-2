package uce.edu.ec.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(4)
public class DescuentoBlackFriday implements Descuento{

    @Override
    public double aplicar(double valor) {
          System.out.println("Aplicando BlackFriday");
       double valorADescontar = valor * 0.05;
        return valor - valorADescontar;
    }



}
