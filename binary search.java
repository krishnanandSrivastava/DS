import java.util.*;
class Binary{
    public static int bs(int a[],int e){
        int l=0,r=a.length-1;
        int mid =(int)(l+r)/2;
        for(;l<=r;){
            if(a[mid]==e){return a[mid];}
            else if(e<a[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
            mid=(l+r)/2;
        }
        return -1;
    }
     public static void main(String[] args) {
         int a[]={1,2,3,4,5,6,7,8};
         System.out.println(bs(a, 8));

    }
}