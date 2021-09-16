package TrabalhoRefatoracao;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

// Alunos: Caio França e Murilo Ferreira    

public class TesteEscalacao {
    public static void main(String[] args) {

        Time time = new Time();
        Escalacao escalacao = new Escalacao();
    
        ArrayList<Jogador> players = new ArrayList<Jogador>();
        Scanner scan = new Scanner(System.in);
    
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        Jogador jogador3 = new Jogador();
        Jogador jogador4 = new Jogador();
        Jogador jogador5 = new Jogador();
    
        time.setNome(JOptionPane.showInputDialog("Entre com nome do time:"));
    
        System.out.println("Informe o nome do jogador 1: ");
        jogador1.setNome(scan.nextLine());
        players.add(jogador1);
    
        System.out.println("Informe o nome do jogador 2: ");
        jogador2.setNome(scan.nextLine());
        players.add(jogador2);
    
        System.out.println("Informe o nome do jogador 3: ");
        jogador3.setNome(scan.nextLine());
        players.add(jogador3);
    
        System.out.println("Informe o nome do jogador 4: ");
        jogador4.setNome(scan.nextLine());
        players.add(jogador4);
    
        System.out.println("Informe o nome do jogador 5: ");
        jogador5.setNome(scan.nextLine());
        players.add(jogador5);

    	System.out.print("Digite o dia do jogo: ");
    	int dia = scan.nextInt();
    	System.out.print("Digite o mês do jogo: ");
    	int mes = scan.nextInt();
        System.out.print("Digite o ano do jogo: ");
    	int ano = scan.nextInt();
    
        System.out.println(escalacao.getImprimir(players));
        System.out.println("Data do jogo: "+dia+"/"+mes+"/"+ano);
        System.out.println("Time: " + time.getNome());
        System.out.println("---------------");
    
        System.out.println("1 - " + jogador1.getNome());
        System.out.println("2 - " + jogador2.getNome());
        System.out.println("3 - " + jogador3.getNome());
        System.out.println("4 - " + jogador4.getNome());
        System.out.println("5 - " + jogador5.getNome());
    }
}