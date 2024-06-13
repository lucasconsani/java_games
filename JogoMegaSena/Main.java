import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        JogoMegaSena jogo = new JogoMegaSena();

        System.out.println("Digite o número de jogos: ");
        int numeroDeJogos = sc.nextInt();

        for (int i = 0; i < numeroDeJogos; i++) {
            jogo.gerarNumerosAleatorios();
            System.out.println("Jogo #" + (i + 1) + " :");
            System.out.println(jogo + "\n");
            jogo.listaNumeros.clear();
        }

        sc.close();

    }
}