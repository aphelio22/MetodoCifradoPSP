package org.example;

public class Mensaje {

    private final String mensajeCifrado;
    private final Integer clave;

    public Mensaje(String mensajeCifrado, Integer clave) {
        this.mensajeCifrado = mensajeCifrado;
        this.clave = clave;
    }

    public String getMensajeCifrado() {
        return mensajeCifrado;
    }

    public Integer getClave() {
        return clave;
    }
}
