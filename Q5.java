

public class Q5 {

    //print the first peak element present in the array
    
    public static void main(String arg[] ){
    
        int [] arr={1,1,3,4,2,3,5,7,0};

        for(int i=1;i<arr.length-1;i++){

            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){


                System.out.println("First peak element="+arr[i]);
                break;
            }


        }
    }
    
}
