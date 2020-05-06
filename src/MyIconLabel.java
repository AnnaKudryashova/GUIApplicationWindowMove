import javax.swing.*;
import java.awt.*;

// класс метки с изображением:
public class MyIconLabel extends JLabel {
    private MyFrame frame;
    MyIconLabel(MyFrame frame) {
        super(); //Вызов конструктора суперкласса
        this.frame = frame; // Заполнение поля класса
        ImageIcon icn = new ImageIcon("C:\\Users\\АЛЬБИНА\\Desktop\\Anna\\TextFieldWindowCreation\\src\\cat4.gif");
        setIcon(icn); // Добавление изображения в метку
        setBounds(5, 15, frame.getWidth()/4-10, frame.getHeight()-30); // Положение и размер метки
        frame.add(this); // Добавление метки в окно
    }
}
