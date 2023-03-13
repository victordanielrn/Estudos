package appilication;

public class Programforeach {
    public static void main (String[]args) {
        String[] vect = new String[] {"maria", "bob", "alex"};
        //for (int i=0; i<vect.length; i++){
        //  System.out.println(vect[i]);
        //}
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
