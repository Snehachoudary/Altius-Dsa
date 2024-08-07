import java.util.*;
class Test
{
     public static void main(String[] args) {
        int a[]={-1,2,3,4,-5};
        //int temp=0;//first temporary index
        int sum=0;
        int ans=Integer.MIN_VALUE;
        /*for(int i=0;i<a.length;i++)
        {
            if(sum+a[i]<=0)//if my array contains negative elements dont include in my sum
            {
                sum=0;
            }
            sum+=a[i];
            ans=Math.max(ans,sum);//compare the cursum with the max value
        }
        System.out.println(ans);*/
        for(int i=0;i<a.length;i++)
        {
            sum=Math.max(a[i],sum+a[i]);//consider only the positive sum
            ans=Math.max(ans,sum);//compare the positive sum with ans

        }
        System.err.println(ans);
        //Space complexity O(1);
        //time complexity O(n);
    }
}