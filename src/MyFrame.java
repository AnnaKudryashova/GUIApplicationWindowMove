import javax.swing.*;
import java.awt.*;

// Класс для реализации окна:
public class MyFrame extends JFrame {
    // Ссылка на панель с текстовыми метками:
    public MyPanel move;
    // Числовое поле - массив, содержащий значения
    // для шага перемещения окна по горизонтали и вертикали:
    private int [] step;
    // Метод для изменения шага перемещения по горизонтали:
    public void setH(int i) {
        step[0]=i;}
    // Метод для изменения шага перемещения по вертикали:
    public void setV(int i) {
        step[1]=i;}
    // Аргументы - название окна и его размеры:
    MyFrame(String text, int width, int height) {
        super();
    // Начальное значение для шага перемещений:
    step = new int [] {0,0};
    // Применение заголовка:
    setTitle(text);
    // Положение и размеры окна:
    setBounds(400, 300, width, height);
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    new MyButton(this,true);
    new MyButton(this, false);
    // Создание панели меню:
    new MyMenuBar(this);
    // Создание метки с изображением:
    new MyIconLabel(this);
    // Создание метки с текстом:
    JLabel msg = new JLabel("Хотите переместить окно?");
    // Положение и размеры метки с текстом:
    msg.setBounds(getWidth()/4,15,3*getWidth()/4-10,getHeight()/4-5);
    // Создание шрифта:
    Font fnt = new Font("Arial", Font.BOLD, 18);
    // Применение шрифта для метки с текстом:
    msg.setFont(fnt);
    // Добавление текстовой метки в окно:
    add(msg);
    // Создание панели с текстовыми метками:
    move = new MyPanel();
    // Положение и размеры панели:
    move.setBounds(msg.getX(), msg.getY() + msg.getHeight() + 1, msg.getWidth(), msg.getHeight());
    // Добавление панели в окно:
    add(move);
    setResizable(false);
    setVisible(true); }
    // Метод вызывается для перемещения окна
    // при обработке щелчка на кнопке "Да" или
    // выборе пункта меню "Подтверждаю":
    void handler() {
    // Изменение позиции окна:
    setLocation(getX() + step[0], getY() + step[1]);}
}
