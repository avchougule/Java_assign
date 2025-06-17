import java.util.*;

class Quadrant{

	public static void main(String args[])
	{
		int x,y;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter X co-ordinate:");
		x=sc.nextInt();
		System.out.println("Enter Y co-ordinate:");
		y=sc.nextInt();

		if(x>0 && y>0){
			System.out.println("X and Y are in I Quadrant");
		}
		else if(x<0 && y>0){
			System.out.println("X and Y are in II Quadrant");
		}
		else if(x<0 && y<0){
			System.out.println("X and Y are in III Quadrant");
		}
		else if(x>0 && y<0){
			System.out.println("X and Y are in IV Quadrant");
		}
		else if(x==0 && y==0){
			System.out.println("X and Y are at origin");
			
		}
		else if(y==0){
			System.out.println("Coordinates are on Y axis");
		}
		else if(x==0){
			System.out.println("Coordinates are on X axis");
		}else{
			System.out.println("Invalid");
		}

	}
}