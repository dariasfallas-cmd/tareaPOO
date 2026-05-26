package Lógica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setTitle("Sistema de Ventas - Tienda WallRose");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Tienda WallRose - Menú Principal");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(10, 11, 414, 23);
		contentPane.add(lblTitulo);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DialogoClientes ventanaClientes = new DialogoClientes();
				ventanaClientes.setModal(true); 
				ventanaClientes.setVisible(true);
			}
		});
		btnClientes.setBounds(25, 147, 115, 35); 
		contentPane.add(btnClientes);
		
		JButton btnProductos = new JButton("Productos");
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DialogoProductos ventanaProductos = new DialogoProductos();
				ventanaProductos.setModal(true);
				ventanaProductos.setVisible(true);
			}
		});
		btnProductos.setBounds(290, 147, 115, 35);
		contentPane.add(btnProductos);
		
		JButton btnOrdenCompra = new JButton("Registrar Orden Compra");
		btnOrdenCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DialogoOrdenes ventanaOrdenes = new DialogoOrdenes();
				ventanaOrdenes.setModal(true);
				ventanaOrdenes.setVisible(true);
			}
		});
		btnOrdenCompra.setBounds(112, 75, 210, 40); 
		contentPane.add(btnOrdenCompra);
	}
}
