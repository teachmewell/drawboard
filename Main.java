import java.io.IOException;
import java.lang.Math;
import java.awt.image.BufferedImage;

//WILL SAVE THE PICTURE INTO DRAWN.PNG
// USING ANYTHING OTHER THAN OPTION 4 WILL OVERWRITE YOUR DRAWING

public class Main {
    public static void main(String[] args) throws IOException {
        boolean end = true;
        int[][] a = new int[130][77];
        int m=0;

        System.out.println("Do you want a template to start with, a completely white paper, randomly coloured, or from a file(Do not choose this first time, because it would be 0 bytes big)? Enter 1,2,3,4. (default is old one) ");
        int version = System.in.read();
        switch(version){
            case '1': version=1; break;
            case '2': version=2; break;
            case '3': version=3; break;
            case '4': version = 4; break;
            default: version = 4;
        }

        while(end) {
            System.out.println("Hello, here you can draw numbers. ");
            System.out.println("choose color, enter their RGB number:");
            System.out.println("r= red. o= orange. y= yellow. l= lightgreen.");
            System.out.println("g= green. s= springgreen. c= cyan. a=azure.");
            System.out.println("b= blue. v=violet. m=magenta. d=rose. w=white. n=black.");
            m = System.in.read();
            switch(m){
                case 'r': m=0xFF0000; end=false; break;
                case 'o': m=0xFF7F00; end=false; break;
                case 'y': m=0xFFFF00; end=false; break;
                case 'l': m=0x7FFF00; end=false; break;
                case 'g': m=0x00FF00; end=false; break;
                case 's': m=0x00FFF0; end=false; break;
                case 'c': m=0x00FFFF; end=false; break;
                case 'a': m=0x07F0FF; end=false; break;
                case 'b': m=0x0000FF; end=false; break;
                case 'v': m=0x7F00FF; end=false; break;
                case 'm': m=0xFF00FF; end=false; break;
                case 'd': m=0xFF007F; end=false; break;
                case 'n': m=0x000000; end=false; break;
                case 'w': m=0xFFFFFF; end=false; break;
                default: System.out.println(" \n \n CHOOSE ONE OF THE OPTIONS \n ");
            }
        }

     if(version ==3){
            for(int k = 0; k < a.length; k++){
                for( int j = 0; j< a[0].length; j++){
                    a[k][j]= (int)(Math.random() * 0xFFFFFF);
                }}
        }

        if(version ==2){
            for(int k = 0; k < a.length; k++){
                for( int j = 0; j< a[0].length; j++){
                    a[k][j]=0xFFFFFF;
                }}

        }

        if(version == 4){
            a = IntoFile.loadImage("drawn.png");
        }

        
        if(version ==1){
    if(Math.random() > 0.5){a = Predefined.globeTemplate(); } 
            else{a=Predefined.symbolTemplate();}
//else{  a[x][y]= (int)(Math.random() * 0xFFFFFF);}
           


                //   else{  a[x][y]= (int)(Math.random() * 0xFFFFFF);}
        }
        Img img = new Img(a, m);

        img.display();

    }
}
