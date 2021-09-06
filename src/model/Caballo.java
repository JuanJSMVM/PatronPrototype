package model;

public class Caballo extends FichaAjedrez{
	
	public Caballo() {
	
	}
	
	private Caballo(Caballo c) {
		super(c);
		
	}
	
	@Override
	public FichaAjedrez clone() {
		// TODO Auto-generated method stub
		return new Caballo(this);
	}
	
}
