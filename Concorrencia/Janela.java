
 
import java.awt.Image;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Janela extends Thread {
    JFrame frame = new JFrame();
    JPanel painel = new JPanel();
   // JTextField texto = new JTextField();
    int sleepTime;
 
    public Janela() {
        int x = (int)(Math.random() * 1500);
        int y = (int)(Math.random() * 680);
 
       // texto.setText("Texto");
       // painel.add(texto);
 
        
        ImageIcon icon = new ImageIcon(getClass().getResource("tututu.jpg"));
        Image img = icon.getImage().getScaledInstance(225, 225, Image.SCALE_SMOOTH);
        JLabel imagem = new JLabel(new ImageIcon(img));
 
        // Adiciona a imagem ao painel
        painel.add(imagem);
 
       // painel.setBackground(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
        sleepTime = (int)(Math.random() * 100);
 
        frame.setSize(400, 400);
        frame.add(painel);
        frame.setLocation(x, y);
        frame.setVisible(true);
    }
 
    @Override
    public void run() {
        try {
            Thread.sleep(sleepTime);
            //frame.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}