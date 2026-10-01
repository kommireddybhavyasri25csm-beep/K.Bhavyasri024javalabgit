class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius; // 'this.radius' = instance var, 'radius' = param
    }
    double area() { return Math.PI * this.radius * this.radius; }
}
