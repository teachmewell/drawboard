import java.io.IOException;

public class Stat{

   public static int[][] enlarge(int[][] pic, int bits){
int[][] res = new int[pic.length * bits][pic[0].length * bits];
for( int y = 0; y < pic[0].length ; y++){
for(int x = 0; x< pic.length; x++){

  for(int z = 0; z< bits; z++){
    for (int m = 0; m<bits; m++){res[x * bits +z][y*bits+m] = pic[x][y]; }
  }
}
}
    return res;}

  //______________________________________________________________________________________________________________________________

   public static void main(String[] args) throws IOException {
      
       int[][] a = IntoFile.loadImage("drawn.png");
      boolean loo=true;
      int input = 5;
  
      for(int l = 0; l<args.length; l++){
    if(args[l].equals("-s")){
       input = Integer.parseInt(args[l+1]);
       l++;
    }
          if(args[l].equals("-i")){
System.out.println("Sizes of drawn.png : x = "+ a.length + " , y = "+ a[0].length);
             try{  int[][] b = IntoFile.loadImage("template.png");
                 System.out.println("Sizes of template.png : x = "+ b.length + " , y = "+ b[0].length);}
             catch ( Exception e ) { return; } 
return;         
    }
      }
      
    a =  enlarge(a, input);
   IntoFile.saveImage(a);
}
 //______________________________________________________________________________________________________________________________
/* public static void main(String[] args) {    // If you use this main: flags -f num .t num  With from color to color change. 
     int[][] pic = IntoFile.loadImage("drawn.png");
int from = 0;
int to = 0;

 for(int l = 0; l<args.length; l++){
  if(args[l].equals("-f")){
       from = Integer.parseInt(args[l+1]);
       l++;
    }
    if(args[l].equals("-t")){
       to = Integer.parseInt(args[l+1]);
       l++;
    }
 }
for( int y = 0; y < pic[0].length ; y++){
for(int x = 0; x< pic.length; x++){
if( pic[x][y] == from){ pic[x][y] = to; }
}
}
    IntoFile.saveImage(pic);
 }*/

   
   
}
