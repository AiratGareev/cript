import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileSelector extends JDialog {
    private JPanel contentPane;
    private JFileChooser chooser;

    public FileSelector() {
        setContentPane(contentPane);
        setModal(true);
        pack();
        chooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                GUI.gui.setFile(chooser.getSelectedFile());
                FileSelector.this.setVisible(false);
            }
        });
    }



}
