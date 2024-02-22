package com.runner;

import java.util.Scanner;

import javax.swing.SwingUtilities;

import com.gui.GameWindow;
import com.player.*;
public class Runner {
    public static final int DICE_SIDES = 6;
	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                GameWindow gameWindow = new GameWindow();
	                gameWindow.welcomeScreen();
	            }
	        });
	        }

			
	}
	

