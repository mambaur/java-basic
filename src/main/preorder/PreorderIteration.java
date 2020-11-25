package main.preorder;

import java.util.Stack;

public class PreorderIteration {
    public static void main(String[] args) {
        /* Construct below tree
                   1
                 /   \
                /     \
               2       3
              /      /  \
             /      /    \
            4      5      6
                  / \
                 /   \
                7     8
		*/
        Node2 root = new Node2(1);
        root.left = new Node2(2);
        root.right = new Node2(3);
        root.left.left = new Node2(4);
        root.right.left = new Node2(5);
        root.right.right = new Node2(6);
        root.right.left.left = new Node2(7);
        root.right.left.right = new Node2(8);

        preOrder(root);
    }

    public static void preOrder(Node2 root){
        if(root == null){
            return;
        }
        Stack<Node2> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()){
            Node2 curr = stack.pop();
            System.out.print(curr.data+" ");

            if (curr.right!=null){
                stack.push(curr.right);
            }

            if (curr.left!=null){
                stack.push((curr.left));
            }
        }
    }
}

class Node2{
    int data;
    Node2 right, left;
    public Node2(int key){
        data = key;
        right = left = null;
    }
}
