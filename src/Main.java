import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        //creamos la array en el cual almacenamos las figuras
        Figura figuras[] = new Figura[3];
        int contador = 0;
        //creamos un while en el cual segun el usuario seleccione la opcion
        while(contador < figuras.length) {
            System.out.println("=================MENU=================");
            System.out.println("Elige una opcion");
            System.out.println("1. Mostrar Circulo");
            System.out.println("2. Mostrar Triangulo");
            System.out.println("3. Mostrar Rectangulo");
            System.out.println("4.Salir");
            int opcion;

            //Creamos try, un switch y un cacth para que el usuario pueda seleccionar una opcion e introducir los datos
            try{
                System.out.print("Ingrese una opcion: ");
                opcion = num.nextInt();
                switch(opcion) {
                    case 1:
                        System.out.println("Ingresa el radio del Circulo: ");
                        double radio = num.nextDouble();
                        Circulo circulo = new Circulo(radio);
                        figuras[contador++]  = circulo;

                        System.out.println("El area del Circulo es: " + circulo.area());
                        System.out.println("El perimetro del Circulo: " + circulo.perimetro());
                        circulo.dibujar();
                       break;
                       case 2:
                        System.out.println("Ingresa el base del Triangulo: ");
                        double base = num.nextDouble();
                           System.out.println("Ingresa el altura del Triangulo: ");
                        double altura = num.nextDouble();
                           System.out.println("Ingresa el lado del Triangulo: ");
                        double l1 =num.nextDouble();
                        double l2 = num.nextDouble();
                        double l3 = num.nextDouble();
                        Triangulo triangulo= new Triangulo(base,altura,l1,l2,l3);
                        figuras[contador++] = triangulo;

                        System.out.println("El area del triangulo es: " + triangulo.area());
                        System.out.println("El perimetro del triangulo es: " + triangulo.perimetro());
                        triangulo.dibujar();
                        break;
                        case 3:
                        System.out.println("Ingresa el base del Rectangulo: ");
                        double base2 = num.nextDouble();
                        System.out.println("Ingresa el altura del Rectangulo: ");
                        double altura2 = num.nextDouble();

                        Rectangulo rectangulo = new Rectangulo(base2,altura2);
                        figuras[contador++] = rectangulo;
                        System.out.println("El area del Rectangulo es: " + rectangulo.area());
                            System.out.println("El perimetro del Rectangulo: " + rectangulo.perimetro());
                            rectangulo.dibujar();
                            break;
                        case 4:
                            System.out.println("Saliendo......");
                            return;
                            default:
                                System.out.println("Error al seleccionar una opcion");
                }
            }catch(InputMismatchException e){
                System.out.println("Error al seleccionar una opcion");
                num.nextLine();
            }
        }
    }
}
