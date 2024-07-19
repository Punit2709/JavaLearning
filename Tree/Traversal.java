import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{

    String data;
    TreeNode left;
    TreeNode right;

    TreeNode(String data){ this.data = data;}
    TreeNode(String data , TreeNode l , TreeNode r)
    {
        this.data = data;
        this.left = l;
        this.right = r;
    }
}

public class Traversal {


    public static List<String> preorder(TreeNode root){
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        result.add(root.data);
        result.addAll(preorder(root.left));
        result.addAll(preorder(root.right));

        return result;
    }

    public static List<String> inorder(TreeNode root){
        List<String> result = new ArrayList<>();

        if (root == null) 
            return result;
        
        result.addAll(inorder(root.left));
        result.add(root.data);
        result.addAll(inorder(root.right));

        return result;
    }

    public static List<String> preorderIterative(TreeNode root){
        List<String> result = new ArrayList<String>();
        TreeNode node = root;

        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(node);

        while(!st.empty())
        {
            node = st.pop();
            result.add(node.data);

            if (node.right != null) 
            {
                st.push(node.right);    
            }
           
            if(node.left != null)
                    st.push(node.left);
        }

        return result;
    }

    public static List<String> inorderIterative(TreeNode root){
        List<String> inorder = new ArrayList<String>();

        if(root == null) return inorder;
        
        else{
            Stack<TreeNode> st = new Stack<TreeNode>();
            TreeNode node = root;
            while(true){
                if(node != null){
                    st.push(node);
                    node = node.left;
                }
                else{
                    if(st.isEmpty())
                        break;
                    node = st.pop();
                    inorder.add(node.data);
                    node = node.right;       
                }
            }
            return inorder;
        }
    }

    public static List<String> postorderIterative(TreeNode root){
        List<String> ans = new ArrayList<String>();
        
        if (root == null) {
            return ans;
        }

        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();

        TreeNode node = root;
        st1.push(node);

        while (!st1.empty()) {
            node = st1.pop();
            st2.push(node);

            if (node.left != null) st1.push(node.left);
            if (node.right != null) st1.push(node.right);
        }

        while (!st2.empty()) {
            node = st2.pop();
            ans.add(node.data);
        }

        return ans;
    }

    public static List<String> postorderSingleStack(TreeNode root){
        List<String> ans = new ArrayList<String>();

        if(root == null) return ans;
        
        else{
            Stack<TreeNode> st = new Stack<TreeNode>();
            TreeNode node = root;

            while (node != null || !st.empty()) {
                if(node != null){
                st.push(node);
                node = node.left;
                }

                else{
                    TreeNode temp = st.peek().right;

                    if(temp == null){
                        temp = st.peek();
                        st.pop();
                        ans.add(temp.data);

                        while(!st.empty() && temp == st.peek().right){
                            temp = st.peek();
                            st.pop();
                            ans.add(temp.data);
                        }
                    }

                    else{
                        node = temp;
                    } 
                }       
            }
            return ans;
        }
    }
    
    
    public static void main(String[] args) {
        
        TreeNode  root = new TreeNode("Bhimsen");
        root.left = new TreeNode("Ramdas");
        root.right = new TreeNode("Dhaniram");

        root.left.left = new TreeNode("Ishwar");
        root.left.right = new TreeNode("Kanaiyalal");

        root.left.right.left = new TreeNode("Jay");
        // root.left.right.right = new TreeNode("Punit");

        root.right.left = new TreeNode("DayaRam");
        root.right.right = new TreeNode("Azad");

        // List<String> ans = preorderIterative(root);
        // System.out.println(ans);


        List<String> post = postorderIterative(root);
        System.out.println(post); 

        List<String> post1 = postorderSingleStack(root);
        System.out.println(post1); 

        // =================================================================================================================================================================

        // TreeNode  ex = new TreeNode("A");
        // ex.left = new TreeNode("B");
        // ex.left.right = new TreeNode("E");
        
        // ex.left.left = new TreeNode("C");
        // ex.left.left.left = new TreeNode("D");
        
        // List<String> exin = inorderIterative(ex);
        // System.out.println(exin);

        // List<String> recPreorder = preorder(root);
        // System.out.println(recPreorder);

        // List<String> exi = inorder(ex);
        // System.out.println(exi);
        
    }
}
