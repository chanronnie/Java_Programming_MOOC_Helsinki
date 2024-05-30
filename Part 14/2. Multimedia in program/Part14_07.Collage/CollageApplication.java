/*
============== Java Programming II ==============
Part 14
Section 2 - Multimedia in programs
Ex 7 - Collage


Using the image of the Mona Lisa, implement a program that copies the original image to create a collage. 
The collage contains four small identical images, each one being one-fourth of the original image. 
The color displayed is the negative of the original image.
=================================================
*/

package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {

        // Get the image file
        Image sourceImage = new Image("file:monalisa.png");

        // Create components for reading and copying the original image
        PixelReader imageReader = sourceImage.getPixelReader();
        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();
    
        // Create the collage
        createCollage(imageReader, imageWriter, 0, 0, width, height);
        
        // Display the collage
        ImageView image = new ImageView(targetImage);
        Pane pane = new Pane();
        pane.getChildren().add(image);

        stage.setScene(new Scene(pane));
        stage.show();
    }
    
    public static void createCollage(PixelReader imageReader, PixelWriter imageWriter, int x0, int y0, int width, int height) {
        /*
        -------------------------------------------------------------------------------------
        This method creates a new image, and copy the opened image into four new ones, pixel by pixel.
        
        Parameters      Description
        
        imageReader:    PixelReader object for reading the original image (pixel by pixel)
        imageWriter:    PixelWriter object for writing the copied pixel 
        x0:             starting point on x-axis from where the original image will be copied
        y0:             starting point on y-axis from where the original image will be copied
        width:          width of the original image to copy
        height:         height of the original image to copy
        -------------------------------------------------------------------------------------
        */
        
        int yCoordinate = y0;
        while (yCoordinate < height) {
            int xCoordinate = x0;
            while (xCoordinate < width) {

                // Copy and invert the color of each pixel
                Color color = imageReader.getColor(xCoordinate, yCoordinate);
                double neg_red = 1.0 - color.getRed();
                double neg_green = 1.0 - color.getGreen();
                double neg_blue = 1.0 - color.getBlue();
                double opacity = color.getOpacity();
                
                // Store the copied pixel with the new color at the four corners simultaneously
                Color newColor = new Color(neg_red, neg_green, neg_blue, opacity);
                imageWriter.setColor(xCoordinate/2, yCoordinate/2, newColor);                       // top left corner
                imageWriter.setColor(xCoordinate/2 + width/2, yCoordinate/2, newColor);             // top right corner
                imageWriter.setColor(xCoordinate/2, yCoordinate/2 + height/2, newColor);            // bottom left corner
                imageWriter.setColor(xCoordinate/2 + width/2, yCoordinate/2 + height/2, newColor);  // bottom right corner
                
                xCoordinate += 2;
            }
            yCoordinate += 2;
        }
    }
}
