/*this program shows how you can create a BST and inorder, preorder, postorder traversals*/

import java.util.Scanner;


class tNode{

    int data;

    tNode right;

    tNode left;

    tNode(int d){

        data=d;

        left=null;

        right=null;

    }

}

 

class BST{

    static tNode root;

    BST(int value){

        tNode temp = new tNode(value);

        root=temp;

    }

    

    public static void addtotree(int value){

        tNode temp = root;

        tNode n = new tNode(value);

        while(value<temp.data && temp.left!=null){

            temp=temp.left;

        }

        while(value>temp.data && temp.right!=null){

            temp=temp.right;

        }

        if(value<temp.data){

            temp.left=n;

        }

        else temp.right=n;

    }

    
    public static tNode getroot(){

        return root;

    }

}

   

public class binarySearchTree{

     public static void inordertraversal(tNode start){

           if(start!=null){

	   	inordertraversal(start.left);
	
   	System.out.print(start.data+" ");

	        inordertraversal(start.right);

    	  }

    }


    
public static void postordertraversal(tNode start){

    	if(start!=null){

            postordertraversal(start.left);

            postordertraversal(start.right);

            System.out.print(start.data+" ");

        }

    }

    

    public static void preordertraversal(tNode start){

        if(start!=null){

            

            System.out.print(start.data+" ");

            preordertraversal(start.left);

            preordertraversal(start.right);

        }

    }

    

    

    

    public static void main(String args[]) {

    
    

        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();

        BST mytree = new BST(x);

        while(sc.hasNextInt()){

            x=sc.nextInt();

            mytree.addtotree(x);

        }

        

        tNode start = mytree.getroot();

        inordertraversal(start);

        System.out.println();

        preordertraversal(start);

        System.out.println();

        postordertraversal(start);

    }

}

