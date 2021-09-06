package model;

public class Torre extends FichaAjedrez {

	public Torre() {

	}

	private Torre(Torre t) {
		super(t);

	}

	@Override
	public FichaAjedrez clone() {
		// TODO Auto-generated method stub
		return new Torre(this);
	}

}
