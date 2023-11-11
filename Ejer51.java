public class Ejer51 extends Bse {
public static void main(String[] args) {
        int num = 0;
        int mil = 0;
        int resm = 0;
        int cien = 0;
        int resc = 0;
        int diez = 0;
        int resd = 0;
        int des = 0;
        int resde = 0;
        String res1 = "";
        String res2 = "";
        String res3 = "";
        String res4 = "";
        System.out.println("ingrese un numero del 1 al 3999: ");
        num = keyboard.nextInt();
        mil= num/1000;
        resm = num%1000;
        if(mil==3){
            res1="MMM";
        }
        else if(mil==2){
            res1="MM";
        }
        else if(mil==1){
            res1="M";
        }
        cien = resm/100;
        resc = resm%100;
        if (cien==9) {
            res2="CM";
        }
        if (cien==8) {
            res2="DCCC";
        }
        if (cien==7) {
            res2="DCC";
        }
        if (cien==6) {
            res2="DC";
        }
        if (cien==5) {
            res2="D";
        }
        if (cien==4) {
            res2="CD";
        }
        if (cien==3) {
            res2="CCC";
        }
        if (cien==2) {
            res2="CC";
        }
        if (cien==1) {
            res2="C";
        }
        diez = resc/10;
        resd = resc%10;
        if (diez==9) {
            res3="XC";
        }
        if (diez==8) {
            res3="LXXX";
        }
        if (diez==7) {
            res3="LXX";
        }
        if (diez==6) {
            res3="LX";
        }
        if (diez==5) {
            res3="L";
        }
        if (diez==4) {
            res3="XL";
        }
        if (diez==3) {
            res3="XXX";
        }
        if (diez==2) {
            res3="XX";
        }
        if (diez==1) {
            res3="X";
        }
        des = resd/1;
        resde = resd%10;
        if (des==9) {
            res4 = "IX";
        }
        if (des==8) {
            res4 = "VIII";
        }
        if (des==7) {
            res4 = "VII";
        }
        if (des==6) {
            res4 = "VI";
        }
        if (des==5) {
            res4 = "V";
        }
        if (des==4) {
            res4 = "IV";
        }
        if (des==3) {
            res4 = "III";
        }
        if (des==2) {
            res4 = "II";
        }
        if (des==1) {
            res4 = "II";
        }
        System.out.println(" el numero en romano fue: "+res1+res2+res3+res4);
    }
    
}
    

