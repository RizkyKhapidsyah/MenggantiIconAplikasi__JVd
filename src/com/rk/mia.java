package com.rk;

import javax.swing.*;
import java.awt.*;

public class mia extends JFrame {
    public mia() {
        super("Custom Jframe Form");
        Inisialisasi_Komponen();
    }

    public void Inisialisasi_Komponen() {
        Image Gambar = new ImageIcon("images/menangis.png").getImage();
        setIconImage(Gambar);
        setPreferredSize(new Dimension(200, 200));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
