import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Іван");
        User user2 = new User("Марія");
        User user3 = new User("Петро");
        User user4 = new User("Олена");

        Creator creator1 = new Creator();
        creator1.setName("Якийсь блог");

        creator1.add(user1);
        creator1.add(user3);

        creator1.publicPosts();

        Creator creator2 = new Creator();
        creator2.setName("Інший блог");

        creator2.add(user2);
        creator2.add(user4);

        creator2.publicPosts();
    }
}
