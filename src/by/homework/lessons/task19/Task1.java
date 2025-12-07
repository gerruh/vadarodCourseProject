package by.homework.lessons.task19;

//1 Создать интерфейс, который будет обрабатывать входящий параметр типа String.
//1.1 На основании этого интерфейса создать лямбда выражение, которое будет возвращать строку с большими буквами.

public class Task1 {
    public static void main(String[] args) {

        //с лямбдой
        StringReceiver sr = a -> System.out.println(a.toUpperCase());
        sr.receive("hello1");

        //с анонимным классом
        StringReceiver sr2 = new StringReceiver() {
            @Override
            public void receive(String s) {
                System.out.println(s.toUpperCase());
            }
        };

        sr2.receive("hello2");
    }
}
