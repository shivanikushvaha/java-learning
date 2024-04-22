package day7;

import java.util.List;

public class Product {
    private String name;
    private String type;
    private Float price;
    private List<String> tagList;
    private List<Comment> commentList;

    public Product() {
    }

    public Product(String name, String type, Float price, List<String> tagList, List<Comment> commentList) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.tagList = tagList;
        this.commentList = commentList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setTags(List<String> tagList) {
        this.tagList = tagList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Float getPrice() {
        return price;
    }

    public List<String> getTags() {
        return tagList;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", tagList=" + tagList +
                ", commentList=" + commentList +
                '}';
    }
}
