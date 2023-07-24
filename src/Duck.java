public class Duck extends Animal implements Flyable{
    public void sound() {
        System.out.println("quacks");
    }
    public void fly() {
        System.out.println("duck fliess");
    }
    public void glide() {
        System.out.println("duck glidess");
    } 
    public void clean(Animal animal) {
        System.out.println(this + " is cleaning " + animal);
    }  
}
