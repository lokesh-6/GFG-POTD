import java.util.*;

class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int n, int start[], int end[]) {
        // add your code here
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=start[i];
            arr[i][1]=end[i];
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
         int count = 0;
        int lastEndTime = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] > lastEndTime) {
                count++;
                lastEndTime = arr[i][1];
            }
        }
        return count;
    }
}

public class N_Meetings {
    
}
