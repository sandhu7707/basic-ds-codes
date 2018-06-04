
import java.util.Scanner;


class stack{

    String[] st=new String[400];

    int top=-1;

    
    void push(String x)

		{
       
		top++;

        	st[top]=x;

        
    	}

    String pop()

	{

        if(top>=0)

		{

     		top--;

        	return this.st[top+1];

        	}

        	else
 
        	return "?";

    	}

    void show(){

        for(int i=0;i<=top;i++)

        {

            System.out.println(this.st[i]);

        }

    }

}



public class intopost {


	static boolean isInt(String y)

    {

        try{

        int q=Integer.parseInt(y);

        }

        catch(NumberFormatException e){

            return false;

        }

    
    return true;

    }


   
     public static void main (String args[])
	{

try{
        String a;

        Scanner sc = new Scanner(System.in);

        a=sc.nextLine();

        char x1[]=a.toCharArray();
	String x[]=new String[x1.length];
	int new_counter1=0,flag1=2;
	String temp;
	

	
	for(int i=0;i<x1.length;i++){
		temp=""+x1[i];
		
		if(isInt(temp))
		{
		 if(i==0){
			flag1=0;
			}
		 if(flag1==1)
			{
			x[new_counter1]=x[new_counter1]+temp;
			}

		 else if(flag1==0)
			{
			x[new_counter1]=""+temp;
			flag1=1;
			}
		

		}

		else{
			
			if(isInt(x[new_counter1]))
				{
				new_counter1++;
				}
			x[new_counter1]=temp;
			new_counter1++;
			flag1=0;
		}
	}






	String y[]=new String[x.length];

	String z;

        stack s1=new stack();

        int cp=10,lp=10,counter=0;

	for(int i=0;i<=new_counter1;i++)

	
		{

			if(x[i].equals("("))

				{

				 	s1.push(x[i]);

       				}

			else if(x[i].equals("^"))

				{

				 	s1.push(x[i]);

				}

			else if(x[i].equals("/")||x[i].equals("*")||x[i].equals("%"))

				{


					z=s1.pop();

					if(z.equals("^"))

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

			else if(x[i].equals("+")||x[i].equals("-"))

				{

				z=s1.pop();

				if(z.equals("/")||z.equals("*")||z.equals("%")||z.equals("^"))

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

			else if(x[i].equals(")"))

				{

				z=s1.pop();

				while(!x[i].equals("("))

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

		while(!z.equals("?"))

		{

		    y[counter]=z;

		    counter++;

		    z=s1.pop();


		}


		System.out.print("postfix : ");
		for(int i=0;i<counter;i++)

		{
	
		System.out.print(y[i]+"  ");

		}




		int[] calc=new int[y.length];

        	int new_counter=0;

        
        for(int i=0;i<counter;i++)

        	{

			
            	if(isInt(y[i]))

            	{

                calc[new_counter]=Integer.parseInt(y[i]);

		
                new_counter++;

            }

        
            else{
 
               if(y[i].equals("*")){

                    calc[new_counter-2]=calc[new_counter-1]*calc[new_counter-2];

                    new_counter=new_counter-1;

                }

                else if(y[i].equals("+")){

                    calc[new_counter-2]=calc[new_counter-1]+calc[new_counter-2];

                    new_counter=new_counter-1;

                }

                else if(y[i].equals("/")){

                    calc[new_counter-2]=calc[new_counter-1]/calc[new_counter-2];

                    new_counter=new_counter-1;

                }else if(y[i].equals("^")){

                    calc[new_counter-2]=(int)Math.pow(calc[new_counter-1],calc[new_counter-2]);

                    new_counter=new_counter-1;

                }else if(y[i].equals("-")){

                    calc[new_counter-2]=calc[new_counter-1]-calc[new_counter-2];

                    new_counter=new_counter-1;

                }else if(y[i].equals("%")){

                    calc[new_counter-2]=calc[new_counter-1]%calc[new_counter-2];

                    new_counter=new_counter-1;

                }

            }

        }
		System.out.println("");
		System.out.print("your thing evaluates to: ");
	
        System.out.print(calc[0] );
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("grow up,man enter numbers....");
}
    }


    
}
