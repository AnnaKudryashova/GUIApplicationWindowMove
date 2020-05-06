import javax.swing.*;
import java.awt.*;

// Класс для панели меню:
public class MyMenuBar extends JMenuBar {
    private MyFrame frame;
    // Аргумент - ссылка на окно, в которое добавляется панель:
    MyMenuBar(MyFrame frame) {
        super();
        this.frame = frame; // Присваивание значения ссылке на объект окна
        // Первое меню - "Окно":
        JMenu wind = new JMenu("Окно");
        // Пункты для меню "Окно":
        JMenuItem apply = new JMenuItem("Подтверждаю");
        JMenuItem exit = new JMenuItem("Выход");
        //Регистрация обработчиков событий:

        apply.addActionListener(new HandlerYes(frame));
        exit.addActionListener(new HandlerNo());

        // Добавление пунктов в меню "Окно":
        wind.add(apply);
        wind.add(exit);
        // Добавление меню "Окно" в панель меню:
        add(wind);
        // Второе меню - "По горизонтали":
        JMenu horiz = new JMenu("По горизонтали");
        // Пункты для меню "По горизонтали":
        JMenuItem left = new JMenuItem("Влево");
        JMenuItem right = new JMenuItem("Вправо");
        JMenuItem hnone = new JMenuItem("На месте");
        // Регистрация обработчиков событий:
        left.addActionListener(new MenuHandler(frame, true));
        right.addActionListener(new MenuHandler(frame, true));
        hnone.addActionListener(new MenuHandler(frame, true));
        // Добавление пунктов в меню "По горизонтали"
        horiz.add(left);
        horiz.add(right);
        horiz.add(hnone);
        // Добавление меню "По горизонтали" в панель меню:
        add(horiz);
        // Третье меню - "По вертикали":
        JMenu vert = new JMenu("По вертикали");
        // Пункты для меню "По вертикали":
        JMenuItem up = new JMenuItem("Вверх");
        JMenuItem down = new JMenuItem("Вниз");
        JMenuItem vnone = new JMenuItem("На месте");
        // Регистрация обработчиков событий:
        up.addActionListener(new MenuHandler(frame, false));
        down.addActionListener(new MenuHandler(frame, false));
        vnone.addActionListener(new MenuHandler(frame, false));
        // Добавление пунктов в меню "По вертикали":
        vert.add(up);
        vert.add(down);
        vert.add(vnone);
        // Добавление меню "По вертикали" в панель меню:
        add(vert);
        // Положение и размер панели меню:
        setBounds(1, 1, frame.getWidth() - 1, frame.getHeight() / 10);
        // Добавление панели меню в окно:
        frame.add(this);
    }}
        // Специальная панель:
        class MyPanel extends JPanel {
        // Ссылки на метки с текстом, указывающим направление перемещения:
        public JLabel HLab; // по горизонтали
        public JLabel VLab; // по вертикали
        MyPanel() {
            super();
            JLabel L1 = new JLabel ("По горизонтали: ");
            JLabel L2 = new JLabel ("По вертикали:" );
            HLab = new JLabel ("на месте");
            VLab = new JLabel ("на месте");
        // Подключается менеджер компоновки.
        // Панель разбивается на четыре ячейки (две строки и два столбца).
        // Зазор между ячейками составляет 3 пикселя.
        setLayout(new GridLayout(2,2,3,3));
        // Добавление меток в панель:
        add(L1);
        add(HLab);
        add(L2);
        add(VLab);
        }
}
