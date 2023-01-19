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
    private JButton etheralPod;
    private JButton uber_etheral;
    private JButton mechtoid;
    private JButton seeker;
    private JButton chryssalid;
    private JButton sectopod;
    private JButton mutonElite;
    private JButton zombie;


    private FlowLayout flayout=new FlowLayout();

    ControlWindow(){
        super("Pod creator");
        randomPod = new JButton("Create random pod");
        sectoidPod = new JButton("Create sectoid pod");
        mutonPod = new JButton("Create muton pod");;
        berserkerPod = new JButton("Create berserker pod");
        sectoidCommanderPod = new JButton("Create sectoidCommander pod");
        cyberdiskPod = new JButton("Create cyberdisc pod");
        thinmanPod = new JButton("Create thinman pod");
        etheralPod = new JButton("Create etheral pod");
        uber_etheral = new JButton("Create uber etheral pod");
        mechtoid = new JButton("reate mechtoid pod");
        seeker = new JButton("Create seeker pod");
        chryssalid = new JButton("Create chryssalid pod");
        sectopod = new JButton("Create sectopod pod");
        mutonElite = new JButton("Create muton elite pod");
        zombie = new JButton("Add zombie");

        setLayout(flayout);

        Handler handler = new Handler();
        sectoidPod.addActionListener(handler);
        mutonPod.addActionListener(handler);
        berserkerPod.addActionListener(handler);
        sectoidCommanderPod.addActionListener(handler);
        cyberdiskPod.addActionListener(handler);
        thinmanPod.addActionListener(handler);
        etheralPod.addActionListener(handler);
        uber_etheral.addActionListener(handler);
        mechtoid.addActionListener(handler);
        seeker.addActionListener(handler);
        chryssalid.addActionListener(handler);
        sectopod.addActionListener(handler);
        mutonElite.addActionListener(handler);
        randomPod.addActionListener(handler);
        zombie.addActionListener(handler);

        add(sectoidPod);
        add(mutonPod);
        add(berserkerPod);
        add(sectoidCommanderPod);
        add(cyberdiskPod);
        add(thinmanPod);
        add(etheralPod);
        add(mechtoid);
        add(seeker);
        add(chryssalid);
        add(sectopod);
        add(mutonElite);
        add(uber_etheral);
        add(randomPod);
        add(zombie);
    }
    private class Handler implements ActionListener
    {
        private void createSectoids(){
            for(int i = 0; i<3; i++){
                AlienWindow window = new AlienWindow(new Sectoid());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375,500);
                window.setVisible(true);
            }
            System.out.println("Created sectoid pod");
        }
        private void createMutons(){
            for(int i = 0; i<3; i++){
                AlienWindow window = new AlienWindow(new Muton());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375,500);
                window.setVisible(true);
            }
            System.out.println("Created muton pod");
        }
        private void createBerserker(){
            for(int i = 0; i<2; i++){
                AlienWindow window = new AlienWindow(new Muton());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375,500);
                window.setVisible(true);
            }
            AlienWindow window = new AlienWindow(new Berserker());
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(375,500);
            window.setVisible(true);
            System.out.println("Created berserker pod");
        }
        private void createSectoidCommander(){
            for(int i = 0; i<2; i++){
                AlienWindow window = new AlienWindow(new Sectoid());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375,500);
                window.setVisible(true);
            }
            AlienWindow window = new AlienWindow(new SectoidCommander());
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(375,500);
            window.setVisible(true);
            System.out.println("Created sectoid commander pod");
        }
        private void createCyberdisk() {
            for(int i = 0; i<2; i++){
                AlienWindow window = new AlienWindow(new Drone());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375,500);
                window.setVisible(true);
            }
            AlienWindow window = new AlienWindow(new Cyberdisc());
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(375,500);
            window.setVisible(true);
            System.out.println("Created cyberdisc pod");
        }
        private void createThinmans(){
            for(int i = 0; i<3; i++) {
                AlienWindow window = new AlienWindow(new Thinman());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375, 500);
                window.setVisible(true);
                System.out.println("Created thinman pod");
            }
        }
        private void createEtheral(){
            for(int i = 0; i<2; i++){
                AlienWindow window = new AlienWindow(new SectoidCommander());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375,500);
                window.setVisible(true);
            }
            AlienWindow window = new AlienWindow(new Etheral());
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(375,500);
            window.setVisible(true);
            System.out.println("Created etheral pod");
        }
        private void createSectopod(){
            for(int i = 0; i<2; i++){
                AlienWindow window = new AlienWindow(new Drone());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375,500);
                window.setVisible(true);
            }
            AlienWindow window = new AlienWindow(new Sectopod());
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(375,500);
            window.setVisible(true);
            System.out.println("Created sectopod pod");
        }
        private void createMechtoid(){
            for(int i = 0; i<2; i++){
                AlienWindow window = new AlienWindow(new Sectoid());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375,500);
                window.setVisible(true);
            }
            AlienWindow window = new AlienWindow(new Mechtoid());
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(375,500);
            window.setVisible(true);
            System.out.println("Created mechtoid pod");
        }
        private void createSeekers(){
            for(int i = 0; i<2; i++){
                AlienWindow window = new AlienWindow(new Seeker());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375,500);
                window.setVisible(true);
            }
            System.out.println("Created seeker pod");
        }
        private void createChryssalids(){
            for(int i = 0; i<3; i++){
                AlienWindow window = new AlienWindow(new Chryssalid());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375,500);
                window.setVisible(true);
            }
            System.out.println("Created chryssalid pod");
        }
        private void createMutonElites(){
            for (int i = 0; i < 3; i++) {
                AlienWindow window = new AlienWindow(new MutonElite());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375, 500);
                window.setVisible(true);
            }
            System.out.println("Created muton elite pod");
        }
        private void createFinalPod() {
            for (int i = 0; i < 2; i++) {
                AlienWindow window = new AlienWindow(new Etheral());
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(375, 500);
                window.setVisible(true);
            }
            AlienWindow window = new AlienWindow(new UberEtheral());
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(375, 500);
            window.setVisible(true);
            System.out.println("Created final boss pod");
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
            else if(event.getActionCommand().equals("Create etheral pod")) {
                createEtheral();
            }
            else if(event.getActionCommand().equals("Create sectopod pod")) {
                createSectopod();
            }
            else if(event.getActionCommand().equals("Create seeker pod")) {
                createSeekers();
            }
            else if(event.getActionCommand().equals("Create mechtoid pod")) {
                createMechtoid();
            }
            else if(event.getActionCommand().equals("Create chryssalid pod")) {
                createChryssalids();
            }
            else if(event.getActionCommand().equals("Create muton elite pod")) {
                createMutonElites();
            }
            else if(event.getActionCommand().equals("Create uber etheral pod")) {
                createFinalPod();
            }
            else if(event.getActionCommand().equals("Add zombie")){
                Zombie zombie = new Zombie();
                AlienWindow window = new AlienWindow(zombie);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(zombie.width, zombie.height+16);
                window.setVisible(true);
                System.out.println("Created a zombie");
            }
        }
    }
}
