package cursojava.classe;

import java.util.Locale;
import java.util.Scanner;
import cursojava.classe.Produto;

public class estoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Enter,Produto data: ");
		System.out.println("nome:");
		produto.nome =sc.nextLine();
		System.out.print("valor:");
		produto.valor = sc.nextDouble();
		System.out.print("quantidade:");
		produto.quantidade = sc.nextInt();
		
		System.out.println(produto.nome + ", "+ produto.valor + " ," + produto.quantidade);
		
		
		
		
		
       sc.close();
	}
     
}
