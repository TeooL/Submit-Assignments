public class Instrument {
    private int price;
    public Instrument(int p){
        price = p;
    }
    public String toString(){
        return "This Instrument costs " + price + " dollars.";
    }
    public boolean equals(Instrument instrument){
        if (this.price == instrument.price) return true;
        else return false;
    }
    public void play(){
        System.out.println("PLAYING MUSIC ~~~~~");
    }
}
