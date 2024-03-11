public class Main {
    public static void main(String[]args){
        Instrument triangle = new Instrument(25);
        Instrument horn =  new Instrument(20);
        System.out.println(triangle);
        System.out.println(triangle.equals(new Instrument(25)));
        System.out.println(horn);
        System.out.println(horn.equals(new Instrument(20)));
    }
}
