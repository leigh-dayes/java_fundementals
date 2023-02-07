public class Dog {
    private String breed;
    private String name;
    private int height;
    private int length;
    private boolean is_hungry;
    enum Size {
        toy,
        small,
        medium, 
        large,
        x-large
    }
    private Size size;
    // no arg constructor
    public Dog() {
        breed = "Not assigned";
        name = "Not assigned";
        height = 0;
        length = 0;
        is_hungry = false;
        size = Size.medium;
    }
    // 1 arg constructor
    public Dog(String breed) {
        this.breed = breed;
        name = "Not assigned";
        height = 0;
        length = 0;
        is_hungry = false;
        size = Size.medium;
    }
    // all arg constructor
    public Dog(String breed, String name, int height, int length, boolean is_hungry, Size size) {
        this.breed = breed;
        this.name = name;
        this.height = height;
        this.length = length;
        this.is_hungry = is_hungry;
        this.size = Size.size;
    }

    void printBreed() {
        System.out.println(name + " is a " + breed);
    }
    void bark() {
        System.out.println("Woof!");
    }
    void printName() {
        System.out.println("My name is " + name);
    }
    //getters and setters
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setLength(int length) {
        this.length = length
    }
    public void setHungry(boolean is_hungry) {
        this.is_hungry = is_hungry
    }
    public void setSize(Size size) {
        this.size = Size.size;
    }
    public String getBreed(){
        return breed;
    }
    public String getName(){
        return name;
    }
    public int getHeight(){
        return height;
    }
    public int getLength(){
        return length;
    }
    public boolean getHungry(){
        return is_hungry;
    }
    public Size getSize(){
        return size;
    }
}