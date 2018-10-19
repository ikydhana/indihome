/**
 *Untuk Menggunakan Event Yang Perlu Diisi Cuman nama, No Telpon, Jenis Kelamin, Dan Pilihan Paket.
 * Kemudian Pilih Button Save
 */
package indihome;

/**
 *
 * @author HP-PC
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
class DataIndihome extends JFrame 
{ 
   JLabel lblsc=new JLabel("No SC "); 
   JTextField txsc=new JTextField(20); 
   JLabel lblnamapel=new JLabel("Nama "); 
   JTextField txnamapel=new JTextField(20);
   JLabel lbldatapel=new JLabel("Data Pelanggan"); 
   JLabel lblnoinet=new JLabel("No Internet"); 
   JTextField txnoinet=new JTextField(20);
   JLabel lblnotelp=new JLabel("No Telepon"); 
   JTextField txnotelp=new JTextField(20);
   JLabel lblwitel=new JLabel("Witel");
   JTextField txwitel=new JTextField(20);
   JLabel lblstatus=new JLabel("Status"); 
   JTextField txstatus=new JTextField(20);
   JButton tblcari=new JButton("Cari"); 
   JButton tblsave=new JButton("Save");
   JButton tblupdate=new JButton("Update");
   JButton tblexit=new JButton("Exit");
   JLabel lblpaket=new JLabel("Paket"); 
   JLabel lblkelamin=new JLabel("Jenis Kelamin");
   JRadioButton kelamin1=new JRadioButton("L"); 
   JRadioButton kelamin2=new JRadioButton("P"); 
   String[] jenispaket={"Inet","Telepon","Useetv","Inet+Useetv","Inet+Telepon","Inet+Useetv+Telepon"}; 
   JComboBox cbpaket=new JComboBox(jenispaket); 
   JButton kirim=new JButton("Kirim");
   JTextArea hasil=new JTextArea();
   DataIndihome() 
   { 
      setTitle("Data Pelanggan Indihome"); 
      setLocation(300,100); 
      setSize(400,450); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   } 
   void komponenVisual() 
   { 
      getContentPane().setLayout(null); 
      getContentPane().add(lblsc); 
      lblsc.setBounds(10,10,70,20); 
      getContentPane().add(txsc); 
      txsc.setBounds(75,10,100,20); 
      getContentPane().add(tblcari); 
      tblcari.setBounds(180,10,95,20);
      getContentPane().add(tblsave); 
      tblsave.setBounds(180,135,95,20);
      getContentPane().add(tblupdate); 
      tblupdate.setBounds(180,155,95,20);
      getContentPane().add(tblexit); 
      tblexit.setBounds(180,175,95,20);
      getContentPane().add(lblnamapel); 
      lblnamapel.setBounds(10,30,70,20); 
      getContentPane().add(txnamapel); 
      txnamapel.setBounds(75,30,200,20); 
      getContentPane().add(lblpaket); 
      lblpaket.setBounds(10,70,100,20); 
      getContentPane().add(cbpaket); 
      cbpaket.setBounds(75,70,125,20);
      getContentPane().add(lbldatapel); 
      lbldatapel.setBounds(10,95,100,20); 
      getContentPane().add(lblnoinet); 
      lblnoinet.setBounds(10,115,70,20); 
      getContentPane().add(txnoinet); 
      txnoinet.setBounds(75,115,100,20); 
      getContentPane().add(lblnotelp); 
      lblnotelp.setBounds(10,135,70,20); 
      getContentPane().add(txnotelp); 
      txnotelp.setBounds(75,135,100,20);
      getContentPane().add(lblwitel); 
      lblwitel.setBounds(10,155,70,20); 
      getContentPane().add(txwitel); 
      txwitel.setBounds(75,155,100,20);
      getContentPane().add(lblstatus); 
      lblstatus.setBounds(10,175,70,20); 
      getContentPane().add(txstatus); 
      txstatus.setBounds(75,175,100,20);
      getContentPane().add(lblkelamin); 
      lblkelamin.setBounds(10,50,100,20); 
      getContentPane().add(kelamin1); 
      kelamin1.setBounds(105,50,50,20); 
      getContentPane().add(kelamin2); 
      kelamin2.setBounds(150,50,50,20);
      getContentPane().add(kirim);
      kirim.setBounds(180,195,95,20);
      getContentPane().add(hasil); 
      hasil.setBounds(10,235,270,80);
      setVisible(true); 
   } 
         void AksiReaksi()
{ 
   tblsave.addActionListener(new ActionListener()
   {
       public void actionPerformed(ActionEvent e)
       {
           hasil.append(txnamapel.getText()+"\n");
           hasil.append(txnotelp.getText()+"\n");
           if(kelamin1.isSelected()==true)
           {
               hasil.append(kelamin1.getText()+"\n");
           }
           else
           {
               hasil.append(kelamin2.getText()+"\n");
           } 
           { String jenispaket = (String)
                   cbpaket.getSelectedItem();
           hasil.append(jenispaket+"\n");
           }     
         }       
   });
} 
   public static void main(String args[]) 
   {  
     DataIndihome ap=new DataIndihome(); 
     ap.komponenVisual(); 
     ap.AksiReaksi();
   } 
} 