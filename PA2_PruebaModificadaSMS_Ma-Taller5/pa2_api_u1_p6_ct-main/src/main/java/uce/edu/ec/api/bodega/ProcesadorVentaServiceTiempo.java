package uce.edu.ec.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ProcesadorVentaServiceTiempo {
    
    
    
    //@Inject
    //private EstadisticasVentasGlobales estadisticasVentasGlobales;
 
    @MedirTiempo
    public void procesar (Venta venta){
        
        
        //inicia venta

        System.out.println("procesando pedido......");
        //consultando Stock
        //consultando base de datos....  etc 

        //simulamos tiempo de demora
        try{

            Thread.sleep(100);
            
        }catch (Exception e){

        }
        
        //this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Final del pedido");

    }


     @MedirTiempo
    public void reprocesar (Venta venta){
        
        
        //inicia venta

        System.out.println("reprocesando pedido......");
        //consultando Stock
        //consultando base de datos....  etc 

        //simulamos tiempo de demora
        try{

            Thread.sleep(250);
            
        }catch (Exception e){

        }
        
       // this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Final del reproceso");

    }
}
