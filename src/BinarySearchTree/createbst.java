package BinarySearchTree;

public class createbst {  
		  
	    //Represent a node of binary tree  
	    public static class Node{  
	        int data;  
	        Node left;  
	        Node right;  
	  
	        public Node(int data){  
	            //Assign data to the new node, set left and right children to null  
	            this.data = data;  
	            this.left = null;  
	            this.right = null;  
	        }  
	      }  
	  
	      //Represent the root of binary tree  
	      public Node root;  
	  
	      public createbst(){  
	          root = null;  
	      }  
	  
	      //insert() will add new node to the binary search tree  
	      public void insert(int data) {  
	          //Create a new node  
	          Node newNode = new Node(data);  
	  
	          //Check whether tree is empty  
	          if(root == null){  
	              root = newNode;  
	              return;  
	            }  
	          else {  
	              //current node point to root of the tree  
	              Node current = root, parent = null;  
	  
	              while(true) {  
	                  //parent keep track of the parent node of current node.  
	                  parent = current;  
	  
	                  //If data is less than current's data, node will be inserted to the left of tree  
	                  if(data < current.data) {  
	                      current = current.left;  
	                      if(current == null) {  
	                          parent.left = newNode;  
	                          return;  
	                      }  
	                  }  
	                  //If data is greater than current's data, node will be inserted to the right of tree  
	                  else {  
	                      current = current.right;  
	                      if(current == null) {  
	                          parent.right = newNode;  
	                          return;  
	                      }  
	                  }  
	              }  
	          }  
	      }  
	      //inorder() will perform inorder traversal on binary search tree  
	      public void inorderTraversal(Node node) {  
	  
	          //Check whether tree is empty  
	          if(root == null){  
	              System.out.println("Tree is empty");  
	              return;  
	           }  
	          else {  
	  
	              if(node.left!= null)  
	                  inorderTraversal(node.left);  
	              System.out.print(node.data + " ");  
	              if(node.right!= null)  
	                  inorderTraversal(node.right);  
	  
	          }  
	      }  
	  
public static void main(String[] args) {  
	  
    createbst bt = new createbst();  
    //Add nodes to the binary tree  
    bt.insert(56);  
    bt.insert(30);  
    bt.insert(70);  
    bt.insert(22);  
    bt.insert(40);  
    bt.insert(60);  
    bt.insert(95);
    bt.insert(11);
    bt.insert(03);
    bt.insert(16);
    bt.insert(65);
    bt.insert(63);
    bt.insert(97);
    System.out.println("Binary search tree after insertion:");  
    //Displays the binary tree  
    bt.inorderTraversal(bt.root);
}

}