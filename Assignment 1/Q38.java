public class Q38 {
    public static void main(String[] args) {
        int volume = 1287;
        int radius = 10;
        //let's break the formula according to our requirment
        double h = volume/(Math.PI*radius*radius);
        //surface area of the cylinder 
        double surface_area = (2 * Math.PI * radius * h ) + (2* Math.PI * radius *radius);
        System.out.println("The surface area of the cylinder is -: "+surface_area);
    }
}
