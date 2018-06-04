public class qsort {


    public static void quicksort(int[] array,int p,int r){

        if(p< r){

            int q = partition(array,p,r);

            quicksort(array,p,q-1);

            quicksort(array,q,r);

        }

    }

    

    static int partition(int[] arr, int p , int r){

        int x= arr[r],temp;

        int i= p-1;

        for(int j=p ; j<r ; j++){

            if(arr[j]<=x){

                i++;

                temp=arr[j];

                arr[j]=arr[i];

                arr[i]=temp;

            }

        }

        

        arr[r]=arr[i+1];

        arr[i+1]=x;

        

        return i+1;

    }


    


    

    public static void main(String args[]) {


    
    int[] array={21,32,34,2,12,42,13};


    
    quicksort(array,0,6);


    
    for(int i=0;i<array.length;i++){


    
        System.out.print(array[i]+" ");


        }


    }


}

