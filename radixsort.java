public class radixsort {


    static int max(int[] arr){

        int n=arr.length;

        int largest = arr[0];

        

        for(int i=0;i<n;i++){

        
    
            if(largest<arr[i]){

              	  largest=arr[i];

                }

        }

        

        return largest;

    }



    public static void radixsort(int[] arr){

        int max=max(arr);

        for(int i=1;max/i>0;i*=10 ){

            countsort(arr,i);

        }

    }

    


    static void countsort(int[] arr,int i){

        

        int n=arr.length;

        int[] output = new int[n];

        int[] count = {0,0,0,0,0,0,0,0,0,0};

        

        for(int j=0; j<n;j++){

            count[(arr[j]/10)%10]++;
 
        }

        
 
       for(int j=1;j<10;j++){

            count[j]+=count[j-1];

        }

        

        for(int j=n-1;j>=0;j--){

            output[count[(arr[j]/10)%10]-1]=arr[j];

            count[(arr[j]/10)%10]--;

        }

        

        for(int j=0;j<n;j++){

            arr[j]=output[j];
    
    }

    }



    


    

    public static void main(String args[]) {


    
    int[] array={21,32,34,2,12,42,13};


    
    radixsort(array);


    
    for(int i=0;i<array.length;i++){


    
    
    System.out.print(array[i]+" ");


    
    }


  
  }


}

