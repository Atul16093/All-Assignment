public class Q41 {
    public static void main(String[] args) {
        int height = 50;
        int diameter = 30;
        //radius
        int radius = diameter/2;
        //Now calculate the cylinder volume 
        double volume = Math.PI * radius *radius *height;
        System.out.println(volume+"cm");
    }
}
