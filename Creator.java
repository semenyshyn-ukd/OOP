import java.util.ArrayList;

public class Creator implements Observeble {
    public ArrayList<User> users;
    public ArrayList<String> posts;
    private String name;
    String post;
    int countPost;
    int followers;

    public Creator() {
        users = new ArrayList<User>();
        posts = new ArrayList<>();
        this.name = "Невідомий блог";
        this.post = "Новий пост";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void publicPosts() {
        this.posts.add(post);
        this.countPost += 1;
        notifyPost();
    }

    @Override
    public void add(User user) {
        users.add(user);
        followers += 1;
    }

    @Override
    public void remove(User user){
        users.remove(user);
    }

    @Override
    public void notifyPost(){
        for (User user : users) {
            user.update(this.name);
        }
    }
}