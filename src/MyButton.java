import javax.swing.*;

public class MyButton extends JButton {
    private MyFrame frame;
    // Аргументы - окно, в которое добавляется кнопка и
    // логическое значение, определяющее тип кнопки:
    MyButton(MyFrame frame, boolean state) {
        super();
        this.frame = frame;
        // Текст для записи имени файла изображения:
        String fileName;
        // Текст для записи имени кнопки:
        String bName;
        if(state) {
            fileName = "Yes.png";
            bName = "Yes";
            addActionListener(new HandlerYes(frame)); }
            else {fileName = "No.png";
            bName = "No";
            addActionListener(new HandlerNo()); }
            fileName = "C:\\Users\\АЛЬБИНА\\Desktop\\Anna\\TextFieldWindowCreation\\src" + fileName;

            ImageIcon icn = new ImageIcon(fileName);
            setIcon(icn);
            setText(bName);
            setFocusPainted(false);
            int w = frame.getWidth()/4;
            int h = frame.getHeight()/8;
            setSize(w,h);
            int x = frame.getWidth()/4, y = frame.getHeight()-h-50;
            if(!state) x+=w+50;
            setLocation(x,y);
            frame.add(this);}
        }