class Solution {

  //TC: :O(N)  SC:O(1)
    public int missingNumber(int[] arr) {
        int xor = 0;
        for (int i = 0; i <= arr.length; i++) {
            xor = xor ^ i;
        } 
      
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;

    }
    //Missing number in range
   public int missingNumber(int[] arr, int start , int end) {
        int xor = 0;
        for (int i = start; i <=end ; i++) {
            xor = xor ^ i;
        }
      
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;

    }


  //  //TC: :O(N)  SC:O(N)
  public int missingNumber(int[] arr) {
        
        int n= arr.length;
        int[] hasharr= new int[n+1];

        for(int i=0;i<arr.length;i++){
                hasharr[arr[i]]++;
        }

        for(int i=0;i<hasharr.length;i++){
            if(hasharr[i]==0){
                return i;
            }
        }
        return -1;



    }

  
}
