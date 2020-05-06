import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Класс обработчика для щелчка на кнопке "Нет" или выбора пункты меню "Выход":
public class HandlerNo implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }
}

// Класс обработчика для щелчка на кнопке "Да" или выбора пункта меню "Подтверждаю":
class HandlerYes implements ActionListener {
    // Ссылка на объект окна, в котором расположена кнопка:
    private MyFrame frame;

    HandlerYes(MyFrame frame) {
        // Присваивание значения ссылке:
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent ae) {
        // Вызов метода handle() для обработки события:
        frame.handler();
    }
}

// Класс обработчика для выбора пунктов меню "По горизонтали" и "По вертикали":
class MenuHandler implements ActionListener {
    // Ссылка на объект окна, в котором размещена панель меню:
    private MyFrame frame;
    // Логическое поле, определяющее, какое из двух меню используется:
    private boolean dir;
// Аргументы - ссылка на объект окна и логический параметр, определяющий одно из двух меню:
// true - меню "По горизонтали" и false - меню "По вертикали":
MenuHandler(MyFrame frame, boolean dir) {
// Присваивание значения ссылке:
    this.frame = frame;
// Присваивание значения логическому параметру:
this.dir = dir;
}
    // Переопределение метода для обработки выбора пункта меню:
public void actionPerformed(ActionEvent ae) {
    // Считывание команды действия:
    String cmd = ae.getActionCommand();
    // Реакция на выбор меню:
    if(dir) {
        frame.move.HLab.setText(cmd.toLowerCase());
        if(cmd.equalsIgnoreCase("Вправо")) frame.setH(50);
        else if(cmd.equalsIgnoreCase("Влево")) frame.setH(-50);
        else frame.setH(0);}
    else {
        frame.move.VLab.setText(cmd.toLowerCase());
        if(cmd.equalsIgnoreCase("Вверх")) frame.setV(-50);
        else if(cmd.equalsIgnoreCase("Вниз")) frame.setV(50);
        else frame.setV(0);}
    }}