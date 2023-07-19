public class Main {

        public static boolean pythagoreanTriple(int[] arr) {
            int n = arr.length;
            for (int i = 2; i < n; i++) {
                int c = arr[i];
                int a = 0;
                int b = i - 1;
                while (a < b) {
                    if (arr[a] * arr[a] + arr[b] * arr[b] == c * c) {
                        return true;//fpund the triplet
                    } else if (arr[a] * arr[a] + arr[b] * arr[b] < c * c) {
                        a++;
                    } else {
                        b--;
                    }
                }
            }
            return false;
        }
}//end main