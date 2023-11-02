class CTriangle{
    protected int base;
    protected int height;

    protected void show(){
        System.out.println("base="+base+",height="+height);
    }
}
class CData extends CTriangle{
    public CData(int a,int b){
        base = a;
        height = b;
    }
    public double area(){
        return (base*height)/2.0;
    }
    public void show(){
        super.show();
        System.out.println("area = "+area());
    }
}
public class class1006{
    public static void main (String arg[]){
        CData obj = new CData(3,8);
        obj.area();
        
    }
}