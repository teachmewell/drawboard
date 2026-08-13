

public class Refactor{

public static void main(String[] args){
   int[][] a = IntoFile.loadImage("drawn.png");
  int m=0;

   for(int l = 0; l<args.length; l++){
     if(args[l].equals( "-d")){
if(l+1 >= args.length){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -d 15"); break;}
             if(args[l+1].startsWith("-r") ){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -d 15"); break;}
             m =Integer.parseInt(args[l+1]);
             l=l++;
       if(m<0){a=Img.deleteDown(a,m);} else{a=Img.addDown(a,m);}
        }
     
      if(args[l].equals( "-u")){
if(l+1 >= args.length){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -u 15"); break;}
             if(args[l+1].startsWith("-l") ){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -u 15"); break;}
             m =Integer.parseInt(args[l+1]);
             l=l++;
       if(m<0){a=Img.deleteUp(a,m);} else{a=Img.addUp(a,m);}
        }
     
       if(args[l].equals( "-l")){
if(l+1 >= args.length){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -l 15"); break;}
             if(args[l+1].startsWith("-d") ){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -l 15"); break;}
             m =Integer.parseInt(args[l+1]);
             l=l++;
       if(m<0){a=Img.deleteLeft(a,m);} else{a=Img.addLeft(a,m);}
        }
     
       if(args[l].equals( "-r")){
if(l+1 >= args.length){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -r 15"); break;}
             if(args[l+1].startsWith("-u") ){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -r 15"); break;}
             m =Integer.parseInt(args[l+1]);
             l=l++;
       if(m<0){a=Img.deleteRight(a,m);} else{a=Img.addRight(a,m);}
        }
     
      }
  


    IntoFile.saveImage(a);
}
}
