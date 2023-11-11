public class Ejer52 extends Bse {
    public static void main(String[] args) {
        String jugador1="";
        String jugador2="";
        String jugador3="";
        String jugador4="";
        String jugador5="";
        String jugador6="";
        String jugador7="";
        String jugador8="";
        String resultado="";
        String game1="";
        String game2="";
        String game3="";
        String game4="";
        String game5="";
        String game6="";
        String game7="";

        screen.println("Ingresar el nombre de la jugadora #1");
        jugador1=keyboard.nextLine();
        screen.println("Ingresar el nombre de la jugadora #2");
        jugador2=keyboard.nextLine();
        screen.println("Ingresar el nombre de la jugadora #3");
        jugador3=keyboard.nextLine();
        screen.println("Ingresar el nombre de la jugadora #4");
        jugador4=keyboard.nextLine();
        screen.println("Ingresar el nombre de la jugadora #5");
        jugador5=keyboard.nextLine();
        screen.println("Ingresar el nombre de la jugadora #6");
        jugador6=keyboard.nextLine();
        screen.println("Ingresar el nombre de la jugadora #7");
        jugador7=keyboard.nextLine();
        screen.println("Ingresar el nombre de la jugadora #8");
        jugador8=keyboard.nextLine();

        screen.println("PARTIDO #1: " + jugador1 + " vs " + jugador8);
        screen.println("Ingrese el resultado de este partido: (2-0, 2-1, 0-2, 1-2)");
        resultado=keyboard.nextLine();
        if(resultado.equals("2-0") || resultado.equals("2-1")){game1=jugador1;}
        else{game1=jugador8;}        
        screen.println("El ganador del partido #1 es: " + game1);

        screen.println("PARTIDO #2: " + jugador4 + " vs " + jugador5);
        screen.println("Ingrese el resultado de este partido: (2-0, 2-1, 0-2, 1-2)");
        resultado=keyboard.nextLine();
        if(resultado.equals("2-0") || resultado.equals("2-1")){game2=jugador4;}
        else{game2=jugador5;}
        screen.println("El ganador del partido #2 es: " + game2);

        screen.println("PARTIDO #3: " + jugador6 + " vs " + jugador3);
        screen.println("Ingrese el resultado de este partido: (2-0, 2-1, 0-2, 1-2)");
        resultado=keyboard.nextLine();
        if(resultado.equals("2-0") || resultado.equals("2-1")){game3=jugador6;}
        else{game3=jugador3;}
        screen.println("El ganador del partido #3 es: " + game3);

        screen.println("PARTIDO #4: " + jugador7 + " vs " + jugador2);
        screen.println("Ingrese el resultado de este partido: (2-0, 2-1, 0-2, 1-2)");
        resultado=keyboard.nextLine();
        if(resultado.equals("2-0") || resultado.equals("2-1")){game4=jugador7;}
        else{game4=jugador2;}
        screen.println("El ganador del partido #4 es: " + game4);

        screen.println("PARTIDO #5: " + game1 + " vs " + game2);
        screen.println("Ingrese el resultado de este partido: (2-0, 2-1, 0-2, 1-2)");
        resultado=keyboard.nextLine();
        if(resultado.equals("2-0") || resultado.equals("2-1")){game5=game1;}
        else{game5=game2;}
        screen.println("El ganador del partido #5 es: " + game5);

        screen.println("PARTIDO #6: " + game3 + " vs " + game4);
        screen.println("Ingrese el resultado de este partido: (2-0, 2-1, 0-2, 1-2)");
        resultado=keyboard.nextLine();
        if(resultado.equals("2-0") || resultado.equals("2-1")){game6=game3;}
        else{game6=game4;}
        screen.println("El ganador del partido #6 es: " + game6);

        screen.println("PARTIDO #7: " + game5 + " vs " + game6);
        screen.println("Ingrese el resultado de este partido: (2-0, 2-1, 0-2, 1-2)");
        resultado=keyboard.nextLine();
        if(resultado.equals("2-0") || resultado.equals("2-1")){game7=game5;}
        else{game7=game6;}
        screen.println("El ganado del partido #7 y del torneo es: " + game7);


    }
}
