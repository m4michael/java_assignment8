
public class Q2 {
    
    //print all the Strings stored in odd indices of array

    public static void main(String arg[]){

        String[] arr={"ab","bc","cd","de","ef","fg","gh"};

        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
