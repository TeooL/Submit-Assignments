public class Flute extends Instrument{
    public Flute(int p){
        super(p);
    }
    public void perform(int time){
        System.out.println("It's time to perform");
        super.play(time);
    }
}
