public class mergesort{

    
    public static void mergesort(int[] A,int p,int r){

        if(p<r){
        int q = (p+r)/2;

        mergesort(A,p,q);

        mergesort(A,q+1,r);

        merge(A,p,q,r);

            
        }

    }

    
    static void merge(int[] A,int p,int q,int r){

        int n = q-p+1;

        int m = r-q;

        
        
	int[] x = new int[n+1];

        int[] y = new int[m+1];


        for(int i = 0 ; i<n ; i++)

        {

            x[i]=A[p+i];

        }

        for(int i = 0; i<m ; i++)

        {

            y[i]=A[q+i+1];

    
        }

        

        x[n]=2000000000;

        y[m]=2000000000;

        

        int i=0;

        int j=0;

        

        for(int k = p ; k<r+1 ; k++){

            if(x[i]<y[j]){

                A[k]=x[i];

                i++;

            }

            else{

                A[k]=y[j];

                j++;

            }

        }

        

    }

    

    
    public static void main(String args[]) {

        int[] array={21,32,34,2,12,42,13};

        mergesort(array,0,6);

        for(int i=0;i<array.length;i++){

            System.out.print(array[i]+" ");

        }

    }

}
