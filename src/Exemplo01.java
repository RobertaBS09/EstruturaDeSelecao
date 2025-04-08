    /* progama exemplo para calcular
    a média entre duas notas e imprimir a situação do aluno
    */

    import java.text.DecimalFormat;
    import java.util.Scanner;

    public class Exemplo01 {
    public static void main(String[] args) {
        double nota1,nota2,media;
        DecimalFormat df =new DecimalFormat("0.00");

        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o valor da primeira nota do aluno: ");
        nota1= sc.nextDouble();

        System.out.println("Digite o valor da segunda nota do aluno:");
        nota2= sc.nextDouble();

        media = (nota1 +nota2) /2;

        if (media >= 6 ){
            System.out.println("Aluno Aprovado! A média do aluno foi de " + df.format(media));
        }
        else {
            System.out.println("Aluno reprovado! A média do aluno foi de " + df.format(media));
        }
    }
}
