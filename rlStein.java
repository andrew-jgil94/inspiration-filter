import java.io.*;
import java.util.Scanner;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.text.html.StyleSheet;

public class rlStein {
    public static void main(String args[]) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Folder to atomize: ");

        int counter = 0;

        String destFolder = scan.nextLine(); 
        File f = new File(destFolder);
        
        if (f.exists() && f.isDirectory()) {

            File[] filesTEST = new File(destFolder).listFiles();

            for (File file : filesTEST) {
       
       
        //File file0 = new File("./framepics/tryit.jpg");
        BufferedImage image = ImageIO.read(file);
       
        File file1 = new File("./temp/16px-Archetypeicon_tanker.png");
        BufferedImage apples1 = ImageIO.read(file1);
        File file2 = new File("./temp/16px-V_archetypeicon_arachnos_soldier.png");
        BufferedImage apples2 = ImageIO.read(file2);
        File file3 = new File("./temp/16px-V_archetypeicon_arachnos_widow.png");
        BufferedImage apples3 = ImageIO.read(file3);
        File file4 = new File("./temp/16px-V_archetypeicon_brute.png");
        BufferedImage apples4 = ImageIO.read(file4);
        File file5 = new File("./temp/16px-V_archetypeicon_mastermind.png");
        BufferedImage apples5 = ImageIO.read(file5);
        File file6 = new File("./temp/acc4.png");
        BufferedImage apples6 = ImageIO.read(file6);
        File file7 = new File("./temp/acc8.png");
        BufferedImage apples7 = ImageIO.read(file7);
        File file8 = new File("./temp/def8.png");
        BufferedImage apples8 = ImageIO.read(file8);
        File file9 = new File("./temp/dmg8.png");
        BufferedImage apples9 = ImageIO.read(file9);
        File file10 = new File("./temp/end8.png");
        BufferedImage apples10 = ImageIO.read(file10);
        File file11 = new File("./temp/ham8.png");
        BufferedImage apples11 = ImageIO.read(file11);
        File file12 = new File("./temp/hp8.png");
        BufferedImage apples12 = ImageIO.read(file12);
        File file13 = new File("./temp/Inspiration_Accuracy_Lvl_2.png");
        BufferedImage apples13 = ImageIO.read(file13);
        File file14 = new File("./temp/Inspiration_Accuracy_Lvl_3.png");
        BufferedImage apples14 = ImageIO.read(file14);
        File file15 = new File("./temp/Inspiration_Accuracy_Lvl_4.png");
        BufferedImage apples15 = ImageIO.read(file15);
        File file16 = new File("./temp/Inspiration_Damage_Lvl_2.png");
        BufferedImage apples16 = ImageIO.read(file16);
        File file17 = new File("./temp/Inspiration_Damage_Lvl_3.png");
        BufferedImage apples17 = ImageIO.read(file17);
        File file18 = new File("./temp/Inspiration_Damage_Lvl_4.png");
        BufferedImage apples18 = ImageIO.read(file18);
        File file19 = new File("./temp/Inspiration_Damage_Resistance_Lvl_2.png");
        BufferedImage apples19 = ImageIO.read(file19);
        File file20 = new File("./temp/Inspiration_Damage_Resistance_Lvl_3.png");
        BufferedImage apples20 = ImageIO.read(file20);
        File file21 = new File("./temp/Inspiration_Defense_Lvl_2.png");
        BufferedImage apples21 = ImageIO.read(file21);
        File file22 = new File("./temp/Inspiration_Defense_Lvl_3.png");
        BufferedImage apples22 = ImageIO.read(file22);
        File file23 = new File("./temp/Inspiration_Defense_Lvl_4.png");
        BufferedImage apples23 = ImageIO.read(file23);
        File file24 = new File("./temp/Inspiration_Endurance_Lvl_2.png");
        BufferedImage apples24 = ImageIO.read(file24);
        File file25 = new File("./temp/Inspiration_Endurance_Lvl_3.png");
        BufferedImage apples25 = ImageIO.read(file25);
        File file26 = new File("./temp/Inspiration_Endurance_Lvl_4.png");
        BufferedImage apples26 = ImageIO.read(file26);
        File file27 = new File("./temp/Inspiration_Health_Lvl_2.png");
        BufferedImage apples27 = ImageIO.read(file27);
        File file28 = new File("./temp/Inspiration_Health_Lvl_3.png");
        BufferedImage apples28 = ImageIO.read(file28);
        File file29 = new File("./temp/Inspiration_resist_sleep_hold_Lvl_1.png");
        BufferedImage apples29 = ImageIO.read(file29);
        File file30 = new File("./temp/Inspiration_resist_sleep_hold_Lvl_2.png");
        BufferedImage apples30 = ImageIO.read(file30);
        File file31 = new File("./temp/Inspiration_resist_sleep_hold_Lvl_3.png");
        BufferedImage apples31 = ImageIO.read(file31);
        File file32 = new File("./temp/Inspiration_resist_sleep_hold_Lvl_4.png");
        BufferedImage apples32 = ImageIO.read(file32);
        File file33 = new File("./temp/Inspiration_Resurrection_Lvl_2.png");
        BufferedImage apples33 = ImageIO.read(file33);
        File file34 = new File("./temp/Inspiration_Resurrection_Lvl_3.png");
        BufferedImage apples34 = ImageIO.read(file34);
        File file35 = new File("./temp/Inspiration_Resurrection_Lvl_4.png");
        BufferedImage apples35 = ImageIO.read(file35);
        File file36 = new File("./temp/res+8.png");
        BufferedImage apples36 = ImageIO.read(file36);
        File file37 = new File("./temp/res8.png");
        BufferedImage apples37 = ImageIO.read(file37);
        File file38 = new File("./temp/ult8.png");
        BufferedImage apples38 = ImageIO.read(file38);
        File file39 = new File("./temp/V_archetypeicon_stalker.png");
        BufferedImage apples39 = ImageIO.read(file39);
        File file40 = new File("./temp/wak8.png");
        BufferedImage apples40 = ImageIO.read(file40);
        
       
        
        
        
        BufferedImage img = new BufferedImage(image.getWidth(),image.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
        img.getGraphics().drawImage(image, 0, 0, null);

        //int [][][][][] fullMap = 16;
        // Getting pixel color by position x and y 
        //int clr = image.getRGB(2,3);
        //int red =   (clr & 0x00ff0000) >> 16;
        //int green = (clr & 0x0000ff00) >> 8;
        //int blue =   clr & 0x000000ff;

        int blur = 2;
        int blurScale = blur*blur;

        int h = image.getHeight() - (blur-1);
        int w = image.getWidth() - (blur-1);
        //System.out.println("height = " + h);
        //System.out.println("width = " + w);
        


        //System.out.println("Red Color value = " + red);
        //System.out.println("Green Color value = " + green);
        //System.out.println("Blue Color value = " + blue);
    
        int i = 0;
        //int counter = 0;
        //int j = 0;

        while (i < w){

            int j = 0;
            
            while ( j < h){

                
                int subI = i;
                int averageBlue = 0;
                int averageGreen = 0;
                int averageRed = 0;

                while (subI < i + blur){

                    int subJ = j;
                    
                    while ( subJ < j + blur){

                        int subClr = image.getRGB(subI,subJ);
                        int subBlue =   subClr & 0x000000ff;
                        int subRed =   (subClr & 0x00ff0000) >> 16;
                        int subGreen = (subClr & 0x0000ff00) >> 8;
                        //System.out.println(subI + " " + subJ + " Blue Color value = " + subBlue);
                        subJ++;
                        //counter++;
                        averageBlue = averageBlue + subBlue;
                        averageGreen = averageGreen + subGreen;
                        averageRed = averageRed + subRed;


                    }

                    
                
                    subI++;
                
                
                }
                
                //System.out.println();
                averageBlue = averageBlue/blurScale;
                averageGreen= averageGreen/blurScale;
                averageRed = averageRed/blurScale;
                //System.out.println(i + " " + j + " " + averageRed + " " + averageBlue + " " + averageGreen);
                int rgb = colorClose(averageRed, averageGreen, averageBlue);
                //int rgb = ((averageRed&0x0ff)<<16)|((averageGreen&0x0ff)<<8)|(averageBlue&0x0ff);
                
                //System.out.println("red: " + averageRed + " " + "green: " + averageGreen + " " + "blue: " + averageBlue + " array: " + i + " " + j + " rgb: " + rgb);
                
                subI = i;

                while (subI < i + blur){

                    int subJ = j;
                    
                    while ( subJ < j + blur){


                        
                        
                        img.setRGB(subI, subJ,rgb);

                        if(rgb == 7638167){
                            img.getGraphics().drawImage(apples1, i, j, null);
                            }
                            if(rgb == 6116678){
                            img.getGraphics().drawImage(apples2, i, j, null);
                            }
                            if(rgb == 4730197){
                            img.getGraphics().drawImage(apples3, i, j, null);
                            }
                            if(rgb == 8489115){
                            img.getGraphics().drawImage(apples4, i, j, null);
                            }
                            if(rgb == 8295505){
                            img.getGraphics().drawImage(apples5, i, j, null);
                            }
                            if(rgb == 12760118){
                            img.getGraphics().drawImage(apples6, i, j, null);
                            }
                            if(rgb == 12694581){
                            img.getGraphics().drawImage(apples7, i, j, null);
                            }
                            if(rgb == 9716142){
                            img.getGraphics().drawImage(apples8, i, j, null);
                            }
                            if(rgb == 13842232){
                            img.getGraphics().drawImage(apples9, i, j, null);
                            }
                            if(rgb == 3047385){
                            img.getGraphics().drawImage(apples10, i, j, null);
                            }
                            if(rgb == 13928599){
                            img.getGraphics().drawImage(apples11, i, j, null);
                            }
                            if(rgb == 3913013){
                            img.getGraphics().drawImage(apples12, i, j, null);
                            }
                            if(rgb == 12827481){
                            img.getGraphics().drawImage(apples13, i, j, null);
                            }
                            if(rgb == 12829301){
                            img.getGraphics().drawImage(apples14, i, j, null);
                            }
                            if(rgb == 11053968){
                            img.getGraphics().drawImage(apples15, i, j, null);
                            }
                            if(rgb == 13454414){
                            img.getGraphics().drawImage(apples16, i, j, null);
                            }
                            if(rgb == 13068917){
                            img.getGraphics().drawImage(apples17, i, j, null);
                            }
                            if(rgb == 13411241){
                            img.getGraphics().drawImage(apples18, i, j, null);
                            }
                            if(rgb == 13796451){
                            img.getGraphics().drawImage(apples19, i, j, null);
                            }
                            if(rgb == 13408655){
                            img.getGraphics().drawImage(apples20, i, j, null);
                            }
                            if(rgb == 10706874){
                            img.getGraphics().drawImage(apples21, i, j, null);
                            }
                            if(rgb == 11764676){
                            img.getGraphics().drawImage(apples22, i, j, null);
                            }
                            if(rgb == 11705277){
                            img.getGraphics().drawImage(apples23, i, j, null);
                            }
                            if(rgb == 3444950){
                            img.getGraphics().drawImage(apples24, i, j, null);
                            }
                            if(rgb == 4499671){
                            img.getGraphics().drawImage(apples25, i, j, null);
                            }
                            if(rgb == 5479379){
                            img.getGraphics().drawImage(apples26, i, j, null);
                            }
                            if(rgb == 5946694){
                            img.getGraphics().drawImage(apples27, i, j, null);
                            }
                            if(rgb == 8503915){
                            img.getGraphics().drawImage(apples28, i, j, null);
                            }
                            if(rgb == 9336017){
                            img.getGraphics().drawImage(apples29, i, j, null);
                            }
                            if(rgb == 9995471){
                            img.getGraphics().drawImage(apples30, i, j, null);
                            }
                            if(rgb == 10786256){
                            img.getGraphics().drawImage(apples31, i, j, null);
                            }
                            if(rgb == 11513028){
                            img.getGraphics().drawImage(apples32, i, j, null);
                            }
                            if(rgb == 7455160){
                            img.getGraphics().drawImage(apples33, i, j, null);
                            }
                            if(rgb == 9751238){
                            img.getGraphics().drawImage(apples34, i, j, null);
                            }
                            if(rgb == 10078146){
                            img.getGraphics().drawImage(apples35, i, j, null);
                            }
                            if(rgb == 12036512){
                            img.getGraphics().drawImage(apples36, i, j, null);
                            }
                            if(rgb == 13988158){
                            img.getGraphics().drawImage(apples37, i, j, null);
                            }
                            if(rgb == 11579038){
                            img.getGraphics().drawImage(apples38, i, j, null);
                            }
                            if(rgb == 6382694){
                            img.getGraphics().drawImage(apples39, i, j, null);
                            }
                            if(rgb == 6209459){
                            img.getGraphics().drawImage(apples40, i, j, null);
                            }
                            





                        subJ++;



                    }

                    
                
                    subI++;
                
                
                }
                
                
                
                j = j+blur;
            
            }

            i = i+blur;

        }
    
    
        counter++;
        File outputfile = new File("./framepics/testnew" + counter +".png");
        ImageIO.write(img, "png", outputfile);
        //counter++;
        //System.out.println(counter);
        //counter++;
        //System.out.println("height = " + h);
        //System.out.println("width = " + w);

        }//for file

        scan.close();
    
    
    
    
        } //iff file
    
    }


