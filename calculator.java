import java.awt.*;
import java.awt.event.*;

public class calculator {
     String no="";
     String noo="";
     int no1,no2;
     String op="";
     int result;
    calculator() {
        Frame f = new Frame("Calculator");
        f.setLayout(null);
        f.setSize(350, 550);
        f.setVisible(true);
        f.setBackground(Color.cyan);
        Font fon = new Font("new", Font.BOLD, 20);
        f.setFont(fon);
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b0 = new Button("0");
        Button bp = new Button("+");
        Button bm = new Button("-");
        Button bmu = new Button("X");
        Button bd = new Button("/");
        Button be = new Button("=");
        Button bac = new Button("AC");
        TextField t1 = new TextField();
        TextField t2 = new TextField();

        t1.setBounds(30, 40, 300, 30);
        t2.setBounds(30, 80, 300, 30);

        bac.setBounds(30, 150, 35, 35);
        bd.setBounds(85, 150, 35, 35);
        bmu.setBounds(140, 150, 35, 35);
        bm.setBounds(195, 150, 35, 35);
        bp.setBounds(250, 150, 35, 35);
        be.setBounds(305, 150, 35, 35);

        b7.setBounds(85, 215, 35, 35);
        b8.setBounds(140, 215, 35, 35);
        b9.setBounds(195, 215, 35, 35);

        b4.setBounds(85, 280, 35, 35);
        b5.setBounds(140, 280, 35, 35);
        b6.setBounds(195, 280, 35, 35);

        b1.setBounds(85, 350, 35, 35);
        b2.setBounds(140, 350, 35, 35);
        b3.setBounds(195, 350, 35, 35);

        b0.setBounds(140, 415, 35, 35);

        f.add(t1);
        f.add(t2);
        f.add(bac);
        f.add(bd);
        f.add(bmu);
        f.add(bm);
        f.add(bp);
        f.add(be);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b0);

       
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                no=no+"0";
                t1.setText(no);
                

            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                no=no+"1";
                t1.setText(no);
                

            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                no=no+"2";
                t1.setText(no);
                

            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                no=no+"3";
                t1.setText(no);
                

            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                no=no+"4";
                t1.setText(no);
                

            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                no=no+"5";
                t1.setText(no);
                

            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                no=no+"6";
                t1.setText(no);
                

            }
        });
        

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                no=no+"7";
                t1.setText(no);
                

            }
        });

        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                no=no+"8";
                t1.setText(no);
                

            }
        });

        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                no=no+"9";
                t1.setText(no);

                

            }
        });

         bp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                no1=Integer.parseInt(t1.getText().toString());
                noo=t1.getText().toString();
                no="";
                
                t1.setText(noo+"+");
                op="+";
            }
        });
        bm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                no1=Integer.parseInt(t1.getText().toString());
                noo=t1.getText().toString();
                no="";
                
                t1.setText(noo+"-");
                op="-";
            }
        });

        bmu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                no1=Integer.parseInt(t1.getText().toString());
                noo=t1.getText().toString();
                no="";
                
                t1.setText(noo+"X");
                op="X";
            }
        });

        bd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                no1=Integer.parseInt(t1.getText().toString());
                noo=t1.getText().toString();
                no="";
                
                t1.setText(noo+"/");
                op="/";
            }
        });


        be.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(op.equals("+")){
                   no2=Integer.parseInt(t1.getText().toString());
                   result = no1+no2;
                   t2.setText(String.valueOf(result));
                   t1.setText(String.valueOf(no1)+"+"+String.valueOf(no2));
                }
                else if(op.equals("-")){
                     no2=Integer.parseInt(t1.getText().toString());
                   result = no1-no2;
                   t2.setText(String.valueOf(result));
                   t1.setText(String.valueOf(no1)+"-"+String.valueOf(no2));
                }
                else if(op.equals("X")){
                     no2=Integer.parseInt(t1.getText().toString());
                   result = no1*no2;
                   t2.setText(String.valueOf(result));
                   t1.setText(String.valueOf(no1)+"X"+String.valueOf(no2));
                }
                else if(op.equals("/")){
                     no2=Integer.parseInt(t1.getText().toString());
                   float result1 = (float)no1/(float)no2;
                   t2.setText(String.valueOf(result1));
                   t1.setText(String.valueOf(no1)+"/"+String.valueOf(no2));
                }

            }
        });
       


        bac.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                t1.setText("");
                t2.setText("");
                no="";
                noo="";
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        calculator s = new calculator();
    } 
}