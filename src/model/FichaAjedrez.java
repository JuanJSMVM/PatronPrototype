package model;

public abstract class FichaAjedrez {
	private int posx;
	private int posy;
	private String color;
	
	public FichaAjedrez() {
		
	}
	
	protected FichaAjedrez(FichaAjedrez f) {
		this.posx=f.posx;
		this.posy=f.posy;
		this.color=f.color;
	}

	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract FichaAjedrez clone();

	@Override
	public String toString() {
		return "posicion x=" + posx + ", posicion y=" + posy + ", color=" + color;
	}
	
	
	
	
}
