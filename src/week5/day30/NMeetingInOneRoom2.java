package week5.day30;

import java.util.Arrays;

class NMeetingInOneRoom2 {

    static class Meeting {
        int st;
        int end;

        public Meeting(int s, int e) {
            this.st = s;
            this.end = e;
        }
    }

    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int[] start, int[] end, int n) {
        Meeting[] arr = new Meeting[n];
        for (int i = 0; i < n; i++) {
            Meeting m = new Meeting(start[i], end[i]);
            arr[i] = m;
        }

        for (Meeting meeting : arr)
            System.out.println(meeting.st + " -- " + meeting.end);

        Arrays.sort(arr, (a, b) -> a.end - b.end);
        System.out.println("-----------------------------");
        for (Meeting meeting : arr)
            System.out.println(meeting.st + " -- " + meeting.end);

        int ans = 1;
        int last = arr[0].end;

        for (int i = 1; i < n; i++) {
            if (arr[i].st > last) {
                ans++;
                last = arr[i].end;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] start = new int[]{1, 3, 0, 5, 8, 5};
        int[] end = new int[]{2, 4, 6, 7, 9, 9};
        int n = 6;

        int i = NMeetingInOneRoom2.maxMeetings(start, end, n);
        System.out.println(i);

    }
}