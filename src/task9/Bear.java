package task9;

public class Bear {
            /*
Создать класс Bear. В нем поля имя, возраст и пол. Поля приватные.
Создать конструктор для задания имени и пола. Для Возраста задать
геттеры и сеттеры.
Создать метод voice, который выводит в консоль сообщение "RRRRRRRR!!!!"

Создать метод makeBabyBear, который в свои параметры требует объект
класса Bear, строку и boolean.
Если пол у медведей совпадает, то тогда возвращается новый медведь с пустым именем.
(поле пол можете оставить любым). Если пол разный, то возвращается новы медведь
с именем и полом, которые он получает из аргументов переданных в параметры метода.

Переопределить метод toString() который в случае если у медведя поле имени равно
null, возвращает строку типа: "Я не мог быть рожден", в противном случае он
возвращает информацию о медведе.
*/
    private String nameBear;
    private int ageBear;
    private boolean male;

    public int getAgeBear() {
        return ageBear;
    }

    public void setAgeBear(int ageBear) {
        this.ageBear = ageBear;
    }

    public Bear(String nameBear, boolean male) {
        this.nameBear = nameBear;
        this.male = male;
    }
    public void voice(){
        System.out.println("RRRRRRRR!");
    }

    public Bear makeBabyBear (Bear newBear, String nameBear, boolean male) {
        if (this.male == newBear.male) {
            return new Bear(null, true);
        } else {
            return new Bear(nameBear, male);
        }
    }
        @Override
        public String toString () {
            if (nameBear == null) {
                return "Я не мог быть рождён";
            }
            else {
                return "Имя медведя " + nameBear + ". Пол медведя " + male;
            }
        }

    public static void main(String[] args) {
        Bear bear1 = new Bear("Max", true);
        Bear bear2 = new Bear("Ulya", false);
        Bear bear3 = new Bear("Michael", true);

        Bear newBear = bear1.makeBabyBear(bear2, "Vasya", true);
        Bear newBear2 = bear1.makeBabyBear(bear3, "Nastya", false);
        System.out.println(newBear);
        System.out.println(newBear2);
    }
}