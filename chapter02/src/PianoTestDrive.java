public class PianoTestDrive {
    public static void main(String[] args) {

        Piano piano = new Piano();
        piano.band = "Заря";
        Tuner tuner = new Tuner();

        piano.playSound();
        piano.tunePiano(tuner);
        piano.playSound();
    }
}
