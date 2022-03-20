/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package process;

import inter.processes.ExitInter;

/**
 *
 * @author Plague
 */
public class Exit implements ExitInter {

    @Override
    public void process() {
        System.out.println("Exiting ...");
        System.exit(0);
    }

}
