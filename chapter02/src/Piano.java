public class Piano {
    boolean isTuner; // по умолчанию false
    String band;


    void playSound() {
        if (isTuner) {
            System.out.println("Брамс: Венгерский танец №5");
        } else {
            System.out.println("Звук расстроенного пианино...");
        }
    }

    void tunePiano(Tuner tuner) {
        System.out.println("Пианино " + band + " просит настроить себя ");
        tuner.tune(this); // передает себя настройщику через this();
    }

}
