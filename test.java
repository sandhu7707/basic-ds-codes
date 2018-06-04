
//this program converts infix expressions (represented with variables ) to postfix

import java.util.Scanner;


class stack{

    char[] st=new char[400];

    int top=-1;

    
    void push(char x)

		{
       
		top++;

        	st[top]=x;

        
    	}

    char pop()

	{

        if(top>=0)

		{

     		top--;

        	return this.st[top+1];

        	}

        	else
 
        	return '?';

    	}

    void show(){

        for(int i=0;i<=top;i++)

        {

            System.out.print(this.st[i]);

        }

    }

}



public class test {

   
    public static void main (String args[])
	{

        String a;

        Scanner sc = new Scanner(System.in);

        a=sc.nextLine();

        char x[]=a.toCharArray();

	char y[]=new char[x.length];

	char z;

        stack s1=new stack();

        int cp=10,lp=10,counter=0;

	for(int i=0;i<x.length;i++)

	
		{

			if(x[i]=='(')

				{

				 	s1.push(x[i]);

       				}

			else if(x[i]=='^')

				{

				 	s1.push(x[i]);

				}

			else if(x[i]=='/'||x[i]=='*'||x[i]=='%')

				{

					z=s1.pop();

					if(z=='^')

						{

						y[counter]=z;

						counter++;

						}

					else

						{

						s1.push(z);

						}

					
 s1.push(x[i]);

				}

			else if(x[i]=='+'||x[i]=='-')

				{

				z=s1.pop();

				if(z=='/'||z=='*'||z=='%'||z=='^')

					{

				    	y[counter]=z;

			    		counter++;

		    			}

				else

					{

						s1.push(z);

	    				}

				s1.push(x[i]);

				}

			else if(x[i]==')')

				{

				z=s1.pop();

				while(z!='(')

					{

					y[counter]=z;

					counter++;

					z=s1.pop();

					}

				}

			else

				{

				y[counter]=x[i];

				counter++;

				}

		}

		z=s1.pop();

		while(z!='?')

		{

		    y[counter]=z;

		    counter++;

		    z=s1.pop();

		}

		for(int i=0;i<counter;i++)

		{
	
		System.out.print(y[i]+" ");

		}

    }


    
}
