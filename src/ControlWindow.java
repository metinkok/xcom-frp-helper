import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ControlWindow extends JFrame{

    private JButton randomPod;
    private JButton mutonPod;
    private JButton sectoidPod;
    private JButton berserkerPod;
    private JButton sectoidCommanderPod;
    private JButton cyberdiskPod;
    private JButton thinmanPod;

    private FlowLayout flayout=new FlowLayout();

    ControlWindow(){
        super("Pod creator");
        randomPod = new JButton("Create random pod");
        sectoidPod = new JButton("Create sectoid pod");
        mutonPod = new JButton("Create muton pod");;
        berserkerPod = new JButton("Create berserker pod");
        sectoidCommanderPod = new JButton("Create sectoidCommander pod");
        cyberdiskPod = new JButton("Create cyberdisk pod");
        thinmanPod = new JButton("Create thinman pod");

        setLayout(flayout);

        Handler handler = new Handler();
        sectoidPod.addActionListener(handler);
        mutonPod.addActionListener(handler);
        berserkerPod.addActionListener(handler);
        sectoidCommanderPod.addActionListener(handler);
        cyberdiskPod.addActionListener(handler);
        thinmanPod.addActionListener(handler);
        randomPod.addActionListener(handler);

        add(sectoidPod);
        add(mutonPod);
        add(berserkerPod);
        add(sectoidCommanderPod);
        add(cyberdiskPod);
        add(thinmanPod);
        add(randomPod);
    }
    private class Handler implements ActionListener
    {
        private void createSectoids(){
            for(int i = 0; i<3; i++){
                AlienWindow window = new AlienWindow(new Sectoid());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375,400);
                window.setVisible(true);
            }
            System.out.println("Created sectoid pod");
        }
        private void createMutons(){
            for(int i = 0; i<3; i++){
                AlienWindow window = new AlienWindow(new Muton());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375,400);
                window.setVisible(true);
            }
            System.out.println("Created muton pod");
        }
        private void createBerserker(){
            for(int i = 0; i<2; i++){
                AlienWindow window = new AlienWindow(new Muton());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375,400);
                window.setVisible(true);
            }
            AlienWindow window = new AlienWindow(new Berserker());
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(375,400);
            window.setVisible(true);
            System.out.println("Created berserker pod");
        }
        private void createSectoidCommander(){
            for(int i = 0; i<2; i++){
                AlienWindow window = new AlienWindow(new Sectoid());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375,400);
                window.setVisible(true);
            }
            AlienWindow window = new AlienWindow(new SectoidCommander());
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(375,400);
            window.setVisible(true);
            System.out.println("Created sectoid commander pod");
        }
        private void createCyberdisk() {
            for(int i = 0; i<2; i++){
                AlienWindow window = new AlienWindow(new Drone());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375,400);
                window.setVisible(true);
            }
            AlienWindow window = new AlienWindow(new Cyberdisc());
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(375,400);
            window.setVisible(true);
            System.out.println("Created Cyberdisk pod");
        }
        private void createThinmans(){
            for(int i = 0; i<3; i++) {
                AlienWindow window = new AlienWindow(new Thinman());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375, 400);
                window.setVisible(true);
                System.out.println("Created thinman pod");
            }
        }
        public void actionPerformed(ActionEvent event)
        {
            if(event.getActionCommand().equals("Create random pod")) {
                Random generator = new Random();
                int pod = generator.nextInt(6);
                if(pod == 0)
                    createSectoids();
                else if(pod == 1)
                    createMutons();
                else if(pod == 2)
                    createBerserker();
                else if(pod == 3)
                    createSectoidCommander();
                else if(pod == 4)
                    createCyberdisk();
                else if(pod == 5)
                    createThinmans();
            }
            else if(event.getActionCommand().equals("Create sectoid pod")) {
                createSectoids();
            }
            else if(event.getActionCommand().equals("Create muton pod")) {
                createMutons();
            }
            else if(event.getActionCommand().equals("Create berserker pod")) {
                createBerserker();
            }
            else if(event.getActionCommand().equals("Create sectoidCommander pod")) {
                createSectoidCommander();
            }
            else if(event.getActionCommand().equals("Create cyberdisk pod")) {
                createCyberdisk();
            }
            else if(event.getActionCommand().equals("Create thinman pod")) {
                createThinmans();
            }
        }
    }
}
