public class Instrument {
    private String name;
    private int price;
    public Instrument(int p, String name){
        price = p;
        this.name = name;
    }
    public void play(int time){
        System.out.println("Playing for " + time + " hours");
    }
    public void makeNoise(){
        System.out.println("Making noise!");
    }
    public String toString(){
        return name;
    }
}
