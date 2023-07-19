public class Main {
    public static int minimalPositive(Range[] rangeA) {
        int low = 0, high = rangeA.length - 1;

        while (low < high) {

            int mid = (low + high) / 2;

            if (rangeA[mid].getSmall() < 0 && rangeA[mid].getBig() > 0)
                return 1;

            else if (rangeA[mid].getSmall() > 0)
                high = mid - 1;
            else
                low = mid + 1;
        }

        if (rangeA[low].getSmall() > 0)
            return rangeA[low].getSmall();

        else if (rangeA[low].getBig() > 0)
            return rangeA[low].getBig();

        return -1;
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
}