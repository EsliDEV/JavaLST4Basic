package AtividadeLista4If;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ladoOne, ladoTwo, ladoThree;
        System.out.println("Digite o primeiro lado do triangulo: ");
        ladoOne = sc.nextInt();
        System.out.println("Digite o segundo lado do triangulo: ");
        ladoTwo = sc.nextInt();
        System.out.println("Digite o terceiro lado do triangulo: ");
        ladoThree = sc.nextInt();
        if (ladoOne < ladoTwo + ladoThree && ladoTwo < ladoOne + ladoThree && ladoThree < ladoOne + ladoTwo) {
            System.out.println("Essas medidas formam um triangulo.");
        } else{
            System.out.println("Essas medidas não formam um triangulo.");
        }
    }
}
