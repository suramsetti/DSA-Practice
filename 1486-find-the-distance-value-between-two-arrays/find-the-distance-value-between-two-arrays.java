class Solution {
    Boolean to(int num,int arr2[],int n2,int d){
        for(int j=0;j<n2;j++){
            int n=Math.abs(num-arr2[j]);
            if(n<=d){
                return false;
            }
        }
        return true;
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n1=arr1.length;
        int n2=arr2.length;
        int c=0;
        for(int i=0;i<n1;i++){
            if(to(arr1[i],arr2,n2,d)){
                c++;
            }
        }
        return c;
    }
}