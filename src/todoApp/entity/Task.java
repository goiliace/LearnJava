package todoApp.entity;

public class Task {
    private int id;
    private String name;
    private String descriptions;
    private boolean isCompleted;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

}
