import java.util.ArrayList;
public class Main {
    public static void main(String[]args){
        Instrument flute = new Flute(100,"flute");
        inspect(flute);
        Flute flute2 = new Flute(100, "flute2");
        Instrument[] storage = new Instrument[3];
        storage[0] = flute2;
        storage[1] = new Instrument(40, "bell");
        storage[2] = new Instrument(80, "violin");
        ArrayList<Instrument> storage2 = new ArrayList<Instrument>();
        storage2.add(new Instrument(40, "bell"));
        storage2.add(new Instrument(80, "violin"));
        storage2.add(flute2);
        for(Instrument i: storage){
            System.out.println(i);
        }
        System.out.println(storage2);
    }
    public static void inspect(Instrument i){
        System.out.println("Inspecting the instrument " + i);
    }
}
