package u3;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
Student st1 = new Student();
st1.showInfo();

st1.incrementNote(9);
        st1.showInfo();

st1.decrementNote(2);
        st1.showInfo();

        st1.setName("Gaston","Jacinto");
        st1.showInfo();

    }
}
