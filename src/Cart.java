import javafx.util.Pair;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Cart {

    String id;
    User user;
    Resturant res;
    Set<User> friends = new HashSet<>();//So that same friend is not added twice;
    //List<Item> items = new ArrayList<>();//TODO : redundant remove
    ConcurrentHashMap <User,List<Item>> mapping = new ConcurrentHashMap<>();


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Resturant getRes() {
        return res;
    }

    public void setRes(Resturant res) {
        this.res = res;
    }

    public Set<User> getFriends() {
        return friends;
    }

    public void setFriends(Set<User> friends) {
        this.friends = friends;
    }

    public ConcurrentHashMap<User, List<Item>> getMapping() {
        return mapping;
    }

    public void setMapping(ConcurrentHashMap<User, List<Item>> mapping) {
        this.mapping = mapping;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "user=" + user +
                ", res=" + res +
                ", friends=" + friends +
                ", mapping=" + mapping +
                '}';
    }
}
