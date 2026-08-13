public class Func{

public static void main(String[] args){
 int[][] a = new int[2000][2000];

  int lenX = a.length; 
  int lenY = a[0].length;
  double step = 3.0 / (double)a.length;
for(int y =0; y< a[0].length; y++){
for (int x = 0; x< a.length; x++){
 a[x][y]= func(-1.5+ x*step, -1.5+y*step);
}
}

  IntoFile.saveImage(a, "func.png");
}


  public static int func(double x, double y){
    int itermax = 100; //max iterations
    int iter = 0;
while(x*x+y*y<4 && iter<itermax){
  double oldx = x;
  x = x*x-y*y+x;
  y= 2*oldx*y+y;
  iter++;
}
    if(iter == itermax){
      return 0x000000;
    }
    else{return 0xFF0000;}
    
  }
  
}
