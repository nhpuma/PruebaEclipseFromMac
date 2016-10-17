package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Configurado extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnMostrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configurado frame = new Configurado();
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
	public Configurado() {
		setTitle("Configurado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(this);
		btnMostrar.setBounds(335, 11, 89, 23);
		contentPane.add(btnMostrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 315, 239);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMostrar) {
			actionPerformedBtnMostrar(e);
		}
	}
	protected void actionPerformedBtnMostrar(ActionEvent e) {
		txtS.setText("Hola Mundo");
	}
}
