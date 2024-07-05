package week10.day68;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s, boolean[] vis) {
        Queue<Node> q = new LinkedList<>(); //BFS
        q.add(new Node(s, -1));
        vis[s] = true;

        while (!q.isEmpty()) {
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove();

            for (Integer it : adj.get(node)) {
                if (vis[it] == false) {
                    vis[it] = true;
                    q.add(new Node(it, node));
                } else if (par != it) return true;
            }
        }

        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++)
            if (vis[i] == false)
                if (checkForCycle(adj, i, vis))
                    return true;

        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        Solution obj = new Solution();
        boolean ans = obj.isCycle(4, adj);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");
    }

    static class Node {
        int first;
        int second;

        public Node(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
