public class ContainerWithMostWater{
    public static void main(String args[]){
        int[] h={1,8,6,2,5,4,8,3,7};
        int left=0;
        int right =h.length-1;
        int most_water=0;
        while(left<right){
            int len=Math.min(h[left],h[right]);
            int width=right-left;
            most_water=Math.max(most_water,len*width);
            if(h[left]<h[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(most_water);
    }
}