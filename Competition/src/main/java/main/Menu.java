/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Input.InputUtil;
import process.Exit;
import process.Login;
import process.Logout;
import process.Regist;
import process.Start;
import process.MenuService;

/**
 *
 * @author Plague
 */
public enum Menu {

    Login(1, "Log in", new Login()),
    Regist(2, "Regist competitor", new Regist()),
    Start(3, "Start competition", new Start()),
    Logout(4, "Log out", new Logout()),
    Exit(5, "Exit", new Exit());
    private int number;
    private String label;
    private MenuService service;
    public static boolean loggedIn = false;
    public static Menu[] menus = Menu.values();

    private Menu(int number, String label, MenuService service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public static void menuShow() {
        if (loggedIn) {
            for (int i = 1; i < menus.length; i++) {
                System.out.println(i + "." + menus[i].label);
            }
        } else {
            menus[0].service.process();
            for (int i = 1; i < menus.length; i++) {
                System.out.println(i + "." + menus[i].label);
            }
        }
    }

    public static void menuSelect() {
        int selectedMenu = InputUtil.getNumber("Enter your operation : ");
        menus[selectedMenu].service.process();
    }
}
