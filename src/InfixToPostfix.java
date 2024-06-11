import java.math.BigDecimal;
import java.util.Stack;
import java.util.ArrayList;

public class InfixToPostfix {
    ArrayList<String>arrayList=new ArrayList<>();
    String string="";

    String statement;
    String finalStatement="";

    InfixToPostfix(String statement){
        this.statement=statement;

        arrayList=stringToArrayList(statement);


        arrayList=  infixToPostfix(stringToArrayList(statement));

        for (int i=0; i<arrayList.size();i++){

            string+=arrayList.get(i);


        }



        System.out.println(postfixEvaluate(arrayList));
        finalStatement=postfixEvaluate(arrayList)+"";


    }
    public ArrayList<String> infixToPostfix(ArrayList<String> arrayList){


        Stack<String> stack = new Stack<>();

        ArrayList <String>output=new ArrayList<>();

        int size=arrayList.size();


        for (int i = 0; i < size; i++) {


            if(isDigit(arrayList.get(i).charAt(0))){

                output.add(arrayList.get(i));}

            else{

                while (!stack.empty()&&(Priority(arrayList.get(i)) <= Priority(stack.peek() ) ) ){


                    output.add(stack.peek());
                    stack.pop();
                }
                stack.push(arrayList.get(i));
            }
        }
        while (!stack.empty()){

            output.add(stack.peek());
            stack.pop();
        }
        return output;

    }

    public boolean isDigit(char s){

        if(s=='0'||s=='1'||s=='2'||s=='3'||s=='4'||s=='5'||s=='6'||s=='7'||s=='8'||s=='9' )
        {return true;}
        else{
            return false;}


    }

    public int Priority(String s){
        char c=s.charAt(0);

        int wight =-1;

        switch (c){

            case '+':
                wight=1;break;
            case  '-':
                wight=1;break;
            case'×':
                wight=2;break;
            case '÷':
                wight=2;break;
        }
        return wight;


    }

    public ArrayList <String> stringToArrayList(String s){

        ArrayList<String>arrayList1=new ArrayList<>();
        String carry="";
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (isDigit(s.charAt(i))){

                carry+=c;
            }

            if(!isDigit(s.charAt(i))){
                arrayList1.add(carry);
                arrayList1.add(Character.toString(c) );
                carry="";
            }



        }
        arrayList1.add(carry);



        return arrayList1; }


    String postfixEvaluate(ArrayList<String>calc){
        Stack <String> stk =new Stack<>();

        for (int i = 0; i < calc.size(); i++) {

            if(isDigit(calc.get(i).charAt(0))){

                    String z=calc.get(i);




                String se=""+z;

                stk.push(se);

            }


            else {
                String op1 =stk.peek();
                stk.pop();

                String op2 =stk.peek();
                stk.pop();

                Double result=MathOperation(op1,op2,calc.get(i));
                String resultEnd=result+"";
                System.out.println(resultEnd+" result");

                stk.push(resultEnd);
            }

        }


        return  stk.peek();
    }


    Double MathOperation(String op1 ,String op2 ,String operat){
        Double digit1=Double.parseDouble(op1);
        Double digit2=Double.parseDouble(op2);
        char operand =operat.charAt(0);

        Double sloved= new Double("1");



        switch (operand){

            case '+': sloved=digit2+digit1;break;
            case '-': sloved=digit2-digit1;break;
            case '×': sloved=digit2*digit1;break;
            case '÷': sloved= digit2/digit1;break;
        }


        return sloved;



    }






}
