import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double a,b,c;

        Scanner sc= new Scanner(System.in);

        System.out.print("Digite o valor do Lado A --->");
        a= sc.nextDouble();


        System.out.print("Digite o valor do Lado B --->");
        b= sc.nextDouble();


        System.out.print("Digite o valor do Lado C --->");
        c= sc.nextDouble();

        if (c<a+b && b<a+c && a<b+c){
            System.out.println(" Os valores representam um triângulo.");
        }
        else {
            System.out.println("Os valores NÃO representam um triângulo.");
        }



    }
}
