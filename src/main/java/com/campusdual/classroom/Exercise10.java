package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    //TODO ↓
    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {
        int blueBall = 0;
        do {
            String color = getBall();
            System.out.println("La bola es de color: " + color);
            if (color.equals("azul")) {
                blueBall++;
            }
        }while(blueBall < 2);
    }

    //TODO ↓
    // Un método que devuelva una cadena de texto con el color de una pelota (en minúscula). Dicho color se escogerá de
    // manera aleatoria. Se empleará el método randomWithRange(int min, int max) para escoger un número aleatorio, que
    // lo asociaremos al valor de un color de la siguiente manera:
    // 1 → rojo
    // 2 → azul
    // 3 → verde
    public static String getBall() {
            int selectedNumber = randomWithRange(1, 4);
            String colorBall = null;
            switch (selectedNumber) {
                case 1: colorBall = "rojo";
                    break;
                case 2: colorBall = "azul";
                    break;
                case 3: colorBall = "verde";
                    break;
                default: System.out.println("El numero no es valido");
            }
        return colorBall;
    }

    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
/*Dada la clase Exercise10 proporcionada, completar los métodos main() y getBall() siguiendo las instrucciones de
El objetivo de este programa es llamar a un método proporcionado randomWithRange() que devolverá un valor numérico
aleatorio (investigar lo que hace este método para deducir qué parámetros necesita). En función del valor numérico que
 devuelva este método, el getBall() lo asociará a un String de un color y se lo enviará al main(). Se repetirá la acción
 hasta que salgan dos bolas de color azul.
Métodos a implementar
Desde el método main() se llamará al método getBall(), tantas veces como sea necesario, desde un do-while, hasta que,
usando un contador, se acumulen dos bolas de color azul.

El método getBall() devuelve un String al ser invocado. El String podrá ser "verde", "azul" o "rojo". Dentro del método,
utilizando un switch, se llamará al método randomWithRange() y según el valor numérico que devuelva éste, el switch devolverá
un color u otro.*/