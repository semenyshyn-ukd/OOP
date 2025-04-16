public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String creatorName) {
        System.out.println(this.name + ", " + creatorName + " опублікував новий пост! \n---------------");
    }
}