package br.com.ecommerce.main;

import br.com.ecommerce.exception.TipoFreteInvalidoException;
import br.com.ecommerce.model.*;

public class Main {
    public static void main(String[] args) {
        CalculadoraFrete cal = new CalculadoraFrete();

        try {
            EstrategiaFrete sedex = new FreteSedex();
            System.out.println(sedex.calcular(100));
            EstrategiaFrete pac = new FretePac();
            System.out.println(pac.calcular(100));
            EstrategiaFrete moto = new FreteMotoboy();
            System.out.println(moto.calcular(100));
            System.out.println(cal.processarFrete(100, null));
        } catch (TipoFreteInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}
