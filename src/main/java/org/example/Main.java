package org.example;

public class Main {
    public static void main(String[] args) {
        String mensajeOriginal = "Hola, este es un mensaje secreto.";

        // Cifrado del mensaje original
        Mensaje mensajeCifrado = Cifrado.cifrar(mensajeOriginal);
        System.out.println("Mensaje cifrado: " + mensajeCifrado.getMensajeCifrado());

        // Descifrado del mensaje cifrado
        String mensajeDescifrado = Cifrado.descifrar(mensajeCifrado);
        System.out.println("Mensaje descifrado: " + mensajeDescifrado);
    }
}