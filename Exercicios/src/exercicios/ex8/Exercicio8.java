package exercicios.ex8;

/**
 *
 * @author Lucas
 */
public class Exercicio8 {

    public Integer createNumberC(Integer numberA, Integer numberB) {
        char[] listNumberA = numberA.toString().toCharArray();
        char[] listNumberB = numberB.toString().toCharArray();
        int tamanhoLista = listNumberA.length > listNumberB.length
                ? listNumberA.length : listNumberB.length;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < tamanhoLista; i++) {
            if (listNumberA.length > i) {
                builder.append(listNumberA[i]);
            }
            if (listNumberB.length > i) {
                builder.append(listNumberB[i]);
            }

        }

        Integer numeroC = Integer.valueOf(builder.toString());

        return numeroC > 1000000 ? -1 : numeroC;
    }

}
