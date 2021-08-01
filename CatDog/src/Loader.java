public class Loader {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.printf("Вес собаки N1: %.2f %n", dog1.getWeight());
        dog1.feed(200.0);
        dog1.woof();
        System.out.printf("Вес собаки N1 после кормежки: %.2f %n", dog1.getWeight());
    }
}
