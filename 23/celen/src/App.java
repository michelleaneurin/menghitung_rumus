// Parent class (Inheritance)
class Pet {
    // Private access modifier (Encapsulation)
    private String name;
    private int age;
    
    // Super Constructor
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Encapsulation: Getter & Setter
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Public method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Child class (Inheritance)
class Dog extends Pet {
    private String breed;
    
    // Super Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    // Encapsulation: Getter & Setter
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}

// Child class (Inheritance)
class Cat extends Pet {
    private boolean isIndoor;
    
    // Super Constructor
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }
    
    // Encapsulation: Getter & Setter
    public boolean isIndoor() {
        return isIndoor;
    }
    
    public void setIndoor(boolean isIndoor) {
        this.isIndoor = isIndoor;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Indoor Cat: " + isIndoor);
    }
}

public class App {
    public static void main(String[] args) {
        // Creating Dog object
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.displayInfo();
        
        System.out.println();
        
        // Creating Cat object
        Cat cat = new Cat("Whiskers", 2, true);
        cat.displayInfo();
    }
}
