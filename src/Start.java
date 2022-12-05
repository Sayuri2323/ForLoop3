import java.util.Arrays;
public class Start {
    public static void main(String[] args) {


        String[] arr = new String[]
                {"Monday", "Tuesday", "Wednesday", "Thursday", "friday","Saturday","Sunday"};

        for(int i = 0; i<= arr.length; i+=2){
            System.out.println(i);
            String showArray=arr[i];
            System.out.println(showArray);
        }



    }
}
