package dsa;

public class JumpSearch {
    public static int search(int[] arr, int target) { //brute force
        var blockSize = (int) Math.sqrt(arr.length);
        var start = 0;
        var next = blockSize;
        var end = 0;

        while(next < arr.length) {
            if (arr[next-1] >= target) {
                end = next - 1;
                if (end < blockSize)
                    start = 0;
                else
                    start = end - blockSize;
                break;
            }
            next += blockSize;
        }

        if(next >= arr.length) {
            end = arr.length - 1;
            start = end - blockSize;
        }

        for (int i = start; i <= end; i++)
            if (arr[i] == target)
                return i;

        return -1;
    }
}
