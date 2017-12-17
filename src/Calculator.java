import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculator extends JFrame{


	private JTextField t;

	private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9
	,buttonD,button0,buttonE,buttonP,buttonM,buttonMul,buttonDiv,buttonBal,buttonCsl,
	buttonQua,buttonCube,buttonx,buttonSin,buttonCos,buttonTan,buttonEx,buttonLnx,buttonSqrt,buttonPi,buttone;

	private String operator;
	private double a=0,b=0,value=0,result=0;
	private String answer;
	private String str ="";
	private String c="";
	private Font font1;
	private Font font2;
	private Font font3;
	private Font font4;
	private String Enternumber;


	public Calculator()
	{

		font1 = new Font("HY°ß°íµñ", Font.BOLD, 30);
		font2 = new Font("HY°ß°íµñ", Font.BOLD, 25);
		font3 = new Font("HY°ß°íµñ", Font.BOLD, 15);
		font4 = new Font("HY°ß°íµñ", Font.BOLD, 12);



		button1=new JButton("1");
		button1.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {

				Enternumber = t.getText() + button1.getText();
				t.setText(Enternumber);
				str += e.getActionCommand();
				b = Double.parseDouble(button1.getText());
				
				if(operator=="+"||operator=="-"||operator=="*"||operator=="/"||operator=="%")
				{
				c+=e.getActionCommand();
				b = Double.parseDouble(c);
				}
				if(operator=="=")
				{
					str = e.getActionCommand();
					t.setText(str);
					c+=button1.getText();
				}
				if(operator=="^2" || operator=="^3" || operator== "sin" || operator=="cos" || operator=="tan"||operator=="1/x"
						|| operator == "ex" ||operator=="lnx"||operator=="sqrt"||operator=="pi"||operator=="e")
				{
					
					a=0.0;
					b=0.0;
					str="";
					c="";
					result=0.0;
					answer="";
					t.setText("");
					str+=e.getActionCommand();
					t.setText(str);
				}
			}
		});
		button2=new JButton("2");
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Enternumber = t.getText() + button2.getText();
				t.setText(Enternumber);
				str += e.getActionCommand();
				b = Double.parseDouble(button2.getText());
				
				if(operator=="+"||operator=="-"||operator=="*"||operator=="/"||operator=="%")
				{
				c+=e.getActionCommand();
				b = Double.parseDouble(c);
				}
				if(operator=="=")
				{
					str = e.getActionCommand();
					t.setText(str);
					c+=button2.getText();
				}
				if(operator=="^2" || operator=="^3" || operator== "sin" || operator=="cos" || operator=="tan"||operator=="1/x"
						|| operator == "ex" ||operator=="lnx"||operator=="sqrt"||operator=="pi"||operator=="e")
				{
					
					a=0.0;
					b=0.0;
					str="";
					c="";
					result=0.0;
					answer="";
					t.setText("");
					str+=e.getActionCommand();
					t.setText(str);
				}
			}
		});
		button3=new JButton("3");
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Enternumber = t.getText() + button3.getText();
				t.setText(Enternumber);
				str += e.getActionCommand();
				b = Double.parseDouble(button3.getText());
				
				if(operator=="+"||operator=="-"||operator=="*"||operator=="/"||operator=="%")
				{
				c+=e.getActionCommand();
				b = Double.parseDouble(c);
				}
				if(operator=="=")
				{
					str = e.getActionCommand();
					t.setText(str);
					c+=button3.getText();
				}
				if(operator=="^2" || operator=="^3" || operator== "sin" || operator=="cos" || operator=="tan"||operator=="1/x"
						|| operator == "ex" ||operator=="lnx"||operator=="sqrt"||operator=="pi"||operator=="e")
				{
					
					a=0.0;
					b=0.0;
					str="";
					c="";
					result=0.0;
					answer="";
					t.setText("");
					str+=e.getActionCommand();
					t.setText(str);
				}
			}
		});
		button4=new JButton("4");
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Enternumber = t.getText() + button4.getText();
				t.setText(Enternumber);
				str += e.getActionCommand();
				b = Double.parseDouble(button4.getText());
				
				if(operator=="+"||operator=="-"||operator=="*"||operator=="/"||operator=="%")
				{
				c+=e.getActionCommand();
				b = Double.parseDouble(c);
				}
				if(operator=="=")
				{
					str = e.getActionCommand();
					t.setText(str);
					c+=button4.getText();
				}
				if(operator=="^2" || operator=="^3" || operator== "sin" || operator=="cos" || operator=="tan"||operator=="1/x"
						|| operator == "ex" ||operator=="lnx"||operator=="sqrt"||operator=="pi"||operator=="e")
				{
					
					a=0.0;
					b=0.0;
					str="";
					c="";
					result=0.0;
					answer="";
					t.setText("");
					str+=e.getActionCommand();
					t.setText(str);
				}
			}
		});
		button5=new JButton("5");
		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Enternumber = t.getText() + button5.getText();
				t.setText(Enternumber);
				str += e.getActionCommand();
				b = Double.parseDouble(button5.getText());
				
				if(operator=="+" || operator=="-" || operator=="*" || operator=="/" || operator=="%")
				{
				c+=e.getActionCommand();
				b = Double.parseDouble(c);
				}
				if(operator=="=")
				{
					str = e.getActionCommand();
					t.setText(str);
					c+=button5.getText();
				}
				if(operator=="^2" || operator=="^3" || operator== "sin" || operator=="cos" || operator=="tan"||operator=="1/x"
						|| operator == "ex" ||operator=="lnx"||operator=="sqrt"||operator=="pi"||operator=="e")
				{
					
					a=0.0;
					b=0.0;
					str="";
					c="";
					result=0.0;
					answer="";
					t.setText("");
					str+=e.getActionCommand();
					t.setText(str);
				}
			}
		});
		button6=new JButton("6");
		button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Enternumber = t.getText() + button6.getText();
				t.setText(Enternumber);
				str += e.getActionCommand();
				b = Double.parseDouble(button6.getText());
				
				if(operator=="+"||operator=="-"||operator=="*"||operator=="/"||operator=="%")
				{
				c+=e.getActionCommand();
				b = Double.parseDouble(c);
				}
				if(operator=="=")
				{
					str = e.getActionCommand();
					t.setText(str);
					c+=button6.getText();
				}
				if(operator=="^2" || operator=="^3" || operator== "sin" || operator=="cos" || operator=="tan"||operator=="1/x"
						|| operator == "ex" ||operator=="lnx"||operator=="sqrt"||operator=="pi"||operator=="e")
				{
					
					a=0.0;
					b=0.0;
					str="";
					c="";
					result=0.0;
					answer="";
					t.setText("");
					str+=e.getActionCommand();
					t.setText(str);
				}
			}
		});
		button7=new JButton("7");
		button7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Enternumber = t.getText() + button7.getText();
				t.setText(Enternumber);
				str += e.getActionCommand();
				b = Double.parseDouble(button7.getText());
				
				if(operator=="+"||operator=="-"||operator=="*"||operator=="/"||operator=="%")
				{
				c+=e.getActionCommand();
				b = Double.parseDouble(c);
				}
				if(operator=="=")
				{
					str = e.getActionCommand();
					t.setText(str);
					c+=button7.getText();
				}
				if(operator=="^2" || operator=="^3" || operator== "sin" || operator=="cos" || operator=="tan"||operator=="1/x"
						|| operator == "ex" ||operator=="lnx"||operator=="sqrt"||operator=="pi"||operator=="e")
				{
					
					a=0.0;
					b=0.0;
					str="";
					c="";
					result=0.0;
					answer="";
					t.setText("");
					str+=e.getActionCommand();
					t.setText(str);
				}
			}
		});
		button8=new JButton("8");
		button8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Enternumber = t.getText() + button8.getText();
				t.setText(Enternumber);
				str += e.getActionCommand();
				b = Double.parseDouble(button8.getText());
				
				if(operator=="+"||operator=="-"||operator=="*"||operator=="/"||operator=="%")
				{
				c+=e.getActionCommand();
				b = Double.parseDouble(c);
				}
				
				if(operator=="=")
				{
					str = e.getActionCommand();
					t.setText(str);
					c+=button8.getText();
				}
				if(operator=="^2" || operator=="^3" || operator== "sin" || operator=="cos" || operator=="tan" ||operator=="1/x"
						|| operator == "ex" ||operator=="lnx"||operator=="sqrt"||operator=="pi"||operator=="e")
				{
					
					a=0.0;
					b=0.0;
					str="";
					c="";
					result=0.0;
					answer="";
					t.setText("");
					str+=e.getActionCommand();
					t.setText(str);
				}
			}
		});
		button9=new JButton("9");
		button9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Enternumber = t.getText() + button9.getText();
				t.setText(Enternumber);
				str += e.getActionCommand();
				b = Double.parseDouble(button9.getText());
				
				if(operator=="+"||operator=="-"||operator=="*"||operator=="/"||operator=="%")
				{
				c+=e.getActionCommand();
				b = Double.parseDouble(c);
				}
				if(operator=="=")
				{
					str = e.getActionCommand();
					t.setText(str);
					
				}
				//buttonx,buttonSin,buttonCos,buttonTan,buttonEx,buttonLnx,buttonSqrt,buttonPi,buttone
				if(operator=="^2" || operator=="^3" || operator== "sin" || operator=="cos" || operator=="tan"||operator=="1/x"
						|| operator == "ex" ||operator=="lnx"||operator=="sqrt"||operator=="pi"||operator=="e")
				{
					
					a=0.0;
					b=0.0;
					str="";
					c="";
					result=0.0;
					answer="";
					t.setText("");
					str+=e.getActionCommand();
					t.setText(str);
				}
			}
		});

		
		button0=new JButton("0");
		button0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Enternumber = t.getText() + button0.getText();
				t.setText(Enternumber);
				str += e.getActionCommand();
				b = Double.parseDouble(button0.getText());
				
				if(operator=="+"||operator=="-"||operator=="*"||operator=="/"||operator=="%")
				{
				c+=e.getActionCommand();
				b = Double.parseDouble(c);
				}
				if(operator=="=")
				{
					str = e.getActionCommand();
					t.setText(str);
					c+=button0.getText();
				}
				if(operator=="^2" || operator=="^3" || operator== "sin" || operator=="cos" || operator=="tan"||operator=="1/x"
						|| operator == "ex" ||operator=="lnx"||operator=="sqrt"||operator=="pi"||operator=="e")
				{
					
					a=0.0;
					b=0.0;
					str="";
					c="";
					result=0.0;
					answer="";
					t.setText("");
					str+=e.getActionCommand();
					t.setText(str);
				}
			}
		});
		buttonD=new JButton(".");
		buttonD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Enternumber = t.getText() + buttonD.getText();
				t.setText(Enternumber);
				str += e.getActionCommand();
				b = Double.parseDouble(Enternumber);
				if(operator=="=")
				{
					str = e.getActionCommand();
					t.setText(str);
					c+=button0.getText();
				}
			}
		});

		buttonE=new JButton("=");
		buttonE.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try{

					c="";
					
					str += e.getActionCommand();
					t.setText(str);

					
					if(operator=="+")
					{
						result = a+b;
						answer = String.format("%.2f",result);
						str += answer;
						t.setText(str);
						
					}
					
					else if(operator=="-")
					{
						result = a-b;
						answer = String.format("%.2f",result);
						str += answer;
						t.setText(str);
					}
					else if(operator=="*")
					{
						result = a*b;
						answer = String.format("%.2f",result);
						str += answer;
						t.setText(str);
					}
					else if(operator=="/")
					{
						result = a/b;
						answer = String.format("%.2f",result);
						str += answer;
						t.setText(str);
					}
					else if(operator=="%")
					{
						result = a%b;
						answer = String.format("%.2f",result);
						str += answer;
						t.setText(str);
					}
					else if(operator=="^2")
					{
						result = a*b;
						answer = String.format("%.2f",result);
						str += answer;
						t.setText(str);
					}
					else if(operator=="^3")
					{
						result = a*a*a;
						answer = String.format("%.2f",result);
						str += answer;
						t.setText(str);
					}
					else if(operator=="1/x")
					{
						result = 1/a;
						answer = String.format("%.2f",result);
						str += answer;
						t.setText(str);
					}

					operator= "=";

				}


				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}

			}

		});
		
		buttonP=new JButton("+");
		buttonP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				
				try{
					if(operator=="=")
					{	
						str = e.getActionCommand();
						str = answer;
						t.setText(str);
						
					}
					
					//t.setText(Enternumber);
					a=Double.parseDouble(t.getText());
					operator="+";
					str += e.getActionCommand();
					t.setText(str);
					c = "";

				}
				catch(NumberFormatException err){
					err.printStackTrace();
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}
			}
		});
		buttonM=new JButton("-");
		buttonM.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				try{
					if(operator=="=")
					{	
						str = e.getActionCommand();
						str = answer;
						t.setText(str);
						
					}
					a=Double.parseDouble(t.getText());
					
					operator="-";
					t.setText("");
					str += e.getActionCommand();
					t.setText(str);
					
					c="";
				}
				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}
			}
		});
		buttonMul=new JButton("*");
		buttonMul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				try{
					if(operator=="=")
					{	
						str = e.getActionCommand();
						str = answer;
						t.setText(str);
						
					}
					
					a=Double.parseDouble(t.getText());
					
					operator="*";
					t.setText("");
					str += e.getActionCommand();
					t.setText(str);
					c="";
				}
				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}
			}
		});
		buttonDiv=new JButton("/");
		buttonDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				try{
					if(operator=="=")
					{	
						str = e.getActionCommand();
						str = answer;
						t.setText(str);
						
					}
					a=Double.parseDouble(t.getText());
					t.setText("");
					operator="/";
					str += e.getActionCommand();
					t.setText(str);
					
					c="";
				}
				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}
			}
		});
		buttonBal=new JButton("%");
		buttonBal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				try{
					if(operator=="=")
					{	
						str = e.getActionCommand();
						str = answer;
						t.setText(str);
						
					}
					
					a=Double.parseDouble(t.getText());
					t.setText("");
					operator="%";
					str += e.getActionCommand();
					t.setText(str);
					
					c="";
				}
				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}
			}
		});
		buttonCsl=new JButton("CLR");
		buttonCsl.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Enternumber = t.getText() + button0.getText();
				t.setText(null);
				a=0.0;
				b=0.0;
				str="";
				c="";
				result=0.0;
				answer="";
				operator = "c";
			}
		});
		buttonQua=new JButton("^2");
		buttonQua.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				try{
					double ops = Double.parseDouble(String.valueOf(t.getText()));
					ops = ops*ops;
					t.setText(String.valueOf(ops));
					operator = "^2";
				}
				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}
			}
		});
		buttonCube=new JButton("^3");
		buttonCube.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				try{
					double ops = Double.parseDouble(String.valueOf(t.getText()));
					ops = ops*ops*ops;
					t.setText(String.valueOf(ops));
					operator = "^3";
				}
				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}
			}
		});
		buttonx=new JButton("1/x");
		buttonx.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				try{
					double ops = Double.parseDouble(String.valueOf(t.getText()));
					ops = 1/ops;
					t.setText(String.valueOf(ops));
					operator="1/x";
				}
				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}
			}
		});
		buttonSin=new JButton("sinx");
		buttonSin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				try{
					double ops = Double.parseDouble(String.valueOf(t.getText()));
					ops = Math.sin(ops);
					t.setText(String.valueOf(ops));
					operator="sin";
				}
				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}
			}

		});
		buttonCos=new JButton("cosx");
		buttonCos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				try{
					double ops = Double.parseDouble(String.valueOf(t.getText()));
					ops = Math.cos(ops);
					t.setText(String.valueOf(ops));
					operator="cos";
				}
				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}
			}
		});
		buttonTan=new JButton("tanx");
		buttonTan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				try{
					double ops = Double.parseDouble(String.valueOf(t.getText()));
					ops = Math.tan(ops);
					t.setText(String.valueOf(ops));
					operator="tan";
				}
				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}
			}
		});
		buttonEx=new JButton("e^x");
		buttonEx.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				try{
					double ops = Double.parseDouble(String.valueOf(t.getText()));
					ops = Math.exp(ops);
					t.setText(String.valueOf(ops));
					operator="ex";
				}
				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}
			}
		});
		buttonLnx=new JButton("lnx");
		buttonLnx.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				try{

					double ops = Double.parseDouble(String.valueOf(t.getText()));
					ops = Math.log(ops)/Math.log(10);
					t.setText(String.valueOf(ops));
					operator="lnx";
				}
				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}
			}
		});
		buttonSqrt=new JButton("SQRT");
		buttonSqrt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				try{

					double ops = Double.parseDouble(String.valueOf(t.getText()));
					ops = Math.sqrt(ops);
					t.setText(String.valueOf(ops));
					operator="sqrt";

				}
				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}

			}
		});
		buttonPi=new JButton("¥ð");
		buttonPi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {



				try{
					double ops=Double.parseDouble(t.getText());
					ops = ops*(Math.PI);
					t.setText(String.valueOf(ops));
					operator="pi";
				}
				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}

			}
		});
		buttone=new JButton("e");
		buttone.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				try{
					double ops =Double.parseDouble(t.getText());
					ops = ops* Math.E;
					t.setText(String.valueOf(ops));
					operator="e";
				}
				catch(NumberFormatException err){
					JOptionPane.showMessageDialog(null, "Please enter a number first!");
				}


			}
		});

		button1.setBounds(20,100,80,60);
		button1.setFont(font1);
		button1.setForeground(Color.orange);
		button2.setBounds(110,100,80,60);
		button2.setFont(font1);
		button2.setForeground(Color.orange);
		button3.setBounds(200,100,80,60);
		button3.setFont(font1);
		button3.setForeground(Color.orange);
		button4.setBounds(20,170,80,60);
		button4.setFont(font1);
		button4.setForeground(Color.red);
		button5.setBounds(110,170,80,60);
		button5.setFont(font1);
		button5.setForeground(Color.red);
		button6.setBounds(200,170,80,60);
		button6.setFont(font1);
		button6.setForeground(Color.red);
		button7.setBounds(20,235,80,60);
		button7.setFont(font1);
		button7.setForeground(Color.red);
		button8.setBounds(110,235,80,60);
		button8.setFont(font1);
		button8.setForeground(Color.red);
		button9.setBounds(200,235,80,60);
		button9.setFont(font1);
		button9.setForeground(Color.red);

		buttonD.setBounds(20,305,80,60);
		buttonD.setFont(font1);
		buttonD.setForeground(Color.red);
		button0.setBounds(110,305,80,60);
		button0.setFont(font1);
		button0.setForeground(Color.red);
		buttonE.setBounds(200,305,80,60);
		buttonE.setFont(font1);
		buttonE.setForeground(Color.black);
		buttonP.setBounds(20,380,70,60);
		buttonP.setFont(font1);
		buttonP.setForeground(Color.black);
		buttonM.setBounds(100,380,70,60);
		buttonM.setFont(font1);
		buttonM.setForeground(Color.black);
		buttonMul.setBounds(180,380,70,60);
		buttonMul.setFont(font1);
		buttonMul.setForeground(Color.black);

		buttonDiv.setBounds(20,455,70,60);
		buttonDiv.setFont(font1);
		buttonDiv.setForeground(Color.black);
		buttonBal.setBounds(100,455,70,60);
		buttonBal.setFont(font1);
		buttonBal.setForeground(Color.black);
		buttonCsl.setBounds(180,455,70,60);
		buttonCsl.setFont(font4);
		buttonCsl.setForeground(Color.black);

		buttonQua.setBounds(300,100,80,65);
		buttonQua.setFont(font1);
		buttonQua.setForeground(Color.magenta);
		buttonCube.setBounds(390,100,80,65);
		buttonCube.setFont(font1);
		buttonCube.setForeground(Color.magenta);
		buttonx.setBounds(480,100,80,65);
		buttonx.setFont(font4);
		buttonx.setForeground(Color.lightGray);

		buttonSin.setBounds(300,170,80,65);
		buttonSin.setFont(font3);
		buttonSin.setForeground(Color.blue);
		buttonCos.setBounds(390,170,80,65);
		buttonCos.setFont(font3);
		buttonCos.setForeground(Color.blue);
		buttonTan.setBounds(480,170,80,65);
		buttonTan.setFont(font3);
		buttonTan.setForeground(Color.blue);

		buttonEx.setBounds(300,240,80,65);
		buttonEx.setFont(font3);
		buttonEx.setForeground(Color.green);
		buttonLnx.setBounds(390,240,80,65);
		buttonLnx.setFont(font3);
		buttonLnx.setForeground(Color.green);
		buttonSqrt.setBounds(480,240,80,65);
		buttonSqrt.setFont(font4);
		buttonSqrt.setForeground(Color.lightGray);
		buttonPi.setBounds(300,310,80,65);
		buttonPi.setFont(font1);
		buttonPi.setForeground(Color.magenta);
		buttone.setBounds(390,310,80,65);
		buttone.setFont(font1);
		buttone.setForeground(Color.magenta);


		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		add(buttonD);
		add(button0);
		add(buttonE);
		add(buttonP);
		add(buttonM);
		add(buttonMul);
		add(buttonDiv);
		add(buttonBal);
		add(buttonCsl);
		add(buttonQua);
		add(buttonCube);
		add(buttonx);
		add(buttonSin);
		add(buttonCos);
		add(buttonTan);
		add(buttonEx);
		add(buttonLnx);
		add(buttonSqrt);
		add(buttonPi);
		add(buttone);




		t = new JTextField();
		t.setDisabledTextColor(Color.BLUE);
		t.setBounds(0, 30, 580, 50);
		t.setFont(font1);
		t.setEnabled(false);
		t.setHorizontalAlignment(JTextField.RIGHT);

		add(t);





		setBounds(600,600,600,600);
		setLayout(null);
		setTitle("Basic scientific calculation   ");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();

	}

}

