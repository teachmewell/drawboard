public class Transcribe{


public static void main(String[] args){

/*int[][] a = IntoFile.loadImage("drawn.png");
Predefined.printText(a);*/

//____________________________________________________________________________________________________________________________________
  // Needs a file named template.png  Will copy all red bits into drawn.png as black ones. 
  int[][] a = IntoFile.loadImage("drawn.png");
  int[][] tem = IntoFile.loadImage("template.png");
int alen = a.length; int tlen = tem.length; int aglen = a[0].length; int tglen = tem[0].length;  
  int alendif = alen-tlen; // negative if tlen is bigger
  int aglendif = aglen - tglen; // negative if tglen is bigger
if(alendif > 0){ tem= Img.addRight(tem, alendif/2); tem=Img.addLeft(tem, alendif-alendif/2); }
  else{ a = Img.addRight(a, -alendif/2); a=Img.addLeft(a, alendif/2-alendif); }
if(aglendif > 0){ tem= Img.addDown(tem, aglendif/2); tem=Img.addUp(tem, aglendif-aglendif/2);  }
  else{ a = Img.addDown(a, -aglendif/2); a=Img.addUp(a, aglendif/2-aglendif);}
  
for(int y = 0; y<tem[0].length; y++){
  for(int x = 0; x<tem.length; x++){

if(tem[x][y] == 0xFF0000 ){a[x][y] = 0xFF0000;} 
    
  }
}

  IntoFile.saveImage(a);
}

}
