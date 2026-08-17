class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxElement = -1; 

        for(int i=n-1; i>=0; i--){
          
          int current = arr[i];
          arr[i] = maxElement;

          if (current > maxElement) {
            maxElement = current;
            
         }

          if(i == n-1) {
             arr[n-1] = -1;
           }

        }

        return arr;
    }
}