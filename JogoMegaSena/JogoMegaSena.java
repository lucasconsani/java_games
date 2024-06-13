import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JogoMegaSena {

    List<Integer> listaNumeros = new ArrayList<>();

    public void gerarNumerosAleatorios() {
        Random rand = new Random();
        for (int j = 0; j < 6; j++) {
            int randomNumber = rand.nextInt(1, 60);
            while (listaNumeros.contains(randomNumber)) {
                randomNumber = rand.nextInt(1, 60);
            }
            listaNumeros.add(randomNumber);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Integer numero : listaNumeros) {
            sb.append(numero)
                    .append(" ");
        }
        return sb.toString();
    }

}


