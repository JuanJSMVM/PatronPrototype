package model;

public class Alfil extends FichaAjedrez {

	public Alfil() {

	}

	private Alfil(Alfil r) {
		super(r);

	}

	@Override
	public FichaAjedrez clone() {
		// TODO Auto-generated method stub
		return new Alfil(this);
	}

}
