// главный класс, в нем создаются объекты Производителя и Слушателя


public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder  = new StringBuilder("ABC");
        StringBuilder_ stringBuilder_ = new StringBuilder_(stringBuilder);
        ConcreteObservable ol = new ConcreteObservable(stringBuilder_);


        ConcreteObserver o1 = new ConcreteObserver();
        ol.addObserver(o1);

        ConcreteObserver o2 = new ConcreteObserver();
        ol.addObserver(o2);

        ol.changStringBuilder();
    }
}
