package week13.day85;

import java.util.ArrayList;

public class Test {
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

        System.out.println(adj);

        System.out.println(adj.get(2));

    }
}
