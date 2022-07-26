package Controller;

import model.CrispyFlour;
import model.Discount;
import model.Material;

import java.util.ArrayList;
import java.util.Scanner;

public class MaterialManager{
    public static ArrayList<Material> materials = new ArrayList<>();

    public void addFlour(Material mate) {
        materials.add(mate);
    }

    public void addMeat(Material mate) {
        materials.add(mate);
    }

    public void removeMaterial(ArrayList<Material> arr) {
        System.out.println("Nhap id san pham can xoa:");
        Scanner scan = new Scanner(System.in);
        String id = scan.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equals(id)) {
                arr.remove(i);
                break;
            }
        }
    }


}
