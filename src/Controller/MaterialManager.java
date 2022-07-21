package Controller;

import model.Material;

import java.util.ArrayList;
import java.util.Scanner;

public class MaterialManager{
    public static ArrayList<Material> materials = new ArrayList<>();

    public void addFlour(Material mate) {

        materials.add(mate);
    }

    public void remove(ArrayList<Material> mat) {
        System.out.println("Nhap id san pham can xoa:");
        Scanner scan = new Scanner(System.in);
        String id = scan.nextLine();
        for (int i = 0; i < mat.size(); i++) {
            if (mat.get(i).getId().equals(id)) {
                mat.remove(i);
            }
        }
    }

}
