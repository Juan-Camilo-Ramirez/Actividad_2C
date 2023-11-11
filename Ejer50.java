
public class Ejer50  extends Bse{
    public static void main(String[] args) {
    String Placa="";
    String dia="";
    int numpla=0;
    String ciudad="";
    String ldia="";
    screen.println("Ingresar la placa del vehículo (ej:ABC123)");
    Placa=keyboard.nextLine();
    screen.println("Ingresar el día de la semana (ej:Lunes)");
    dia=keyboard.nextLine();

    numpla=Placa.charAt(5);
    if(dia.equalsIgnoreCase("Lunes"))
    ldia="L";
    else if(dia.equalsIgnoreCase("Martes"))
    ldia="M";
    else if(dia.equalsIgnoreCase("Miercoles"))
    ldia="X";
    else if(dia.equalsIgnoreCase("Jueves"))
    ldia="J";
    else if(dia.equalsIgnoreCase("Viernes"))
    ldia="V";




    if((ldia=="L"&&(numpla=='0' || numpla=='1')) || (ldia=="M" && (numpla=='2' || numpla=='3')) || 
    (ldia=="X" &&(numpla=='4' || numpla=='5')) || (ldia=="J" && (numpla=='6' || numpla=='7')) || 
    (ldia=="V" && (numpla=='8' || numpla=='9'))) ciudad +="Manizales. ";

    if((ldia=="L"&&(numpla=='0' || numpla=='9')) || (ldia=="M" && (numpla=='1' || numpla=='8')) || 
    (ldia=="X" &&(numpla=='2' || numpla=='7')) || (ldia=="J" && (numpla=='6' || numpla=='3')) || 
    (ldia=="V" && (numpla=='4' || numpla=='5'))) ciudad +="Pereira. ";

    if((ldia=="L"&&(numpla=='8' || numpla=='9')) || (ldia=="M" && (numpla=='6' || numpla=='7')) || 
    (ldia=="X" &&(numpla=='4' || numpla=='5')) || (ldia=="J" && (numpla=='2' || numpla=='3')) || 
    (ldia=="V" && (numpla=='0' || numpla=='1'))) ciudad +="Medellín. ";

    if((ldia=="L"&&(numpla=='2' || numpla=='1')) || (ldia=="M" && (numpla=='3' || numpla=='4')) || 
    (ldia=="X" &&(numpla=='6' || numpla=='5')) || (ldia=="J" && (numpla=='8' || numpla=='7')) || 
    (ldia=="V" && (numpla=='0' || numpla=='9'))) ciudad +="Barranquilla. ";

    if((ldia=="L"&&(numpla=='8' || numpla=='9')) || (ldia=="M" && (numpla=='0' || numpla=='1')) || 
    (ldia=="X" &&(numpla=='2' || numpla=='3')) || (ldia=="J" && (numpla=='4' || numpla=='5')) || 
    (ldia=="V" && (numpla=='6' || numpla=='7'))) ciudad +="Armenia. ";

    if((ldia=="L"&&(numpla=='2' || numpla=='7')) || (ldia=="M" && (numpla=='3' || numpla=='8')) || 
    (ldia=="X" &&(numpla=='4' || numpla=='9')) || (ldia=="J" && (numpla=='0' || numpla=='5')) || 
    (ldia=="V" && (numpla=='6' || numpla=='1'))) ciudad +="Bogotá. ";

    if((ldia=="L"&&(numpla=='3' || numpla=='4')) || (ldia=="M" && (numpla=='5' || numpla=='6')) || 
    (ldia=="X" &&(numpla=='7' || numpla=='8')) || (ldia=="J" && (numpla=='9' || numpla=='0')) || 
    (ldia=="V" && (numpla=='1' || numpla=='2'))) ciudad +="Bucaramanga. ";

    if((ldia=="L"&&(numpla=='6' || numpla=='1')) || (ldia=="M" && (numpla=='2' || numpla=='7')) || 
    (ldia=="X" &&(numpla=='3' || numpla=='8')) || (ldia=="J" && (numpla=='4' || numpla=='9')) || 
    (ldia=="V" && (numpla=='0' || numpla=='5'))) ciudad +="Cartagena. ";
    

    screen.println("Las ciudades en las que no puede circular son: " + ciudad);
}
}