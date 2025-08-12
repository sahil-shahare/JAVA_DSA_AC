public class Solid_rhombus {
    public static void solid_rhombus(int total_rows){
        //outer loop
        for(int i=1;i<=total_rows;i++){
            //spaces
            for(int j=1;j<=total_rows-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j = 1;j<=total_rows;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solid_rhombus(5);
    }
}