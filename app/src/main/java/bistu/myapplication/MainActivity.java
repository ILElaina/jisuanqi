package bistu.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,add,sub,mul,div,equ,sign,point,deno,del,cln;
    TextView the_text=null;
    String showString="",myString="",first_num="",all_num="";  //设置字符串
    String option="";   //运算符号
    Double result=0.0;    //运算结果

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//获取界面控件
        n0=findViewById(R.id.button11);
        n1=findViewById(R.id.button);
        n2=findViewById(R.id.button2);
        n3=findViewById(R.id.button3);
        n4=findViewById(R.id.button4);
        n5=findViewById(R.id.button5);
        n6=findViewById(R.id.button6);
        n7=findViewById(R.id.button7);
        n8=findViewById(R.id.button8);
        n9=findViewById(R.id.button9);
        add=findViewById(R.id.button15);
        sub=findViewById(R.id.button16);
        mul=findViewById(R.id.button17);
        div=findViewById(R.id.button18);
        equ=findViewById(R.id.button19);
        sign=findViewById(R.id.button14);
        point=findViewById(R.id.button12);
        deno=findViewById(R.id.button20);
        del=findViewById(R.id.button13);
        cln=findViewById(R.id.button10);

        the_text=findViewById(R.id.textView2);
//设置每个按钮点击事件
        n0.setOnClickListener(this);
        n1.setOnClickListener(this);
        n2.setOnClickListener(this);
        n3.setOnClickListener(this);
        n4.setOnClickListener(this);
        n5.setOnClickListener(this);
        n6.setOnClickListener(this);
        n7.setOnClickListener(this);
        n8.setOnClickListener(this);
        n9.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        equ.setOnClickListener(this);
        sign.setOnClickListener(this);
        point.setOnClickListener(this);
        deno.setOnClickListener(this);
        del.setOnClickListener(this);
        cln.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        //获取每个按钮的ID
        switch (v.getId()){
            case R.id.button11:
                myString+="0";
                all_num+="0";
                showString+="0";
                the_text.setText(showString);
                break;
            case R.id.button:
                myString+="1";
                all_num+="1";
                showString+="1";
                the_text.setText(showString);
                break;
            case R.id.button2:
                myString+="2";
                all_num+="2";
                showString+="2";
                the_text.setText(showString);
                break;
            case R.id.button3:
                myString+="3";
                all_num+="3";
                showString+="3";
                the_text.setText(showString);
                break;
            case R.id.button4:
                myString+="4";
                all_num+="4";
                showString+="4";
                the_text.setText(showString);
                break;
            case R.id.button5:
                myString+="5";
                all_num+="5";
                showString+="5";
                the_text.setText(showString);
                break;
            case R.id.button6:
                myString+="6";
                all_num+="6";
                showString+="6";
                the_text.setText(showString);
                break;
            case R.id.button7:
                myString+="7";
                all_num+="7";
                showString+="7";
                the_text.setText(showString);
                break;
            case R.id.button8:
                myString+="8";
                all_num+="8";
                showString+="8";
                the_text.setText(showString);
                break;
            case R.id.button9:
                myString+="9";
                all_num+="9";
                showString+="9";
                the_text.setText(showString);
                break;
            case R.id.button12:
                myString+=".";
                all_num+=".";
                showString+=".";
                the_text.setText(showString);
                break;


            case R.id.button15:
                if(!myString.equals(""))
                {
                    first_num=all_num;
                    option="+";
                    showString+=option;
                    the_text.setText(showString);
                    myString+=option;
                    all_num="";
                }
                break;
            case R.id.button16:
                if(!myString.equals(""))
                {
                    first_num=all_num;
                    option="-";
                    showString+=option;
                    the_text.setText(showString);
                    myString+=option;
                    all_num="";
                }
                break;
            case R.id.button17:
                if(!myString.equals(""))
                {
                    first_num=all_num;
                    option="*";
                    showString+=option;
                    the_text.setText(showString);
                    myString+=option;
                    all_num="";
                }
                break;
            case R.id.button18:
                if(!myString.equals(""))
                {
                    first_num=all_num;
                    option="/";
                    showString+=option;
                    the_text.setText(showString);
                    myString+=option;
                    all_num="";
                }
                break;


            case R.id.button19:
                if (myString.length() == 0||(myString.length()==1&&myString.equals("."))) {
                    return;
                }
                else if(option.equals("+"))
                {
                    result=Double.parseDouble(first_num)+Double.parseDouble(all_num);
                }
                else if(option.equals("-"))
                {
                    result=Double.parseDouble(first_num)-Double.parseDouble(all_num);
                }
                else if (option.equals("*"))
                {
                    result=Double.parseDouble(first_num)*Double.parseDouble(all_num);
                }
                else if (option.equals("/"))
                {
                    if(all_num.equals("0"))
                    {
                        Toast.makeText(MainActivity.this,"除数不能为0",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    else
                        result=Double.parseDouble(first_num)/Double.parseDouble(all_num);
                }
                else if (option.equals("%"))
                {
                    result=Double.parseDouble(first_num)/100;
                }
                else
                    result=Double.parseDouble(all_num);
                the_text.setText(""+result);
                first_num="";
                all_num="";
                myString="";
                showString="";
                break;


            case R.id.button20:
                if(!all_num.contains("+")&&!all_num.contains("-"))
                {
                    all_num="-"+all_num;
                    if(!showString.contains("+")&&!showString.contains("-")&&!showString.contains("*")&&!showString.contains("/"))
                    {
                        showString="-"+showString;
                        the_text.setText(showString);
                    }
                    else
                        the_text.setText(showString.substring(0,showString.indexOf("")+3)+"-"+showString.substring(showString.indexOf("")+3));
                }
                else if(all_num.contains("-"))
                {
                    all_num="+"+all_num;
                    if(!showString.contains("+")&&!showString.contains("-")&&!showString.contains("*")&&!showString.contains("/"))
                    {
                        showString="+"+showString;
                        the_text.setText(showString);
                    }
                    else
                        the_text.setText(showString.substring(0,showString.indexOf("")+3)+"+"+showString.substring(showString.indexOf("")+3));
                }

                break;

            case R.id.button14:
                if(!all_num.equals("")&&!all_num.equals("0"))
                {
                    all_num=String.valueOf(1/Double.parseDouble(all_num));
                    if(!showString.contains("+")&&!showString.contains("-")&&!showString.contains("*")&&!showString.contains("/"))
                    {
                        showString="1/"+showString;
                        the_text.setText(showString);
                    }
                    else
                        the_text.setText(showString.substring(0,showString.indexOf("")+2)+"1/"+showString.substring(showString.indexOf("")+2));
                }
                break;
            case R.id.button10:
                all_num="";
                first_num="";
                showString="";
                myString="";
                the_text.setText(showString);
                break;
            default:
                break;
        }

    }
}
