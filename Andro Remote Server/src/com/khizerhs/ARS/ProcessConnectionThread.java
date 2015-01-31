package com.khizerhs.ARS;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.InputStream;

import javax.microedition.io.StreamConnection;

public class ProcessConnectionThread implements Runnable{

	private StreamConnection mConnection;
	
	// Constant that indicate command from devices
	private static final int EXIT_CMD = -1;
	
	private static final int KEY_RIGHT = 1;
	private static final int KEY_LEFT = 2;

	private static final int KEY_A =3;
	private static final int KEY_B =4;
	private static final int KEY_C =5;
	private static final int KEY_D =6;
	private static final int KEY_E =7;
	private static final int KEY_F =8;
	private static final int KEY_G =9;
	private static final int KEY_H =10;
	private static final int KEY_I =11;
	private static final int KEY_J =12;
	private static final int KEY_K =13;
	private static final int KEY_L =14;
	private static final int KEY_M =15;
	private static final int KEY_N =16;
	private static final int KEY_O =17;
	private static final int KEY_P =18;
	private static final int KEY_Q =19;
	private static final int KEY_R =20;
	private static final int KEY_S =21;
	private static final int KEY_T =22;
	private static final int KEY_U =23;
	private static final int KEY_V =24;
	private static final int KEY_W =25;
	private static final int KEY_X =26;
	private static final int KEY_Y =27;
	private static final int KEY_Z =28;
	
	private static final int KEY_BS =100;
	private static final int KEY_RET=101;
	private static final int KEY_SPC=99;
	
	private static final int KEY_AL =29;
	private static final int KEY_BL =30;
	private static final int KEY_CL =31;
	private static final int KEY_DL =32;
	private static final int KEY_EL =33;
	private static final int KEY_FL =34;
	private static final int KEY_GL =35;
	private static final int KEY_HL =36;
	private static final int KEY_IL =37;
	private static final int KEY_JL =38;
	private static final int KEY_KL =39;
	private static final int KEY_LL =40;
	private static final int KEY_ML =41;
	private static final int KEY_NL =42;
	private static final int KEY_OL =43;
	private static final int KEY_PL =44;
	private static final int KEY_QL =45;
	private static final int KEY_RL =46;
	private static final int KEY_SL =47;
	private static final int KEY_TL =48;
	private static final int KEY_UL =49;
	private static final int KEY_VL =50;
	private static final int KEY_WL =51;
	private static final int KEY_XL =52;
	private static final int KEY_YL =53;
	private static final int KEY_ZL =54;
	
	public ProcessConnectionThread(StreamConnection connection)
	{
		mConnection = connection;
	}
	
	@Override
	public void run() {
		try {
			
			// prepare to receive data
			InputStream inputStream = mConnection.openInputStream();
	        
			System.out.println("waiting for input");
	        
	        while (true) {
	        	int command = inputStream.read();
	        	
	        	if (command == EXIT_CMD)
	        	{	
	        		System.out.println("finish process");
	        		break;
	        	}
	        	
	        	processCommand(command);
        	}
        } catch (Exception e) {
    		e.printStackTrace();
    	}
	}
	
