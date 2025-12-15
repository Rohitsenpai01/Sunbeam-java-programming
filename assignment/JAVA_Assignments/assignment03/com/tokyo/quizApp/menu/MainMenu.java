package com.tokyo.quizApp.menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class MainMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 873, 701);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setForeground(new Color(0, 255, 127));
		contentPane.setToolTipText("Quiz App");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Quizz App");
        lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 38));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setLabelFor(this);
        lblNewLabel.setBounds(183, 22, 468, 82);
        contentPane.add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Student Login");
        btnNewButton.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
        btnNewButton.setBounds(309, 178, 225, 42);
        contentPane.add(btnNewButton);
        
        JButton btnStudentRegistration = new JButton("Student Registration");
        btnStudentRegistration.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
        btnStudentRegistration.setBounds(309, 254, 225, 42);
        contentPane.add(btnStudentRegistration);
        
        JButton btnAdminLogin = new JButton("Admin Login");
        btnAdminLogin.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
        btnAdminLogin.setBounds(309, 327, 225, 42);
        contentPane.add(btnAdminLogin);
        
        JButton btnExit = new JButton("Exit !");
        btnExit.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
        btnExit.setBounds(309, 410, 225, 42);
        contentPane.add(btnExit);

	}
	private static int mainMenu(Scanner sc) {
		System.out.println("1. SignIn .");
		System.out.println("2. SignUp .");
		System.out.println("3. Admin .");
		System.out.println("0. Exit Application .");
		return sc.nextInt();
	}
	
	public static void mainmenu(Scanner sc) {
		do {
			switch(mainMenu(sc)) {
			case 0 :return;
			
			case 1 : SignIn.Signin(sc);
			break;
			
			case 2 : SignUp.Signup(sc);
			}
		}while(mainMenu(sc) != 0);
	}
}
