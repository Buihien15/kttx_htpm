package com.example;

public class Main {
    public static void main(String[] args) {
        MobileManagerImpl manager = new MobileManagerImpl();

        Mobile m1 = new Mobile("M001", "iPhone 14", 1000.0, 10, "Apple", "iOS");
        Mobile m2 = new Mobile("M002", "Galaxy S23", 900.0, 8, "Samsung", "Android");
        Mobile m3 = new Mobile("M003", "Xiaomi Mi 13", 700.0, 15, "Xiaomi", "Android");

        // Thêm các sản phẩm vào danh sách
        manager.addMobile(m1);
        manager.addMobile(m2);
        manager.addMobile(m3);

        System.out.println("Danh sách Mobile:");
        manager.sortedMobile(true).forEach(System.out::println);

        System.out.println("\nTìm kiếm Mobile chứa 'Galaxy':");
        manager.searchMobile("Galaxy").forEach(System.out::println);

        // Sửa sản phẩm Galaxy S23
        m2.setProduct_price(850.0);
        manager.editMobile(m2);

        System.out.println("\nDanh sách sau khi sửa Galaxy S23:");
        manager.sortedMobile(true).forEach(System.out::println);

        // Xóa sản phẩm iPhone 14
        manager.delMobile(m1);

        System.out.println("\nDanh sách sau khi xóa iPhone 14:");
        manager.sortedMobile(true).forEach(System.out::println);
    }
}
