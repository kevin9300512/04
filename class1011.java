class CShape{
    public double area(){
        return 0.0 ;
    }
}
class CCircle extends CShape{
    public double radius;
    public CCircle(double r){
        radius = r;
    }
    public double area(){
        return radius*radius*Math.PI;
    }
}


class CSquare extends CShape{
    public double side;
    public CSquare(double s){
        side = s;
    } 
    public double area(){
        return side*side;
    }

}


class CTriangle extends CShape{
    public double base;
    public double height;
    public CTriangle(double a,double b){
        base = a;
        height = b;
    }
    public double area(){
        return(base*height)/2.0;
    }
}


public class class1011 {
    public static CShape largest(CShape[] shapes) {
        if (shapes == null || shapes.length == 0) {
            return null;
        }

        CShape largestShape = shapes[0];
        double largestArea = largestShape.area();

        for (int i = 1; i < shapes.length; i++) {
            double area = shapes[i].area();
            if (area > largestArea) {
                largestArea = area;
                largestShape = shapes[i];
            }
        }

        return largestShape;
    }

    public static void main(String[] args) {
        CShape[] shapes = new CShape[3];
        shapes[0] = new CCircle(5);
        shapes[1] = new CSquare(4);
        shapes[2] = new CTriangle(3, 6);

        CShape largestShape = largest(shapes);

        System.out.println("最大面積的形狀是：");
        if (largestShape instanceof CCircle) {
            System.out.println("圓形");
        } else if (largestShape instanceof CSquare) {
            System.out.println("正方形");
        } else if (largestShape instanceof CTriangle) {
            System.out.println("三角形");
        }
        System.out.println("面積 = " + largestShape.area());
    }
}
