package HW3;
import java.util.Scanner; 


public class Main {
	
	public static String current_floor="5";                             //Anfangsebene
	public static void main(String[] args) {
		String dest_floor;                                              //Variable f�r Zielebene
		int p;                                                          //Variable um bei ung�ltiger Eingabe zu �berspringen
		Scanner s = new Scanner(System.in);                             //starte Scanner
		System.out.println("Current Floor is "+current_floor); 
        System.out.println("Enter destination Floor: (0 to 10):"); 

		try{
			dest_floor=s.nextLine();int Test=Integer.parseInt(dest_floor);p=1;}   //Variable wird mit Scanner gef�llt und Test w�rde Fehler werfen,falls Eingabe ung�ltig
		catch(java.lang.NumberFormatException a) {
			p=0;dest_floor=current_floor;
			System.out.println("--------------------------------------------");
			System.out.println("falsche Eingabe");}
		                                                                          //f�ngt f�r String ung�ltige Eingabe und w�rde p=0 setzen
		s.close();                                                                //Scanner beendet
		
		if(p==1) {
			System.out.println("--------------------------------------------");
		    int z=Integer.parseInt(dest_floor);
		    boolean q=false;                                                                   //q wird true, wenn dest_floor zwischen 0 und 10
		    for(int d=0;d<=10;d++) {
			   if(z==d) {q=true;System.out.println(current_floor);}}
		    if(q==true) {                                                                      //Aufzug �ndert nur Ebene, wenn ein g�ltiges Ziel eingegeben wurde
		       while(Integer.parseInt(dest_floor)!=Integer.parseInt(current_floor)) {          //Aufzug f�hrt, bis er am Ziel angekommen ist
			    if(Integer.parseInt(current_floor)<=Integer.parseInt(dest_floor)) 
			      {moveup();}                                                                  //wenn tiefer als Ziel moveup
		   	    else
		   	      {movedown();}                                                                //sonst bzw. wenn h�her als ziel movedown
			    System.out.println(current_floor);
		        }
		    System.out.println("Sie haben ihr Ziel erreicht");
		    }
		    
		    else {System.out.println("falsche Eingabe");}                                      // wird ausgegeben, wenn Eingabe String aber nicht zwischen 0 und 10
		  }
	}
		
	public static void moveup() {                                                              //erh�ht current_floor um 1
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
