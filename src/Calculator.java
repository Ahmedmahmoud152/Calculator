import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

public class Calculator extends JFrame implements ActionListener  , KeyListener {

    String s =new String();
    String ANS =new String();

    ArrayList<String> arrayList=new ArrayList<>();
    boolean bC=false;

    JFrame jFrame= new JFrame();

    JPanel jPanel1 =new JPanel();
    JPanel jPanel2 =new JPanel();

    JTextArea jTextArea =new JTextArea("0");

    Stack<String>s1=new Stack<>();


    JButton jButtonC,jButtonDEL,jButtonAPS,jButtonDivision,
            jButton7,jButton8,jButton9,jButtonMultiplication,
            jButton4,jButton5,jButton6,jButtonMinus,
            jButton1,jButton2,jButton3,jButtonPlus,
            jButtonplusORminus,jButton0,jButtonDot,jButtonEqual;





    Calculator(){
        jFrame.setTitle("Calculator");
        jFrame.setVisible(true);
        jFrame.setSize(500,700);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setResizable(true);
        jFrame.setLocation(200,50);
        jFrame.setLayout(null);
        jFrame.add(jPanel1);
        jFrame.add(jPanel2);
        jPanel1.add(jTextArea);
        jTextArea.setFont(new Font("Bold",100,26));
        jTextArea.setForeground(Color.black);
        jTextArea.setBackground(Color.black);
        jPanel1.setBackground(Color.black);
        jPanel1.setLayout(null);
        jPanel1.setBounds( 20,20, 400 , 150);
        jTextArea.setBounds(20,50 ,370,70);
        
        jPanel2.setBounds(20,230,400,400);
        jPanel2.setBackground(Color.black);
        jPanel2.setLayout(new GridLayout(5,4));
        jTextArea.setBackground(Color.WHITE);
        jTextArea.setLineWrap(true);
jTextArea.setFont(new Font("bold",10,26));






        AddButtons();


        jTextArea.setEnabled(false);




    }

