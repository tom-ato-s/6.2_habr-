//класс где производитель производит действия. В данном случае действия производятся над строкой
// Слушателю будет отправлен результат работы

class StringBuilder_ {

    private StringBuilder stringBuilder;  // стока над которой будут проводиться действия

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }  //геттер

    public void setStringBuilder(StringBuilder sb) {
        stringBuilder = sb;
    } // сеттер

   StringBuilder_(StringBuilder stringBuilder) {  //конструктор для создания строки
        this.stringBuilder = stringBuilder;
    }

// меторы для работы со строкой


    public int length() {
        return stringBuilder.length();
    }

    public int indexOf(char ch) {
        return stringBuilder.indexOf(String.valueOf(ch));
    }

    public StringBuilder substring(int i) {
        return new StringBuilder(stringBuilder.substring(i));
    }


    public StringBuilder substring(int i, int j) {
        return new StringBuilder(stringBuilder.substring(i, j));
    }

    public StringBuilder delete(int start, int fin) {
        return stringBuilder.delete(start, fin);
    }

    public void append(char ch) {
        stringBuilder.append(ch);}

    public StringBuilder reverse() {
        int length = stringBuilder.length();
        StringBuilder temp = new StringBuilder();

        for( int i = 0; i<length; i++) {
            temp.append(stringBuilder.charAt(length - 1 - i));
        }
        stringBuilder = temp;
        return stringBuilder;
    }


}
