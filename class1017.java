class Car{
    protected String owner;
    protected String id;

    public Car(String own,String s){
        owner =own;
        id = s;
    }
    void show(){
        System.out.println("車主姓名:"+owner);
        System.out.println("車牌號碼:"+id);
    }
}

class CColor extends Car{
    protected String color;

    public CColor(String own,String s,String c){
        super(own,s);
        color = c;
    }
    public void  show() {
        super.show();
        System.out.println("車子顏色"+color);
        }
}



public class class1017{
    public static void main (String arg[]){
        CColor mycar = new CColor("Riaan","A1-2345","Black");
        mycar.show();
        } 
}