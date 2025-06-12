import java.util.Scanner;
public class areas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Seleccione una figura para calcular el area:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Circulo");
            System.out.println("4. Triangulo");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    double areaCuadrado = lado * lado;
                    System.out.println("El area del cuadrado es: " + areaCuadrado);
                    break;
                case 2:
                    System.out.print("Ingrese la base del rectangulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectangulo: ");
                    double altura = scanner.nextDouble();
                    double areaRectangulo = base * altura;
                    System.out.println("El area del rectangulo es: " + areaRectangulo);
                    break;
                case 3:
                    System.out.print("Ingrese el radio del circuloo: ");
                    double radio = scanner.nextDouble();
                    double areaCirculo = Math.PI * radio * radio;
                    System.out.println("El araa del circulo es: " + areaCirculo);
                    break;
                case 4:
                    System.out.print("Ingrese la base del triangulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triangulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                    System.out.println("El area del triangulo es: " + areaTriangulo);
                    break;
                case 5:
                    System.out.println("saliendo con AU :)");
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        } while (choice != 5);

        scanner.close();
    }
}