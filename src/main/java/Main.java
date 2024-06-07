import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame myframe = new JFrame();
        Gameplay gameplay = new Gameplay();

        myframe.setBounds(10, 10, 700, 600);
        myframe.setTitle("Emma's Brick Breaker Game");
        myframe.setResizable(false);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myframe.add(gameplay);
        myframe.setVisible(true);
        
    }
}
