import javax.swing.*;

   public class Model 
   {

     Arrays array;
     VIew view;

     public Model(VIew view,Arrays array)
     {
      this.view=view;
      this.array=array;
      }
       
        public void run()
        {   
          String input  =JOptionPane.showInputDialog("Shtypni(1,2,3,4)"+"\n1 - Regjistro \n2 - Ndrysho \n3 - Largo \n4 - Mbyll");
            if (input==null || input.length()==0)
            {}
             else { char hyrja=readCommand(input);
                  if (hyrja == '4') 
                  {} 
                   else {
                
                           switch (hyrja) 
                           {
                              case '1': {
                                          
                                          
                                          String emri = JOptionPane.showInputDialog("Emri:");
                                          String mbiemri = JOptionPane.showInputDialog("Mbiemri:");
                                          
                                          

                                          char lenda = readCommand("Lenda:" +"- Programim \n2 -Artificial Iellegence  \n3 -Algjeber \n4 -English \n5 - Baza e te dhenave");
                                          String Lenda=JOptionPane.showInputDialog("Lenda:" + " Shtypni "+"\n - Programim \n -Artificial Iellegence  \n -Algjeber \n -English \n - Baza e te dhenave");
                                         
                                           if(lenda =='1'){Lenda="Programim";}
                                             else
                                             {
                                             
                                                if(lenda =='2'){Lenda="Intelegjnce Artificiale";}
                                                else
                                                {
                                               
                                                   if(lenda =='3'){Lenda="Algjeber";}
                                                   else 
                                                   {
                                              
                                                      if(lenda =='4'){Lenda="English";}
                                                      else{Lenda=Lenda;}
                                                     // else {Lenda= null; JOptionPane.showMessageDialog(null, "Komanda per Lenden e shtypur gabim");}
                                                     
                                                     }
                                                   }
                                                 }
                                                 
                                                 String nota=JOptionPane.showInputDialog("Nota");
                                                 String piket=JOptionPane.showInputDialog("Piket:");
                                                 
                                                 int id = Integer.parseInt(JOptionPane.showInputDialog("Numri Personal:","Kujdese! te jete unike"));
                                                 if (array.Id_unike(id)){JOptionPane.showMessageDialog(null,"Personi eshte i regjistruar");}
                                                 else {array.addId(id);
                                                 
                                                 array.add(new Studenti(emri,mbiemri,id,Lenda,nota,piket));
                                                 view.repaint();}
                                                 run();
                                                 break;

                                                    }
                        
                        case '2': {
                                   
                                   int index = new Integer(JOptionPane.showInputDialog("Zgjedh sipas indeksit, Studentin tek i cili deshironi"+
                                   "te beni ndryshime "));
                                    
                                       if (index >=0 && index<array.users.length)
                                       {
                                         String s = JOptionPane.showInputDialog("Komanda (N,F) \nN - Ndrysho noten \nF - Fshinoten");
                                         char c = readCommand(s);
                                         Studenti b = array.users[index];
                                       
                                         switch (c) {
                                                      case 'N': {
                                                                  String nota = JOptionPane.showInputDialog("Nota)");
                                                                  b.setNota(nota);
                                                                  view.repaint();
                                                                  run();
                                                                  break;
                                             
                                                                 }
                                                      
                                                      case 'O': {
                                                                  String piket = JOptionPane.showInputDialog("Piket");
                                                                  b.setPiket(piket);
                                                                  view.repaint();
                                                                  run();
                                                                  break;
   
                                                                 }
                       
                                                       default: {
                                                                  JOptionPane.showMessageDialog(null, "Komanda e shtypur gabim");
                                                                  run();
                                                                }
                                                    }
                        
                                          }
                        
                        
                                         else 
                                           {
                                             JOptionPane.showMessageDialog(null,"Studenti nuk gjendet ne liste");
                                             run();
                                           }
                                             
                                             break;
                                           }
                                           
                                           
                        case '3': {
                                    int index = new Integer(JOptionPane.showInputDialog("Zgjedh sipas indeksit  studentin qe deshiron ta fshijsh nga lista"));
                                    if (index >=0 && index<array.users.length)
                                    {array.delete(index);}
                                    else {JOptionPane.showMessageDialog(null,"Studenti nuk gjendet ne liste");}
                                    view.repaint();
                                    run();
                                    break;
                                   }
                        
                        default: {
                                   JOptionPane.showMessageDialog(null, "Komanda e shtypur gabim");
                                   run();
                                 }

                              }

                        }

                  
            
            }                
}
 
    public char readCommand(String s)
    {
      return s.toUpperCase().trim().charAt(0);
   

}}