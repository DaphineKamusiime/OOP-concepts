package Discussion;

public class Triangle extends Properties implements Methods {
    private int height;
    private int base;
    private double area;
    private int volume;
    private int perimeter;


    Triangle(int base, int height){
        this.base = base;
        this.height = height;
        
    }


    public double getArea(){
        return this.area;
    }
    public int getVolume(){
        return this.volume;

    }
    public int getPerimeter(){
        return this.perimeter;
    }

    public void computeArea(){
        this.area = 0.5*this.base*this.height;
       
    }
    public void computeVolume(){
       this.volume = 0;
    }
    public void computePerimeter(){

        this.perimeter = 2*this.base + this.height;
    }
    
}
