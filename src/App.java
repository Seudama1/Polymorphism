// Tonpo Rattanachote 650615018

public class App {
    public static void main(String[] args) throws Exception {

        Duck donald = new Duck();
        donald.clean(new Cow());
        Duck daisy = new PekingDuck();
        daisy.clean(donald);
    }
}
