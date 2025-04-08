import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double valornormal, valordesconto,vvdesconto;


        Scanner sc= new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("0.00");

        System.out.println("Qual foi o valor da compra? ");
        valornormal = sc.nextDouble();

        if ( valornormal > 1000)   {
            vvdesconto =valornormal * 0.15;
            valordesconto = valornormal - vvdesconto;

        }
        else {
            vvdesconto = valornormal * 0.08;
            valordesconto = valornormal -vvdesconto;

        }
        System.out.println("O valor à pagar é de: " + df.format(valordesconto) + ". E o valor de desconto foi de " + df.format(vvdesconto));

    }
}
