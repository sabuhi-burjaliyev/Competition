/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Plague
 */
public class Competitor {

    private String name;
    private String surname;

    public Competitor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    public String turnToString(){
        return this.name+" "+this.surname;
    }
}
