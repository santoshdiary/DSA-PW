package BinarySearch;

public class squareRoot {


    public static void main(String[] args) {
       int ans= FindSR(24);
        System.out.println(ans);
        int ans1=bruteForceApproach(24);
        System.out.println(ans1);
    }
    static int FindSR(int sqr){
        int st=0;
        int en=sqr;
        int ans=-1;
        while(st<=en){
            int mid=st+(en-st)/2;

            if(mid*mid==sqr){
                return mid;
            }
            else if(mid*mid<sqr){
                st=mid+1;
                ans=mid;
            }
            else{
                en=mid-1;

            }

        }
        return ans;
    };

    static int bruteForceApproach(int sqr){
        int ans=-1;
        for(int i=0;i<=sqr;i++){
            int val=i*i;
            if(val<=sqr){
                ans=i;
            }
        }
        return ans;

    }
}