	/**
	 * Process the command from client
	 * @param command the command code
	 */
	private void processCommand(int command) {
		try {
			Robot robot = new Robot();
			switch (command) {
	    	case KEY_RIGHT:
	    		robot.keyPress(KeyEvent.VK_RIGHT);
	    		System.out.println("Right");
	    		// release the key after it is pressed. Otherwise the event just keeps getting trigged	    		
	    		robot.keyRelease(KeyEvent.VK_RIGHT);
	    		break;
	    	case KEY_LEFT:
	    		robot.keyPress(KeyEvent.VK_LEFT);
	    		System.out.println("Left");
	    		// release the key after it is pressed. Otherwise the event just keeps getting trigged	    		
	    		robot.keyRelease(KeyEvent.VK_LEFT);
	    		break;
	    	case KEY_A:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_A);
	    		System.out.println("A");
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_A);
	    		
	    		break;
	    	case KEY_B:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_B);
	    		System.out.println("B");
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_B);
	    		break;
	    	case KEY_C:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_C);
	    		System.out.println("C");
	    		robot.keyRelease(KeyEvent.VK_C);
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		break;
	    	case KEY_D:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_D);
	    		System.out.println("D");
	    		
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_D);
	    		break;
	    	case KEY_E:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_E);
	    		System.out.println("B");
	    		
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_E);
	    		break;
	    	case KEY_F:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_F);
	    		System.out.println("F");
	    		
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_F);
	    		break;
	    	case KEY_G:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_G);
	    		System.out.println("G");
	    		robot.keyRelease(KeyEvent.VK_G);
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		break;
	    	case KEY_H:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_H);
	    		System.out.println("H");
	    		robot.keyRelease(KeyEvent.VK_H);
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		break;
	    	case KEY_I:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_I);
	    		System.out.println("I");
	    		
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_I);
	    		break;
	    	case KEY_J:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_J);
	    		System.out.println("J");
	    		
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_J);
	    		break;
	    	case KEY_K:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_K);
	    		System.out.println("K");
	    		robot.keyRelease(KeyEvent.VK_K);
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_K);
	    		break;
	    	case KEY_L:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_L);
	    		System.out.println("L");
	    		
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_L);
	    		break;
	    	case KEY_M:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_M);
	    		System.out.println("M");
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_M);
	    		
	    		break;
	    	case KEY_N:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_N);
	    		System.out.println("N");
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_N);
	    		
	    		break;
	    	case KEY_O:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_O);
	    		System.out.println("O");
	    		
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_O);
	    		break;
	    	case KEY_P:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_P);
	    		System.out.println("P");
	    		
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_P);
	    		break;
	    	case KEY_Q:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_Q);
	    		System.out.println("Q");
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_Q);

	    	case KEY_R:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_R);
	    		System.out.println("R");
	    		
	    		
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_R);
	    		break;
	    	case KEY_S:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_S);
	    		System.out.println("S");
	    		
	    		
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_S);
	    		break;
	    	case KEY_T:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_T);
	    		System.out.println("T");
	    		
	    		
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_T);
	    		break;
	    	case KEY_U:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_U);
	    		System.out.println("U");
	    		
	    		
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_U);
	    		break;
	    	case KEY_V:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_V);
	    		System.out.println("V");
	    		
	    		
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_V);
	    		break;
	    	case KEY_W:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_W);
	    		System.out.println("W");
	    		
	    		
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_W);
	    		break;
	    	case KEY_X:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_X);
	    		System.out.println("X");
	    		
	    		
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_X);
	    		break;
	    	case KEY_Y:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_Y);
	    		System.out.println("Y");
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_Y);
	    		break;
	    	case KEY_Z:
	    		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyPress(KeyEvent.VK_Z);
	    		System.out.println("Z");
	    	robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	    		robot.keyRelease(KeyEvent.VK_Z);
	    		break;
	    	case KEY_AL:
	    		robot.keyPress(KeyEvent.VK_A);
	    		System.out.println("a");
	    		robot.keyRelease(KeyEvent.VK_A);
	    		break;
	    	case KEY_BL:
	    		robot.keyPress(KeyEvent.VK_B);
	    		System.out.println("b");
	    		robot.keyRelease(KeyEvent.VK_B);
	    		break;
	    	case KEY_CL:
	    		robot.keyPress(KeyEvent.VK_C);
	    		System.out.println("c");
	    		robot.keyRelease(KeyEvent.VK_C);
	    		break;
	    	case KEY_DL:
	    		robot.keyPress(KeyEvent.VK_D);
	    		System.out.println("d");
	    		robot.keyRelease(KeyEvent.VK_D);
	    		break;
	    	case KEY_EL:
	    		robot.keyPress(KeyEvent.VK_E);
	    		System.out.println("e");
	    		robot.keyRelease(KeyEvent.VK_E);
	    		break;
	    	case KEY_FL:
	    		robot.keyPress(KeyEvent.VK_F);
	    		System.out.println("f");
	    		robot.keyRelease(KeyEvent.VK_F);
	    		break;
	    	case KEY_GL:
	    		robot.keyPress(KeyEvent.VK_G);
	    		System.out.println("g");
	    		robot.keyRelease(KeyEvent.VK_G);
	    		break;
	    	case KEY_HL:
	    		robot.keyPress(KeyEvent.VK_H);
	    		System.out.println("h");
	    		robot.keyRelease(KeyEvent.VK_H);
	    		break;
	    	case KEY_IL:
	    		robot.keyPress(KeyEvent.VK_I);
	    		System.out.println("i");
	    		robot.keyRelease(KeyEvent.VK_I);
	    		break;
	    	case KEY_JL:
	    		robot.keyPress(KeyEvent.VK_J);
	    		System.out.println("j");
	    		robot.keyRelease(KeyEvent.VK_J);
	    		break;
	    	case KEY_KL:
	    		robot.keyPress(KeyEvent.VK_K);
	    		System.out.println("k");
	    		robot.keyRelease(KeyEvent.VK_K);
	    		break;
	    	case KEY_LL:
	    		robot.keyPress(KeyEvent.VK_L);
	    		System.out.println("l");
	    		robot.keyRelease(KeyEvent.VK_L);
	    		break;
	    	case KEY_ML:
	    		robot.keyPress(KeyEvent.VK_M);
	    		System.out.println("m");
	    		robot.keyRelease(KeyEvent.VK_M);
	    		break;
	    	case KEY_NL:
	    		robot.keyPress(KeyEvent.VK_N);
	    		System.out.println("n");
	    		robot.keyRelease(KeyEvent.VK_N);
	    		break;
	    	case KEY_OL:
	    		robot.keyPress(KeyEvent.VK_O);
	    		System.out.println("o");
	    		robot.keyRelease(KeyEvent.VK_O);
	    		break;
	    	case KEY_PL:
	    		robot.keyPress(KeyEvent.VK_P);
	    		System.out.println("p");
	    		robot.keyRelease(KeyEvent.VK_P);
	    		break;
	    	case KEY_QL:
	    		robot.keyPress(KeyEvent.VK_Q);
	    		System.out.println("q");
	    		robot.keyRelease(KeyEvent.VK_Q);
	    		break;
	    	case KEY_RL:
	    		robot.keyPress(KeyEvent.VK_R);
	    		System.out.println("r");
	    		robot.keyRelease(KeyEvent.VK_R);
	    		break;
	    	case KEY_SL:
	    		robot.keyPress(KeyEvent.VK_S);
	    		System.out.println("s");
	    		robot.keyRelease(KeyEvent.VK_S);
	    		break;
	    	case KEY_TL:
	    		robot.keyPress(KeyEvent.VK_T);
	    		System.out.println("t");
	    		robot.keyRelease(KeyEvent.VK_T);
	    		break;
	    	case KEY_UL:
	    		robot.keyPress(KeyEvent.VK_U);
	    		System.out.println("u");
	    		robot.keyRelease(KeyEvent.VK_U);
	    		break;
	    	case KEY_VL:
	    		robot.keyPress(KeyEvent.VK_V);
	    		System.out.println("v");
	    		robot.keyRelease(KeyEvent.VK_V);
	    		break;
	    	case KEY_WL:
	    		robot.keyPress(KeyEvent.VK_W);
	    		System.out.println("w");
	    		robot.keyRelease(KeyEvent.VK_W);
	    		break;
	    	case KEY_XL:
	    		robot.keyPress(KeyEvent.VK_X);
	    		System.out.println("x");
	    		robot.keyRelease(KeyEvent.VK_X);
	    	case KEY_YL:
	    		robot.keyPress(KeyEvent.VK_Y);
	    		System.out.println("y");
	    		robot.keyRelease(KeyEvent.VK_Y);
	    		break;
	    	case KEY_ZL:
	    		robot.keyPress(KeyEvent.VK_Z);
	    		System.out.println("z");
	    		robot.keyRelease(KeyEvent.VK_Z);
	    		break;
	    	case KEY_BS:
	    		robot.keyPress(KeyEvent.VK_BACK_SPACE);
	    		System.out.println("Backspace");
	    		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
	    		break;
	    	case KEY_RET:
	    		robot.keyPress(KeyEvent.VK_ENTER);
	    		System.out.println("Enter");
	    		robot.keyRelease(KeyEvent.VK_ENTER);
	    	case KEY_SPC:
	    		robot.keyPress(KeyEvent.VK_SPACE);
	    		System.out.println("Space");
	    		robot.keyRelease(KeyEvent.VK_SPACE);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
