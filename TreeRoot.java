package binsrytreemain;

import java.util.ArrayList;
import java.util.Iterator;

public class TreeRoot {

    TreeNode root;

    // WAS ALRIGHT
    public TreeNode Travel(TreeNode root, int value) {
        //THE FIRST VALUE WILL ALWAYS BE THE ROOT VALUE
        if (root == null) {
            return new TreeNode(value);
        }
        //IF THE NEXT VALUE IS GREATER/LESS THAN THE ROOT NODE ADD VALUE  TO THE POINTER NODES
        if (value < root.value) {
            root.left = Travel(root.left, value);
        } else if (value > root.value) {
            root.right = Travel(root.right, value);
        } else {
            return root;
        }

        return root;
    }

    //ADDING AND TRAVERSING ARE DIFERENT METHODS SO U NEED TO TRAVERSE FIRST AND FIND WHERE TO ADD
    public void add(int value) {
        root = Travel(root, value);
    }

    // BIG HEADACHE
    private TreeNode TraverseDeletion(TreeNode root, int value) {
        // WHAT ARE YOU GONNA DELETE IF THERE IS NOTHING IN THE TREE
        if (root == null) {
            return null;
        }
        // IF VALUE MATCHES THEN FIGURE IT OUT
        if (value == root.value) {
            if (root.left != null && root.right != null) {

                //WHEN THERES 2 CHILDREN AT A NODE
            }
            // IF IT GOT ATLEAST A CHILD
            if (root.left == null) {
                root = root.right;
            }
            if (root.right == null) {
                root = root.left;
            } else {
                //GOT NO CHILDREN 
                return null;
            }

        }
        // IF THE VALUE IS GREATER/LESS THAN THE ROOT VALUE THEN TRVERSE FURTHER
        //LESS THAN --->
        if (value < root.value) {
            root.left = TraverseDeletion(root.left, value);
            return root;
        }   //GREATER THAN
        root.right = TraverseDeletion(root.right, value);
        return root;
    }

    //WAS THE EASIEST PART
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" " + root.value);
        }
    }

    // GAVE ME A HEADACHE
    public void breadTravel() {
        ArrayList<TreeNode> q = new ArrayList();
        //I STILL DONT KNOW WHY WE NEED THIS
        Iterator it = q.iterator();
        //THE Q MUST HAVE ATLEAST 1 VALUE IF YOU WANT TO LOOP
        q.add(root);
        //IF THE Q HAS A VALUE THEN LOOP
        while (it.hasNext()) {
            root = q.remove(0);
            System.out.print(" " + root.value);
            //IF THE LEFT CHILD HAS VALUE THEN ADD THE LEFT CHILD TO Q
            if (root.left != null) {
                q.add(root.left);
            }
            //IF THE RIGHT CHILD HAS VALUE ADD THE RIGHT CHILD TO Q
            if (root.right != null) {
                q.add(root.right);
            }
        }
    }
}