    public void AddButtons(){


        //references buttons
        jButtonC=new JButton("C");
        jButtonDEL=new JButton("DEL");
        jButtonAPS=new JButton("| x |");
        jButtonDivision=new JButton("/");
                jButton7=new JButton("7");jButton8=new JButton("8");jButton9=new JButton("9");
                jButtonMultiplication=new JButton("*");
                jButton4=new JButton("4");
                jButton5=new JButton("5");
                jButton6=new JButton("6");
                jButtonMinus=new JButton("-");
                jButton1=new JButton("1");
                jButton2=new JButton("2");
                jButton3=new JButton("3");
                jButtonPlus=new JButton("+");
                jButtonplusORminus=new JButton("+/-");
                jButton0=new JButton("0");
                jButtonDot=new JButton(".");
                jButtonEqual=new JButton("=");


                //BackGroundColor

                jButtonC.setBackground(Color.white);jButtonDEL.setBackground(Color.white);jButtonAPS.setBackground(Color.white);jButtonDivision.setBackground(new Color(220,220,220));
                jButton7.setBackground(Color.white);jButton8.setBackground(Color.white);jButton9.setBackground(Color.white);jButtonMultiplication.setBackground(new Color(220,220,220));
                jButton4.setBackground(Color.white);jButton5.setBackground(Color.white);jButton6.setBackground(Color.white);jButtonMinus.setBackground(new Color(220,220,220));
                jButton1.setBackground(Color.white);jButton2.setBackground(Color.white);jButton3.setBackground(Color.white);jButtonPlus.setBackground(new Color(220,220,220));
                jButtonplusORminus.setBackground(Color.white);jButton0.setBackground(Color.white);jButtonDot.setBackground(Color.white);jButtonEqual.setBackground(new Color(65, 115, 158));


                //ForeGroundColor


                jButtonC.setForeground(Color.black);jButtonDEL.setForeground(Color.black);jButtonAPS.setForeground(Color.black);jButtonDivision.setForeground(Color.black);
                jButton7.setForeground(Color.black);jButton8.setForeground(Color.black);jButton9.setForeground(Color.black);jButtonMultiplication.setForeground(Color.black);
                jButton4.setForeground(Color.black);jButton5.setForeground(Color.black);jButton6.setForeground(Color.black);jButtonMinus.setForeground(Color.black);
                jButton1.setForeground(Color.black);jButton2.setForeground(Color.black);jButton3.setForeground(Color.black);jButtonPlus.setForeground(Color.black);
                jButtonplusORminus.setForeground(Color.black);jButton0.setForeground(Color.black);jButtonDot.setForeground(Color.black);jButtonEqual.setForeground(Color.black);


                //Font

        jButtonC.setFont(new Font("Bold",100,26));        jButtonDEL.setFont(new Font("Bold",100,26)); jButtonAPS.setFont(new Font("Bold",100,26)); jButtonDivision.setFont(new Font("Bold",100,26));
        jButton7.setFont(new Font("Bold",100,26)); jButton8.setFont(new Font("Bold",100,26)); jButton9.setFont(new Font("Bold",100,26)); jButtonMultiplication.setFont(new Font("Bold",100,26));
        jButton4.setFont(new Font("Bold",100,26)); jButton5.setFont(new Font("Bold",100,26)); jButton6.setFont(new Font("Bold",100,26)); jButtonMinus.setFont(new Font("Bold",100,26));
        jButton1.setFont(new Font("Bold",100,26)); jButton2.setFont(new Font("Bold",100,26)); jButton3.setFont(new Font("Bold",100,26)); jButtonPlus.setFont(new Font("Bold",100,26));
        jButtonplusORminus.setFont(new Font("Bold",100,26)); jButton0.setFont(new Font("Bold",100,26)); jButtonDot.setFont(new Font("Bold",100,26)); jButtonEqual.setFont(new Font("Bold",100,26));


        //AddButtonsInPanel
                 jPanel2.add(jButtonC);jPanel2.add(jButtonDEL);jPanel2.add(jButtonAPS);jPanel2.add(jButtonDivision);
                 jPanel2.add(jButton7);jPanel2.add(jButton8);jPanel2.add(jButton9);jPanel2.add(jButtonMultiplication);
                 jPanel2.add(jButton4);jPanel2.add(jButton5);jPanel2.add(jButton6);jPanel2.add(jButtonMinus);
                 jPanel2.add(jButton1);jPanel2.add(jButton2);jPanel2.add(jButton3);jPanel2.add(jButtonPlus);
                 jPanel2.add(jButtonplusORminus);jPanel2.add(jButton0);jPanel2.add(jButtonDot);jPanel2.add(jButtonEqual);

                  // ActionListener to Mouse

                    jButtonC.addActionListener(this);jButtonDEL.addActionListener(this);jButtonAPS.addActionListener(this);jButtonDivision.addActionListener(this);
                    jButton7.addActionListener(this);jButton8.addActionListener(this);jButton9.addActionListener(this);jButtonMultiplication.addActionListener(this);
                    jButton4.addActionListener(this);jButton5.addActionListener(this);jButton6.addActionListener(this);jButtonMinus.addActionListener(this);
                    jButton1.addActionListener(this);jButton2.addActionListener(this);jButton3.addActionListener(this);jButtonPlus.addActionListener(this);
                    jButtonplusORminus.addActionListener(this);jButton0.addActionListener(this);jButtonDot.addActionListener(this);jButtonEqual.addActionListener(this);

                    //
        //ActionListener to Keyboard
        jButtonC.addKeyListener(this);jButtonDEL.addKeyListener(this);jButtonAPS.addKeyListener(this);jButtonDivision.addKeyListener(this);
        jButton7.addKeyListener(this);jButton8.addKeyListener(this);jButton9.addKeyListener(this);jButtonMultiplication.addKeyListener(this);
        jButton4.addKeyListener(this);jButton5.addKeyListener(this);jButton6.addKeyListener(this);jButtonMinus.addKeyListener(this);
        jButton1.addKeyListener(this);jButton2.addKeyListener(this);jButton3.addKeyListener(this);jButtonPlus.addKeyListener(this);
        jButtonplusORminus.addKeyListener(this);jButton0.addKeyListener(this);jButtonDot.addKeyListener(this);jButtonEqual.addKeyListener(this);
       jPanel2.setFocusable(true);
       jPanel2.setFocusTraversalKeysEnabled(true);
       jFrame.addKeyListener(this);
       jFrame.setFocusable(true);
        jFrame.setFocusTraversalKeysEnabled(true);
       //
        jButtonC.setFocusable(true);jButtonDEL.setFocusable(true);jButtonAPS.setFocusable(true);jButtonDivision.setFocusable(true);
        jButton7.setFocusable(true);jButton8.setFocusable(true);jButton9.setFocusable(true);jButtonMultiplication.setFocusable(true);
        jButton4.setFocusable(true);jButton5.setFocusable(true);jButton6.setFocusable(true);jButtonMinus.setFocusable(true);
        jButton1.setFocusable(true);jButton2.setFocusable(true);jButton3.setFocusable(true);jButtonPlus.setFocusable(true);
        jButtonplusORminus.setFocusable(true);jButton0.setFocusable(true);jButtonDot.setFocusable(true);jButtonEqual.setFocusable(true);


        jButtonC.setFocusTraversalKeysEnabled(true);jButtonDEL.setFocusTraversalKeysEnabled(true);jButtonAPS.setFocusTraversalKeysEnabled(true);jButtonDivision.setFocusTraversalKeysEnabled(true);
        jButton7.setFocusTraversalKeysEnabled(true);jButton8.setFocusTraversalKeysEnabled(true);jButton9.setFocusTraversalKeysEnabled(true);jButtonMultiplication.setFocusTraversalKeysEnabled(true);
        jButton4.setFocusTraversalKeysEnabled(true);jButton5.setFocusTraversalKeysEnabled(true);jButton6.setFocusTraversalKeysEnabled(true);jButtonMinus.setFocusTraversalKeysEnabled(true);
        jButton1.setFocusTraversalKeysEnabled(true);jButton2.setFocusTraversalKeysEnabled(true);jButton3.setFocusTraversalKeysEnabled(true);jButtonPlus.setFocusTraversalKeysEnabled(true);
        jButtonplusORminus.setFocusTraversalKeysEnabled(true);jButton0.setFocusTraversalKeysEnabled(true);jButtonDot.setFocusTraversalKeysEnabled(true);jButtonEqual.setFocusTraversalKeysEnabled(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {



        if(e.getSource().equals(jButton0)){

         addArrayList("0");
            jTextArea.setText(arrayToString( arrayList));

        } else if (e.getSource().equals(jButton1)) {
            addArrayList("1");
            jTextArea.setText(arrayToString( arrayList));


        }

        else if (e.getSource().equals(jButton2)) {

            addArrayList("2");
            jTextArea.setText(arrayToString( arrayList));

        }
        else if (e.getSource().equals(jButton3)) {
            addArrayList("3");
            jTextArea.setText(arrayToString( arrayList));
        }
        else if (e.getSource().equals(jButton4)) {

            addArrayList("4");
            jTextArea.setText(arrayToString( arrayList));
        }
        else if (e.getSource().equals(jButton5)) {
            addArrayList("5");
            jTextArea.setText(arrayToString( arrayList));
        }
        else if (e.getSource().equals(jButton6)) {

            addArrayList("6");
            jTextArea.setText(arrayToString( arrayList));
        }
        else if (e.getSource().equals(jButton7)) {

            addArrayList("7");
            jTextArea.setText(arrayToString( arrayList));
        }
        else if (e.getSource().equals(jButton8)) {
            addArrayList("8");
            jTextArea.setText(arrayToString( arrayList));
        }
        else if (e.getSource().equals(jButton9)) {
            addArrayList("9");
            jTextArea.setText(arrayToString( arrayList));

        }

        else if (e.getSource().equals(jButtonDot)) {
            String ANS= jTextArea.getText();
            jTextArea.setText(arrayToString( arrayList));
            jTextArea.setText(ANS);
        }
        else if (e.getSource().equals(jButtonplusORminus)) {
            jTextArea.setText(arrayToString( arrayList));
        }



        else if (e.getSource().equals(jButtonPlus)) {


            if(arrayList.size()<=0&&arrayList.get(0)=="-"){}//here dont add + in first
            else {
                if (arrayList.get(arrayList.size() - 1).equals("+")) {
                } else if (!arrayList.get(arrayList.size() - 1).equals("+") && !arrayList.get(arrayList.size() - 1).equals("-") && !arrayList.get(arrayList.size() - 1).equals("×") && !arrayList.get(arrayList.size() - 1).equals("÷")) {
                    addArrayList("+");
                    jTextArea.setText(arrayToString(arrayList));
                } else if (arrayList.get(arrayList.size() - 1).equals("-")) {

                    removeItemArrayList(arrayList);
                    addArrayList("+");
                    jTextArea.setText(arrayToString(arrayList));

                } else if (arrayList.get(arrayList.size() - 1).equals("×")) {

                    removeItemArrayList(arrayList);
                    addArrayList("+");
                    jTextArea.setText(arrayToString(arrayList));

                } else if (arrayList.get(arrayList.size() - 1).equals("÷")) {

                    removeItemArrayList(arrayList);
                    addArrayList("+");
                    jTextArea.setText(arrayToString(arrayList));

                }
            }

        }
        else if (e.getSource().equals(jButtonMinus)) {
            //here add - in first

            if (arrayList.size()==0){
                arrayList.add("-");
                jTextArea.setText("-");
            }

            if (arrayList.get(arrayList.size()-1).equals("-")){}
           else if(!arrayList.get(arrayList.size()-1).equals("+")&&!arrayList.get(arrayList.size()-1).equals("-")&&!arrayList.get(arrayList.size()-1).equals("×")&&!arrayList.get(arrayList.size()-1).equals("÷")){
                addArrayList("-");
                jTextArea.setText(arrayToString( arrayList));}

            else if(arrayList.get(arrayList.size()-1).equals("+") ){

                removeItemArrayList(arrayList);
                addArrayList("-");
                jTextArea.setText(arrayToString( arrayList));

            }
            else if(arrayList.get(arrayList.size()-1).equals("×")){

                removeItemArrayList(arrayList);
                addArrayList("-");
                jTextArea.setText(arrayToString( arrayList));

            }
            else if(arrayList.get(arrayList.size()-1).equals("÷")){

                removeItemArrayList(arrayList);
                addArrayList("-");
                jTextArea.setText(arrayToString( arrayList));

            }
        }




        else if (e.getSource().equals(jButtonMultiplication)) {

            if(arrayList.size()<=0&&arrayList.get(0)=="-"){}
            else {

                if (arrayList.get(arrayList.size() - 1).equals("×")) {
                } else if (!arrayList.get(arrayList.size() - 1).equals("+") && !arrayList.get(arrayList.size() - 1).equals("-") && !arrayList.get(arrayList.size() - 1).equals("×") && !arrayList.get(arrayList.size() - 1).equals("÷")) {
                    addArrayList("×");
                    jTextArea.setText(arrayToString(arrayList));
                } else if (arrayList.get(arrayList.size() - 1).equals("+")) {

                    removeItemArrayList(arrayList);
                    addArrayList("×");
                    jTextArea.setText(arrayToString(arrayList));

                } else if (arrayList.get(arrayList.size() - 1).equals("-")) {

                    removeItemArrayList(arrayList);
                    addArrayList("×");
                    jTextArea.setText(arrayToString(arrayList));

                } else if (arrayList.get(arrayList.size() - 1).equals("÷")) {

                    removeItemArrayList(arrayList);
                    addArrayList("×");
                    jTextArea.setText(arrayToString(arrayList));

                }


            }
        }


        else if (e.getSource().equals(jButtonDivision)) {




            if(arrayList.size()<=0&&arrayList.get(0).equals("-")||arrayList.get(0)=="0"){}
            else {
                if (arrayList.get(arrayList.size() - 1).equals("÷")) {
                } else if (!arrayList.get(arrayList.size() - 1).equals("+") && !arrayList.get(arrayList.size() - 1).equals("-") && !arrayList.get(arrayList.size() - 1).equals("×") && !arrayList.get(arrayList.size() - 1).equals("÷")) {
                    addArrayList("÷");
                    jTextArea.setText(arrayToString(arrayList));
                } else if (arrayList.get(arrayList.size() - 1).equals("+")) {

                    removeItemArrayList(arrayList);
                    addArrayList("÷");
                    jTextArea.setText(arrayToString(arrayList));

                } else if (arrayList.get(arrayList.size() - 1).equals("-")) {

                    removeItemArrayList(arrayList);
                    addArrayList("÷");
                    jTextArea.setText(arrayToString(arrayList));

                } else if (arrayList.get(arrayList.size() - 1).equals("×")) {

                    removeItemArrayList(arrayList);
                    addArrayList("÷");
                    jTextArea.setText(arrayToString(arrayList));

                }

            }
        }


        else if (e.getSource().equals(jButtonC)) {
            arrayList.clear();
            jTextArea.setText("0");
        }

        else if (e.getSource().equals(jButtonDEL)) {
            if(arrayList.size()==0){
                jTextArea.setText("0");
            }
            else {
                jTextArea.setText(arrayToString(arrayList));
                removeItemArrayList(arrayList);
                jTextArea.setText(arrayToString(arrayList));
            }

        }
        else if (e.getSource().equals(jButtonEqual)) {
            System.out.println(arrayList.toString());
            if(jTextArea.getText().charAt(jTextArea.getText().length()-1)=='-'||jTextArea.getText().charAt(jTextArea.getText().length()-1)=='+'||jTextArea.getText().charAt(jTextArea.getText().length()-1)=='×'||jTextArea.getText().charAt(jTextArea.getText().length()-1)=='÷'){}
           else {
            if(jTextArea.getText().charAt(0)=='-'){
                String sEdit="0"+jTextArea.getText();//

                InfixToPostfix infixToPostfix = new InfixToPostfix(sEdit);
                jTextArea.setText(infixToPostfix.finalStatement);
            }
            else {
                InfixToPostfix infixToPostfix = new InfixToPostfix(jTextArea.getText());
                jTextArea.setText(infixToPostfix.finalStatement);
            }

        }
    }}


    public ArrayList<String> addArrayList(String s1){

        arrayList.add(s1);

        return arrayList;
    }

    public ArrayList<String> removeItemArrayList(ArrayList<String> arrayList){

        arrayList.remove(arrayList.size()-1);

        return arrayList;
    }

    public String arrayToString(ArrayList<String> arrayList){
        String s1=new String();

        for (int i = 0; i < arrayList.size(); i++) {
            s1+=arrayList.get(i);
        }

        return s1;
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int k=e.getKeyCode();

        if(k==KeyEvent.VK_0||k==KeyEvent.VK_NUMPAD0){

            addArrayList("0");
            jTextArea.setText(arrayToString( arrayList));

        }


        if(k==KeyEvent.VK_1||k==KeyEvent.VK_NUMPAD1){

            addArrayList("1");
            jTextArea.setText(arrayToString( arrayList));
        }

        if(k==KeyEvent.VK_2||k==KeyEvent.VK_NUMPAD2){

            addArrayList("2");
            jTextArea.setText(arrayToString( arrayList));
        }


        if(k==KeyEvent.VK_3||k==KeyEvent.VK_NUMPAD3){

            addArrayList("3");
            jTextArea.setText(arrayToString( arrayList));
        }


        if(k==KeyEvent.VK_4||k==KeyEvent.VK_NUMPAD4){

            addArrayList("4");
            jTextArea.setText(arrayToString( arrayList));
        }


        if(k==KeyEvent.VK_5||k==KeyEvent.VK_NUMPAD5){

            addArrayList("5");
            jTextArea.setText(arrayToString( arrayList));
        }


        if(k==KeyEvent.VK_6||k==KeyEvent.VK_NUMPAD6){

            addArrayList("6");
            jTextArea.setText(arrayToString( arrayList));
        }


        if(k==KeyEvent.VK_7||k==KeyEvent.VK_NUMPAD7){

            addArrayList("7");
            jTextArea.setText(arrayToString( arrayList));
        }


        if(k==KeyEvent.VK_8||k==KeyEvent.VK_NUMPAD8){
            addArrayList("8");
            jTextArea.setText(arrayToString( arrayList));
        }
        if(k==KeyEvent.VK_9||k==KeyEvent.VK_NUMPAD9){
            addArrayList("9");
            jTextArea.setText(arrayToString( arrayList));
        }


        if(k==KeyEvent.VK_PLUS||k==KeyEvent.VK_ADD){


                if(arrayList.size()<=0&&arrayList.get(0)=="-"){}//here dont add + in first
                else {
                    if (arrayList.get(arrayList.size() - 1).equals("+")) {
                    } else if (!arrayList.get(arrayList.size() - 1).equals("+") && !arrayList.get(arrayList.size() - 1).equals("-") && !arrayList.get(arrayList.size() - 1).equals("×") && !arrayList.get(arrayList.size() - 1).equals("÷")) {
                        addArrayList("+");
                        jTextArea.setText(arrayToString(arrayList));
                    } else if (arrayList.get(arrayList.size() - 1).equals("-")) {

                        removeItemArrayList(arrayList);
                        addArrayList("+");
                        jTextArea.setText(arrayToString(arrayList));

                    } else if (arrayList.get(arrayList.size() - 1).equals("×")) {

                        removeItemArrayList(arrayList);
                        addArrayList("+");
                        jTextArea.setText(arrayToString(arrayList));

                    } else if (arrayList.get(arrayList.size() - 1).equals("÷")) {

                        removeItemArrayList(arrayList);
                        addArrayList("+");
                        jTextArea.setText(arrayToString(arrayList));

                    }
                }

        }
        if(k==KeyEvent.VK_SUBTRACT||k==KeyEvent.VK_MINUS||k==KeyEvent.VK_S){

            //here add - in first

            if (arrayList.size()==0){
                arrayList.add("-");
                jTextArea.setText("-");
            }

            if (arrayList.get(arrayList.size()-1).equals("-")){}
            else if(!arrayList.get(arrayList.size()-1).equals("+")&&!arrayList.get(arrayList.size()-1).equals("-")&&!arrayList.get(arrayList.size()-1).equals("×")&&!arrayList.get(arrayList.size()-1).equals("÷")){
                addArrayList("-");
                jTextArea.setText(arrayToString( arrayList));}

            else if(arrayList.get(arrayList.size()-1).equals("+") ){

                removeItemArrayList(arrayList);
                addArrayList("-");
                jTextArea.setText(arrayToString( arrayList));

            }
            else if(arrayList.get(arrayList.size()-1).equals("×")){

                removeItemArrayList(arrayList);
                addArrayList("-");
                jTextArea.setText(arrayToString( arrayList));

            }
            else if(arrayList.get(arrayList.size()-1).equals("÷")){

                removeItemArrayList(arrayList);
                addArrayList("-");
                jTextArea.setText(arrayToString( arrayList));

            }
        }
        if(k==KeyEvent.VK_MULTIPLY||k==KeyEvent.VK_M){


                if(arrayList.size()<=0&&arrayList.get(0)=="-"){}
                else {

                    if (arrayList.get(arrayList.size() - 1).equals("×")) {
                    } else if (!arrayList.get(arrayList.size() - 1).equals("+") && !arrayList.get(arrayList.size() - 1).equals("-") && !arrayList.get(arrayList.size() - 1).equals("×") && !arrayList.get(arrayList.size() - 1).equals("÷")) {
                        addArrayList("×");
                        jTextArea.setText(arrayToString(arrayList));
                    } else if (arrayList.get(arrayList.size() - 1).equals("+")) {

                        removeItemArrayList(arrayList);
                        addArrayList("×");
                        jTextArea.setText(arrayToString(arrayList));

                    } else if (arrayList.get(arrayList.size() - 1).equals("-")) {

                        removeItemArrayList(arrayList);
                        addArrayList("×");
                        jTextArea.setText(arrayToString(arrayList));

                    } else if (arrayList.get(arrayList.size() - 1).equals("÷")) {

                        removeItemArrayList(arrayList);
                        addArrayList("×");
                        jTextArea.setText(arrayToString(arrayList));

                    }


                }


        }
        if(k==KeyEvent.VK_DIVIDE||k==KeyEvent.VK_D){


                if(arrayList.size()<=0&&arrayList.get(0).equals("-")||arrayList.get(0)=="0"){}
                else {
                    if (arrayList.get(arrayList.size() - 1).equals("÷")) {
                    } else if (!arrayList.get(arrayList.size() - 1).equals("+") && !arrayList.get(arrayList.size() - 1).equals("-") && !arrayList.get(arrayList.size() - 1).equals("×") && !arrayList.get(arrayList.size() - 1).equals("÷")) {
                        addArrayList("÷");
                        jTextArea.setText(arrayToString(arrayList));
                    } else if (arrayList.get(arrayList.size() - 1).equals("+")) {

                        removeItemArrayList(arrayList);
                        addArrayList("÷");
                        jTextArea.setText(arrayToString(arrayList));

                    } else if (arrayList.get(arrayList.size() - 1).equals("-")) {

                        removeItemArrayList(arrayList);
                        addArrayList("÷");
                        jTextArea.setText(arrayToString(arrayList));

                    } else if (arrayList.get(arrayList.size() - 1).equals("×")) {

                        removeItemArrayList(arrayList);
                        addArrayList("÷");
                        jTextArea.setText(arrayToString(arrayList));

                    }

                }

        }


        if (k==KeyEvent.VK_EQUALS||k==KeyEvent.VK_ENTER){
            System.out.println(arrayList.toString());
            if(jTextArea.getText().charAt(jTextArea.getText().length()-1)=='-'||jTextArea.getText().charAt(jTextArea.getText().length()-1)=='+'||jTextArea.getText().charAt(jTextArea.getText().length()-1)=='×'||jTextArea.getText().charAt(jTextArea.getText().length()-1)=='÷'){}
            else {
                if(jTextArea.getText().charAt(0)=='-'){
                    String sEdit="0"+jTextArea.getText();//

                    InfixToPostfix infixToPostfix = new InfixToPostfix(sEdit);
                    jTextArea.setText(infixToPostfix.finalStatement);
                }
                else {
                    InfixToPostfix infixToPostfix = new InfixToPostfix(jTextArea.getText());
                    jTextArea.setText(infixToPostfix.finalStatement);
                }

            }

        }

        if(k==KeyEvent.VK_BACK_SPACE){
            if(arrayList.size()==0){
                jTextArea.setText("0");
            }
            else {
                jTextArea.setText(arrayToString(arrayList));
                removeItemArrayList(arrayList);
                jTextArea.setText(arrayToString(arrayList));
            }


        }





    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
