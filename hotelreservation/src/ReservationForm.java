import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservationForm extends JFrame {
    private JTextField textFieldIsim;
    private JTextField textFieldSoyisim;
    private JTextField textFieldTc;
    private JTextField textFieldOdaNo;
    private JTextField textFieldRezervasyonTarihi;
    private JButton buttonKaydet;

    public ReservationForm() {
        initializeUI();
    }

    private void initializeUI() {
        // Pencere ayarları
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hotel Reservation");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));

        // Bileşenlerin oluşturulması
        JLabel labelIsim = new JLabel("İsim:");
        JLabel labelSoyisim = new JLabel("Soyisim:");
        JLabel labelTc = new JLabel("TC:");
        JLabel labelOdaNo = new JLabel("Oda No:");
        JLabel labelRezervasyonTarihi = new JLabel("Rezervasyon Tarihi:");
        textFieldIsim = new JTextField();
        textFieldSoyisim = new JTextField();
        textFieldTc = new JTextField();
        textFieldOdaNo = new JTextField();
        textFieldRezervasyonTarihi = new JTextField();
        buttonKaydet = new JButton("Kaydet");

        // Bileşenlerin panele eklenmesi
        add(labelIsim);
        add(textFieldIsim);
        add(labelSoyisim);
        add(textFieldSoyisim);
        add(labelTc);
        add(textFieldTc);
        add(labelOdaNo);
        add(textFieldOdaNo);
        add(labelRezervasyonTarihi);
        add(textFieldRezervasyonTarihi);
        add(new JLabel()); // Boş label
        add(buttonKaydet);

        // Kaydet butonuna tıklama olayının atanması
        buttonKaydet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Butona tıklanınca yapılacak işlemler
                String isim = textFieldIsim.getText();
                String soyisim = textFieldSoyisim.getText();
                String tc = textFieldTc.getText();
                String odaNo = textFieldOdaNo.getText();
                String rezervasyonTarihi = textFieldRezervasyonTarihi.getText();

                // Verilerin işlenmesi veya kaydedilmesi
                // Bu kısımda verileri işleyebilir veya bir veritabanına kaydedebilirsiniz
                System.out.println("İsim: " + isim);
                System.out.println("Soyisim: " + soyisim);
                System.out.println("TC: " + tc);
                System.out.println("Oda No: " + odaNo);
                System.out.println("Rezervasyon Tarihi: " + rezervasyonTarihi);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ReservationForm().setVisible(true);
            }
        });
    }
}

