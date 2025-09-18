public class MethodExamples {

    // 1. Method with no return type and no parameters (void method)
    public static void greet() {
        System.out.println("Hello from the greet method!");
    }

    // 2. Method with a return type and parameters
    public static int add(int a, int b) {
        int sum = a + b;
        return sum; // Returns the calculated sum
    }

    // 3. Method with a String return type and a String parameter
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 4. Method that demonstrates method overloading (same name, different parameters)
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        // Calling the greet method
        greet();

        // Calling the add method and storing the result
        int resultSum = add(10, 5);
        System.out.println("Sum of 10 and 5: " + resultSum);

        // Calling the createFullName method
        String fullName = createFullName("John", "Doe");
        System.out.println("Full Name: " + fullName);

        // Calling overloaded calculateArea methods
        double circleArea = calculateArea(7.0);
        System.out.println("Area of circle with radius 7: " + circleArea);

        double rectangleArea = calculateArea(4.0, 6.0);
        System.out.println("Area of rectangle with length 4 and width 6: " + rectangleArea);
    }
}
