package com.edityj.v1ch02;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ImageViewer {
  public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
      JFrame frame = new ImageViewerFrame();
      frame.setTitle("ImageViewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    });
  }
}

class ImageViewerFrame extends JFrame {
  private JLabel label;
  private JFileChooser chooser;
  private static final int DEFAULT_WIDTH = 300;
  private static final int DEFAULT_HEIGHT = 400;

  public ImageViewerFrame() {
    setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

    // use a label to display the images
    label = new JLabel();
    add(label);

    // setup the file chooser
    chooser = new JFileChooser();
    chooser.setCurrentDirectory(new File("."));

    // setup the menu bar
    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    JMenu menu = new JMenu("File");
    menuBar.add(menu);
    JMenuItem openItem = new JMenuItem("Open");
    menu.add(openItem);
    openItem.addActionListener(event -> {
      // show file chooser dialog
      int result = chooser.showOpenDialog(null);

      //if file select, set it as icon of label
      if (result == JFileChooser.APPROVE_OPTION) {
        String name = chooser.getSelectedFile().getPath();
        label.setIcon(new ImageIcon(name));
      }
    });

    JMenuItem exitItem = new JMenuItem("exit");
    menu.add(exitItem);
    exitItem.addActionListener(event -> System.exit(0));
  }
}
