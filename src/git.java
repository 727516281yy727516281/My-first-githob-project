import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;//导入图片的接口

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;	


	public class git extends JFrame implements ActionListener{

		private static final long serialVersionUID = 119158294134073403L;
		//定义窗口界面元素的对象
		private JLabel userLabel,pwsLabel;//用户名、密码标签,即在窗口中显示用户名、密码提示信息
		private JTextField userTextField;//用户名输入文本框
		private JPasswordField pwdTextField;//密码输入文本框
		private JButton login_Button;//登录按钮
		private JButton exit_Button;//退出按钮
		private ImageIcon title_image,login_image,background;//定义图标、按键、背景的图片

		
		
		//窗口本身的位置
		public git(String title){
			super(title);//或者调用title(),设置窗口标题
			init();
			//setLocation(800,350);//设置窗口在屏幕中的位置
			setSize(300,300);//设置窗口的大小300*300
			int windowWidth=this.getWidth();//获取窗口宽度
			int windowHeight=this.getHeight();//获取窗口高度
			Toolkit kit=Toolkit.getDefaultToolkit();//定义工具包
			Dimension screenSize=kit.getScreenSize();//获取屏幕尺寸
			int screenWidth=screenSize.width;//获取屏幕宽度
			int screenHeight=screenSize.height;//获取屏幕高度
			this.setLocation
				(screenWidth/2-windowWidth/2,
						screenHeight/2-windowHeight/2);//设置窗口居中
			
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);//设置关闭按钮，退出程序
			setResizable(false);//不允许拖动窗口以改变其大小
			setVisible(true);
		}
		//窗口界面元素的设置
		public void init()
		{
			setLayout(null);//设置窗口管理窗口元素显（实例化一种管理模式的对象）
			userLabel=new JLabel("用户名");
			userLabel.setBounds(60, 50, 60, 30);
			add(userLabel);
			userTextField=new JTextField();
			userTextField.setBounds(120, 50, 100, 25);
			add(userTextField);
			pwsLabel=new JLabel("密码");
			pwsLabel.setBounds(60, 100, 60, 30);
			add(pwsLabel);
			pwdTextField=new JPasswordField();
			pwdTextField.setBounds(120, 100, 100, 25);
			add(pwdTextField);
			
			login_image=
					new ImageIcon(getClass()
							.getResource("/com/student/image/img02.jpg"));//将登录图标换成图片
			login_Button=new JButton("登录",login_image);//登录可以把它省略
			login_Button.setBounds(60, 150, 60, 30);
			add(login_Button);
			
			login_Button.addActionListener(this);
			exit_Button=new JButton("退出");
			exit_Button.setBounds(160, 150, 60, 30);
			add(exit_Button);
			exit_Button.addActionListener(this);
			
			
			
			
			//背景图片开始了
			background=new ImageIcon(getClass()
					.getResource("/com/student/image/img03.jpg"));
			JLabel label=new JLabel(background);
			label.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
			JPanel imagePanel=(JPanel)this.getContentPane();
			imagePanel.setOpaque(false);//改变透明度
			this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
			/**
			 * getClass().getResource();这个是获取图片地址的格式
			 * */
			
			/**
			 * Imagelcon im=new  Imagelcon(getclass()
						.getrosource("/com/student/image/img01.png"));//设置登录界面的登陆图标
			 * */
		
			
		}
		public void actionPerformed(ActionEvent e){
			String userText;
			//点击登录按钮
				if (e.getSource()==login_Button)
				{
						userText=userTextField.getText();
					if(userText.equals(""))
						JOptionPane.showMessageDialog(this,"请输入用户名");

					}
			
			if (e.getSource()==exit_Button)
			{
				System.exit(0);
			}
				
		}

		/*
		public MyFirstFrame(){
		setTitle("FirstFrame");
		setBounds(200,200, 400,300);
		setVisible(true);
		}
		*/
		
		public static void main(String[] args) {
			new git("学生登陆");
		
		}
	}
