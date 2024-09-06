
import java.util.Locale;
import java.util.Scanner;



public class AboutMe {
    public static void main(String[] args) {

        //criando o objet scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite sua atura: ");
        double altura =sc.nextDouble();
        System.out.println("Digite seu Primeiro Nome: ");
        String nome = sc.next();
        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = sc.next();
        System.out.println("Digite sua Idade: ");
        int idade = sc.nextInt();

        System.out.println(" Olá, me chama " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println(" Minha Altura é: " + altura + "cm");
    }
}
