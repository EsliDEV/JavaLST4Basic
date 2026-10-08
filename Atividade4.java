package AtividadeLista4If;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade >=5 && idade <=7){
            System.out.println("A categoria do nadador é Infantil.");
        } else if (idade >=8 && idade <=17){
            System.out.println("A categoria do nadador é Juvenil.");
        } else{
            System.out.println("A categoria do nadador é Sênior.");
        }
    }

}
