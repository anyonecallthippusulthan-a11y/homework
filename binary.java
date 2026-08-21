import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {

    Node root;

    // Inorder: Left -> Root -> Right
    void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Preorder: Root -> Left -> Right
    void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Postorder: Left -> Right -> Root
    void postorder(Node node) {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Level Order: BFS
    void levelOrder(Node node) {
        if (node == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        // Create tree manually

        tree.root = new Node(8);

        tree.root.left = new Node(4);
        tree.root.right = new Node(12);

        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(6);

        tree.root.right.left = new Node(10);
        tree.root.right.right = new Node(14);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.println();

        System.out.print("Preorder: ");
        tree.preorder(tree.root);

        System.out.println();

        System.out.print("Postorder: ");
        tree.postorder(tree.root);

        System.out.println();

        System.out.print("Level Order: ");
        tree.levelOrder(tree.root);
    }
}