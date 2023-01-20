import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class AlienWindow extends JFrame {

    private JButton alien;
    private ImageIcon alien_icon;
    private JTextField information;
    private JTextField abilitiesText;
    private BorderLayout blayout=new BorderLayout();
    private Alien xeno;

    AlienWindow(Alien xeno){
        super(xeno.name);
        Handler handler = new Handler();
        this.xeno = xeno;
        String abilities = "";
        for(int i = 0; i<xeno.abilities.length; i++)
            abilities = abilities+", "+xeno.abilities[i];
        abilities = abilities+", "+xeno.damage;
        java.net.URL imgURL = AlienWindow.class.getResource(xeno.image_url);
        alien_icon = new ImageIcon(imgURL);
        alien = new JButton(alien_icon);
        information = new JTextField();
        abilitiesText = new JTextField();

        information.setText("HP:"+xeno.hp+" AIM:"+xeno.aim+" CRIT:"+xeno.critical_chance+" DEF:"+xeno.defence+" MOB:"+xeno.mobility+" WILL:"+xeno.will);
        information.setEditable(false);
        abilitiesText.setText("Abilities:"+abilities);
        abilitiesText.setEditable(false);

        alien.addActionListener(handler);

        setLayout(blayout);

        add(alien, BorderLayout.CENTER);
        add(information, BorderLayout.SOUTH);
        add(abilitiesText, BorderLayout.NORTH);

    }
    private class Handler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            DamageWindow window = new DamageWindow();
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(375,100);
            window.setVisible(true);
        }
    }
    class DamageWindow  extends JFrame {

        private JButton inflictDamage;
        private JTextField damage;
        private BorderLayout layout = new BorderLayout();

        DamageWindow(){
            super("Inflict damage");
            inflictDamage = new JButton("Done");
            damage = new JTextField("");

            DamageHandler damageHandler = new DamageHandler();
            inflictDamage.addActionListener(damageHandler);

            setLayout(layout);

            add(inflictDamage, BorderLayout.EAST);
            add(damage, BorderLayout.CENTER);
        }
        private class DamageHandler implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                AlienWindow.this.setVisible(false);
                int inflictedDamage = Integer.parseInt(damage.getText());
                xeno.hp = xeno.hp - inflictedDamage;
                System.out.println(xeno.name+" took "+inflictedDamage+" damage");
                DamageWindow.this.setVisible(false);
                if(xeno.hp > 0){
                    AlienWindow window = new AlienWindow(xeno);
                    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    window.setSize(xeno.width,xeno.height+75);
                    window.setVisible(true);
                }
            }
        }
    }
}
