package net.instituto.desa;

public class Jugador {
	int y, x;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void moveAbajo() {
		setY(getY() + 1);
	}

	public void moveArriba() {
		setY(getY() - 1);
	}

	public void moveIzquierda() {
		setX(getX() - 1);
	}

	public void moveDerecha() {
		setX(getX() + 1);
	}

}
