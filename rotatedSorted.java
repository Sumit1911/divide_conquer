import java.lang.annotation.Target;

public class rotatedSorted {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        // rotSortedArr(arr, 0, arr.length-1, 0);

        int tar = 0;
        int tarIdx = search(arr, tar, 0, arr.length-1);
        System.out.println(tarIdx);

    }
    public static void rotSortedArr(int arr[], int si, int ei, int target) {
        if(si>ei) {
            System.out.println(-1);
        }
       
        int mid = (si+ei)/2;
        if(arr[mid] == target) {
            System.out.println(mid);
            return;
        }

        if(arr[si]<=arr[mid]) {  //mid on L1
            if(arr[si]<=target && target<=arr[mid]) {
                rotSortedArr(arr, si, mid, target);
            } else {
                rotSortedArr(arr, mid+1, ei, target);
            }
        } else { //mid on L2
            if(arr[mid]<=target && target<=arr[ei]) {
                rotSortedArr(arr, mid+1, ei, target);
            } else {
                rotSortedArr(arr, si, mid, target);
            }
        }
    }

    //from apna college
    public static int search(int arr[], int tar, int si, int ei) {
        if(si>ei) {
            return -1;
        }
        int mid = si + (ei-si)/2;
        if(arr[mid] == tar) {
            return mid;
        }
        if(arr[si]<=arr[mid]) {
            if(arr[si]<=tar && tar<=arr[mid]) {
                return search(arr, tar, si, mid-1);
            } else {
                return search(arr, tar, mid+1, ei);
            }
        } else {
            if(arr[mid]<=tar && tar<=arr[ei]) {
                return search(arr, tar, mid+1, ei);
            } else {
                return search(arr, tar, si, mid-1);
            }
        }
    }

}
