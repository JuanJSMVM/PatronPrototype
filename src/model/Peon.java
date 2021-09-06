package model;

public class Peon extends FichaAjedrez{
	
	
	public Peon() {
		
	}
	
	private Peon(Peon p) {
		super(p);
		
	}

	@Override
	public FichaAjedrez clone() {
		// TODO Auto-generated method stub
		return new Peon(this);
	}

}
