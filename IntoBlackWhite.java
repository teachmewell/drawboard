public class IntoBlackWhite{

public static void main(String[][] args){
int[][] a = IntoFile.loadImage("drawn.png");
  a= Stat.intoBlackWhite(a);
   IntoFile.saveImage(a);
}

  
}
