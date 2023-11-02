package Study_Java.Task1;

import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Sportswear_corp1", 40);
        Ball b2 = new Ball("Sportswear_corp2", 45);
        Ball b3 = new Ball("Sportswear_corp3");
        b3.ChangeShape(50);
        System.out.println(b1);
        b1.intoOtherShape();
        b2.intoOtherShape();
        b3.intoOtherShape();
    }
}