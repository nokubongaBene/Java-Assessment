package assignment.pkg4;
/**
 *
 * @author Benedicta
 */
public class Assignment4 {
    /**
     * @param args the command line arguments
     */
    public static void ArrayExample(){
         
        //Declaring and initializing a one-dimensional array
        int[] arrayStudNum = {1, 2, 3, 4, 5};
        String[] arrayName = {"Bonga", "Maggie", "Thabelo", "Rofhiwa", "Nolly"};
        String[] arraySurname = {"Smith", "Mandela", "Zulu", "Adams", "Mabe"};
        
        //use a forloop to printout the results
        for(int i=0; i<5; i++){
            System.out.println("The Student Number: "+ arrayStudNum[i] +
                    " Name is: "+ arrayName[i] + " and the Surname is "+ arraySurname[i]);
        }
        
    }
    public static void ArrayTwoDimen(){

        //Declaring and initializing two dimensional array
        int[][] marks = {{45, 65,78},{56,45,77},{78,55,39},{78,79,70},{45,67,89}};
        
        //use a forloop to printout the results
        for(int i =0; i<5; i++){
            
            for(int o = 0; o <3; o++){
                System.out.print(marks[i][o]+ " ");
            }
            System.out.println();
            
        }
        
    }
    public static void main(String[] args) {
        
        //calling the methods to execute the one-dimensional Array
        System.out.println("These are the students in my class!");
        ArrayExample();
        System.out.println(" ");
        //calling the methods to execute the two-dimensional Array
        System.out.println("The marks for the students from one to five.");
        ArrayTwoDimen();
    }
    
}