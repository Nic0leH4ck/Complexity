public class Main {
  public class Range {
      private int_center, _radius;
      public Range (int c,int r)
      {
          _center = c;
          _radius = r;
      }
      public  int getCenter(){
          return _center;
      }
      public int getRadius(){
          return _Radius;
      }
  }
  public static int findNum(Range rangeA[],int num){
      int high = rangeA.length-1,low = 0 ;
      int mid ;
      while (low<=high){
          mid =(low+high)/2;
          if(num<=rangeA[mid.getCenter()+rangeA[mid].gerRadius()&& num>=rangeA[mid].getCenter()-rangeA[mid].getRadius())      {
              return mid;
          } else if(num>rangeA[mid].getCenter()+rangeA[mid].getRadius()){
              low = mid +1;
          }
           else if (num<rangeA[mid].getCenter()-rangeA[mid].getRadius()){
               high = mid-1;
          }
  }
      return -1;

}