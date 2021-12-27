/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package answer;

/**
 *
 * @author USER
 */
public class ques2 extends ques1{
    //MarsAir inherits from EarthAir class
    private double a;
    private double b;
    private double c;

    public ques2(double A1, double A2, double A3) {
        super(A1, A2, A3);
        this.a = A3;
        this.b = A1;
        this.c = A2;
    }
    //overrides AirDetails method from EarthAir class
    @Override
    public void AnsDetails() {
       
        
        System.out.println("Mark of question A "+a+"");
        System.out.println("Mark of question B "+b+"");
        System.out.println("Mark of question C "+c+"");
    }
}