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
    return a;}

  //______________________________________________________________________________________________________________________________

   public static void main(String[] args){
       int[][] a = IntoFile.loadImage("drawn.png");
      System.out.println("Enlarge by how much? (one bit should become how many bits)");
      boolean loo=true;
    while(loo){
      System.out.println("Only input numbers 0-9 . ");
      
      int input = System.in.read();
      switch(input){
         case '0': input = input -'0'; loo=false; break; 
         case '1': input = input -'0'; loo=false; break; 
         case '2': input = input -'0'; loo=false; break; 
         case '3': input = input -'0'; loo=false; break; 
         case '4': input = input -'0'; loo=false; break; 
         case '5': input = input -'0'; loo=false; break; 
         case '6': input = input -'0'; loo=false; break; 
         case '7': input = input -'0'; loo=false; break; 
         case '8': input = input -'0'; loo=false; break; 
         case '9': input = input -'0'; loo=false; break; 
            }
    }
      enlarge(a, input);
   IntoFile.saveImage(a);
   }
}
