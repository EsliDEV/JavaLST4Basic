package AtividadeLista4If;

import java.util.Locale;
import java.util.Scanner;


public class Atividade7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double peso, altura, imc ;
        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();
        imc  = peso/(altura * altura);
        if (imc < 18.5){
            System.out.println("Seu imc "+ imc + " está abaixo do peso.");
        } else if (imc>= 18.5 && imc<=24.9){
            System.out.println("Seu imc "+ imc + " está normal.");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Seu imc " + imc + " está com sobrepeso.");
        } else if (imc >= 30.0 && imc <=34.9){
            System.out.println("Seu imc "+ imc + " está com obesidade grau |");
        } else if (imc >= 35.0 && imc <= 39.9){
            System.out.println("Seu imc "+ imc + "está com obesidade grau ||");
        } else {
            System.out.println("Seu imc "+ imc + " está com obesidade grau |||");
        }
    }
}
