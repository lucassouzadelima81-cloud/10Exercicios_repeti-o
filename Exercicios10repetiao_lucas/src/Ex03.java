import java.util.Scanner;
public class Ex03 {
    static void main(String[] args) {
        int numero;
        Scanner sc=new Scanner(System.in);
        System.out.println("escolha seu numero");
        numero= sc.nextInt();


        for (int contador = 1; contador <= 10; contador++) {
            System.out.println( contador + "x" + numero+"="+contador*numero);
        }
    }
}
