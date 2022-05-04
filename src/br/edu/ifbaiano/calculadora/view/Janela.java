package br.edu.ifbaiano.calculadora.view;

import javax.swing.JFrame;

	public class Janela extends JFrame {
		
		private static final long serialVersionUID = 1L;

		public Janela() {
			super("Janela Principal");
			setSize(200, 200);
			setVisible(true);
		}
		
		public static void main(String[] args) {
			new Janela();
		}
	}
