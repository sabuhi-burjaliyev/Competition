/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package process;

import Input.InputUtil;
import bean.Competitor;
import config.Config;
import inter.processes.RegistInter;

/**
 *
 * @author Plague
 */
public class Regist implements RegistInter{
    @Override
    public void process() {
       int number = InputUtil.getNumber("Enter the number of student you want to register : ");
       Config.competitors = new Competitor[number];
       for(int i=0;i<number;i++){
           System.out.println((i+1)+".Registration");
           String name = InputUtil.getText("Enter name : ");
           String surname = InputUtil.getText("Enter surname : ");
           Competitor c = new Competitor(name, surname);
           Config.competitors[i] = c;
       }
        System.out.println("Registration has been done successfully.");
    }
}
