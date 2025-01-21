package palpite_dados;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
public class palpite {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("qual o seu  palpite ?");
		int palpite= s.nextInt();
		
		Random n = new Random();
		int dado= n.nextInt(6)+1; //0-5
		System.out.println("Palpite = "+ palpite);
		
		
		try {

            if (palpite < 1 || palpite > 6) {
                throw new IllegalArgumentException("Este número não é válido.");
            }

            System.out.println("Número válido: " + palpite);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Digite apenas números inteiros.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
             // Fecha o scanner para liberar recursos
        }
		

	    
		System.out.println(" Dado = "+ dado);
		if(palpite== dado) {
			System.out.println("acertou! ");
		}
		else {
			System.out.println("Errou :(");
		}
		System.out.print("Digite um número entre 1 e 6 da proxima vez ");
        

}
}
