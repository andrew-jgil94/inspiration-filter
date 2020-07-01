import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.nio.file.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileWriter; 

public class autoIns {
    
    public static void main(String[] args) throws IOException {

        
        Scanner scan = new Scanner(System.in);
        System.out.print("Folder to atomize: ");

        PrintStream fileSetUp = new PrintStream(new File("fileSetUp.txt"));
        PrintStream fileIf = new PrintStream(new File("fileIf.txt"));
        PrintStream fileArr = new PrintStream(new File("fileArr.txt"));

        String destFolder = scan.nextLine(); 
        File f = new File(destFolder);

        if (f.exists() && f.isDirectory()) {

            File[] filesTEST = new File(destFolder).listFiles();

            int counter = 0;
            int counter2 = 0;
            int counter3 = 1;
            
            //int averageRed = 0;
            //int averageBlue = 0;
            //int averageGreen = 0;
            
            
            
            for (File file : filesTEST) {

                int averageRed = 0;
                int averageBlue = 0;
                int averageGreen = 0;
                
                
                BufferedImage image = ImageIO.read(file);
            
            
                int h = image.getHeight();
                int w = image.getWidth();

                //averageRed = 0;
                //averageBlue = 0;
                //averageGreen = 0;


                int i = 0;

                while (i<h){

                    int j = 0;

                    while (j<w){

                        int subClr = image.getRGB(i,j);
                        int subBlue =   subClr & 0x000000ff;
                        int subRed =   (subClr & 0x00ff0000) >> 16;
                        int subGreen = (subClr & 0x0000ff00) >> 8;
                        
                        averageRed = averageRed + subRed;
                        averageGreen = averageGreen + subGreen;
                        averageBlue = averageBlue + subBlue;

                        j++;


                    }


                    i++;



                }
            
                int averageRedFinal = (averageRed/(h*w));
                int averageGreenFinal = (averageGreen/(h*w));
                int averageBlueFinal = (averageBlue/(h*w));
                int rgb = ((averageRedFinal&0x0ff)<<16)|((averageGreenFinal&0x0ff)<<8)|(averageBlueFinal&0x0ff);

                //System.out.println(file.getAbsolutePath() + ": " + averageRedFinal + " " + averageGreenFinal + " " + averageBlueFinal);

                fileSetUp.println ("File file" +counter3 + " = new File(\"./temp/" + file.getName()+"\");");
                //counter3++;
                fileSetUp.println("BufferedImage apples" + counter3 + " = ImageIO.read(file" +counter3 + ");");
                
                
                fileIf.println( "if(rgb == " + rgb + "){"); //blue

                fileIf.println(    "img.getGraphics().drawImage(apples" + counter3 + ", i, j, null);");

                fileIf.println("}");
                counter3++;

                //fileArr.println("int " + file.getName() + " = " + averageRedFinal + ";");
                //fileArr.println("int " + file.getName() + " = " + averageGreenFinal + ";");
                //fileArr.println("int " + file.getName() + " = " + averageBlueFinal + ";");
        
                fileArr.println("colorValues[" + counter + "] = " + averageRedFinal + ";");
                counter++;
                fileArr.println("colorValues[" + counter + "] = " + averageGreenFinal + ";");
                counter++;
                fileArr.println("colorValues[" + counter + "] = " + averageBlueFinal + ";");
                counter++;
        
                fileArr.println("arr[" + counter2 + "] = distance3d(" + averageRedFinal + ", " + averageGreenFinal + ", " + averageBlueFinal + ", x, y, z);");
                counter2++;



            
            
            }

            


        
        
        
        }


        fileSetUp.close();
        fileIf.close();
        fileArr.close();
        scan.close();








    }


}