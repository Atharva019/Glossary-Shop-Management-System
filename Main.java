package com.PTSMS;import java.util.Scanner;public class Main implements admindb,custom {    static Scanner sc = new Scanner(System.in);    public static void main(String [] args) {        Main obj = new Main();        System.out.print("1.Admin\n2.customer\n3.Exit");        System.out.print("\nEnter choice: ");        int choice = sc.nextInt();        switch (choice) {            case 1 -> obj.gota_item_op();            case 2 -> obj.menu();            case 3 -> System.exit(0);            default -> System.out.println("default called!!!");        }    }    void gota_item_op(){            System.out.println("1.add items\t2.delete and update item\t3.check item list\t4.bill operations\t5.back main section\t6.exit");            System.out.print("Enter: ");            int choice = sc.nextInt();            switch (choice){                case 1 -> add_item();                case 2 -> update_item();                case 3 -> show_all();                case 4 -> bill_op();                case 5 -> main(null);                case 6 -> System.exit(0);            }    }}