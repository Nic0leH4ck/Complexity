public class Main {
    //o(logn)-space complexity
    //o(logn)-time complexity
    public int newNumber(int n){
        int newNumber = 0;
        while(n != 0){
            int num = n % 10;
            newNumber += num * num;
            n = n / 10;
        }
        return newNumber;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = isHappy(n);
        }

    }
}
}
