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

    }

    public static void main(String[] args) {
        LocalDate time = LocalDate.from(LocalDateTime.now());
        CrispyFlour crisp1 = new CrispyFlour("1","Aji-Ngon", time, 10, 5);
        CrispyFlour crisp2 = new CrispyFlour("2","Aji-Quick", time, 10, 3);
        CrispyFlour crisp3 = new CrispyFlour("3","Meizan", time, 10, 7);
        CrispyFlour crisp4 = new CrispyFlour("4","Neptune", time, 10, 11);
        CrispyFlour crisp5 = new CrispyFlour("5","Knor", time, 10, 2);
        Meat meat1 = new Meat("12","Dog", time, 10, 10);
        Meat meat2 = new Meat("19","Pigeon", time, 10, 5);
        Meat meat3 = new Meat("55","Cow", time, 10, 12);
        Meat meat4 = new Meat("18","Pig", time, 10, 17);
        Meat meat5 = new Meat("28","", time, 10, 13);
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
        System.out.println(arr);


        MaterialManager array = new MaterialManager();
        array.remove(arr);
//        array.addFlour(newFlour());
        System.out.println(arr);


    }



    public static CrispyFlour newFlour() {
        CrispyFlour flour = new CrispyFlour();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap id san pham:");
        String id = scan.nextLine();
        flour.setId(id);
        System.out.println("Nhap ten san pham:");
        Scanner scan1 = new Scanner(System.in);
        String name = scan1.nextLine();
        flour.setName(name);
        //TG san xuat:
        LocalDate time = LocalDate.from(LocalDateTime.now());
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

}