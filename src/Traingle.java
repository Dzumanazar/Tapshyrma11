public class Traingle {
    int a;
    int b;
    int c;
    public void area(){
        double s = 0;
        s =(a + b + c)/2d;
        System.out.println(Math.sqrt((s * (s-a)*(s-b)*(s-c))));
    }
}
