package exercicios;

import exercicios.ex8.Exercicio8;
import exercicios.ex9.BinaryTree;

/**
 *
 * @author Lucas
 */
public class Exercicios {

    static BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(2);
        bt.add(1);
        return bt;
    }

    static void exercicio9() {
        BinaryTree tree = createBinaryTree();
        int node = 4;
        int value = tree.sumNodeRecursive(node);
        System.out.println("=========EXERCÍCIO 9=========");
        System.out.println("Valor da soma de todos os nós subsequentes do nó "
                + node + ": " + value);
    }

    static void exercicio8() {
        Exercicio8 criarNumeroC = new Exercicio8();
        Integer numeroA = 1144;
        Integer numeroB = 22;
        Integer numeroC = criarNumeroC.createNumberC(numeroA, numeroB);
        System.out.println("=========EXERCÍCIO 8=========");
        System.out.println("Número A: " + numeroA + "\nNúmero B: " + numeroB
                + "\nNúmero C: " + numeroC);

    }

    public static void main(String[] args) {
        exercicio8();
        exercicio9();
    }
}
