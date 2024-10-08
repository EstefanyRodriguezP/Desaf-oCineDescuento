import java.util.Scanner;

public class CineApp {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("¡Buen día y bienvenido a nuestra CineApp!" + '\n' + "Por favor ingresa tu edad para saber el valor de la entrada");
        Integer edad = miScanner.nextInt();

        if (edad <= 0 || edad >= 110) {
            System.out.println("La edad no corresponde. Por favor vuelve a ingresar a CineApp.");
        } else if (edad < 5) {
            System.out.println("El valor normal de la entrada es de $3500, pero por ser menor de 5 años cuenta con un descuento del 60%.");
        } else if (edad >= 5 && edad < 60) {
            System.out.println("El valor normal de la entrada es de $3500.");
        } else {
            System.out.println("El valor normal de la entrada es de $3500, pero por ser mayor de 60 años cuenta con un descuento del 55%.");
        }

        miScanner.nextLine();


    }
}
