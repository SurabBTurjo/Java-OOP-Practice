/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package answer;


public class ques1 implements Answer {
    //EarthAir implements Air class
    private double a;
    private double b;
    private double c;
   
    public  ques1(double A1,double A2,double A3){
        a = A1;
        b = A2;
        c = A3;
       
    }
    //getters
    public double getA1() {
        return a;
    }
    public double getA2() {
        return b;
    }
    public double getA3() {
        return c;
    }

    //setters
    public void setA1(double a) {
        this.a = a;
    }
    public void setA2(double b) {
        this.b = b;
    }
    public void A3(double c) {
        this.c = c;
    }


    public void AnsDetails(){
        System.out.println("Mark of question A "+a+"");
        System.out.println("Mark of question B  "+b+"");
        System.out.println("Mark of question C  "+c+"");
   
    }
}
