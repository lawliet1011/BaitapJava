package Bai1.truutuong;

public class Dog extends Animal {


    public Dog(){
    }

    public Dog(String name) {
        super(name);
    }

    public void introduce(){
            super.introduce();
    }


    public void makeASound(){
        System.out.println("gaugau");
    }
}
