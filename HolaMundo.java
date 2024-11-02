import java.util.Scanner;

public class HolaMundo {
    
    public static void main(String[] args) {
        // (sout) imprimir datos en pantalla
        System.out.println("Hola Mundo!");

        System.out.print("Como van las cosas");
        System.out.print(10);
        System.out.print(10.5);
        System.out.print('A');
        System.out.println("Mi nombre es" + "Andres" + "y tengo" + 22 + "años");
        
        System.out.printf("Aqui va una cadena: %s", "Andres");
        System.out.printf("Aqui va un entero: %d", 22);
        System.out.printf("Mi nombre es %s y tengo %d años%n", "Andres Cantillo", 22);

        var entrada = new Scanner(System.in);

        System.out.print("Porfavor ingrese un numero entero: ");
        var entero = entrada.nextInt();

        System.out.println(entero);

        entrada.close();

    }

}