public class TapeDeck {
    boolean canRecords = false;
    boolean canRecord = false;                // добавлена переменная

    void playTape(){
        System.out.println("пленка проигрывается");
    }
    void recordTape(){                       // добавлен метод
        System.out.println("идет запись");
    }
}
