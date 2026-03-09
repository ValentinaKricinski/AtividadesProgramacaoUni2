import java.util.Scanner;

public class Uni2Exe15 {
    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        System.out.println("insira um valor de ponto flutuante: ");
        float valor = sc.nextFloat();

        float nota100 = valor / 100;
        float resto100 = valor % 100;

        float nota50 = resto100 / 50;
        float resto50 = resto100 % 50;

        float nota20 = resto50 / 20;
        float resto20 = resto50 % 20;

        float nota10 = resto20 / 10;
        float resto10 = resto20 % 10;

        float nota5 = resto10 / 5;
        float resto5 = resto10 % 5;

        float nota2 = resto5 / 2;
        float resto2 = resto5 % 2;

        float moeda1 = resto2 / 1;
        float restoMoeda1 = resto2 % 1;

        float moeda50 = restoMoeda1 / 0.50;
        float restoMoeda50 = restoMoeda1 % 0.50;
        

    sc.close();
    }
    
}
