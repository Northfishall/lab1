package shiyan2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class menu implements ActionListener {

	JButton jb1=new JButton("�ϴ��ļ�");
	JButton jb2=new JButton("��ʾͼƬ");
	JButton jb3=new JButton("�ŽӴ�");
	JButton jb4=new JButton("�������ı�");
	JButton jb5=new JButton("�������");
	JButton stop=new JButton("stop");
	JButton jb6=new JButton("�㵽����");
	JButton jb7=new JButton("��͵�");
	JButton exit=new JButton("exit");
	
	
	JTextField from=new JTextField();
	JTextField to =new JTextField();
	JTextField bridge_word=new JTextField();
	JTextArea User_input=new JTextArea();
	JTextArea word_output=new JTextArea();
	JTextArea ran_go=new JTextArea();
	JScrollPane jsp1  = new JScrollPane(ran_go);
	JTextField start=new JTextField();
	JTextField start1=new JTextField();//�㵽��������
	JScrollPane jsp2 = new JScrollPane(start);
	JTextArea short2=new JTextArea();
	
	JTextField start2=new JTextField();
	JTextField end=new JTextField();
	JTextArea short1=new JTextArea();
	
	
	JFrame myframe=new JFrame();
	JPanel mypanel=new JPanel();
	Graph T=new Graph();
	public menu()
	{
		myframe.setSize(400,600);
		myframe.setVisible(true);
		myframe.add(mypanel);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mypanel.setLayout(null);
		
		jb1.setBounds(175, 10, 100, 20);
		mypanel.add(jb1);
		jb1.addActionListener(this);
		
		
		jb2.setBounds(175, 130,100,20);
		jb2.addActionListener(this);
		mypanel.add(jb2);
		
//		Label label2=new Label("word1");
//		Label label3=new Label("word2");
//		label2.setBounds(20, 160, 40, 20);
//		label3.setBounds(150, 160, 40, 20);
//		mypanel.add(label2);
//		from.setBounds(70, 160, 70, 20);
//		mypanel.add(label3);
//		to.setBounds(200, 160, 70, 20);
//		mypanel.add(from);
//		mypanel.add(to);
//		jb3.setBounds(175,190 , 100,20);
//		jb3.addActionListener(this);
//		mypanel.add(jb3);
//		bridge_word.setBounds(20,190,150,20);
//		bridge_word.setEditable(false);
//		mypanel.add(bridge_word);
		
		Label label4=new Label("�����ı�");
		Label label5=new Label("�����ı�");
		label4.setBounds(20, 220, 60, 20);
		label5.setBounds(170, 220, 60, 20);
		mypanel.add(label4);
		User_input.setBounds(20,250, 130,50 );
		mypanel.add(label5);
		word_output.setBounds(170, 250, 130, 50);
		User_input.setLineWrap(true);
		word_output.setLineWrap(true);
		word_output.setEditable(false);
		mypanel.add(User_input);
		mypanel.add(word_output);
		jb4.setBounds(175, 310, 100,20);
		mypanel.add(jb4);
		jb4.addActionListener(this);
		
		jb5.setBounds(175, 340, 100, 20);
		jb5.addActionListener(this);
		mypanel.add(jb5);
		ran_go.setBounds(20, 400,300,50);
		jsp1.setBounds(13,10,350,340);
		jsp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		mypanel.add(ran_go);
		mypanel.add(jsp1);
		Label label6=new Label("��ʼ�ĵ��ʣ�");
		label6.setBounds(100, 370, 100, 20);
		mypanel.add(label6);
		start.setBounds(210, 370, 100, 20);
		mypanel.add(start);
		
		jsp2.setBounds(13,10,350,340);
		jsp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		mypanel.add(jsp2);
		//mypanel.add(start1);//start1.setBounds();
		mypanel.add(jb6);
		jb6.setBounds(175,460,100, 20);
		start1.setBounds(100, 490, 100, 20);
		short2.setBounds(20,520,300,300);
		mypanel.add(short2);
		jb6.addActionListener(this);
		
		mypanel.add(start2);
		mypanel.add(end);
		mypanel.add(jb7);
		mypanel.add(short1);
		jb7.setBounds(400, 20, 100, 20);
		start2.setBounds(450,50,100,20);
		end.setBounds(560,50,100,20);
		jb7.addActionListener(this);
		short1.setBounds(320,80,300,60);
		
		stop.setBounds(320,150,100,20);
		stop.addActionListener(this);
		mypanel.add(stop);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb1)
		{
			JFileChooser jfc=new JFileChooser();
    		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
    		jfc.showDialog(new JLabel(), "ѡ��");
    		File file=jfc.getSelectedFile();
    		mypanel.add(jfc);
    		if(file.isFile())
    		{
    			try {
    				T = main_1.createDirectedGraph("D:\\eclipse code\\shiyan2\\test_data.txt");//file.getAbsolutePath()
    			} catch (IOException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
    		}
		}
		else if(e.getSource()==jb2)
		{
			main_1.showDirectedGraph(T);
        	JFrame frm=new JFrame();
        	JPanel pnl=new JPanel(new BorderLayout());
        	frm.add(pnl);
        	frm.setSize(1000,1000);
        	//pnl.setBounds(0, 0, 500, 500);
        	frm.setVisible(true);
        	JLabel imag=new JLabel(new ImageIcon("D:\\javaapp.gif"));
        	imag.setBounds(0,0,pnl.getWidth(),pnl.getHeight());
        	pnl.add(imag);
        	JScrollPane scrollPane=new JScrollPane();
        	pnl.add(scrollPane);
        	
        	
		}
		else if(e.getSource()==jb3)
		{
			String result=main_1.queryBridgeWords(T,from.getText().toLowerCase(),to.getText().toLowerCase());
			bridge_word.setText(result);
		}
		else if(e.getSource()==jb4)
		{
			String result=main_1.generateNewText(T,User_input.getText().toLowerCase());
			word_output.setText(result);
		}
		else if(e.getSource()==stop||e.getSource()==jb5)
		{
			for(int i=0;i<T.num;i++)
				for(int j=0;j<T.num;j++)
					T.visited[i][j]=0;
			String result=main_1.randomWalk(T,start.getText().toLowerCase());
			ran_go.setText(result);
		}
		else if(e.getSource()==jb6)
		{
			short2.setText("");
			if(!T.s_to_int.containsKey(start1.getText().toLowerCase()))
			{
				short2.setText("there is no such a word!");
				return;
			}
			Stack []result=main_1.all_calcShortestPath(T,start1.getText().toLowerCase());
			int i=0;
			while(i<T.num)
			{
				if(!result[i].isEmpty())
				{
					while(!result[i].isEmpty())
					{
						short2.setText(short2.getText()+(result[i].pop()+" "));
					}
					short2.setText(short2.getText()+("\n"));
				}
				i++;
			}
		}
		else if(e.getSource()==jb7)
		{
			String result="there is no such word!";
			if(T.s_to_int.containsKey(start2.getText().toLowerCase())&&T.s_to_int.containsKey(end.getText().toLowerCase()))
			{
				result=main_1.calcShortestPath(T,start2.getText().toLowerCase(),end.getText().toLowerCase());
			}
			short1.setText(result);
		}
	}
}
