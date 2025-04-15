import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double a,x;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de X:");
        x= sc.nextDouble();

        if ( x>5 || x< -5){
           a  = 8/Math.sqrt(Math.pow(x,2)-25);
        }
            else{
            System.out.println("Valor invalido para X");
        }








    }
}
