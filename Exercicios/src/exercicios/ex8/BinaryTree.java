package exercicios.ex8;

/**
 *
 * @author Lucas
 */
public class BinaryTree {

    Node root;

    public Node containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public int sumNodeRecursive(int value) {
        return containsNode(value).sumNodeRecursive() - value;
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    private Node containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }
        if (value == current.value) {
            return current;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }
}
