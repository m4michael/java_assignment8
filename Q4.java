

public class Q4 {

    //print the smallest element present in the array
    
    public static void main(String arg[]){

        int [] arr={2,-3,5,8,1,0,-4};

        int min=arr[0]; // assuming first element is smallest element

        for(int i=1;i<arr.length;i++){

            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("smallest element="+min);
    }
}
