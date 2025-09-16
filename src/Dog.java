public class Dog {
    String name;
    int age;

    Dog(String name,int age) {
        this.name = name;
        this.age = age;
    }

    void dogCredentials(){
        System.out.println(name + " is " + age + " years old");
        System.out.println(name + " is a grown up dog");
    }

    void bark() {
        System.out.println(name + " is barking...");
    }

    void dogEats(){
        System.out.println(name + " is eating Meat !");
    }

}

