import java.util.ArrayList;
import java.util.Stack;

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }

    Node(int val, Node left, Node right) {
        data = val;
        this.left = left;
        this.right = right;
    }
}

public class Tree1 {

    public static ArrayList<Integer> inorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        else {
            Stack<Node> st = new Stack<Node>();
            Node node = root;

            boolean done = false;

            while (!done) {
                if (node != null) {
                    st.push(node);
                    node = node.left;
                } else {
                    if (st.isEmpty())
                        done = true;
                    else {
                        node = st.pop();
                        ans.add(node.data);
                        node = node.right;
                    }
                }
            }
            return ans;
        }
    }

    public static ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        if (root == null) {
            return ans;
        }

        else {
            Stack<Node> st = new Stack<Node>();
            st.push(root);

            while (!st.empty()) {
                Node node = st.pop();
                ans.add(node.data);

                if (node.right != null) {
                    st.push(node.right);
                }

                if (node.left != null) {
                    st.push(node.left);
                }

            }
            return ans;
        }
    }

    public static ArrayList<Integer> postorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        if (root == null) {
            return ans;
        }

        Stack<Node> st1 = new Stack<Node>();
        Stack<Node> st2 = new Stack<Node>();

        Node node = root;
        st1.push(node);

        while (!st1.empty()) {
            node = st1.pop();
            st2.push(node);

            if (node.left != null) {
                st1.push(node.left);
            }

            if (node.right != null) {
                st1.push(node.right);
            }
            // node = st1.pop(); no need to repeat it...
            // st2.push(node);
        }

        while (!st2.empty()) {
            node = st2.pop();
            ans.add(node.data);
        }

        return ans;
    }

    public static ArrayList<Integer> postorderSingleStack(Node root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        if (root == null)
            return ans;

        else {
            Stack<Node> st = new Stack<Node>();
            Node node = root;

            if (node != null) {
                st.push(node);
                node = node.left;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        Node r1 = new Node(5);
        root.left = r1;

        Node r3 = new Node(2);
        r1.left = r3;

        Node r5 = new Node(1);
        r1.right = r5;

        Node r2 = new Node(12);
        root.right = r2;

        Node r4 = new Node(15);
        r2.left = r4;

        Node r6 = new Node(18);
        r2.right = r6;

        ArrayList<Integer> res = postorder(root);
        System.out.println(res);
    }
}
