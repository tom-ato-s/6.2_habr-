//в класс - шаблон для создания объекта производителя.
//в классе описаны методы интерфейса Observable: Добавление, удаление слушателя и оповещение слушателя.



import java.util.ArrayList;

public class ConcreteObservable implements Observable{

ArrayList<Observer> observers ;
StringBuilder_ stringBuilder_;


    ConcreteObservable(StringBuilder_ stringBuilder_) {//шаблон для создание объекта производителя
        observers = new ArrayList<>();
        this.stringBuilder_ = stringBuilder_;

}

    @Override
    public void addObserver(Observer observer) { // переопределенный метод добавления слушателя в список
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) { // переопределенный метод удаления слушателя из списка
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() { // отправка оповещения слушателям
        for(Observer observer: observers) {
            observer.update(stringBuilder_.getStringBuilder());
        }
    }

    public void changStringBuilder() { //  изменение строки и отправка о изменениии слушателям
        stringBuilder_.append('A');
        notifyObserver();

    }

}
