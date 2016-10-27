import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;//����ͼƬ�Ľӿ�

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;	


	public class git extends JFrame implements ActionListener{

		private static final long serialVersionUID = 119158294134073403L;
		//���崰�ڽ���Ԫ�صĶ���
		private JLabel userLabel,pwsLabel;//�û����������ǩ,���ڴ�������ʾ�û�����������ʾ��Ϣ
		private JTextField userTextField;//�û��������ı���
		private JPasswordField pwdTextField;//���������ı���
		private JButton login_Button;//��¼��ť
		private JButton exit_Button;//�˳���ť
		private ImageIcon title_image,login_image,background;//����ͼ�ꡢ������������ͼƬ

		
		
		//���ڱ����λ��
		public git(String title){
			super(title);//���ߵ���title(),���ô��ڱ���
			init();
			//setLocation(800,350);//���ô�������Ļ�е�λ��
			setSize(300,300);//���ô��ڵĴ�С300*300
			int windowWidth=this.getWidth();//��ȡ���ڿ��
			int windowHeight=this.getHeight();//��ȡ���ڸ߶�
			Toolkit kit=Toolkit.getDefaultToolkit();//���幤�߰�
			Dimension screenSize=kit.getScreenSize();//��ȡ��Ļ�ߴ�
			int screenWidth=screenSize.width;//��ȡ��Ļ���
			int screenHeight=screenSize.height;//��ȡ��Ļ�߶�
			this.setLocation
				(screenWidth/2-windowWidth/2,
						screenHeight/2-windowHeight/2);//���ô��ھ���
			
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);//���ùرհ�ť���˳�����
			setResizable(false);//�������϶������Ըı����С
			setVisible(true);
		}
		//���ڽ���Ԫ�ص�����
		public void init()
		{
			setLayout(null);//���ô��ڹ�����Ԫ���ԣ�ʵ����һ�ֹ���ģʽ�Ķ���
			userLabel=new JLabel("�û���");
			userLabel.setBounds(60, 50, 60, 30);
			add(userLabel);
			userTextField=new JTextField();
			userTextField.setBounds(120, 50, 100, 25);
			add(userTextField);
			pwsLabel=new JLabel("����");
			pwsLabel.setBounds(60, 100, 60, 30);
			add(pwsLabel);
			pwdTextField=new JPasswordField();
			pwdTextField.setBounds(120, 100, 100, 25);
			add(pwdTextField);
			
			login_image=
					new ImageIcon(getClass()
							.getResource("/com/student/image/img02.jpg"));//����¼ͼ�껻��ͼƬ
			login_Button=new JButton("��¼",login_image);//��¼���԰���ʡ��
			login_Button.setBounds(60, 150, 60, 30);
			add(login_Button);
			
			login_Button.addActionListener(this);
			exit_Button=new JButton("�˳�");
			exit_Button.setBounds(160, 150, 60, 30);
			add(exit_Button);
			exit_Button.addActionListener(this);
			
			
			
			
			//����ͼƬ��ʼ��
			background=new ImageIcon(getClass()
					.getResource("/com/student/image/img03.jpg"));
			JLabel label=new JLabel(background);
			label.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
			JPanel imagePanel=(JPanel)this.getContentPane();
			imagePanel.setOpaque(false);//�ı�͸����
			this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
			/**
			 * getClass().getResource();����ǻ�ȡͼƬ��ַ�ĸ�ʽ
			 * */
			
			/**
			 * Imagelcon im=new  Imagelcon(getclass()
						.getrosource("/com/student/image/img01.png"));//���õ�¼����ĵ�½ͼ��
			 * */
		
			
		}
		public void actionPerformed(ActionEvent e){
			String userText;
			//�����¼��ť
				if (e.getSource()==login_Button)
				{
						userText=userTextField.getText();
					if(userText.equals(""))
						JOptionPane.showMessageDialog(this,"�������û���");

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
			new git("ѧ����½");
		
		}
	}
