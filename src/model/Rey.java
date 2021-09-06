package model;

public class Rey extends FichaAjedrez{
	
	public Rey() {
		
	}
	
	private Rey(Rey r) {
		super(r);
		
	}

	@Override
	public FichaAjedrez clone() {
		// TODO Auto-generated method stub
		return new Rey(this);
	}

}
