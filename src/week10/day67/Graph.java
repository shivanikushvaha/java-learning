package week10.day67;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph<T> {
    private Map<T, List<T>> map = new HashMap<>();

    public void addVertex(T s) {
        map.put(s, new LinkedList<>());
    }

    public void addEdge(T source, T destination, boolean bidirectional) {
        if (!map.containsKey(source))
            addVertex(source);
        if (!map.containsKey(destination))
            addVertex(destination);
        map.get(source).add(destination);
        if (bidirectional)
            map.get(destination).add(source);
    }

    public void getVertexCount() {
        System.out.println("The graph has " + map.keySet().size() + " vertex");
    }

    // This function gives the count of edges
    public void getEdgesCount(boolean bidirection) {
        int count = 0;
        for (T v : map.keySet()) {
            count += map.get(v).size();
        }
        if (bidirection == true) {
            count = count / 2;
        }
        System.out.println("The graph has " + count + " edges.");
    }

    public void neighbours(T s) {
        if (!map.containsKey(s))
            return;
        System.out.println("The neighbours of " + s + " are");
        for (T w : map.get(s))
            System.out.print(w + ",");
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }

    public static void main(String[] args) {
        Graph<Integer> g = new Graph<Integer>();

        g.addEdge(0, 1, true);
        g.addEdge(0, 4, true);
        g.addEdge(1, 2, true);
        g.addEdge(1, 3, true);
        g.addEdge(1, 4, true);
        g.addEdge(2, 3, true);
        g.addEdge(3, 4, true);

        System.out.println("Graph:\n" + g.toString());

        // Gives the no of vertices in the graph.
        g.getVertexCount();

        // Gives the no of edges in the graph.
        g.getEdgesCount(true);
        g.neighbours(0);
    }

}
