public class Instrument {
    private int price;
    public Instrument(int p){
        price = p;
    }
    public void play(int time){
        System.out.println("Playing for " + time + " hours");
    }
    public void makeNoise(){
        System.out.println("Making noise!");
    }
}
