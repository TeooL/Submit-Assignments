public class Flute extends Instrument{
    public Flute(int p, String name){
        super(p,name);
    }
    public void perform(int time){
        System.out.println("It's time to perform");
        super.play(time);
    }
}
