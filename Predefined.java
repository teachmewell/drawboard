public class Predefined{

  public static void printText (int[][] png){ // Need to put into loop first. Makes text for an array named a[x][y]. 
    String txt;
     for (int h=0; h<png[0].length; h++){
    for(int w=0; w < png.length; w++ ){ 
        System.out.print( "a["+w+"]["+h+"] = " + png[w][h]+"; " );
    }
}
  }

  
}
