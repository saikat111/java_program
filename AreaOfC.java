public class AreaOfC {
    static void out(){

        area1.ar = area1.r * area1.r * area1.pi;
        System.out.println("The area is =" + area1.ar);
    }
    public static void main(String[] args) {
        area area1 = new area();
        area1.r = 7.00;
        area1.pi = 3.1416;
        out();

    }
}
