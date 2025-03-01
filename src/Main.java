// Lớp cha (SuperClass)
class og {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Lớp con (SubClass) kế thừa từ Animal
class Dog extends Animal {
    // Ghi đè phương thức makeSound() của lớp cha
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Gọi phương thức của lớp cha

        Animal myDog = new Dog();//Dog myDog = new Dog();
        myDog.makeSound(); // Gọi phương thức ghi đè trong lớp con (Đa hình)
    }
}
