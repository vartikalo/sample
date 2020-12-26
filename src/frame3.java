import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class frame3 extends Frame implements ActionListener{
 Label l1, l2 , l3;
        TextField t1, t2, t3;
        Button b1, b2;
    @Override
    public void actionPerformed(ActionEvent e) {
        int a , b , c;
        a=Integer.parseInt(t1.getText().toString());
        b=Integer.parseInt(t2.getText().toString());
         if(e.getActionCommand().equals("Add")){
       c=a+b;
       t3.setText("Sum is"+c);
       
                                                              
        
        } 
        else
         
      
        {  c=a-b;
        t3.setText("Differencce is"+c);
       
            
        }
         
   
    }
    public frame3(){
         this.setSize(500,400);
    this.setVisible(true);
    this.setLayout(new GridLayout(4,2));
      l1 = new Label("Enter first number");
    
    this.add(l1);
    
    t1 = new TextField();
    this.add(t1);
    t1.setVisible(true);
    
     l2 = new Label("Enter second number");
   
   this.add(l2);
    
    t2 = new TextField();
    this.add(t2);
    t2.setVisible(true);
    
     b1 = new Button("Add");
        this.add(b1);
        b1.addActionListener(this);
        
         b2 = new Button("Subtract");
        this.add(b2);
        b2.addActionListener(this);
        
        
        t3 = new TextField();
        this.add(t3);
        t3.setVisible(true);
        
    
}
    public static void main(String arg[]){
       
   
    frame3 fp = new frame3();
    
    
   
    }
}
