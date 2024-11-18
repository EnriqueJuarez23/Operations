import java.util.Scanner;

class Funciones {
    int a, b;

    public void mostrarSuma() {
        Scanner op = new Scanner(System.in);
        System.out.println("ingresa un numero");
        a = op.nextInt();
        System.out.println("ingresa otro numero");
        b = op.nextInt();
        int r = a + b;
        System.out.println("resultado: " + r);
    }

    public void mostrarResta() {
        Scanner pam = new Scanner(System.in);
        System.out.println("ingresa un numero");
        a = pam.nextInt();
        System.out.println("ingresa otro numero");
        b = pam.nextInt();
        int r = a - b;
        System.out.println("resultado: " + r);
    }

    public void mostrarMultiplicacion() {
        Scanner eli = new Scanner(System.in);
        System.out.println("ingresa un numero");
        a = eli.nextInt();
        System.out.println("ingresa otro numero");
        b = eli.nextInt();
        int r = a * b;
        System.out.println("resultado: " + r);
    }

    public void mostrarDivision() {
        Scanner san = new Scanner(System.in);
        System.out.println("ingresa un numero");
        a = san.nextInt();
        System.out.println("ingresa otro numero");
        b = san.nextInt();
        int r = a / b;
        System.out.println("resultado: " + r);
    }
}