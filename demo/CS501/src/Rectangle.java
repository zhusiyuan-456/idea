
public class Rectangle
{

    private double width = 1.0;
    private double height = 1.0;
    private String errorMessage = "";


    public Rectangle() {}
    public Rectangle(double _width, double _height) throws Exception
    {
        setWidth(_width);
        setHeight(_height);
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public String getErrorMessage() { return errorMessage; }


    public void setWidth(double _width) throws Exception
    {
        if(!isValidWidth(_width))
            throw new Exception(errorMessage);
        width = _width;
    }
    public void setHeight(double _height) throws Exception
    {
        if(!isValidHeight(_height))
            throw new Exception(errorMessage);
        height = _height;
    }

    public void print()
    {
        //System.out.println("Rectangle:");
        //System.out.println("----------");
        System.out.println("Width     = " + width);
        System.out.println("Height    = " + height);
        System.out.println("Area      = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }
    public String toString()
    {
        return "[Width = " + width + "; Height = " + height + "]";
    }
    public boolean equals(Object o)
    {
        // check for null parameter
        if( o == null) return false;

        // check for object type
        String s = o.getClass().getName(); // method to get class name
        if( !s.equals("Rectangle")) return false;

        // check for equivalent parameter values
        Rectangle b = (Rectangle) o;	// cast unspecified object to
        // Rectangle object in order to be able
        // to use Rectangle get() functions
        if(	width != b.getWidth()) return false;
        if( height != b.getHeight()) return false;

        return true;
    }


    public boolean isValidWidth(double _width)
    {
        if(_width > 0)
            return true;
        else
        {
            errorMessage = "Invalid Width Length: must be greater than 0";
            return false;
        }

    }
    public boolean isValidHeight(double _height)
    {
        if(_height > 0)
            return true;
        else
        {
            errorMessage = "Invalid Height Length: must be greater than 0";
            return false;
        }
    }


    public double getArea()
    {
        return width*height;
    }
    public double getPerimeter()
    {
        return (2*width)+(2*height);
    }

}