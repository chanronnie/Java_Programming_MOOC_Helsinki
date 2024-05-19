package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        
        // Request a title from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a title: ");
        String title = scanner.nextLine();
        
        // Launch the application showing the user title in a graphical user interface 
        Application.launch(UserTitle.class, "--title= " + title);
    }
}
