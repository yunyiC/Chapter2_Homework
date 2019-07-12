package chapter.android.aweme.ss.com.homework;

public class User {
    private static int idCount = 0;
    public int id;
    public String name;
    public String description;
    public float time;

    public User(String name, String description, float time) {
        idCount++;
        this.id = idCount;
        this.name = name;
        this.description = description;
        this.time = time;
    }
}
