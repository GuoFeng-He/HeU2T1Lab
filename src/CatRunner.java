public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("Bennett", 3, 13);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Kuudra", 1000,1000000);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
