class Q1{

    public static void main(String arg[]){

        //print only positive integers present in the array

        int [] arr= {2,6,-5,-1,0,4,-9};

        for(int i=0;i<arr.length;i++){

            if(arr[i]>=0){

                System.out.println(arr[i]);
            }
        }
    }
}