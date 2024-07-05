package week10.day67;

import java.util.ArrayList;

public class GraphDFS {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] vis = new boolean[V + 1];

        return dfs(0, vis, adj, list);
    }

    private ArrayList<Integer> dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list) {
        vis[node] = true;
        list.add(node);

        for (Integer it : adj.get(node)) {
            if (vis[it] == false) {
                dfs(it, vis, adj, list);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        GraphDFS sl = new GraphDFS();
        ArrayList<Integer> ans = sl.dfsOfGraph(5, adj);
        int n = ans.size();
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
