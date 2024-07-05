package week10.day67;

public class NumberOfProvinces {
    public static void main(String[] args) {
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int circleNum = findCircleNum(isConnected);
        System.out.println(circleNum);
    }

    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                dfs(i, isConnected, visited);
                count++;
            }
        }
        
        return count;
    }

    private static void dfs(int i, int[][] isConnected, boolean[] visited) {
        int n = isConnected.length;

        for (int j = 0; j < n; j++) {
            if (isConnected[i][j] == 1 && visited[j] == false) {
                visited[j] = true;
                dfs(j, isConnected, visited);
            }
        }
    }
}
