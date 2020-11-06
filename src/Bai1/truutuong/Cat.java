package Bai1.truutuong;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public void introduce(){
        super.introduce();
    }

    public void makeASound(){
        System.out.println("meomeo");
    }
}
