public  class Main{
public static int count(int[]a,int x){//declaring the variables
        int count=0;
        int low=0;
        int high=a.length-1;

        while(low<=high){//while we are the borders of the array
        int middle=low+(high-low)/2;

        if(a[middle]==x){
        count++;
        int left=middle-1;
        int right=middle+1;

        while(left>=0&&a[left]==x){
        count++;
        left--;
        }

        while(right<a.length&&a[right]==x){
        count++;
        right++;
        }

        break;
        }else if(a[middle]<x){
        low=middle+1;
        }else{
        high=middle-1;
        }
        }

        return count;
        }
        }
