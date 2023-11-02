class Caaa{
     public int num1 = 1;
     public int num2 = 1;
     public void set_num(int a,int b){
        num1 = a;
        num2 = b;
     }
}
class Cbbb extends Caaa{
    public void set_num(int a, int b){
        num1 = a;
        num2 = b;
    }
    public void show(){
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
    }
}

public class class1003{
    public static void main (String arg[]){
        Cbbb bb=new Cbbb();
        bb.set_num(7,10);
        bb.show();
    }
}