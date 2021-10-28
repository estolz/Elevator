package HW3;
import java.util.Scanner; 


public class Main {
	
	public static String current_floor="5";                             //Anfangsebene
	public static void main(String[] args) {
		String dest_floor;                                              //Variable für Zielebene
		int p;                                                          //Variable um bei ungültiger Eingabe zu Überspringen
		Scanner s = new Scanner(System.in);                             //starte Scanner
		System.out.println("Current Floor is "+current_floor); 
        System.out.println("Enter destination Floor: (0 to 10):"); 

		try{
			dest_floor=s.nextLine();int Test=Integer.parseInt(dest_floor);p=1;}   //Variable wird mit Scanner gefüllt und Test würde Fehler werfen,falls Eingabe ungültig
		catch(java.lang.NumberFormatException a) {
			p=0;dest_floor=current_floor;
			System.out.println("--------------------------------------------");
			System.out.println("falsche Eingabe");}
		                                                                          //fängt für String ungültige Eingabe und würde p=0 setzen
		s.close();                                                                //Scanner beendet
		
		if(p==1) {
			System.out.println("--------------------------------------------");
		    int z=Integer.parseInt(dest_floor);
		    boolean q=false;                                                                   //q wird true, wenn dest_floor zwischen 0 und 10
		    for(int d=0;d<=10;d++) {
			   if(z==d) {q=true;System.out.println(current_floor);}}
		    if(q==true) {                                                                      //Aufzug ändert nur Ebene, wenn ein gültiges Ziel eingegeben wurde
		       while(Integer.parseInt(dest_floor)!=Integer.parseInt(current_floor)) {          //Aufzug fährt, bis er am Ziel angekommen ist
			    if(Integer.parseInt(current_floor)<=Integer.parseInt(dest_floor)) 
			      {moveup();}                                                                  //wenn tiefer als Ziel moveup
		   	    else
		   	      {movedown();}                                                                //sonst bzw. wenn höher als ziel movedown
			    System.out.println(current_floor);
		        }
		    System.out.println("Sie haben ihr Ziel erreicht");
		    }
		    
		    else {System.out.println("falsche Eingabe");}                                      // wird ausgegeben, wenn Eingabe String aber nicht zwischen 0 und 10
		  }
	}
		
	public static void moveup() {                                                              //erhöht current_floor um 1
		int u=Integer.parseInt(current_floor);
		u++;
		current_floor=Integer.toString(u);
	    }
	public static void movedown() {                                                            //verringert current_floor um 1
		int u=Integer.parseInt(current_floor);
		u--;
		current_floor=Integer.toString(u);
	}
	
}
