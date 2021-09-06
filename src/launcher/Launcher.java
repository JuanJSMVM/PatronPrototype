package launcher;

import model.Peon;
import model.Reina;
import model.Rey;

public class Launcher {
	public static void main(String[] args) {
		Peon p1 = new Peon();
		p1.setColor("negro");
		p1.setPosx(0);
		p1.setPosy(0);
		
		Peon p2 = (Peon)p1.clone();
		p2.setPosx(7);
		p2.setPosy(0);

		Peon p3 = (Peon)p1.clone();
		p3.setColor("blanco");
		p3.setPosy(7);
		
		Peon p4 = (Peon)p2.clone();
		p4.setColor("blanco");
		p4.setPosy(7);
		
		Reina r1 = new Reina();
		r1.setColor("negro");
		r1.setPosx(3);
		r1.setPosy(0);
		
		Reina r2 = (Reina)r1.clone();
		r2.setColor("blanco");
		r2.setPosy(7);
		
		Rey r3 = new Rey();
		r3.setColor("negro");
		r3.setPosx(4);
		r3.setPosy(0);
		
		Rey r4 = (Rey)r3.clone();
		r4.setColor("blanco");
		r4.setPosy(7);
		
		System.out.println("Peon 1:"+p1);
		System.out.println("Peon 2: "+p2);
		System.out.println("Peon 3: "+p3);
		System.out.println("Peon 4: "+p4);
		
		System.out.println("Reina 1: "+r1);
		System.out.println("Reina 2: "+r2);
		System.out.println("Rey 1: "+r3);
		System.out.println("Rey 2: "+r4);
		
	}
	
}
