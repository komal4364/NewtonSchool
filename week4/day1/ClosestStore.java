package day1;
import java.util.Arrays;

//fix it
public class ClosestStore {
    public static void main(String[] args) {
        int []houses = {1, 4, 2, 5, 3, 9, 12};
        int []stores = {2, 7, 4};
        closestStore(houses, stores);
    }
    private static int findClosetStore(int house, int[]stores) {
        int closestStore = -1;
        int start=0, end=stores.length-1;
        int minDist = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end-start)/2;
            int diff = Math.abs(stores[mid]-house);
            if (diff == 0) {
                closestStore = stores[mid];
                break;
            } else if (diff < minDist) {
                minDist = diff;
                closestStore = stores[mid];
            }

            if (stores[mid] < house) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return closestStore;
    }

    private static void closestStore(int []houses, int []stores) {
        int []result = new int[houses.length];
        Arrays.sort(stores);
        for (int i=0; i < houses.length; i++) {
            result[i] = findClosetStore(houses[i], stores);
        }
        System.out.println(Arrays.toString(result));
    }
}
