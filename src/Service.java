import java.util.*;

public class Service {

    public static User addUser(String name,String email){
        return new User(name, email, UUID.randomUUID().toString());
    }

    public static Resturant addResturant(String name,String resId){
        return new Resturant(name,resId, UUID.randomUUID().toString());
    }

    public static Cart createCart(User user){
        //TODO : check if user doesnot already have a cart
        Cart c = new Cart();
        c.setUser(user);
        return c;
    }

    public static void addFriend(Cart c,User friend){
        c.getFriends().add(friend);
    }

    public static Item getItem(String name,int qua){
        return new Item(name,qua);
    }

    public static void linkRes(Cart c,Resturant r){
        c.setRes(r);
    }

    public static void addItem(Cart c,User u,Item i){//Thread saf3
        if(c.getMapping().get(u) == null){
            List<Item> iL = new ArrayList<>();
            iL.add(i);
            c.getMapping().put(u,iL);
        }else{
            c.getMapping().get(u).add(i);
        }

    }

    public static void removeItem(Cart c,User u,Item i){

        if(c.getMapping().get(u).contains(i)) { ;
            c.getMapping().get(u).remove(i);
        }else{
            System.out.println("Unauthorized");
        }
        //TODO : If user has no item, remove user from map
    }

    public static synchronized void changeQuantity(Item i,int quantity){
        i.setQuantity(quantity);
    }

    public static void checkout(Cart c,User u){
        if(c.getUser().equals((u))) {
            HashMap<String,Integer> order = new HashMap<>();
            Iterator<List<Item>> i = c.getMapping().values().iterator();
            while(i.hasNext()){
                List<Item> x =i.next();
                    if(x.size() > 0)
                        System.out.println(x);
            }

        }else{
            System.out.println("Unauthorized");
        }
    }

    public static void main(String args[]){
        User admin = addUser("admin","admin@email.com");
        User f1 = addUser("f1","f1@email.com");
        User f2 = addUser("f2","f1@email.com");

        Resturant res = addResturant("restaurant","123");

        Cart cart = createCart(admin);
        linkRes(cart,res);

        addFriend(cart,f1);
        addFriend(cart,f2);


        Item i1 = getItem("Paneer",2);
        Item i2 = getItem("Chicken",1);

        addItem(cart,admin,i1);
        addItem(cart,f1,i2);

        System.out.println("Cart is:"+cart);

        removeItem(cart,admin,i2);
        removeItem(cart,admin,i1);
        System.out.println("Cart is:"+cart);


        changeQuantity(i2,5);
        System.out.println("Cart is:"+cart);

        checkout(cart,admin);
    }
}
