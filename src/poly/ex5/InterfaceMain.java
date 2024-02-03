package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();


        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cat);

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("이동 테스트 시작");
        animal.move();
        System.out.println("이동 테스트 종료");
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("소리 테스트 시작");
        animal.sound();
        System.out.println("소리 테스트 종료");
    }
}
