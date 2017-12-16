public class Resturant {

    private String name;
    private String id;
    private String resId;

    public Resturant(String name,String resId, String id) {
        this.name = name;
        this.id = id;
        this.resId = resId;//TODO : Unique check in DB
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
        return "Resturant{" +
                "name='" + name + '\'' +

                ", resId='" + resId + '\'' +
                '}';
    }
}
