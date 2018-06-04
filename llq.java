//this program shows implementation of queue using linked lists


import java.util.Scanner;


class qNode{

    int data;

    qNode next;

    qNode(int d){

        data=d;

        next=null;

    }

}


class queue{

    static qNode front;

    static qNode rear;

    static int size;

    queue(int value){

        qNode temp = new qNode(value);

        front=temp;

        rear=temp;

        size=1;

    }

    

    public static void enq(int value){

        qNode temp = new qNode(value);

        rear.next=temp;

        rear=temp;

        size++;

    }

    

    public static int deq(){

        int temp = front.data;

        front=front.next;

        size--;

        return temp;

    }

    

    public static int getsize(){

        return size;

    }

    

    public static void traverse(){

        qNode temp = front;

        while(temp!=null){

            System.out.print(temp.data);

            temp=temp.next;

        }

        System.out.println();

    }

}


public class llq{

    
    public static void main(String args[]) {

        

        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();

        queue myq = new queue(x);

        while(sc.hasNextInt()){

            x=sc.nextInt();

            myq.enq(x);

        }

        

        x = myq.getsize();

        System.out.println(x);

        myq.traverse();

        System.out.println("deq : " + myq.deq());

        myq.traverse();

        
    }

}

