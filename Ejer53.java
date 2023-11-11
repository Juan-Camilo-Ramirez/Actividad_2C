public class Ejer53 extends Bse{
    public static void main(String[] args) {
    String numRo="";
    String numRoT="";
    int numara=0;

    screen.println("Ingresar un numero romano entre I(1) y MMMCMXCIX(3999)");
    numRo=keyboard.nextLine().trim().toUpperCase();
    numRoT=numRo;
    if(numRoT.startsWith("MMM")){
        numara+=3000;
        numRoT=numRoT.substring(3);}
    else if(numRoT.startsWith("MM")){
            numara += 2000;
            numRoT = numRoT.substring(2);}
    else if(numRoT.startsWith("M")){
            numara += 1000;
            numRoT = numRoT.substring(1);}
        

    


    if(numRoT.startsWith("CM")){
        numara+=900;
        numRoT=numRoT.substring(2);}
    else if(numRoT.startsWith("DCCC")){
        numara+=800;
        numRoT=numRoT.substring(4);}
    else if(numRoT.startsWith("DCC")){
        numara+=700;
        numRoT=numRoT.substring(3);}        
    else if(numRoT.startsWith("DC")){
        numara+=600;
        numRoT=numRoT.substring(2);}
    else if(numRoT.startsWith("D")){
        numara+=500;
        numRoT=numRoT.substring(1);}
    else if(numRoT.startsWith("CD")){
        numara+=400;
        numRoT=numRoT.substring(2);}
    else if(numRoT.startsWith("CCC")){
        numara+=300;
        numRoT=numRoT.substring(3);}
    else if(numRoT.startsWith("CC")){
        numara+=200;
        numRoT=numRoT.substring(2);}
    else if(numRoT.startsWith("C")){
        numara+=100;
        numRoT=numRoT.substring(1);}
      
    if(numRoT.startsWith("XC")){
        numara+=90;
        numRoT=numRoT.substring(2);}       
    








        screen.println(numara);
    }
}

