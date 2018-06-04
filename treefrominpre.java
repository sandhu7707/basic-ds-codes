//this programs demonstrates algo to create a binary tree from given inorder and preorder
import java.util.Scanner;


class Node{

    int data;

    Node left;

    Node right;

    Node(int d){

        data=d;

        left=null;

        right=null;

    }

}

class Btree{

    static Node root;

    
    static int search(int[] arr,int a,int b,int x){

        for(int i=a;i<=b;i++){

            if(arr[i]==x){

                return i;

            }

        }

        

        return -1;

    }

    

    static int prein = 0;

    static Node buildTree(int[] in,int [] pre,int istart,int iend){

        if(istart>iend){

            return null;

        }

        

        Node temp = new Node(pre[prein++]);

        

        if(istart==iend){

            return temp;

        }

        

        int inindex= search(in,istart,iend,temp.data);

        

        temp.left=buildTree(in,pre,istart,inindex-1);

        temp.right=buildTree(in,pre,inindex+1,iend);

        return temp;

    }

    

    static Node create(int[] in,int[] pre,int istart,int iend){

    
    root = buildTree(in,pre,istart,iend);

        return root;

    }

  
  
}


    






public class treefrominpre {

    
    static void intraversal(Node root){

        if(root!=null){

        intraversal(root.left);

        System.out.print(root.data+" ");

        intraversal(root.right);

        }

    }

    

    public static void main(String args[]) {

        int[] inorder = {1 ,2 ,3 ,4 ,5 ,7 };

        int[] preorder = {3 ,1 ,2 ,5 ,4 ,7};

        Btree mytree = new Btree();

        Node mytreeroot = mytree.create(inorder,preorder,0,5);

        
        intraversal(mytreeroot);

        
    }

}
