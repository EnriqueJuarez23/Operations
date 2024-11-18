import java.util.Scanner;

public class Bucle {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int a, b, r;
        int num;

        do {
            System.out.println("------MENU------");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            num = op.nextInt();

            switch (num) {
                case 1:
                    System.out.println("--SUMA--");
                    System.out.println("ingresa un numero");
                    a = op.nextInt();
                    System.out.println("Ingresa otro numero");
                    b = op.nextInt();
                    r = a + b;
                    System.out.println("El resultado es: " + r);
                    break;
                case 2:
                    System.out.println("--RESTA--");
                    System.out.println("ingresa un numero");
                    a = op.nextInt();
                    System.out.println("Ingresa otro numero");
                    b = op.nextInt();
                    r = a - b;
                    System.out.println("El resultado es: " + r);
                    break;
                case 3:
                    System.out.println("--MULTIPLICACION--");
                    System.out.println("ingresa un numero");
                    a = op.nextInt();
                    System.out.println("Ingresa otro numero");
                    b = op.nextInt();
                    r = a * b;
                    System.out.println("El resultado es: " + r);
                    break;
                case 4:
                    System.out.println("--DIVISION--");
                    System.out.println("ingresa un numero");
                    a = op.nextInt();
                    System.out.println("Ingresa otro numero");
                    b = op.nextInt();
                    r = a / b;
                    System.out.println("El resultado es: " + r);
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (num != 0);

        System.out.println("hasta pronto");
    }
}