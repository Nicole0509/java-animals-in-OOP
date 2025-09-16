public class Puppy extends Dog{
    
    Puppy(String name,int age) {
        super(name,age);
    }
    
    public void puppyCry(){
        System.out.println(name + " is crying...");
    }
    
}
