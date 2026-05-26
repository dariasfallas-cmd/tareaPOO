package Lógica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DialogoOrdenes extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	private JComboBox cbClientes;
	private JComboBox cbProductos;
	private JTextField txtCantidad;
	private JTextField txtTotal;
	private JTable tableDetalles;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoOrdenes dialog = new DialogoOrdenes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoOrdenes() {
		setTitle("Registro de Órdenes de Compra - WallRose");
		setBounds(100, 100, 500, 420); 
		getContentPane().setLayout(new BorderLayout());
		
		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblCliente = new JLabel("Seleccionar Cliente:");
		lblCliente.setBounds(10, 15, 120, 14);
		contentPanel.add(lblCliente);
		
		cbClientes = new JComboBox();
		cbClientes.setBounds(140, 12, 330, 22);
		contentPanel.add(cbClientes);
		
		JLabel lblProducto = new JLabel("Producto:");
		lblProducto.setBounds(10, 48, 70, 14);
		contentPanel.add(lblProducto);
		
		cbProductos = new JComboBox();
		cbProductos.setBounds(80, 45, 160, 22);
		contentPanel.add(cbProductos);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(260, 48, 60, 14);
		contentPanel.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(325, 45, 145, 20);
		contentPanel.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 85, 460, 160);
		contentPanel.add(scrollPane);
		
		tableDetalles = new JTable();
		scrollPane.setViewportView(tableDetalles);
		
		JLabel lblTotal = new JLabel("Total Orden:");
		lblTotal.setBounds(290, 262, 80, 14);
		contentPanel.add(lblTotal);
		
		txtTotal = new JTextField();
		txtTotal.setText("0.0");
		txtTotal.setEditable(false); 
		txtTotal.setBounds(370, 259, 100, 20);
		contentPanel.add(txtTotal);
		txtTotal.setColumns(10);
		
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		
		JButton btnAgregarItem = new JButton("Agregar al carrito");
		btnAgregarItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonPane.add(btnAgregarItem);
		
		JButton btnFinalizarVenta = new JButton("Finalizar Venta");
		btnFinalizarVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonPane.add(btnFinalizarVenta);

		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		buttonPane.add(btnCerrar);
	}
}