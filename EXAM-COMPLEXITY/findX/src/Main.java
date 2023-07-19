public class Main {
  public boolean findX (int[]a,int x){
      if(a.length==1){
          return false;
          int low,top,mid;
          low=0;
          top=a.length-1;
          while(low<=high){
              mid=(low+high)/2;
              if(mid==a.length-1)
                  return false;
              if((a[mid]+a[mid+1])==x)
                  return true;
              else if(a[mid]+a[mid=1]>x)
                  top=mid-1;
              else low=mid+1;
          }

      }
      return false;
  }
}