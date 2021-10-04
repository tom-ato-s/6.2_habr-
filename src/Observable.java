//Интерфейс с методами для добавления, удаления и оповещения наблюдателей.
// Все операции над объектами
public interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}

