
public class TestGeometricObject {

	// Main Method
	public static void main(String[] args) {
		// Create two geometric objects
		GeometricObject geoObject1 = new Circle(5);
		GeometricObject geoObject2 = new Rectangle(5, 3);
		
		System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));
		
		// display circle
		displayGeometricObject(geoObject1);
		
		// display rectangle
		displayGeometricObject(geoObject2);
	}
	
	// a method for comparing the areas of two geometric objects
	public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
		return object1.getArea() == object2.getArea();
	}
	
	// a method for displaying a geometric object
	public static void displayGeometricObject(GeometricObject object) {
		System.out.println();
		System.out.println("The area is " + object.getArea());
		System.out.println("The perimeter is " + object.getPerimeter());
	}
}
