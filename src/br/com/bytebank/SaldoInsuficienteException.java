package br.com.bytebank;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException (String msg) {
        super(msg);
    }

}
