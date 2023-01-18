package hmw;

public class HW6 {
    public static void main(String[] args) {
        System.out.println(isPasswordValid("sdfsdfdss"));
        System.out.println(isPasswordValid("parolaRibM!34"));
    }

     public static boolean isPasswordValid(String password){
        String regex = "\\A(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}\\z";
        return password.matches(regex);
     }
}
