package generics;

public abstract class GeometricObject implements Comparable<GeometricObject>{

		private String color = "white";
		private boolean filled;
		private java.util.Date dateCreated;
		public abstract double getArea();
		
		
	@Override
	public int compareTo(GeometricObject arg0) {
		if(this.getArea() > arg0.getArea()){
			return 1;
		}else if(this.getArea() < arg0.getArea()){
			return -1;
		}else {
			return 0;
		}
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public boolean isFilled() {
		return filled;
	}


	public void setFilled(boolean filled) {
		this.filled = filled;
	}


	public java.util.Date getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public String toString() {
		 return "Circle with area: "+this.getArea();
	 }
	
	
}
