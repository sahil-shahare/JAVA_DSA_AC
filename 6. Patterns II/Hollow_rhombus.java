public class Hollow_rhombus {
    public static void hollow_rhombus(int total_rows){
        //outer loop
        for(int i=1;i<=total_rows;i++){
            //spaces
            for(int j=1;j<=total_rows-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=total_rows;j++){
                //condition
                if(i==1||i==total_rows||j==1||j==total_rows){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rhombus(5);
    }
}
