package week1.day7;

import java.util.List;

public class Comment {
    private Integer id;
    private String comment;
    private Integer likes;
    private List<User> userList;

    public Comment() {
    }

    public Comment(Integer id, String comment, Integer likes, List<User> userList) {
        this.id = id;
        this.comment = comment;
        this.likes= likes;
        this.userList = userList;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Integer getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public Integer getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", likes=" + likes +
                ", userList=" + userList +
                '}';
    }
}
