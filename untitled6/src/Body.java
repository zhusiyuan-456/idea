import java.io.PrintWriter;

public class Body implements java.io.Serializable {
    private String name;
    private double mass;
    private double position;
    private double velocity;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getmass(){
        return this.mass;

    }public double getPosition(){
        return this.position;
    }
}public double getVelocity(){
        return this.position;
    }

    public void setAge(double age){
        this.mass = mass;
    }
}

class position implements java.io.Serializable{
    private  double x,y,z;
    public String getposition(){
        return this.x+","+this.y+","+this.z;
    }
    public void setX(double x){
        this.x=x;
    }public void setY(double y){
        this.y=y;
    }public void setZ(double z){
        this.z=z;
    }
}

class velocity implements java.io.Serializable{
    private double x,y,z;
    public String getvelocity(){
        return this.x+","+this.y+","+this.z;
    }
    public void setX(double x){
        this.x=x;
    }public void setY(double y){
        this.y=y;
    }public void setZ(double z){
        this.z=z;
    }
}