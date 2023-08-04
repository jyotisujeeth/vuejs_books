// create an abstract class
abstract class Animal {
  // declare an abstract method
  abstract void makeSound();

  // define a non-abstract method
  public void eat() {
    System.out.println("I can eat.");
  }
}

// create a subclass
class Dog extends Animal {
  // provide implementation of abstract method
  public void makeSound() {
    System.out.println("Bark bark");
  }
}

// create another subclass
class Cat extends Animal {
  // provide implementation of abstract method
  public void makeSound() {
    System.out.println("Meow meow");
  }
}

// create a main class
class Main {
  public static void main(String[] args) {
    // create an object of Dog class
    Dog d1 = new Dog();
    // call the methods of Dog class
    d1.makeSound();
    d1.eat();

    // create an object of Cat class
    Cat c1 = new Cat();
    // call the methods of Cat class
    c1.makeSound();
    c1.eat();
  }
}
Copy
The output of this code would be:
Bark bark
I can eat.
Meow meow
I can eat.
