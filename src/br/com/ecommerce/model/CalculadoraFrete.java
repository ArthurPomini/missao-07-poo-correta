package br.com.ecommerce.model;

import br.com.ecommerce.exception.TipoFreteInvalidoException;

public class CalculadoraFrete {
    public double processarFrete(double valorPedido, EstrategiaFrete tipo) {
        if (tipo == null) {
            throw new TipoFreteInvalidoException("Tipo de Frete Inválido.");
        } else {
            return tipo.calcular(valorPedido);
        }
    }
}
