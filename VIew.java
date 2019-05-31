import javax.swing.*;
import java.awt.*;
public class VIew extends JPanel{
    Arrays c;
    public VIew(Arrays c)
    {   this.c=c;
        JFrame frame=new JFrame();
        frame.getContentPane().add(this);
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setTitle("Student Grade Book");
    }

    public void paintComponent(Graphics g)
    {   g.setColor(Color.white);
        g.fillRect(0,0,800,600);
        g.setColor(Color.black);

        for (int i=0;i<c.users.length;i++)
        {   Studenti array=c.users[i];
               int rez=0;
             for (int j=0;j<c.id.length;j++)
             {
                if (array.getId()==c.id[j]) {rez++;}

             }
            g.drawString("Studenti: "+i+"Id Number: "+array.getId()+ " Emri: "+array.getEmri()+"  Mbiemri:  "+array.getMbiemri()+"  Lenda: "+array.getLenda()+"  Regjisruar: "
                   +rez+" here"+ "  Nota "+ array.getNota()+ "  Piket: "+array.getPiket(),20,20+20*i);
        }

    }

}