package blog.tech.salman.libx.model;


public class MemberCategory {
    // Field
    private int id;
    private int name;

    // Constructor
    public MemberCategory(int name) {
        this.name = name;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getName() { return name; }

    public void setName(int name) { this.name = name; }
}
