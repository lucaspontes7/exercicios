package exercicios.ex9;

/**
 *
 * @author Lucas
 */
public class Node {

    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    public int sumNodeRecursive() {
        return value
                + (right == null ? 0 : right.sumNodeRecursive())
                + (left == null ? 0 : left.sumNodeRecursive());
    }
}
