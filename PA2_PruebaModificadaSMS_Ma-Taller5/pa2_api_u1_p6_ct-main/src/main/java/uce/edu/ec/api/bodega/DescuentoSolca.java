package uce.edu.ec.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class DescuentoSolca implements Descuento{

    
    @Override
    public double aplicar(double valor) {
        
         System.out.println("Aplicando Solca");
       double valorADescontar = valor * 0.20;
        return valor - valorADescontar;
    }



}
