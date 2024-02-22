package com.gui;

import javax.swing.*;

import com.player.Battle;
import com.player.Player;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
	private CardLayout cardLayout;
    JPanel buttonPanel,titlePanel,playerBAttackCon,outerContainer;
    JLabel titleLabel;
    JTextField textField;
    Font titleFont = new Font("Times New Roman",Font.BOLD,60);
    Font buttonFont = new Font("Times New Roman",Font.PLAIN,30);
    Font normalFont =  new Font("Times New Roman", Font.PLAIN,20);

    JButton playButton;
    JTextField  healthInput, healthStrengthInput, healthAttackInput, healthInputB,healthStrengthInputB, healthAttackInputB;
    WelcomeScreenHandle welcomeHandler = new WelcomeScreenHandle();
    InputScreenHandle inputHandler = new InputScreenHandle();
    Player playerA,playerB;
		public void gameWindowSize() {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setTitle("Magical Game");
			setSize(800,600);
			getContentPane().setBackground(Color.DARK_GRAY);
			setVisible(true);
		}
		public void welcomeScreen() {
			gameWindowSize();
			titlePanel = new JPanel();
			titlePanel.setBounds(50,100,700,70);
			titleLabel = new JLabel("Welcome to Magical Game");
			titleLabel.setFont(titleFont);
			titleLabel.setForeground(Color.WHITE);
			titleLabel.setBackground(Color.DARK_GRAY);
			 titlePanel.setOpaque(false);
			
			
			buttonPanel = new JPanel();
			buttonPanel.setBounds(350,300,100,50);
			 buttonPanel.setOpaque(false);
			 
			playButton =new JButton("PLAY");
			playButton.setBackground(Color.DARK_GRAY);
			playButton.setForeground(Color.WHITE);
			playButton.setFont(buttonFont);
			playButton.addActionListener(welcomeHandler);
			titlePanel.add(titleLabel);
			buttonPanel.add(playButton);
			setLayout(null);
			getContentPane().add(titlePanel);
			getContentPane().add(buttonPanel); 
		}
		
		public void userInputScreen() {
			titlePanel.setVisible(false);
			buttonPanel.setVisible(false);
     outerContainer = new JPanel();
    outerContainer.setBackground(Color.DARK_GRAY);

    titlePanel = new JPanel();
    titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Use FlowLayout for titlePanel
    titlePanel.setPreferredSize(new Dimension(700, 30)); // Set the preferred size
    titleLabel = new JLabel("Magical Game");
    titleLabel.setFont(titleFont);
    titleLabel.setForeground(Color.WHITE);
    titleLabel.setBackground(Color.DARK_GRAY);
    titlePanel.setOpaque(false);
    titlePanel.add(titleLabel);

    JPanel userInput = new JPanel();
    userInput.setLayout(new GridLayout(1, 2));
    userInput.setBackground(Color.DARK_GRAY);
    userInput.setOpaque(false);
    
    JPanel playerAContainer = new JPanel();
    playerAContainer.setBackground(Color.DARK_GRAY);

    
    JLabel playerALabel = new JLabel("Player A :");
    playerALabel.setFont(normalFont);
    playerALabel.setForeground(Color.WHITE);
    playerALabel.setBackground(Color.DARK_GRAY);
    playerALabel.setOpaque(false);
    
    JPanel playerAHealthCon = new JPanel();
    playerAHealthCon.setBackground(Color.DARK_GRAY);
    JLabel playerAHealthLabel = new JLabel("Health : ");
    playerAHealthLabel.setFont(normalFont);
    playerAHealthLabel.setForeground(Color.WHITE);
    playerAHealthLabel.setBackground(Color.DARK_GRAY);
    playerAHealthLabel.setOpaque(false);

    healthInput = new JTextField(20);
    playerAHealthCon.add(playerAHealthLabel);
    playerAHealthCon.add(healthInput);
    
    
JPanel playerAStrengthCon = new JPanel();
playerAStrengthCon.setBackground(Color.DARK_GRAY);

    JLabel playerAStrengthLabel = new JLabel("Strength : ");
    playerAStrengthLabel.setFont(normalFont);
    playerAStrengthLabel.setForeground(Color.WHITE);
    playerAStrengthLabel.setBackground(Color.DARK_GRAY);
    playerAStrengthLabel.setOpaque(false);

    healthStrengthInput = new JTextField(20);
    playerAStrengthCon.add(playerAStrengthLabel);
    playerAStrengthCon.add(healthStrengthInput);
    
    
JPanel playerAAttackCon = new JPanel();
playerAAttackCon.setBackground(Color.DARK_GRAY);

    JLabel playerAAttackLabel = new JLabel("Attack : ");
    playerAAttackLabel.setFont(normalFont);
    playerAAttackLabel.setForeground(Color.WHITE);
    playerAAttackLabel.setBackground(Color.DARK_GRAY);
    playerAAttackLabel.setOpaque(false);

     healthAttackInput = new JTextField(20);
    playerAAttackCon.add(playerAAttackLabel);
    playerAAttackCon.add(healthAttackInput);
    
    
        playerAContainer.add(playerALabel);
        playerAContainer.add(playerAHealthCon);
        playerAContainer.add(playerAStrengthCon);
        playerAContainer.add(playerAAttackCon);

    
    JPanel playerBContainer = new JPanel();
    playerBContainer.setBackground(Color.DARK_GRAY);

    
    JLabel playerBLabel = new JLabel("Player B :");
    playerBLabel.setFont(normalFont);
    playerBLabel.setForeground(Color.WHITE);
    playerBLabel.setBackground(Color.DARK_GRAY);
    playerBLabel.setOpaque(false);
    
    JPanel playerBHealthCon = new JPanel();
    playerBHealthCon.setBackground(Color.DARK_GRAY);
    JLabel playerBHealthLabel = new JLabel("Health : ");
    playerBHealthLabel.setFont(normalFont);
    playerBHealthLabel.setForeground(Color.WHITE);
    playerBHealthLabel.setBackground(Color.DARK_GRAY);
    playerBHealthLabel.setOpaque(false);

    healthInputB = new JTextField(20);
    playerBHealthCon.add(playerBHealthLabel);
    playerBHealthCon.add(healthInputB);
    
    
JPanel playerBStrengthCon = new JPanel();
playerBStrengthCon.setBackground(Color.DARK_GRAY);

    JLabel playerBStrengthLabel = new JLabel("Strength : ");
    playerBStrengthLabel.setFont(normalFont);
    playerBStrengthLabel.setForeground(Color.WHITE);
    playerBStrengthLabel.setBackground(Color.DARK_GRAY);
    playerBStrengthLabel.setOpaque(false);

     healthStrengthInputB = new JTextField(20);
    playerBStrengthCon.add(playerBStrengthLabel);
    playerBStrengthCon.add(healthStrengthInputB);
    
    
    playerBAttackCon = new JPanel();
    playerBAttackCon.setBackground(Color.DARK_GRAY);

    JLabel playerBAttackLabel = new JLabel("Attack : ");
    playerBAttackLabel.setFont(normalFont);
    playerBAttackLabel.setForeground(Color.WHITE);
    playerBAttackLabel.setBackground(Color.DARK_GRAY);
    playerBAttackLabel.setOpaque(false);

    healthAttackInputB = new JTextField(20);
    playerBAttackCon.add(playerBAttackLabel);
    playerBAttackCon.add(healthAttackInputB);
    
    
        playerBContainer.add(playerBLabel);
        playerBContainer.add(playerBHealthCon);
        playerBContainer.add(playerBStrengthCon);
        playerBContainer.add(playerBAttackCon);
    JPanel startButtonPanel = new JPanel();
    startButtonPanel.setOpaque(false);

    JButton startButton = new JButton("START");
    startButton.setBackground(Color.DARK_GRAY);
    startButton.setForeground(Color.WHITE);
    startButton.setFont(buttonFont);
    startButton.addActionListener(inputHandler);
    startButtonPanel.add(startButton);
    outerContainer.add(titlePanel);
    outerContainer.add(userInput);
    outerContainer.add(startButtonPanel);
    userInput.add(playerAContainer);
    userInput.add(playerBContainer);
    outerContainer.setLayout(new BoxLayout(outerContainer, BoxLayout.Y_AXIS));

    // Set outerContainer as the content pane
    setContentPane(outerContainer);

    // Ensure the layout is validated
    revalidate();
    repaint();
}
		
		public void battleScreen() {
    outerContainer.setVisible(false);
    JPanel battleScreenCont = new JPanel();
    battleScreenCont.setBackground(Color.DARK_GRAY);
    JLabel titleBattle = new JLabel("Battle");
    titleBattle.setFont(titleFont);
    titleBattle.setForeground(Color.WHITE);
    titleBattle.setBackground(Color.DARK_GRAY);

    JPanel battleSplitCon = new JPanel();

    JPanel playerStatCont = new JPanel();
    playerStatCont.setBackground(Color.DARK_GRAY);
    JLabel playerALabelBattle = new JLabel("Player A ");
    playerALabelBattle.setForeground(Color.WHITE);
    playerALabelBattle.setFont(normalFont);
    JLabel playerAHealthBattle = new JLabel(String.format("Health     : %d", playerA.getHealth()));
    playerAHealthBattle.setForeground(Color.WHITE);
    playerAHealthBattle.setFont(normalFont);
    JLabel playerAStrengthBattle = new JLabel(String.format("Strength : %d", playerA.getStrength()));
    playerAStrengthBattle.setForeground(Color.WHITE);
    playerAStrengthBattle.setFont(normalFont);
    JLabel playerAAttackBattle = new JLabel(String.format("Attack     : %d", playerA.getAttack()));
    playerAAttackBattle.setForeground(Color.WHITE);
    playerAAttackBattle.setFont(normalFont);
    JLabel playerBLabelBattle = new JLabel("Player B ");
    playerBLabelBattle.setForeground(Color.WHITE);
    playerBLabelBattle.setFont(normalFont);
    JLabel playerBHealthBattle = new JLabel(String.format("Health     : %d", playerB.getHealth()));
    playerBHealthBattle.setForeground(Color.WHITE);
    playerBHealthBattle.setFont(normalFont);
    JLabel playerBStrengthBattle = new JLabel(String.format("Strength : %d", playerB.getStrength()));
    playerBStrengthBattle.setForeground(Color.WHITE);
    playerBStrengthBattle.setFont(normalFont);
    JLabel playerBAttackBattle = new JLabel(String.format("Attack     : %d", playerB.getAttack()));
    playerBAttackBattle.setForeground(Color.WHITE);
    playerBAttackBattle.setFont(normalFont);

    playerStatCont.add(playerALabelBattle);
    playerStatCont.add(playerAHealthBattle);
    playerStatCont.add(playerAStrengthBattle);
    playerStatCont.add(playerAAttackBattle);
    playerStatCont.add(playerBLabelBattle);
    playerStatCont.add(playerBHealthBattle);
    playerStatCont.add(playerBStrengthBattle);
    playerStatCont.add(playerBAttackBattle);

    JPanel consoleCont = new JPanel();
    consoleCont.setBackground(Color.BLACK);
    
    // Create JTextArea to display battle log
    JTextArea battleLogTextArea = new JTextArea();
    battleLogTextArea.setBounds(0,0,400,400);
    battleLogTextArea.setBackground(Color.BLACK);
    battleLogTextArea.setForeground(Color.WHITE);
    battleLogTextArea.setFont(normalFont);
    battleLogTextArea.setEditable(false); // Ensure it's not editable
    
    // Create JScrollPane and add JTextArea to it
    JScrollPane scrollPane = new JScrollPane(battleLogTextArea);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    
    // Add JScrollPane to consoleCont
    consoleCont.add(scrollPane);

    playerStatCont.setLayout(new GridLayout(8, 1, 10, 2));
    battleSplitCon.setLayout(new GridLayout(1, 2));
    battleSplitCon.add(playerStatCont);
    battleSplitCon.add(consoleCont);

    battleScreenCont.setLayout(new BorderLayout());

    // Use FlowLayout for titleBattle with CENTER alignment
    JPanel titlePanelBattle = new JPanel(new FlowLayout(FlowLayout.CENTER));
    titlePanelBattle.setBackground(Color.DARK_GRAY);
    titlePanelBattle.add(titleBattle);

    battleScreenCont.add(titlePanelBattle, BorderLayout.NORTH);
    battleScreenCont.add(battleSplitCon, BorderLayout.CENTER);

    setContentPane(battleScreenCont);

    // Ensure the layout is validated
    revalidate();
    repaint();

    // Simulate battle and update JTextArea with battle log
    StringBuilder battleLog = new StringBuilder();
	new Battle().attackFunctionality(playerA, playerB, battleLog);
	

    battleLogTextArea.setText(battleLog.toString());

    if (playerA.getHealth() == 0) {
    	JOptionPane.showMessageDialog(battleScreenCont, "Player B wins.");
    	System.out.println("Player B wins.");
    } else {
    	JOptionPane.showMessageDialog(battleScreenCont, "Player A wins.");
    	System.out.println("Player A wins.");

    }
}

	
		
		public class WelcomeScreenHandle implements ActionListener {
			
			public void actionPerformed(ActionEvent event) {
				userInputScreen();
			}
		}
		public class InputScreenHandle implements ActionListener {
			
			public void actionPerformed(ActionEvent event) {
				int playerAHealthValue = Integer.parseInt(healthInput.getText());
				int playerAStrengthValue = Integer.parseInt(healthStrengthInput.getText());
				int playerAAttackValue = Integer.parseInt(healthAttackInput.getText());
				int playerBHealthValue = Integer.parseInt(healthInputB.getText());
				int playerBStrengthValue = Integer.parseInt(healthStrengthInputB.getText());
				int playerBAttackValue = Integer.parseInt(healthAttackInputB.getText());
				
				playerA = new Player(playerAHealthValue,playerAStrengthValue,playerAAttackValue);
				playerB = new Player(playerBHealthValue,playerBStrengthValue,playerBAttackValue);
				battleScreen();
			}
		}

		

}