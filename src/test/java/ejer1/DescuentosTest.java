package ejer1;

import ejer1_porcent_desc.CalculadoraDescuentos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DescuentosTest {

    @ParameterizedTest
    @CsvSource({
            "-10",
            "0",
    })
    public void verifyBadSueldo(int sueldo){
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        Assertions.assertThrows(Exception.class,()->{calc.descuentos(sueldo);});
    }

    @ParameterizedTest
    @CsvSource({
            "1,No se aplicara ningun descuento -- Total de sueldo restante: 1",
            "1999,No se aplicara ningun descuento -- Total de sueldo restante: 1999",
            "2000,No se aplicara ningun descuento -- Total de sueldo restante: 2000",
            "2001,Se aplica un descuento del 5% -- Total de sueldo restante: 1900.95",
            "3999,Se aplica un descuento del 5% -- Total de sueldo restante: 3,799.05",
            "4000,Se aplica un descuento del 5% -- Total de sueldo restante: 3,800.0",
            "4001,Se aplica un descuento del 15% -- Total de sueldo restante: 345"

    })
    public void verifyResult(){

    }
}
