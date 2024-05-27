public class Q30 {
    public static void main(String[] args) {
        // floor area
        int l = 200;
        int b = 400;
        int floor_area = l*b;
        //tiles area
        int length = 5;
        int breadth = 8;
        int tiles_area = length*breadth;
        //Number of tiles 
        int number_of_tiles = floor_area/tiles_area;
        System.out.println("The total number of tiles -: "+number_of_tiles);
    }
}
