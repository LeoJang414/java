package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.sound.sampled.Line;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 반복문확인문제2 {

	public static void main(String[] args) {
		for (int i =0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i =0; i < 5; i++) {
			System.out.print("커피*");
		}
		System.out.println();
		for (int i =0; i < 3; i++) {
			System.out.println("커피*우유");
		}
		for (int i =0; i < 3; i++) {
			System.out.println((i + 1) + " : 짱!");
		}
	}

}
