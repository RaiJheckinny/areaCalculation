import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double a,b,c, triangleRec, circle, trapeze, square, rectangle;

        System.out.printf("Digite Três Numero Com Separaçao de Espaços: ");

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangleRec = a * c / 2;
        circle = 3.14 * (Math.pow(c, 2));
        trapeze = (a + b) * c / 2;
        square = Math.pow(b, 2);
        rectangle = a * b;

        System.out.printf("Triangulo: %f", triangleRec);
        System.out.printf("%nCirculo: %f", circle);
        System.out.printf("%nTrapezio: %f", trapeze);
        System.out.printf("%nQuadrado: %f", square);
        System.out.printf("%nRetangulo: %f", rectangle);
        
        sc.close();
    }  
}
