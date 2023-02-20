
package javaapplication45;

public class Geometry {
    private double area;
    public double circleArea (double radius)throws InValidAmontExeption{
        if(radius<0){
            throw new InValidAmontExeption (radius+"is negative ");
        }
        area=22/7*radius*radius;
        return area;
        
    }
    public double rectangleArea(double lenth,double width )throws InValidAmontExeption{
        if(lenth<0){
            throw new InValidAmontExeption (lenth+"is negative ");
        }
        else if(width<0){
             throw new InValidAmontExeption (width+"is negative ");
        }
        area=lenth*width;
        return area;
    }
    public double triangleArea(double height,double base)throws InValidAmontExeption{
        if(height<0){
            throw new InValidAmontExeption (height+"is negative ");
        }
        else if(base<0){
             throw new InValidAmontExeption (base+"is negative ");
        }
        area=0.5*base*height;
        return area;
    }
}