    public static double distance3d(int x, int y, int z, int a, int b, int c) {


        double dist = Math.sqrt(Math.pow(x-a, 2) + Math.pow(y-b, 2) + Math.pow(z-c, 2)); 



        return dist;


    }

    public static int colorClose(int x, int y, int z){

        double[] arr = new double[40];
        String[] colors = {"red","orange","yellow","green","blue","purple", "black", "white", "dgreen"};
        int[] colorValues = new int[120];

        colorValues[0] = 116;
        colorValues[1] = 140;
        colorValues[2] = 151;
        arr[0] = distance3d(116, 140, 151, x, y, z);
        colorValues[3] = 93;
        colorValues[4] = 85;
        colorValues[5] = 70;
        arr[1] = distance3d(93, 85, 70, x, y, z);
        colorValues[6] = 72;
        colorValues[7] = 45;
        colorValues[8] = 85;
        arr[2] = distance3d(72, 45, 85, x, y, z);
        colorValues[9] = 129;
        colorValues[10] = 136;
        colorValues[11] = 155;
        arr[3] = distance3d(129, 136, 155, x, y, z);
        colorValues[12] = 126;
        colorValues[13] = 148;
        colorValues[14] = 81;
        arr[4] = distance3d(126, 148, 81, x, y, z);
        colorValues[15] = 194;
        colorValues[16] = 180;
        colorValues[17] = 54;
        arr[5] = distance3d(194, 180, 54, x, y, z);
        colorValues[18] = 193;
        colorValues[19] = 180;
        colorValues[20] = 53;
        arr[6] = distance3d(193, 180, 53, x, y, z);
        colorValues[21] = 148;
        colorValues[22] = 65;
        colorValues[23] = 174;
        arr[7] = distance3d(148, 65, 174, x, y, z);
        colorValues[24] = 211;
        colorValues[25] = 55;
        colorValues[26] = 56;
        arr[8] = distance3d(211, 55, 56, x, y, z);
        colorValues[27] = 46;
        colorValues[28] = 127;
        colorValues[29] = 217;
        arr[9] = distance3d(46, 127, 217, x, y, z);
        colorValues[30] = 212;
        colorValues[31] = 136;
        colorValues[32] = 151;
        arr[10] = distance3d(212, 136, 151, x, y, z);
        colorValues[33] = 59;
        colorValues[34] = 181;
        colorValues[35] = 53;
        arr[11] = distance3d(59, 181, 53, x, y, z);
        colorValues[36] = 195;
        colorValues[37] = 187;
        colorValues[38] = 89;
        arr[12] = distance3d(195, 187, 89, x, y, z);
        colorValues[39] = 195;
        colorValues[40] = 194;
        colorValues[41] = 117;
        arr[13] = distance3d(195, 194, 117, x, y, z);
        colorValues[42] = 168;
        colorValues[43] = 171;
        colorValues[44] = 144;
        arr[14] = distance3d(168, 171, 144, x, y, z);
        colorValues[45] = 205;
        colorValues[46] = 76;
        colorValues[47] = 78;
        arr[15] = distance3d(205, 76, 78, x, y, z);
        colorValues[48] = 199;
        colorValues[49] = 106;
        colorValues[50] = 117;
        arr[16] = distance3d(199, 106, 117, x, y, z);
        colorValues[51] = 204;
        colorValues[52] = 163;
        colorValues[53] = 169;
        arr[17] = distance3d(204, 163, 169, x, y, z);
        colorValues[54] = 210;
        colorValues[55] = 132;
        colorValues[56] = 99;
        arr[18] = distance3d(210, 132, 99, x, y, z);
        colorValues[57] = 204;
        colorValues[58] = 153;
        colorValues[59] = 143;
        arr[19] = distance3d(204, 153, 143, x, y, z);
        colorValues[60] = 163;
        colorValues[61] = 95;
        colorValues[62] = 186;
        arr[20] = distance3d(163, 95, 186, x, y, z);
        colorValues[63] = 179;
        colorValues[64] = 131;
        colorValues[65] = 196;
        arr[21] = distance3d(179, 131, 196, x, y, z);
        colorValues[66] = 178;
        colorValues[67] = 155;
        colorValues[68] = 189;
        arr[22] = distance3d(178, 155, 189, x, y, z);
        colorValues[69] = 52;
        colorValues[70] = 144;
        colorValues[71] = 214;
        arr[23] = distance3d(52, 144, 214, x, y, z);
        colorValues[72] = 68;
        colorValues[73] = 168;
        colorValues[74] = 215;
        arr[24] = distance3d(68, 168, 215, x, y, z);
        colorValues[75] = 83;
        colorValues[76] = 155;
        colorValues[77] = 211;
        arr[25] = distance3d(83, 155, 211, x, y, z);
        colorValues[78] = 90;
        colorValues[79] = 189;
        colorValues[80] = 70;
        arr[26] = distance3d(90, 189, 70, x, y, z);
        colorValues[81] = 129;
        colorValues[82] = 194;
        colorValues[83] = 107;
        arr[27] = distance3d(129, 194, 107, x, y, z);
        colorValues[84] = 142;
        colorValues[85] = 116;
        colorValues[86] = 209;
        arr[28] = distance3d(142, 116, 209, x, y, z);
        colorValues[87] = 152;
        colorValues[88] = 132;
        colorValues[89] = 207;
        arr[29] = distance3d(152, 132, 207, x, y, z);
        colorValues[90] = 164;
        colorValues[91] = 149;
        colorValues[92] = 208;
        arr[30] = distance3d(164, 149, 208, x, y, z);
        colorValues[93] = 175;
        colorValues[94] = 172;
        colorValues[95] = 196;
        arr[31] = distance3d(175, 172, 196, x, y, z);
        colorValues[96] = 113;
        colorValues[97] = 193;
        colorValues[98] = 184;
        arr[32] = distance3d(113, 193, 184, x, y, z);
        colorValues[99] = 148;
        colorValues[100] = 202;
        colorValues[101] = 198;
        arr[33] = distance3d(148, 202, 198, x, y, z);
        colorValues[102] = 153;
        colorValues[103] = 199;
        colorValues[104] = 194;
        arr[34] = distance3d(153, 199, 194, x, y, z);
        colorValues[105] = 183;
        colorValues[106] = 169;
        colorValues[107] = 160;
        arr[35] = distance3d(183, 169, 160, x, y, z);
        colorValues[108] = 213;
        colorValues[109] = 113;
        colorValues[110] = 62;
        arr[36] = distance3d(213, 113, 62, x, y, z);
        colorValues[111] = 176;
        colorValues[112] = 174;
        colorValues[113] = 158;
        arr[37] = distance3d(176, 174, 158, x, y, z);
        colorValues[114] = 97;
        colorValues[115] = 100;
        colorValues[116] = 102;
        arr[38] = distance3d(97, 100, 102, x, y, z);
        colorValues[117] = 94;
        colorValues[118] = 191;
        colorValues[119] = 179;
        arr[39] = distance3d(94, 191, 179, x, y, z);
        




        //System.out.println(arr[7] + " white");

        //max(arr);
        //StyleSheet s = new StyleSheet();
        int rgb = min(arr);
        //Color c1 = s.stringToColor(rgb);
        //int r1 = c1.getRed();
        //int g1 = c1.getGreen();
        //int  b1 = c1.getBlue();


        int rgbRet = ((((colorValues[rgb*3])&0x0ff)<<16)|(((colorValues[rgb*3+1])&0x0ff)<<8)|((colorValues[rgb*3+2])&0x0ff));
        //if((colors[min(arr)]) == "orange"){


            //System.out.println(rgbRet);

        //}

        return rgbRet;

    }

    public static int min(double[] arr) { 
        
        int i;
        int minRet; 
          
        // Initialize maximum element 
        double min = arr[0];
        minRet = 0; 
       
        // Traverse array elements from second and 
        // compare every element with current max   
        for (i = 1; i < arr.length; i++){ 
            if (arr[i] < min){ 
                
                min = arr[i];
                minRet = i; 
       
            }
        }
        //System.out.println(min + i);
        return minRet; 
    
    
    } 




}