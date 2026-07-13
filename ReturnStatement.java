public class ReturnStatement{
	public static void main(String[] args){
		System.out.println("the area of the rectangle is " + areaOfRectangle(7,20));
		
	}

    public static int areaOfRectangle(int length , int height){
		int area = length * height;
		
		return area;
	}	
}	