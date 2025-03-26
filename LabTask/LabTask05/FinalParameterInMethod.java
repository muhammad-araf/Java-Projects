 class Circle {
    public static double calculateArea(final double radius) {
        System.out.println(radius);
        radius = 23.789; // The final local variable radius cannot be assigned. It must be blank and not using a final variable.
        return radius;
    }

    public static void main(String[] args) {
        System.out.println("Area: " + calculateArea(5.0));
    }
}