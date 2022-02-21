package ejer1_porcent_desc;

public class CalculadoraDescuentos {
    public String descuentos(int sueldo) throws Exception {
        String result="";
        double descuento= 0;
        double totalDesc=0;
        if(sueldo<= 0){
         throw new Exception("sueldo incorrecto");
        }
        if(sueldo<=2000){
            result="No se aplicara ningun descuento -- Total de sueldo restante: "+sueldo;
        }else if(sueldo>2000 && sueldo<=4000){
            descuento=sueldo*0.05;
            totalDesc=sueldo-descuento;
            result="Se aplica un descuento del 5% -- Total de sueldo restante: "+totalDesc;

        }else if(sueldo>4000){
            descuento=sueldo*0.15;
            totalDesc=sueldo-descuento;
            result="Se aplica un descuento del 15% -- Total de sueldo restante: "+totalDesc;
        }
        return result;
    }
}
