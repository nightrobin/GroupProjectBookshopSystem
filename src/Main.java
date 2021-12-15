import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        Bookshop bksp = new Bookshop();

//        bksp.addBook();
//        bksp.listBook();
//        bksp.showBookInfo();
//        bksp.deactivateBook();
//        bksp.showBookInfo();
//        bksp.buyBook();
//        bksp.showBookInfo();


        JFrame frame = new JFrame();
        frame.setSize(800, 600);

        JButton addBookBtn = new JButton("Customer");
        addBookBtn.setBounds(20, 20, 100, 20);
        frame.add(addBookBtn);
        addBookBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                bksp.addBook();
            }
        });

        JButton listBookBtn = new JButton("Admin");
        listBookBtn.setBounds(120, 20, 100, 20);
        frame.add(listBookBtn);
        listBookBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                bksp.listBook();
            }
        });

        JButton showBookBtn = new JButton("Show Book");
        showBookBtn.setBounds(220, 20, 100, 20);
        frame.add(showBookBtn);

        JButton deactivateBookBtn = new JButton("Deactivate Book");
        deactivateBookBtn.setBounds(320, 20, 100, 20);
        frame.add(deactivateBookBtn);

        JButton buyBookBtn = new JButton("Buy Book");
        buyBookBtn.setBounds(420, 20, 100, 20);
        frame.add(buyBookBtn);



        frame.setLayout(null);
        frame.setVisible(true);
    }
}
