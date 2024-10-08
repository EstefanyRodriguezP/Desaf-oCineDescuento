import java.util.Scanner;

public class CineApp {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        Integer entradaNormal = 3500;
        Double entradaMenor = (entradaNormal * 0.4);
        Double entradaMayor = (entradaNormal * 0.45);

        System.out.println("¡Buen día y bienvenido a nuestra CineApp!" + '\n' + "Por favor ingresa tu edad para saber el valor de la entrada");
        Integer edad = miScanner.nextInt();
        miScanner.nextLine();

        if (edad < 1 || edad >= 110) {
            System.out.println("La edad no corresponde. Por favor vuelve a ingresar a CineApp.");
        } else {
            System.out.println("Por favor ahora indica la cantidad de boletos que requieres" + '\n' + "Te recordamos que al comprar 2 boletos o más, se agregará un descuento a tu compra.");
            Integer boletos = miScanner.nextInt();
            miScanner.nextLine();
            if (edad < 5) {
                System.out.println("Por ser menor de 5 años cuenta con un descuento del 60%. El valor de la entrada es $" + entradaMenor);
                if (boletos >= 2) {
                    System.out.println("El total de tu compra por " + boletos + " boletos es $" + Math.round(entradaMenor * boletos * 0.7)
                            + '\n' + " " + '\n' +
                            "****************************" + '\n' + "~~~~  ATENCION  ~~~~" + '\n' +
                            "¡Aquí está tu info! " + '\n' + "Valor boletos: $" + entradaMenor + '\n' +
                            "Cantidad de boletos: " + boletos + '\n' +
                            "Valor total de la compra: $" + Math.round(entradaMenor * boletos * 0.7) + '\n' +
                            "¡Esperamos vuelvas pronto!" + '\n' + "****************************");
                } else {
                    System.out.println("El total de tu compra por " + boletos + " boletos es $" + Math.round(entradaMenor * boletos)
                            + '\n' + " " + '\n' +
                            "****************************" + '\n' + "~~~~  ATENCION  ~~~~" + '\n' +
                            "¡Aquí está tu info! " + '\n' + "Valor boletos: $" + entradaMenor + '\n' +
                            "Cantidad de boletos: " + boletos + '\n' +
                            "Valor total de la compra: $" + Math.round(entradaMenor * boletos) + " " + '\n' +
                            "¡Esperamos vuelvas pronto!" + '\n' + "****************************");
                }

            } else if (edad >= 5 && edad < 60) {
                System.out.println("El valor normal de la entrada es de $" + entradaNormal);
                if (boletos >= 2) {
                    System.out.println("El total de tu compra por " + boletos + " boletos es $" + Math.round(entradaNormal * boletos * 0.7)
                            + '\n' + " " + '\n' +
                            "****************************" + '\n' + "~~~~  ATENCION  ~~~~" + '\n' +
                            "¡Aquí está tu info! " + '\n' + "Valor boletos: $" + entradaNormal + '\n' +
                            "Cantidad de boletos: " + boletos + '\n' +
                            "Valor total de la compra: $" + Math.round(entradaNormal * boletos * 0.7) + '\n' +
                            "¡Esperamos vuelvas pronto!" + '\n' + "****************************");
                } else {
                    System.out.println("El total de tu compra por " + boletos + " boletos es $" + Math.round(entradaNormal * boletos)
                            + '\n' + " " + '\n' +
                            "****************************" + '\n' + "~~~~  ATENCION  ~~~~" + '\n' +
                            "¡Aquí está tu info! " + '\n' + "Valor boletos: $" + entradaNormal + '\n' +
                            "Cantidad de boletos: " + boletos + '\n' +
                            "Valor total de la compra: $" + Math.round(entradaNormal * boletos) + " " + '\n' +
                            "¡Esperamos vuelvas pronto!" + '\n' + "****************************");
                }

            } else {
                System.out.println("Por ser mayor de 60 años cuenta con un descuento del 55%. El valor de la entrada es $" + entradaMayor);
                if (boletos >= 2) {
                    System.out.println("El total de tu compra por " + boletos + " boletos es $" + Math.round(entradaMayor * boletos * 0.7)
                            + '\n' + " " + '\n' +
                            "****************************" + '\n' + "~~~~  ATENCION  ~~~~" + '\n' +
                            "¡Aquí está tu info! " + '\n' + "Valor boletos: " + entradaMayor + '\n' +
                            "Cantidad de boletos: " + boletos + '\n' +
                            "Valor total de la compra: $" + Math.round(entradaMayor * boletos * 0.7)  + '\n' +
                            "¡Esperamos vuelvas pronto!" + '\n' + "****************************");
                } else {
                    System.out.println("El total de tu compra por " + boletos + " boletos es $" + Math.round(entradaMayor * boletos)
                            + '\n' + " " + '\n' +
                            "****************************" + '\n' + "~~~~  ATENCION  ~~~~" + '\n' +
                            "¡Aquí está tu info! " + '\n' + "Valor boletos: " + entradaMayor + '\n' +
                            "Cantidad de boletos: " + boletos + '\n' +
                            "Valor total de la compra: $" + Math.round(entradaMayor * boletos) + " " + '\n' +
                            "¡Esperamos vuelvas pronto!" + '\n' + "****************************");
                }
            }
        }
    }
}

