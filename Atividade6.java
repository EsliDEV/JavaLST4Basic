package AtividadeLista4If;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one, two;
        char txt;
        System.out.println("Digite o primeiro numero:");
        one = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        two = sc.nextInt();
        System.out.println("Qual operação deseja realizar? [+ ADIÇÃO] [- SUBTRAÇÃO] [* MULTIPLICAÇÃO] [/ DIVISÃO]");
        txt = sc.next().charAt(0);
        if(txt == '+') {
            System.out.println("A soma dos numeros digitados são: " + (one + two));
        } else if (txt == '-') {
            System.out.println("A subtração dos numeros digitados são: " + (one-two));
        } else if (txt == '*') {
            System.out.println("A multiplicação dos numeros digitados são: " + (one*two));
        } else if(txt == '/'){
            System.out.println("A divisão dos numeros são : " + (one/two));
        }else {
            System.out.println("digite um numero valido: ");
        }


    }
}
