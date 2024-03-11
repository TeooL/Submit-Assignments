public class Main {
    public static void main(String[]args){
        Instrument triangle = new Instrument(25);
        System.out.println(triangle);
        System.out.println(triangle.equals(new Instrument(25)));
        Instrument grand = new Piano(200);
        grand.play();
    }
}
