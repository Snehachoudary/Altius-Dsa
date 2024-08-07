class Test2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int k=2;//assume 2 rotations
        //reverse first k-1 values
        //reverse k to n-1 values
        //reverse whole array      [1,2,3,4]
        //[2,1,4,3]
        //[3,4,1,2]
        int n=a.length;
        /*for(int i=0;i<;i++)
        {
            int temp=a[i];//first element 
            a[i]=a[k];
            a[k]=a[i]; //k is 2 so decrement
            k--;
        }
        for(int i=k;i<(a.length-1);i++) //k to n-1
        {
            int temp=a[i];
         a[i]=a[a.length-n-i];
            a[a.length-i]=a[i];
        }
        //reverse whole array
        for(int i=0;i<a.length/2;i++)
        {
            int temp=a[i];
            a[i]=a[(n-i)-1];
            a[(n-i)-1]=temp;
            n--;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }*/
        //reverse whole array first

        for(int i=0;i<n/2;i++)
        {
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        
        int y=(k%a.length)-1;
        for(int i=0;i<y;i++)//in revrsed array reverse the first half[4,3,2,1]
        //3,4,2,1
        {
            int temp=a[i];
            a[i]=a[y];
            a[y]=temp;
            y--;
        }
        n=a.length-1;
        for(int i=k%a.length;i<n;i++)//for second half
        {
            int temp=a[i];
            a[i]=a[n];
            a[n]=temp;
            n--;//last index should be decremented
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
