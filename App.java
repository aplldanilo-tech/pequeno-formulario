import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		String s1,s2,s3;

		 System.out.println("digite seu nome");
		s1 = sc.nextLine();
        System.out.println("digite sua idade");
		 s2 = sc.nextLine();
         System.out.println("digite a datade nascimento");
		 s3 = sc.nextLine();
		
		System.out.println("Nome: " + s1);
        System.out.println("Idade: " + s2);
        System.out.println("Data de nascimento: " + s3);
    }
}
