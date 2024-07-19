import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Queue;


class TreeNode{

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){ this.data = data;}
    TreeNode(int data , TreeNode l , TreeNode r)
    {
        this.data = data;
        this.left = l;
        this.right = r;
    }
}

public class levelOrder {
    
    public static List<List<Integer>> levelOrderTravesal(TreeNode root){
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        if (root == null) 
            return ans;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> temp = new LinkedList<Integer>();

            for(int i = level; i > 0; i--){
                if(queue.peek().left != null)   queue.offer(queue.peek().left);
                if(queue.peek().right != null)   queue.offer(queue.peek().right);

                temp.add(queue.poll().data);
            }
            ans.add(temp);
        }
        return ans;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(18);
        root.right.right = new TreeNode(22);

        List<List<Integer>> level = levelOrderTravesal(root);
        System.out.println(level);
    }
}
