package ex1;

import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Tela extends JPanel {
	private JTextField textField;
	private JTextField txtCPF;

	/**
	 * Create the panel.
	 */
	public Tela() {
		setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(268, 5, 1, 1);
		add(desktopPane);
		
		JLabel INome = new JLabel("Nome:");
		INome.setBounds(80, 91, 85, 36);
		INome.setForeground(Color.BLACK);
		INome.setFont(new Font("Impact", Font.PLAIN, 22));
		add(INome);
		
		JLabel ICPF = new JLabel("CPF:");
		ICPF.setBounds(80, 139, 85, 36);
		ICPF.setForeground(Color.BLACK);
		ICPF.setFont(new Font("Impact", Font.PLAIN, 22));
		add(ICPF);
		
		JButton CCPF = new JButton("CONFERIR CPF");
		CCPF.setBackground(Color.BLACK);
		CCPF.setBounds(197, 284, 184, 36);
		CCPF.setFont(new Font("Arial Black", Font.BOLD, 13));
		CCPF.setForeground(Color.RED);
		CCPF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String CPF = txtCPF.getText();
			if (ValidaCPF.isCPF(CPF)==true)
				JOptionPane.showMessageDialog(null, "CPF Válido: " +CPF);
			else
				JOptionPane.showMessageDialog(null, "CPF Inválido: " +CPF);
			}
		});
		add(CCPF);
		
		textField = new JTextField();
		textField.setBounds(186, 104, 243, 20);
		add(textField);
		textField.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(186, 152, 243, 20);
		add(txtCPF);

	}
}
