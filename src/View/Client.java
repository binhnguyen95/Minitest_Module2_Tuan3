package View;

import Controller.MaterialManager;
import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private static ArrayList<Material> arr = MaterialManager.materials;

    static {
        LocalDate time = LocalDate.now();
        CrispyFlour crisp1 = new CrispyFlour("1","Aji-Ngon", time.minusMonths(10), 10, 5);
        CrispyFlour crisp2 = new CrispyFlour("2","Aji-Quick", time.minusMonths(11), 10, 3);
        CrispyFlour crisp3 = new CrispyFlour("3","Meizan", time.minusMonths(7), 10, 7);
        CrispyFlour crisp4 = new CrispyFlour("4","Neptune", time.minusMonths(5), 10, 11);
        CrispyFlour crisp5 = new CrispyFlour("5","Knor", time.minusMonths(2), 10, 2);
        Meat meat1 = new Meat("12","Dog", time.minusDays(3), 10, 10);
        Meat meat2 = new Meat("19","Pigeon", time.minusDays(4), 10, 5);
        Meat meat3 = new Meat("55","Cow", time.minusDays(5), 10, 12);
        Meat meat4 = new Meat("18","Pig", time.minusDays(1), 10, 17);
        Meat meat5 = new Meat("28","Chicken", time, 10, 13);
        arr.add(crisp1);
        arr.add(crisp2);
        arr.add(crisp3);
        arr.add(crisp4);
        arr.add(crisp5);
        arr.add(meat1);
        arr.add(meat2);
        arr.add(meat3);
        arr.add(meat4);
        arr.add(meat5);
    }

    public static void main(String[] args) {

        System.out.println(arr.get(0).getExpiryDate());

        MaterialManager array = new MaterialManager();
//        array.addFlour(newFlour());
//        array.addMeat(newMeat());
//        System.out.println(arr);


    }



    public static CrispyFlour newFlour() {
        CrispyFlour flour = new CrispyFlour();
        System.out.println("Nhap id san pham flour:");
        Scanner scan = new Scanner(System.in);
        String id = scan.nextLine();
        flour.setId(id);

        System.out.println("Nhap ten san pham:");
        Scanner scan1 = new Scanner(System.in);
        String name = scan1.nextLine();
        flour.setName(name);

        System.out.println("Nhap han su dung (ngay):");
        Scanner scanDate = new Scanner(System.in);
        int expire = scanDate.nextInt();
        LocalDate time = LocalDate.now().plusDays(expire);
        flour.setManufacturingDate(time);

        System.out.println("Nhap gia tien cho san pham:");
        Scanner scan2 = new Scanner(System.in);
        int cost = scan2.nextInt();
        flour.setCost(cost);

        System.out.println("Nhap so luong san pham:");
        Scanner scan3 = new Scanner(System.in);
        int quantity = scan3.nextInt();
        flour.setQuantity(quantity);
        return flour;
    }

        public static Meat newMeat() {
        Meat meat = new Meat();
        System.out.println("Nhap id san pham meat:");
        Scanner scan = new Scanner(System.in);
        String id = scan.nextLine();
        meat.setId(id);

        System.out.println("Nhap ten san pham:");
        Scanner scan1 = new Scanner(System.in);
        String name = scan1.nextLine();
        meat.setName(name);

        System.out.println("Nhap han su dung (thang):");
        Scanner scanMonth = new Scanner(System.in);
        int expire = scanMonth.nextInt();
        LocalDate time = LocalDate.now().plusMonths(expire);
        meat.setManufacturingDate(time);

        System.out.println("Nhap gia tien cho san pham:");
        Scanner scan2 = new Scanner(System.in);
        int cost = scan2.nextInt();
        meat.setCost(cost);

        System.out.println("Nhap so luong san pham:");
        Scanner scan3 = new Scanner(System.in);
        int quantity = scan3.nextInt();
        meat.setWeight(quantity);
        return meat;
    }


}