public class User {

    private String name;
    private String id;
    private String email;
    //TODO : add list of valid friends & allow only those to be added

    public User(String name, String email , String id) {
        this.name = name;
        this.id = id;
        this.email = email;//TODO : Unique check in DB
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +

                ", email='" + email + '\'' +
                '}';
    }
}
