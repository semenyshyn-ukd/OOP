public class Food {
    protected String name;
    protected enum Category {МЯСО, ТРАВА, КРУПИ};
    protected boolean hungry;
    Category category;

    public Food(String name, boolean hungry, Category category) {
        this.name = name;
        this.hungry = hungry;
        this.category = category;
    }

    public String getName() {return name;}
    public boolean isHungry() {return hungry;}
    public Category getCategory() {return category;}

    public void setName(String name) {this.name = name;}
    public void setHungry(boolean hungry) {this.hungry = hungry;}
    public void setCategory(Category category) {this.category = category;}
}
