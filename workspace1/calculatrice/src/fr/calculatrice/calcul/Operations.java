package fr.calculatrice.calcul;

public class Operations {
	
	private int x;
	private int y;
	
	public Operations() {
		super();
	}
	
	
	public Operations(int x, int y) {
		//super();
		this.x = x;
		this.y = y;
	}
	
   int add(int x, int y) {
	   return this.x + this.y;
   }
   
   int soust(int x, int y) {
	   return this.x - this.y;
   }
   
   
   
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Operations [x=" + x + ", y=" + y + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
}
