public class  Rectangle {
    double width = 1;
    double height = 1;

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        double area = this.height * this.width;
        return area;
    }

    public double getPerimeter(){
        double perimeter = (this.height + this.width) * 2;
        return perimeter;
    }
    
}









