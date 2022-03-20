/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package process;

import Input.InputUtil;
import config.Config;
import inter.processes.StartInter;
import java.util.Random;

/**
 *
 * @author Plague
 */
public class Start implements StartInter{
    @Override
    public void process() {
        for(int i=0;i<Config.competitors.length;i++){
            System.out.println((i+1)+"."+Config.competitors[i].turnToString());
        }
        int userInput = InputUtil.getNumber("Which competitor is winner ? ");
        Random rand = new Random();
        int randNumber = rand.nextInt(1, Config.competitors.length+1);
        if(randNumber==userInput){
            System.out.println("You won ! Congratulation");
        }else{
            System.out.println("You failed ( Real winner is : "+Config.competitors[randNumber-1].turnToString());
           
        }
    }
}
