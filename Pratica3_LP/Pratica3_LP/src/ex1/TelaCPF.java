package ex1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaCPF extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCPF frame = new TelaCPF();
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
	public TelaCPF() {
		getContentPane().setLayout(null);
		
		JLabel INome_1 = new JLabel("Nome:");
		INome_1.setForeground(Color.BLACK);
		INome_1.setFont(new Font("Impact", Font.PLAIN, 22));
		INome_1.setBounds(44, 43, 85, 36);
		getContentPane().add(INome_1);
		
		JLabel ICPF_1 = new JLabel("CPF:");
		ICPF_1.setForeground(Color.BLACK);
		ICPF_1.setFont(new Font("Impact", Font.PLAIN, 22));
		ICPF_1.setBounds(44, 90, 85, 36);
		getContentPane().add(ICPF_1);
		
		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(139, 56, 243, 20);
		getContentPane().add(textField_2);
		
		JTextField textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(139, 103, 243, 20);
		getContentPane().add(textField_3);
		
		JButton CCPF = new JButton("CONFERIR CPF");
		CCPF.setForeground(Color.RED);
		CCPF.setFont(new Font("Arial Black", Font.BOLD, 13));
		CCPF.setBackground(Color.BLACK);
		CCPF.setBounds(141, 174, 184, 36);
		getContentPane().add(CCPF);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton CCPF1 = new JButton("CONFERIR CPF");
		CCPF1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String CPF = CCPF1.getText();
				if (ValidaCPF.isCPF(CPF)==true)
					JOptionPane.showMessageDialog(null, "CPF Válido: " +CPF);
				else
					JOptionPane.showMessageDialog(null, "CPF Inválido: " +CPF);
		
			}
		});
		CCPF1.setForeground(Color.RED);
		CCPF1.setFont(new Font("Arial Black", Font.BOLD, 13));
		CCPF1.setBackground(Color.BLACK);
		CCPF1.setBounds(131, 182, 184, 36);
		contentPane.add(CCPF1);
		
	
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(114, 59, 243, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(114, 99, 243, 20);
		contentPane.add(textField_1);
		
		JLabel INome = new JLabel("Nome:");
		INome.setForeground(Color.BLACK);
		INome.setFont(new Font("Impact", Font.PLAIN, 22));
		INome.setBounds(28, 47, 85, 36);
		contentPane.add(INome);
		
		JLabel ICPF = new JLabel("CPF:");
		ICPF.setForeground(Color.BLACK);
		ICPF.setFont(new Font("Impact", Font.PLAIN, 22));
		ICPF.setBounds(28, 94, 85, 36);
		contentPane.add(ICPF);
	}
}
