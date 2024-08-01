package week13.day85;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(1);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(2);
        arrayList2.add(6);

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(2);
        arrayList3.add(3);

        ArrayList<Integer> arrayList4 = new ArrayList<>();
        arrayList4.add(0);
        arrayList4.add(1);

        ArrayList<Integer> arrayList5 = new ArrayList<>();
        arrayList5.add(1);
        arrayList5.add(3);

        ArrayList<Integer> arrayList6 = new ArrayList<>();
        arrayList6.add(0);
        arrayList6.add(6);


        ArrayList<ArrayList<Integer>> arrList1 = new ArrayList<>();
        arrList1.add(arrayList1);
        arrList1.add(arrayList2);


        ArrayList<ArrayList<Integer>> arrList2 = new ArrayList<>();
        arrList2.add(arrayList3);
        arrList2.add(arrayList4);

        ArrayList<ArrayList<Integer>> arrList3 = new ArrayList<>();
        arrList3.add(arrayList3);
        arrList3.add(arrayList4);

        adj.add(arrList1);
        adj.add(arrList2);
        adj.add(arrList3);

        int[] dijkstra = dijkstra(3, adj, 2);
        System.out.println(Arrays.toString(dijkstra));
    }

    public static int[] dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj, int s) {
        final int INF = 100000000;  // A large number representing infinity
        Queue<Edge> minHeap = new PriorityQueue<>((e1, e2) -> Integer.compare(e1.wt, e2.wt));
        int[] dist = new int[adj.size()];
        Arrays.fill(dist, INF);
        dist[s] = 0;

        minHeap.add(new Edge(s, 0));

        while (!minHeap.isEmpty()) {
            Edge edge = minHeap.poll();
            int node = edge.node;

            for (ArrayList<Integer> nbrEdge : adj.get(node)) {
                int nbrNode = nbrEdge.get(0);
                int nbrWt = nbrEdge.get(1);

                if (edge.wt + nbrWt < dist[nbrNode]) {
                    dist[nbrNode] = edge.wt + nbrWt;
                    minHeap.add(new Edge(nbrNode, dist[nbrNode]));
                }
            }
        }

        return dist;
    }
}

class Edge {
    int node, wt;

    Edge(int node, int wt) {
        this.node = node;
        this.wt = wt;
    }
}
