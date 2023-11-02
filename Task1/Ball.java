package Study_Java.Task1;

import java.lang.*;
public class Ball {
    private String manufacturer_name;
    private int shape;
    public Ball(String m_n, int s) {
        manufacturer_name = m_n;
        shape = s;
    }
    public Ball(String m_n) {
        manufacturer_name = m_n;
        shape = 0;
    }
    public Ball(){
        manufacturer_name = "Sportswear_corp";
        shape = 0;
    }
    public void ChangeShape(int shape){
        this.shape = shape;
    }
    public void Set_New_Manufacturer_Name(String m_n){
        this.manufacturer_name = m_n;
    }
    public String Get_New_Name(String m_n){
        return m_n;
    }
    public int Get_Shape() {
        return shape;
    }
    public String toString(){
        return this.manufacturer_name+", shape "+this.shape;
    }
    public void intoOtherShape(){
        System.out.println(manufacturer_name+"'s shape in other shape is "+shape*7+" centimeters in 3th degree");
    }
}