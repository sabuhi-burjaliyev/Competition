/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package process;

import Input.InputUtil;
import inter.processes.LoginInter;
import main.Menu;

/**
 *
 * @author Plague
 */
public class Login implements LoginInter {

    @Override
    public void process() {
        System.out.println("Login page : ");
        int chance = 3;
        for (int i = 0; i < 3; i++) {
            String username = InputUtil.getText("Enter username : ");
            String password = InputUtil.getText("Enter password : ");

            if (username.equals("Sarkhan") && password.equals("12345")) {
                Menu.loggedIn = true;
                System.out.println("Logged in successfully");
                break;
            } else {
                --chance;
                System.out.println("Username or password wrong try again ! (remaining chances : " + chance);
            }
        }
        if (chance == 0) {
            System.out.println("You banned");
            System.exit(0);
        }

    }
}
