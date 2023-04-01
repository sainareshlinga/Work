public class Cuboid {
    private double length;
    private double breadth;
    private double height;
    
    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    
    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getBreadth() {
        return breadth;
    }
    
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double volume() {
        return length * breadth * height;
    }
    
    @Override
    public String toString() {
        return "Cuboid [length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
    }
    
    public String volumeToString() {
        return "Volume: " + volume();
    }
}