import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        char data;
        Node left;
        Node right;

        Node(char data) {
            this.data = data;
        }
    }

    static Node[] nodes = new Node[26];
    static StringBuilder sb = new StringBuilder();

    static void preorder(Node node) {
        if (node == null) return;
        sb.append(node.data);
        preorder(node.left);
        preorder(node.right);
    }

    static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        sb.append(node.data);
        inorder(node.right);
    }

    static void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        sb.append(node.data);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < 26; i++) {
            nodes[i] = new Node((char)('A' + i));
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            Node rootNode = nodes[root - 'A'];

            if (left != '.') {
                rootNode.left = nodes[left - 'A'];
            }

            if (right != '.') {
                rootNode.right = nodes[right - 'A'];
            }
        }

        Node root = nodes[0]; // A

        preorder(root);
        sb.append('\n');
        inorder(root);
        sb.append('\n');
        postorder(root);

        System.out.print(sb);
    }
}