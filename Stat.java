public class Stat{

   public static int[][] enlarge(int[][] pic, int bits){
int[][] res = new int[pic.length * bits][pic[0].length * bits];
for( int y = 0; y < pic[0].length ; y++){
for(int x = 0; x< pic.length; x++){

  for(int z = 0; z< bits; z++){
    for (int m = 0; m<bits; m++){res[x+z][y+m] = pic[x][y]; }
  }
}
} 
    }

  //______________________________________________________________________________________________________________________________

   public static void main(String[] args){
       int[][] a = IntoFile.loadImage("drawn.png");
   IntoFile.saveImage(a);
   }
}
