package ARRAYS;


public class TrappingRainWater {
    public static int TrappedWater(int height[]) {
        int n=height.length;//just taking a variable to store length of height so that we do not have to repeat writing
        int trappedWater=0;
        int width=1;

        //to calculate left max boundary in the form of an array which is actually the auxillary/helper array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //to calculate right max boundary in the form of an array which is actually the auxillary/helper array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        //loop
        for(int i=1;i<n;i++){
            //water level=min(left max boundary,right max boundary)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            //trapped water=(water level-height)*width
            trappedWater+=(waterLevel-height[i])*width;
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(TrappedWater(height));
    }
}
