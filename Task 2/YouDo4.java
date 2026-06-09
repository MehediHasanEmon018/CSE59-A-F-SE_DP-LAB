
class Sensor{
    String name;
    int batterylevel;
    
    Sensor(String name, int batterylevel){
        this.name= name;
        this.batterylevel = batterylevel;
    }
    void charge(){
        batterylevel = 100;
        System.out.println("Sensor fully charged");
    }
}

public class Main {
    public static void main(String[] args){
        Sensor sensor = new Sensor(" Tempertature Sensor", 40);
        sensor.charge();
        System.out.println("Battery Level: "+sensor.batterylevel);
    }
}
