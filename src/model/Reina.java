package model;

public class Reina extends FichaAjedrez{
	
	public Reina() {
		
	}
	
	private Reina(Reina r) {
		super(r);
		
	}

	@Override
	public FichaAjedrez clone() {
		// TODO Auto-generated method stub
		return new Reina(this);
	}

}
