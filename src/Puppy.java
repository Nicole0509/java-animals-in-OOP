public class Puppy extends Dog{
    
    Puppy(String name,int age) {
        super(name,age);
    }

    @Override

    public void dogCredentials() {
        System.out.println(name + " is " + age + " years old");
        System.out.println(name + " is a puppy");
    }
    public void puppyCry(){
        System.out.println(name + " is crying...");
    }
    
}
