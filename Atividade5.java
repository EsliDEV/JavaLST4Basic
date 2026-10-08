package AtividadeLista4If;

import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Digite um numero:");
        number = sc.nextInt();
        if (number >= 100 && number<=200){
            System.out.println("O numero " +number+ " está dentro do intervalo");
        } else{
            System.out.println("O numero " +number+ " não está dentro do intervalo");
        }
    }
}
