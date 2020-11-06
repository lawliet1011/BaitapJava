package Bai1.truutuong;

import DocGia.QuanLyThuVien;

import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        System.out.println("1.Nhap ten meo\n");
        System.out.println("2.Nhap ten bo\n");
        System.out.println("3.Nhap ten cho\n");
        Manager manager = new Manager();
        int chon;
        Scanner scanner = new Scanner(System.in);
        chon = scanner.nextInt();
        switch (chon){
            case 1 ->{
                Animal cat = new Cat();
                manager.nhapCat();
                manager.xuatCat();









            }
            case 2 ->{
                Animal cow = new Cow();
                manager.nhapCow();
                manager.xuatCow();
            }
            case 3 ->{
                Animal dog = new Dog();
                manager.nhapDog();
                manager.xuatDog();
            }
            case 0 ->{
                return;
            }
            default -> {
                System.out.println("Bạn chọn sai rồi");
            }
        }
    }
}
