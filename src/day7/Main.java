package day7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> userList1 = new ArrayList<>();
        User u1 = new User(1, "AAA", "nn", "12/3/2009");
        User u2 = new User(2, "BBB", "mm", "11/2/2000");

        userList1.add(u1);
        userList1.add(u2);

        List<User> userList2 = new ArrayList<>();
        User u3 = new User(3, "CCC", "ll", "2/3/2000");
        User u4 = new User(4, "DDD", "kk", "1/1/1999");

        userList2.add(u3);
        userList2.add(u4);

        List<Comment> commentList1 = new ArrayList<>();
        Comment c1 = new Comment(11, "good", 20012, userList1);
        Comment c2 = new Comment(12, "bad", 1000, userList2);

        commentList1.add(c1);
        commentList1.add(c2);

        List<Comment> commentList2 = new ArrayList<>();
        Comment c3 = new Comment(13, "Fine", 13000, userList1);
        Comment c4 = new Comment(14, "Good", 23009, userList2);

        commentList2.add(c3);
        commentList2.add(c4);

        List<Product> productList = new ArrayList<>();
        Product p1 = new Product("i phone", "Electronic", 30000.12f, List.of("phone",
                "mobile"), commentList1);
        Product p2 = new Product("tv", "Electronics", 320987.23f, List.of("television", "tv"), commentList2);

        productList.add(p1);
        productList.add(p2);

        System.out.println(productList);
    }


}
