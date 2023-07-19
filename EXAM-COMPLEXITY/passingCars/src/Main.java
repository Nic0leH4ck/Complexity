public class Main {
    public static int passingCars(int[] a) {
        int i = 0;
        int j = i + 1;
        int sum = 0;

        while (i < a.length - 1 && j < a.length) {
            if (j == a.length - 1) {
                i++;
                j = i + 1;
            }
            if (a[i] != a[j]) {//if the  cars are not equal 0==1
                sum++;
                j++;
            } else {//if the cars equal 1==1/0==0
                j++;//move to the next index
            }
        }

        return sum;//the sum of cars passing
    }

    public static void main(String[] args) {
        int[] cars = {0, 1, 0, 1, 1};
        int passingCount = passingCars(cars);
        System.out.println("the number of cars that passed " + passingCount);
    }
}
