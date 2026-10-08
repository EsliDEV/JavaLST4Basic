package AtividadeLista4If;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne, numberTwo, numberThree;
        System.out.println("Digite o primeiro numero: ");
        numberOne = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        numberTwo = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        numberThree = sc.nextInt();

        if (numberOne> numberTwo && numberOne> numberThree){
            System.out.println("O maior numero digitado é: " +numberOne);
        } else if (numberTwo > numberOne && numberTwo > numberThree){
            System.out.println("O maior numero digitado é: " +numberTwo);
        } else{
            System.out.println("O maior numero digitado é: " +numberThree);
        }
    }
}
