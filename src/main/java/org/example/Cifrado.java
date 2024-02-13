package org.example;

import java.util.Random;

public class Cifrado {

    /**
     * Se genera una clave, la cual es un número aleatorio entre el 0 y el 100, ambos incluidos, que se utilizará como base para cifrar los
     * caracteres. Posteriormente, esta clave se suma al valor ASCII de cada carácter, lo que da un nuevo valor numérico que se utiliza para obtener
     * un nuevo carácter que se incorpora a la cadena.
     *
     * @param mensaje El mensaje cifrado.
     * @return Una instancia de la clase Mensaje.
     */
    public static Mensaje cifrar(String mensaje) {
        Random random = new Random();
        Integer clave = random.nextInt(101);

        StringBuilder mensajeCifrado = new StringBuilder();

        for (Character caracter : mensaje.toCharArray()) {
            Integer transformacion = clave;
            Character caracterCifrado = (char) (caracter + transformacion);
            mensajeCifrado.append(caracterCifrado);
        }

        return new Mensaje(mensajeCifrado.toString(), clave);
    }

    /**
     * Se obtiene la clave que se almacena en la clase Mensaje durante el cifrado, así como el propio mensaje cifrado.
     * La única diferencia conforme al método de cifrado es que en lugar de sumarse la clave y el valor ASCII, estos se restan
     * dando lugar al carácter original.
     *
     * @param mensajeCifrado
     * @return El mensaje descifrado.
     */
    public static String descifrar(Mensaje mensajeCifrado) {
        String mensajeCifradoStr = mensajeCifrado.getMensajeCifrado();
        Integer clave = mensajeCifrado.getClave();

        StringBuilder mensajeDescifrado = new StringBuilder();

        for (Character caracterCifrado : mensajeCifradoStr.toCharArray()) {
            Integer transformacion = clave;
            Character caracterDescifrado = (char) (caracterCifrado - transformacion);
            mensajeDescifrado.append(caracterDescifrado);
        }

        return mensajeDescifrado.toString();
    }
}
