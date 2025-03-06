interface Playable {
    void play();
}
abstract class Guitar implements Playable {
    public void play() {
        System.out.println("Playing guitar");
    }
}
abstract class Piano implements Playable {
    public void play() {
        System.out.println("Playing  piano");
    }
}
class GuitarEx extends Guitar{}
class PianoEx extends Piano{}
public class Interface {
    public static void main(String[] args) {
        Guitar g1 = new GuitarEx();
        Piano p1 = new PianoEx();
        g1.play();
        p1.play();
    }
}
