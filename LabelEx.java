import java.awt.*;  import java.awt.event.*;
public class LabelEx
{
public static void main(String[] args) {  
Frame f=new Frame("Label example");
Label l1= new Label("welcome to REC");
f.setLayout(new FlowLayout());
f.add(l1);
f.setVisible(true);
f.setSize(300,300);
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
}
}