import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double promedio = 0;

        System.out.println("--------------------");
        System.out.println("||Sistema de notas||");
        System.out.println("--------------------");

        System.out.println("Ingrese la nota numero uno: ");
        nota1 = sc.nextDouble();

        if (nota1 > 5 || nota1 < 0){
            System.err.println("[ERROR!] La nota debe estar entre el rango de 0.0 y 5.0");
        } else {
            nota1 = nota1 * 0.30;

            System.out.println("Ingrese la nota numero dos: ");
            nota2 = sc.nextDouble();

            if (nota2 > 5 || nota2 < 0){
                System.err.println("[ERROR!] La nota debe estar entre el rango de 0.0 y 5.0]");
            } else {
                nota2 = nota2 * 0.20;

                System.out.println("Ingrese la nota numero tres: ");
                nota3 = sc.nextDouble();

                if (nota3 > 5 || nota3 < 0){
                    System.err.println("[ERROR!] La nota debe estar entre el rango de 0.0 y 5.0");
                } else {
                    nota3 = nota3 * 0.50;

                    System.out.println("Calculando.....");
                    System.out.println(nota1 + " + " + nota2 + " + " + nota3);
                    promedio = nota1 + nota2 + nota3;

                    if (promedio >= 3 && promedio <= 5){
                        System.out.println("Felicitaciones!! aprobo la materia: " + promedio);
                    } else {
                        System.out.println("Lo siento! Reprobo la materia: " + promedio);
                    }
                }
            }
        }

        sc.close();
    }
}
