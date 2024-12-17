import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Random;

public class Alam {
    public void warning() {
        CpuFucker fucker = new CpuFucker();
        try {
            ProcessBuilder pb = new ProcessBuilder("nircmd.exe", "setsysvolume", "10000");  //65535가 max
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(() -> {
            int count = 1;
            final int MAX_DIALOGS = 450;
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;
            Random random = new Random();

            while (true) {
                int x = random.nextInt(screenWidth - 200);
                int y = random.nextInt(screenHeight - 100);
                SwingUtilities.invokeLater(() -> {
                    JDialog dialog = new JDialog();
                    dialog.setTitle("경고!!!! ");
                    dialog.setSize(200, 100);
                    dialog.setLocation(x, y);
                    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    JLabel label = new JLabel("게임 하지마세요!!!", SwingConstants.CENTER);
                    dialog.add(label);
                    dialog.setVisible(true);
                    Toolkit.getDefaultToolkit().beep();
                });

                //fucker.warningCpu();

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
