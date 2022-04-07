package ex2;

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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
public class Votacao extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int Maria, Pedro, Nulo, Branco, porcento, porcentoP;
	private JPanel contentPane;
	private JTextField txtVoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Votacao frame = new Votacao();
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
	public Votacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMaria = new JLabel("20 - Maria");
		lblMaria.setFont(new Font("Impact", Font.PLAIN, 20));
		lblMaria.setBounds(109, 28, 99, 37);
		contentPane.add(lblMaria);
		
		JLabel lblPedro = new JLabel("30 - Pedro");
		lblPedro.setFont(new Font("Impact", Font.PLAIN, 20));
		lblPedro.setBounds(109, 61, 83, 26);
		contentPane.add(lblPedro);
		
		JLabel lblNulo = new JLabel("1 - Nulo");
		lblNulo.setFont(new Font("Impact", Font.PLAIN, 20));
		lblNulo.setBounds(109, 98, 89, 26);
		contentPane.add(lblNulo);
		
		JLabel lblBranco = new JLabel("2 - Branco");
		lblBranco.setFont(new Font("Impact", Font.PLAIN, 20));
		lblBranco.setBounds(109, 123, 99, 18);
		contentPane.add(lblBranco);
		
		txtVoto = new JTextField();
		txtVoto.setBounds(119, 156, 144, 20);
		contentPane.add(txtVoto);
		txtVoto.setColumns(10);
		
		JLabel SeuVoto = new JLabel("Seu Voto:");
		SeuVoto.setFont(new Font("Tahoma", Font.BOLD, 11));
		SeuVoto.setBounds(58, 152, 63, 29);
		contentPane.add(SeuVoto);
		
		JButton votar = new JButton("VOTAR");
		votar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int voto = Integer.parseInt(txtVoto.getText());
					
				switch (voto) {
					case 20:
						JOptionPane.showMessageDialog(lblMaria, "Você votou na Maria");
						Maria++;
						break;
					
					case 30:
					Pedro++;
					JOptionPane.showMessageDialog(lblPedro, "Você votou no Pedro");
					break;
					
					case 1:
						Nulo++;
						JOptionPane.showMessageDialog(lblNulo, "Você votou Nulo");
						break;
						
					case 2:
						Branco++;
						JOptionPane.showMessageDialog(lblBranco, "Você votou em Branco");
						break;
					
					default:
						JOptionPane.showMessageDialog(null, "Voto Inválido");
						break;
				}	
					
			}
		});
		votar.setFont(new Font("Tahoma", Font.BOLD, 13));
		votar.setForeground(Color.YELLOW);
		votar.setBackground(Color.WHITE);
		votar.setBounds(109, 187, 99, 26);
		contentPane.add(votar);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setBackground(Color.WHITE);
		cancelar.setForeground(new Color(0, 0, 255));
		cancelar.setFont(new Font("Tahoma", Font.BOLD, 13));
		cancelar.setVerticalAlignment(SwingConstants.BOTTOM);
		cancelar.setBounds(218, 187, 105, 26);
		contentPane.add(cancelar);
		
		JButton apurar = new JButton("Apurar");
		apurar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int totalVotos = 1;
				if(Maria > Pedro) {
					Maria = Maria*100/totalVotos;
					JOptionPane.showMessageDialog(lblMaria, "Maria foi a candidata mais votada!");
				}else if(Pedro > Maria){
					Pedro = Pedro*100/totalVotos;
					JOptionPane.showMessageDialog(lblPedro, "Pedro foi o candidato mais votado!");
			}
			}
		});
		apurar.setFont(new Font("Tahoma", Font.BOLD, 13));
		apurar.setBackground(Color.WHITE);
		apurar.setForeground(Color.RED);
		apurar.setBounds(154, 224, 105, 23);
		contentPane.add(apurar);
	}
}
