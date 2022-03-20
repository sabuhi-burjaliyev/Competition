/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package process;

import inter.processes.LogoutInter;
import main.Menu;

/**
 *
 * @author Plague
 */
public class Logout implements LogoutInter{
    @Override
    public void process() {
        Menu.loggedIn = false;
    }
}
