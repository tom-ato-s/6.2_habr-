// класс- шаблон ждя создания объекта слушателя
// Слушатель получает от производителя строку и выводит ее на экран



class ConcreteObserver implements Observer {
    private StringBuilder stringBuilder;
    private int schet= 0;
    @Override
    public void update(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
        schet = schet+1;
        display();

    }
    public void display(){
        System.out.println(stringBuilder + " добавление по порядку " + schet);
    }
}
