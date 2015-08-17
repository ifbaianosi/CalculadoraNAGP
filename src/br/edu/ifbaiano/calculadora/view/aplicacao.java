package br.edu.ifbaiano.calculadora.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.util.StringTokenizer;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileFilter;

import br.edu.ifbaiano.calculadora.utils.BackgroundFocusField;
import br.edu.ifbaiano.calculadora.utils.FixedLengthDocument;
import br.edu.ifbaiano.calculadora.utils.IntegerDocument;
import br.edu.ifbaiano.calculadora.utils.keyPressed;

import com.g5.JMoneyTextField;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.KeyEvent;
import java.awt.Dimension;

public class aplicacao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel_logoIF = null;
	private JPanel jPanel_topo = null;
	private JPanel jPanel_conteudo = null;
	private JPanel jPanel_rodape = null;
	private JPanel jPanel_titulo = null;
	private JLabel jLabel4 = null;
	private JPanel jPanel_formulario = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel7 = null;
	private JLabel jLabel8 = null;
	private JTextField jTextField_qtdPassagem = null;
	private JPanel jPanel2 = null;
	private JPanel jPanel_resultado_calc_porMes = null;
	private JPanel jPanel4 = null;
	private JLabel jLabel9 = null;
	private JLabel jLabel10 = null;
	private JLabel jLabel12 = null;
	private JLabel jLabel14 = null;
	private JPanel jPanel5 = null;
	private JLabel jLabel16 = null;
	private JLabel jLabel18 = null;
	private JLabel jLabel19 = null;
	private JTabbedPane jTabbedPane = null;
	private JPanel jPanel6 = null;
	private JLabel jLabel17 = null;
	private JLabel jLabel20 = null;
	private JLabel jLabel21 = null;
	private JPanel jPanel_formulario1 = null;
	private JLabel jLabel51 = null;
	private JLabel jLabel71 = null;
	private JLabel jLabel81 = null;
	private JTextField jTextField_qtdDeslocamento = null;
	private JLabel jLabel22 = null;
	private JLabel jLabel23 = null;
	private JLabel jLabel24 = null;
	private JLabel jLabel25 = null;
	private JPanel jPanel_resultado_calc_porDia = null;
	private JPanel jPanel81 = null;
	private JButton jButton_limpar = null;
	private JButton jButton_calcular = null;
	private JMoneyTextField jMoneyTextField_vencimentoBasico = null;
	private JMoneyTextField jMoneyTextField_valorDiario = null;
	private JMoneyTextField jMoneyTextField_valorReceber = null;
	private JMoneyTextField jMoneyTextField_valorMensal = null;
	private JMoneyTextField jMoneyTextField_valorMensal_22 = null;
	private JMoneyTextField jMoneyTextField_valorSistema = null;
	private JPanel jPanel_toolBars = null;
	private JButton jButton_fechar = null;
	private JButton jButton_ajuda = null;
	private JLabel jLabel26 = null;
	private JLabel jLabel27 = null;
	private JPanel jPanel10 = null;
	private JLabel jLabel28 = null;
	private JLabel jLabel29 = null;
	private JLabel jLabel30 = null;
	private JMoneyTextField jMoneyTextField_vencimentoBasico2 = null;
	private JMoneyTextField jMoneyTextField_valorPassagem = null;
	private JMoneyTextField jMoneyTextField_valorDescontado = null;
	private JMoneyTextField jMoneyTextField_valorAuxilio = null;
	private JMoneyTextField jMoneyTextField_valorReceber2 = null;
	private JLabel jLabel11 = null;
	private JTextField jTextField_qtdDeslocamento2 = null;
	private JButton jButton_imprimir = null;
	private Image img;
	private JLabel jLabel_imgMEC = null;
	private JPanel jPanel1 = null;
	private JPanel jPanel11 = null;
	private JPanel jPanel811 = null;
	private JButton jButton_limpar2 = null;
	private JButton jButton_calcular1 = null;
	private JButton jButton_imprimir1 = null;  
	
	/**
	 * This method initializes jLabel_logoIF	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	private JLabel getJLabel_logoIF() {
		if (jLabel_logoIF == null) {
			jLabel_logoIF = new JLabel();
			jLabel_logoIF.setText("");
			jLabel_logoIF.setBackground(Color.white);
			jLabel_logoIF.setOpaque(true);
			jLabel_logoIF.setIcon(new ImageIcon(getClass().getResource("/br/edu/ifbaiano/calculadora/img/if-baiano.jpg")));
		}
		return jLabel_logoIF;
	}

	/**
	 * This method initializes jPanel_topo	
	 * 	
	 * @return javax.swing.JPanel	
	 */	
	private JPanel getJPanel_topo() {
		if (jPanel_topo == null) {
			GridBagConstraints gridBagConstraints24 = new GridBagConstraints();
			gridBagConstraints24.gridx = 2;
			gridBagConstraints24.anchor = GridBagConstraints.EAST;
			gridBagConstraints24.insets = new Insets(8, 0, 0, 9);
			gridBagConstraints24.fill = GridBagConstraints.NONE;
			gridBagConstraints24.gridy = 0;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridx = 3;
			gridBagConstraints4.anchor = GridBagConstraints.WEST;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints4.gridy = 0;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
			gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.gridy = 0;
			jPanel_topo = new JPanel();
			jPanel_topo.setLayout(new GridBagLayout());
			jPanel_topo.setBackground(Color.white);
			jPanel_topo.add(getJLabel_logoIF(), gridBagConstraints);
			jPanel_topo.add(getJLabel_imgMEC(), gridBagConstraints24);
		}
		return jPanel_topo;
	}

	/**
	 * This method initializes jPanel_conteudo	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_conteudo() {
		if (jPanel_conteudo == null) {
			jLabel27 = new JLabel();
			jLabel27.setText(" ");
			jLabel26 = new JLabel();
			jLabel26.setText(" ");
			BorderLayout borderLayout = new BorderLayout();
			borderLayout.setHgap(0);
			borderLayout.setVgap(0);
			jPanel_conteudo = new JPanel();
			jPanel_conteudo.setLayout(borderLayout);
			jPanel_conteudo.add(getJPanel_titulo(), BorderLayout.NORTH);
			jPanel_conteudo.add(jLabel26, BorderLayout.WEST);
			jPanel_conteudo.add(jLabel27, BorderLayout.EAST);
			jPanel_conteudo.add(getJTabbedPane(), BorderLayout.CENTER);
		}
		return jPanel_conteudo;
	}

	/**
	 * This method initializes jPanel_rodape	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_rodape() {
		if (jPanel_rodape == null) {
			GridBagConstraints gridBagConstraints49 = new GridBagConstraints();
			gridBagConstraints49.gridx = 0;
			gridBagConstraints49.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints49.gridy = 0;
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.gridx = 0;
			gridBagConstraints5.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints5.weightx = 1.0;
			gridBagConstraints5.insets = new Insets(2, 0, 0, 0);
			gridBagConstraints5.gridy = 1;
			jPanel_rodape = new JPanel();
			jPanel_rodape.setLayout(new GridBagLayout());
			jPanel_rodape.setBackground(new Color(255, 51, 51));
			jPanel_rodape.add(getJPanel5(), gridBagConstraints5);
			jPanel_rodape.add(getJPanel_toolBars(), gridBagConstraints49);
		}
		return jPanel_rodape;
	}

	/**
	 * This method initializes jPanel_titulo	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_titulo() {
		if (jPanel_titulo == null) {
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 0;
			gridBagConstraints6.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints6.anchor = GridBagConstraints.NORTH;
			gridBagConstraints6.weightx = 1.0;
			gridBagConstraints6.insets = new Insets(2, 0, 0, 0);
			gridBagConstraints6.gridy = 0;
			jLabel4 = new JLabel();
			jLabel4.setText("Cálculo do Auxílio-Transporte");
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel4.setBackground(new Color(51, 153, 0));
			jLabel4.setOpaque(true);
			jLabel4.setForeground(Color.white);
			jPanel_titulo = new JPanel();
			jPanel_titulo.setLayout(new GridBagLayout());
			jPanel_titulo.setBackground(new Color(255, 51, 51));
			jPanel_titulo.add(jLabel4, gridBagConstraints6);
		}
		return jPanel_titulo;
	}

	/**
	 * This method initializes jPanel_formulario	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_formulario() {
		if (jPanel_formulario == null) {
			GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
			gridBagConstraints21.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints21.gridy = 2;
			gridBagConstraints21.weightx = 1.0;
			gridBagConstraints21.insets = new Insets(0, 5, 0, 5);
			gridBagConstraints21.gridx = 1;
			GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
			gridBagConstraints18.gridx = 0;
			gridBagConstraints18.insets = new Insets(0, 5, 0, 0);
			gridBagConstraints18.gridy = 2;
			jLabel11 = new JLabel();
			jLabel11.setText("Quantidade de Deslocamento por Mês");
			GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
			gridBagConstraints14.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints14.gridy = 3;
			gridBagConstraints14.weightx = 1.0;
			gridBagConstraints14.insets = new Insets(0, 5, 0, 5);
			gridBagConstraints14.gridx = 1;
			GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
			gridBagConstraints13.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints13.gridy = 1;
			gridBagConstraints13.weightx = 1.0;
			gridBagConstraints13.insets = new Insets(0, 5, 0, 5);
			gridBagConstraints13.gridx = 1;
			GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
			gridBagConstraints10.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints10.gridy = 0;
			gridBagConstraints10.weightx = 1.0;
			gridBagConstraints10.insets = new Insets(0, 5, 0, 5);
			gridBagConstraints10.gridx = 1;
			GridBagConstraints gridBagConstraints44 = new GridBagConstraints();
			gridBagConstraints44.gridx = 0;
			gridBagConstraints44.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints44.gridwidth = 2;
			gridBagConstraints44.insets = new Insets(6, 0, 3, 5);
			gridBagConstraints44.weighty = 1.0;
			gridBagConstraints44.weightx = 1.0;
			gridBagConstraints44.anchor = GridBagConstraints.SOUTHEAST;
			gridBagConstraints44.gridy = 4;
			GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
			gridBagConstraints12.gridx = 0;
			gridBagConstraints12.insets = new Insets(0, 5, 0, 5);
			gridBagConstraints12.anchor = GridBagConstraints.WEST;
			gridBagConstraints12.gridy = 3;
			jLabel8 = new JLabel();
			jLabel8.setText("Quantidade de Passagens Diárias:");
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 0;
			gridBagConstraints11.insets = new Insets(0, 5, 0, 5);
			gridBagConstraints11.anchor = GridBagConstraints.WEST;
			gridBagConstraints11.gridy = 1;
			jLabel7 = new JLabel();
			jLabel7.setText("Valor da Passagem Diária:");
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.gridx = 0;
			gridBagConstraints7.anchor = GridBagConstraints.WEST;
			gridBagConstraints7.insets = new Insets(5, 5, 0, 5);
			gridBagConstraints7.gridy = 0;
			jLabel5 = new JLabel();
			jLabel5.setText("Vencimento Básico:");
			jPanel_formulario = new JPanel();
			jPanel_formulario.setLayout(new GridBagLayout());
			jPanel_formulario.setBorder(BorderFactory.createTitledBorder(null, " Parâmetros ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jPanel_formulario.setBackground(Color.white);
			jPanel_formulario.add(jLabel5, gridBagConstraints7);
			jPanel_formulario.add(jLabel7, gridBagConstraints11);
			jPanel_formulario.add(jLabel8, gridBagConstraints12);
			jPanel_formulario.add(getJPanel81(), gridBagConstraints44);
			jPanel_formulario.add(getJMoneyTextField_vencimentoBasico2(), gridBagConstraints10);
			jPanel_formulario.add(getJMoneyTextField_valorPassagem(), gridBagConstraints13);
			jPanel_formulario.add(getJTextField_qtdPassagem(), gridBagConstraints14);
			jPanel_formulario.add(jLabel11, gridBagConstraints18);
			jPanel_formulario.add(getJTextField_qtdDeslocamento2(), gridBagConstraints21);
		}
		return jPanel_formulario;
	}

	/**
	 * This method initializes jTextField_qtdPassagem	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextField_qtdPassagem() {
		if (jTextField_qtdPassagem == null) {
			jTextField_qtdPassagem = new JTextField();
			jTextField_qtdPassagem.setHorizontalAlignment(JTextField.RIGHT);
			BackgroundFocusField.requestFocus(jTextField_qtdPassagem);
			jTextField_qtdPassagem.setDocument(new IntegerDocument(2));
			jTextField_qtdPassagem.setEditable(false);
			jTextField_qtdPassagem.setEnabled(false);
			keyPressed.vkEnter(jTextField_qtdPassagem);
			jTextField_qtdPassagem.setText("1");
			
			
			//selecionar todo texto ao receber focus
			jTextField_qtdPassagem.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusGained(java.awt.event.FocusEvent e) {
					jTextField_qtdPassagem.selectAll();
				}
			});
		}
		return jTextField_qtdPassagem;
	}

	/**
	 * This method initializes jPanel2	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			jPanel2.setLayout(null);
			jPanel2.setBackground(Color.white);
			jPanel2.add(getJPanel1(), null);
		}
		return jPanel2;
	}

	/**
	 * This method initializes jPanel_resultado_calc_porMes	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_resultado_calc_porMes() {
		if (jPanel_resultado_calc_porMes == null) {
			GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
			gridBagConstraints17.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints17.gridy = 2;
			gridBagConstraints17.weightx = 1.0;
			gridBagConstraints17.insets = new Insets(0, 106, 0, 5);
			gridBagConstraints17.gridx = 2;
			GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
			gridBagConstraints9.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints9.gridy = 1;
			gridBagConstraints9.weightx = 1.0;
			gridBagConstraints9.insets = new Insets(0, 106, 0, 5);
			gridBagConstraints9.gridx = 2;
			GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
			gridBagConstraints23.gridx = 0;
			gridBagConstraints23.weighty = 0.0;
			gridBagConstraints23.anchor = GridBagConstraints.NORTH;
			gridBagConstraints23.insets = new Insets(0, 5, 0, 0);
			gridBagConstraints23.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints23.weightx = 0.0;
			gridBagConstraints23.gridy = 2;
			jLabel14 = new JLabel();
			jLabel14.setText("Valor a Receber");
			GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
			gridBagConstraints20.gridx = 0;
			gridBagConstraints20.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints20.anchor = GridBagConstraints.NORTH;
			gridBagConstraints20.insets = new Insets(0, 5, 0, 0);
			gridBagConstraints20.weightx = 0.0;
			gridBagConstraints20.gridy = 1;
			jLabel12 = new JLabel();
			jLabel12.setText("Valor do Auxílio");
			GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
			gridBagConstraints19.gridx = 0;
			gridBagConstraints19.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints19.weightx = 1.0;
			gridBagConstraints19.anchor = GridBagConstraints.NORTHWEST;
			gridBagConstraints19.gridwidth = 3;
			gridBagConstraints19.insets = new Insets(5, 0, 8, 0);
			gridBagConstraints19.gridy = 0;
			jPanel_resultado_calc_porMes = new JPanel();
			jPanel_resultado_calc_porMes.setLayout(new GridBagLayout());
			jPanel_resultado_calc_porMes.setBorder(BorderFactory.createTitledBorder(null, " Resultado ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jPanel_resultado_calc_porMes.setBackground(Color.white);
			jPanel_resultado_calc_porMes.add(getJPanel4(), gridBagConstraints19);
			jPanel_resultado_calc_porMes.add(jLabel12, gridBagConstraints20);
			jPanel_resultado_calc_porMes.add(jLabel14, gridBagConstraints23);
			jPanel_resultado_calc_porMes.add(getJMoneyTextField_valorAuxilio(), gridBagConstraints9);
			jPanel_resultado_calc_porMes.add(getJMoneyTextField_valorReceber2(), gridBagConstraints17);
		}
		return jPanel_resultado_calc_porMes;
	}

	/**
	 * This method initializes jPanel4	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel4() {
		if (jPanel4 == null) {
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints8.gridy = 0;
			gridBagConstraints8.weightx = 1.0;
			gridBagConstraints8.insets = new Insets(0, 50, 0, 5);
			gridBagConstraints8.gridx = 1;
			GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
			gridBagConstraints16.gridx = 0;
			gridBagConstraints16.gridheight = 0;
			gridBagConstraints16.anchor = GridBagConstraints.NORTH;
			gridBagConstraints16.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints16.weighty = 1.0;
			gridBagConstraints16.insets = new Insets(0, 5, 0, 0);
			gridBagConstraints16.gridy = 2;
			jLabel10 = new JLabel();
			jLabel10.setText("(6% do Vencimento Básico)");
			jLabel10.setFont(new Font("Dialog", Font.PLAIN, 10));
			GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
			gridBagConstraints15.gridx = 0;
			gridBagConstraints15.weighty = 0.0;
			gridBagConstraints15.anchor = GridBagConstraints.WEST;
			gridBagConstraints15.insets = new Insets(0, 5, 0, 0);
			gridBagConstraints15.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints15.gridy = 0;
			jLabel9 = new JLabel();
			jLabel9.setText("Valor a ser Descontado");
			jPanel4 = new JPanel();
			jPanel4.setLayout(new GridBagLayout());
			jPanel4.setBackground(Color.white);
			jPanel4.add(jLabel9, gridBagConstraints15);
			jPanel4.add(jLabel10, gridBagConstraints16);
			jPanel4.add(getJMoneyTextField_valorDescontado(), gridBagConstraints8);
		}
		return jPanel4;
	}

	/**
	 * This method initializes jPanel5	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel5() {
		if (jPanel5 == null) {
			GridBagConstraints gridBagConstraints53 = new GridBagConstraints();
			gridBagConstraints53.gridx = 0;
			gridBagConstraints53.anchor = GridBagConstraints.WEST;
			gridBagConstraints53.gridwidth = 1;
			gridBagConstraints53.gridheight = 5;
			gridBagConstraints53.gridy = 0;
			GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
			gridBagConstraints31.gridx = 1;
			gridBagConstraints31.anchor = GridBagConstraints.EAST;
			gridBagConstraints31.weightx = 0.0;
			gridBagConstraints31.insets = new Insets(0, 0, 4, 4);
			gridBagConstraints31.gridy = 4;
			jLabel21 = new JLabel();
			jLabel21.setText("Ramal.: 13");
			jLabel21.setFont(new Font("Dialog", Font.PLAIN, 8));
			GridBagConstraints gridBagConstraints30 = new GridBagConstraints();
			gridBagConstraints30.gridx = 1;
			gridBagConstraints30.anchor = GridBagConstraints.EAST;
			gridBagConstraints30.weightx = 0.0;
			gridBagConstraints30.insets = new Insets(0, 0, 0, 4);
			gridBagConstraints30.gridy = 3;
			jLabel20 = new JLabel();
			jLabel20.setText("Núcleo de Apoio a Gestão de Pessoas");
			jLabel20.setFont(new Font("Dialog", Font.PLAIN, 8));
			GridBagConstraints gridBagConstraints27 = new GridBagConstraints();
			gridBagConstraints27.gridx = 1;
			gridBagConstraints27.anchor = GridBagConstraints.EAST;
			gridBagConstraints27.weightx = 0.0;
			gridBagConstraints27.insets = new Insets(4, 0, 0, 4);
			gridBagConstraints27.gridy = 1;
			jLabel17 = new JLabel();
			jLabel17.setText("NAGP");
			GridBagConstraints gridBagConstraints29 = new GridBagConstraints();
			gridBagConstraints29.gridx = 0;
			gridBagConstraints29.anchor = GridBagConstraints.EAST;
			gridBagConstraints29.insets = new Insets(4, 4, 0, 10);
			gridBagConstraints29.weightx = 1.0;
			gridBagConstraints29.gridy = 1;
			jLabel19 = new JLabel();
			jLabel19.setText("NGTI");
			GridBagConstraints gridBagConstraints28 = new GridBagConstraints();
			gridBagConstraints28.gridx = 0;
			gridBagConstraints28.anchor = GridBagConstraints.EAST;
			gridBagConstraints28.insets = new Insets(0, 4, 4, 10);
			gridBagConstraints28.weightx = 1.0;
			gridBagConstraints28.gridy = 4;
			jLabel18 = new JLabel();
			jLabel18.setText("Ramal.: 32");
			jLabel18.setFont(new Font("Dialog", Font.PLAIN, 8));
			GridBagConstraints gridBagConstraints26 = new GridBagConstraints();
			gridBagConstraints26.gridx = 0;
			gridBagConstraints26.anchor = GridBagConstraints.EAST;
			gridBagConstraints26.insets = new Insets(0, 4, 0, 10);
			gridBagConstraints26.weightx = 1.0;
			gridBagConstraints26.gridy = 3;
			jLabel16 = new JLabel();
			jLabel16.setText("Núcleo de Gestão em Tecnologia da Informação");
			jLabel16.setFont(new Font("Dialog", Font.PLAIN, 8));
			jPanel5 = new JPanel();
			jPanel5.setLayout(new GridBagLayout());
			jPanel5.setFont(new Font("Dialog", Font.PLAIN, 10));
			jPanel5.setBackground(new Color(204, 255, 204));
			jPanel5.add(jLabel16, gridBagConstraints26);
			jPanel5.add(jLabel18, gridBagConstraints28);
			jPanel5.add(jLabel19, gridBagConstraints29);
			jPanel5.add(jLabel17, gridBagConstraints27);
			jPanel5.add(jLabel20, gridBagConstraints30);
			jPanel5.add(jLabel21, gridBagConstraints31);
			jPanel5.add(getJPanel10(), gridBagConstraints53);
		}
		return jPanel5;
	}

	/**
	 * This method initializes jTabbedPane	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	public JTabbedPane getJTabbedPane() {
		if (jTabbedPane == null) {
			jTabbedPane = new JTabbedPane();			
			jTabbedPane.addTab("Cálculo mensal", null, getJPanel6(), null);
			jTabbedPane.addTab("Cálculo com base na quantidade de dias", null, getJPanel2(), null);
		}
		return jTabbedPane;
	}

	/**
	 * This method initializes jPanel6	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel6() {
		if (jPanel6 == null) {
			jPanel6 = new JPanel();
			jPanel6.setLayout(null);
			jPanel6.setBackground(Color.white);
			jPanel6.add(getJPanel11(), null);
		}
		return jPanel6;
	}

	/**
	 * This method initializes jPanel_formulario1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_formulario1() {
		if (jPanel_formulario1 == null) {
			GridBagConstraints gridBagConstraints42 = new GridBagConstraints();
			gridBagConstraints42.gridx = 0;
			gridBagConstraints42.gridwidth = 2;
			gridBagConstraints42.insets = new Insets(26, 0, 3, 5);
			gridBagConstraints42.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints42.weightx = 1.0;
			gridBagConstraints42.weighty = 1.0;
			gridBagConstraints42.anchor = GridBagConstraints.SOUTHEAST;
			gridBagConstraints42.gridy = 3;
			GridBagConstraints gridBagConstraints46 = new GridBagConstraints();
			gridBagConstraints46.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints46.gridy = 1;
			gridBagConstraints46.weightx = 1.0;
			gridBagConstraints46.insets = new Insets(0, 5, 0, 5);
			gridBagConstraints46.gridx = 1;
			GridBagConstraints gridBagConstraints45 = new GridBagConstraints();
			gridBagConstraints45.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints45.gridy = 0;
			gridBagConstraints45.weightx = 1.0;
			gridBagConstraints45.insets = new Insets(0, 5, 0, 5);
			gridBagConstraints45.gridx = 1;
			jLabel25 = new JLabel();
			jLabel25.setText("Valor Lançado no Sistema");
			/*jLabel25.setBackground(new Color(51, 51, 51));
			jLabel25.setForeground(new Color(51, 51, 51));*/
			jLabel24 = new JLabel();
			jLabel24.setText("Valor Mensal/22");
			jLabel23 = new JLabel();
			jLabel23.setText("Valor Mensal:");
			jLabel22 = new JLabel();
			jLabel22.setText("Quant. Deslocamento X Valor Diário");
			GridBagConstraints gridBagConstraints141 = new GridBagConstraints();
			gridBagConstraints141.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints141.gridwidth = 1;
			gridBagConstraints141.gridx = 1;
			gridBagConstraints141.gridy = 2;
			gridBagConstraints141.weightx = 0.0;
			gridBagConstraints141.insets = new Insets(0, 5, 0, 5);
			GridBagConstraints gridBagConstraints121 = new GridBagConstraints();
			gridBagConstraints121.insets = new Insets(0, 5, 0, 0);
			gridBagConstraints121.gridy = 2;
			gridBagConstraints121.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints121.gridx = 0;
			jLabel81 = new JLabel();
			jLabel81.setText("Quantidade de Deslocamento por Mês:");
			jLabel81.setHorizontalAlignment(SwingConstants.LEADING);
			GridBagConstraints gridBagConstraints111 = new GridBagConstraints();
			gridBagConstraints111.insets = new Insets(0, 5, 0, 0);
			gridBagConstraints111.gridy = 1;
			gridBagConstraints111.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints111.gridx = 0;
			jLabel71 = new JLabel();
			jLabel71.setText("Valor diário por deslocamento:");
			jLabel71.setHorizontalAlignment(SwingConstants.LEADING);
			GridBagConstraints gridBagConstraints71 = new GridBagConstraints();
			gridBagConstraints71.gridx = 0;
			gridBagConstraints71.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints71.insets = new Insets(5, 5, 0, 0);
			gridBagConstraints71.gridy = 0;
			jLabel51 = new JLabel();
			jLabel51.setText("Vencimento Básico:");
			jLabel51.setHorizontalAlignment(SwingConstants.LEADING);
			jPanel_formulario1 = new JPanel();
			jPanel_formulario1.setLayout(new GridBagLayout());
			jPanel_formulario1.setBorder(BorderFactory.createTitledBorder(null, " Parâmetros ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jPanel_formulario1.setBackground(Color.white);
			jPanel_formulario1.add(jLabel51, gridBagConstraints71);
			jPanel_formulario1.add(jLabel71, gridBagConstraints111);
			jPanel_formulario1.add(jLabel81, gridBagConstraints121);
			jPanel_formulario1.add(getJTextField_qtdDeslocamento(), gridBagConstraints141);
			jPanel_formulario1.add(getJMoneyTextField_vencimentoBasico(), gridBagConstraints45);
			jPanel_formulario1.add(getJMoneyTextField_valorDiario(), gridBagConstraints46);
			jPanel_formulario1.add(getJPanel811(), gridBagConstraints42);
		}
		return jPanel_formulario1;
	}

	/**
	 * This method initializes jTextField_qtdDeslocamento	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextField_qtdDeslocamento() {
		if (jTextField_qtdDeslocamento == null) {
			jTextField_qtdDeslocamento = new JTextField();
			jTextField_qtdDeslocamento.setHorizontalAlignment(JTextField.RIGHT);
			jTextField_qtdDeslocamento.setEditable(false);
			jTextField_qtdDeslocamento.setEnabled(false);
			BackgroundFocusField.requestFocus(jTextField_qtdDeslocamento);
			jTextField_qtdDeslocamento.setDocument(new IntegerDocument(2));
			keyPressed.vkEnter(jTextField_qtdDeslocamento);
			jTextField_qtdDeslocamento.setText("22");
			
			
			//selecionar todo texto ao receber focus
			jTextField_qtdDeslocamento.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusGained(java.awt.event.FocusEvent e) {
					jTextField_qtdDeslocamento.selectAll();
				}
			});
			
		}
		return jTextField_qtdDeslocamento;
	}

	/**
	 * This method initializes jPanel_resultado_calc_porDia	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_resultado_calc_porDia() {
		if (jPanel_resultado_calc_porDia == null) {
			GridBagConstraints gridBagConstraints39 = new GridBagConstraints();
			gridBagConstraints39.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints39.gridy = 3;
			gridBagConstraints39.ipadx = 0;
			gridBagConstraints39.weightx = 1.0;
			gridBagConstraints39.insets = new Insets(0, 5, 0, 5);
			gridBagConstraints39.gridx = 1;
			GridBagConstraints gridBagConstraints35 = new GridBagConstraints();
			gridBagConstraints35.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints35.gridx = 0;
			gridBagConstraints35.gridy = 3;
			gridBagConstraints35.ipadx = 55;
			gridBagConstraints35.weightx = 0.0;
			gridBagConstraints35.insets = new Insets(2, 5, 2, 4);
			GridBagConstraints gridBagConstraints38 = new GridBagConstraints();
			gridBagConstraints38.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints38.gridy = 2;
			gridBagConstraints38.weightx = 1.0;
			gridBagConstraints38.insets = new Insets(0, 5, 0, 5);
			gridBagConstraints38.gridx = 1;
			GridBagConstraints gridBagConstraints37 = new GridBagConstraints();
			gridBagConstraints37.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints37.gridy = 1;
			gridBagConstraints37.weightx = 1.0;
			gridBagConstraints37.insets = new Insets(0, 5, 0, 5);
			gridBagConstraints37.gridx = 1;
			GridBagConstraints gridBagConstraints36 = new GridBagConstraints();
			gridBagConstraints36.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints36.gridy = 0;
			gridBagConstraints36.weightx = 1.0;
			gridBagConstraints36.insets = new Insets(0, 5, 0, 5);
			gridBagConstraints36.gridx = 1;
			GridBagConstraints gridBagConstraints34 = new GridBagConstraints();
			gridBagConstraints34.gridx = 0;
			gridBagConstraints34.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints34.insets = new Insets(0, 5, 0, 10);
			gridBagConstraints34.gridy = 2;
			GridBagConstraints gridBagConstraints33 = new GridBagConstraints();
			gridBagConstraints33.gridx = 0;
			gridBagConstraints33.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints33.insets = new Insets(0, 5, 0, 10);
			gridBagConstraints33.gridy = 1;
			GridBagConstraints gridBagConstraints32 = new GridBagConstraints();
			gridBagConstraints32.insets = new Insets(5, 5, 0, 10);
			gridBagConstraints32.gridy = 0;
			gridBagConstraints32.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints32.gridx = 0;
			jPanel_resultado_calc_porDia = new JPanel();
			jPanel_resultado_calc_porDia.setLayout(new GridBagLayout());
			jPanel_resultado_calc_porDia.setBackground(Color.white);
			jPanel_resultado_calc_porDia.setBorder(BorderFactory.createTitledBorder(null, " Resultado ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			jPanel_resultado_calc_porDia.add(jLabel22, gridBagConstraints32);
			jPanel_resultado_calc_porDia.add(jLabel23, gridBagConstraints33);
			jPanel_resultado_calc_porDia.add(jLabel24, gridBagConstraints34);
			jPanel_resultado_calc_porDia.add(getJMoneyTextField_valorReceber(), gridBagConstraints36);
			jPanel_resultado_calc_porDia.add(getJMoneyTextField_valorMensal(), gridBagConstraints37);
			jPanel_resultado_calc_porDia.add(getJMoneyTextField_valorMensal_22(), gridBagConstraints38);
			jPanel_resultado_calc_porDia.add(jLabel25, gridBagConstraints35);
			jPanel_resultado_calc_porDia.add(getJMoneyTextField_valorSistema(), gridBagConstraints39);
		}
		return jPanel_resultado_calc_porDia;
	}

	/**
	 * This method initializes jPanel81	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel81() {
		if (jPanel81 == null) {
			GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
			gridBagConstraints22.gridx = 1;
			gridBagConstraints22.insets = new Insets(0, 5, 0, 0);
			gridBagConstraints22.gridy = 0;
			GridBagConstraints gridBagConstraints401 = new GridBagConstraints();
			gridBagConstraints401.anchor = GridBagConstraints.EAST;
			gridBagConstraints401.gridx = 0;
			gridBagConstraints401.gridy = 0;
			gridBagConstraints401.weightx = 1.0;
			gridBagConstraints401.fill = GridBagConstraints.NONE;
			gridBagConstraints401.ipadx = 0;
			gridBagConstraints401.ipady = 0;
			gridBagConstraints401.insets = new Insets(0, 0, 0, 0);
			gridBagConstraints401.weighty = 0.0;
			gridBagConstraints401.gridwidth = 1;
			GridBagConstraints gridBagConstraints411 = new GridBagConstraints();
			gridBagConstraints411.anchor = GridBagConstraints.EAST;
			gridBagConstraints411.gridx = 2;
			gridBagConstraints411.gridy = 0;
			gridBagConstraints411.weightx = 0.0;
			gridBagConstraints411.weighty = 1.0;
			gridBagConstraints411.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints411.ipadx = 0;
			gridBagConstraints411.ipady = 0;
			gridBagConstraints411.insets = new Insets(0, 5, 0, 0);
			jPanel81 = new JPanel();
			jPanel81.setLayout(new GridBagLayout());
			jPanel81.setBackground(Color.white);
			jPanel81.add(getJButton_limpar(), gridBagConstraints411);
			jPanel81.add(getJButton_calcular(), gridBagConstraints401);
			jPanel81.add(getJButton_imprimir(), gridBagConstraints22);
		}
		return jPanel81;
	}

	/**
	 * This method initializes jButton_limpar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButton_limpar() {
		if (jButton_limpar == null) {
			jButton_limpar = new JButton();
			jButton_limpar.setText("Limpar");
			jButton_limpar.setIcon(new ImageIcon(getClass().getResource("/br/edu/ifbaiano/calculadora/img/edit-clear.png")));
			jButton_limpar.setToolTipText("Limpar campos [F4]");
		}
		return jButton_limpar;
	}

	/**
	 * This method initializes jButton_calcular	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButton_calcular() {
		if (jButton_calcular == null) {
			jButton_calcular = new JButton();
			jButton_calcular.setText("Calcular");
			jButton_calcular.setIcon(new ImageIcon(getClass().getResource("/br/edu/ifbaiano/calculadora/img/ok 16x16.png")));
			jButton_calcular.setToolTipText("");
		}
		return jButton_calcular;
	}

	/**
	 * This method initializes jMoneyTextField_vencimentoBasico	
	 * 	
	 * @return com.g5.JMoneyTextField	
	 */
	public JMoneyTextField getJMoneyTextField_vencimentoBasico() {
		if (jMoneyTextField_vencimentoBasico == null) {
			jMoneyTextField_vencimentoBasico = new JMoneyTextField();
			jMoneyTextField_vencimentoBasico.setText("R$ 0,00");
			BackgroundFocusField.requestFocus(jMoneyTextField_vencimentoBasico);
			keyPressed.vkEnter(jMoneyTextField_vencimentoBasico);
		}
		return jMoneyTextField_vencimentoBasico;
	}

	/**
	 * This method initializes jMoneyTextField_valorDiario	
	 * 	
	 * @return com.g5.JMoneyTextField	
	 */
	public JMoneyTextField getJMoneyTextField_valorDiario() {
		if (jMoneyTextField_valorDiario == null) {
			jMoneyTextField_valorDiario = new JMoneyTextField();
			jMoneyTextField_valorDiario.setText("R$ 0,00");
			BackgroundFocusField.requestFocus(jMoneyTextField_valorDiario);
			keyPressed.vkEnter(jMoneyTextField_valorDiario);
		}
		return jMoneyTextField_valorDiario;
	}

	/**
	 * This method initializes jMoneyTextField_valorReceber	
	 * 	
	 * @return com.g5.JMoneyTextField	
	 */
	public JMoneyTextField getJMoneyTextField_valorReceber() {
		if (jMoneyTextField_valorReceber == null) {
			jMoneyTextField_valorReceber = new JMoneyTextField();
			jMoneyTextField_valorReceber.setText("R$ 0,00");
			jMoneyTextField_valorReceber.setEnabled(false);
			jMoneyTextField_valorReceber.setEditable(true);
		}
		return jMoneyTextField_valorReceber;
	}

	/**
	 * This method initializes jMoneyTextField_valorMensal	
	 * 	
	 * @return com.g5.JMoneyTextField	
	 */
	public JMoneyTextField getJMoneyTextField_valorMensal() {
		if (jMoneyTextField_valorMensal == null) {
			jMoneyTextField_valorMensal = new JMoneyTextField();
			jMoneyTextField_valorMensal.setText("R$ 0,00");
			jMoneyTextField_valorMensal.setEnabled(false);
			jMoneyTextField_valorMensal.setEditable(true);
		}
		return jMoneyTextField_valorMensal;
	}

	/**
	 * This method initializes jMoneyTextField_valorMensal_22	
	 * 	
	 * @return com.g5.JMoneyTextField	
	 */
	public JMoneyTextField getJMoneyTextField_valorMensal_22() {
		if (jMoneyTextField_valorMensal_22 == null) {
			jMoneyTextField_valorMensal_22 = new JMoneyTextField();
			jMoneyTextField_valorMensal_22.setText("R$ 0,00");
			jMoneyTextField_valorMensal_22.setEnabled(false);
			jMoneyTextField_valorMensal_22.setEditable(true);
		}
		return jMoneyTextField_valorMensal_22;
	}

	/**
	 * This method initializes jMoneyTextField_valorSistema	
	 * 	
	 * @return com.g5.JMoneyTextField	
	 */
	public JMoneyTextField getJMoneyTextField_valorSistema() {
		if (jMoneyTextField_valorSistema == null) {
			jMoneyTextField_valorSistema = new JMoneyTextField();
			jMoneyTextField_valorSistema.setText("R$ 0,00");
			jMoneyTextField_valorSistema.setEnabled(false);
			jMoneyTextField_valorSistema.setEditable(true);
		}
		return jMoneyTextField_valorSistema;
	}

	/**
	 * This method initializes jPanel_toolBars	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_toolBars() {
		if (jPanel_toolBars == null) {
			GridBagConstraints gridBagConstraints48 = new GridBagConstraints();
			gridBagConstraints48.gridx = 0;
			gridBagConstraints48.weightx = 1.0;
			gridBagConstraints48.anchor = GridBagConstraints.EAST;
			gridBagConstraints48.insets = new Insets(2, 0, 5, 5);
			gridBagConstraints48.gridy = 0;
			GridBagConstraints gridBagConstraints47 = new GridBagConstraints();
			gridBagConstraints47.gridx = 1;
			gridBagConstraints47.insets = new Insets(5, 0, 5, 5);
			gridBagConstraints47.weightx = 1.0;
			gridBagConstraints47.anchor = GridBagConstraints.EAST;
			gridBagConstraints47.gridy = 0;
			jPanel_toolBars = new JPanel();
			jPanel_toolBars.setLayout(new GridBagLayout());
			jPanel_toolBars.setBackground(Color.white);
			jPanel_toolBars.add(getJButton_fechar(), gridBagConstraints47);
			jPanel_toolBars.add(getJButton_ajuda(), gridBagConstraints48);
		}
		return jPanel_toolBars;
	}

	/**
	 * This method initializes jButton_fechar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButton_fechar() {
		if (jButton_fechar == null) {
			jButton_fechar = new JButton();
			jButton_fechar.setText("Sair");
			jButton_fechar.setMnemonic(KeyEvent.VK_UNDEFINED);
			jButton_fechar.setIcon(new ImageIcon(getClass().getResource("/br/edu/ifbaiano/calculadora/img/nav-remove.png")));
			jButton_fechar.setToolTipText("Fechar [Esc]");
			jButton_fechar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					dispose();
				}
			});
		}
		return jButton_fechar;
	}

	/**
	 * This method initializes jButton_ajuda	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton_ajuda() {
		if (jButton_ajuda == null) {
			jButton_ajuda = new JButton();
			jButton_ajuda.setText("Ajuda");
			jButton_ajuda.setVisible(false);
		}
		return jButton_ajuda;
	}

	/**
	 * This method initializes jPanel10	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel10() {
		if (jPanel10 == null) {
			GridBagConstraints gridBagConstraints52 = new GridBagConstraints();
			gridBagConstraints52.gridx = 0;
			gridBagConstraints52.anchor = GridBagConstraints.WEST;
			gridBagConstraints52.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints52.insets = new Insets(0, 4, 4, 0);
			gridBagConstraints52.gridy = 2;
			jLabel30 = new JLabel();
			jLabel30.setText("Tel.: (73) 3536-1210");
			jLabel30.setFont(new Font("Dialog", Font.PLAIN, 10));
			GridBagConstraints gridBagConstraints51 = new GridBagConstraints();
			gridBagConstraints51.gridx = 0;
			gridBagConstraints51.anchor = GridBagConstraints.WEST;
			gridBagConstraints51.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints51.insets = new Insets(0, 4, 0, 0);
			gridBagConstraints51.gridy = 1;
			jLabel29 = new JLabel();
			jLabel29.setText("BR 420 (Rodovia Santa Inês – Ubaíra), Zona Rural, Bahia");
			jLabel29.setFont(new Font("Dialog", Font.PLAIN, 10));
			GridBagConstraints gridBagConstraints50 = new GridBagConstraints();
			gridBagConstraints50.gridx = 0;
			gridBagConstraints50.anchor = GridBagConstraints.WEST;
			gridBagConstraints50.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints50.insets = new Insets(4, 4, 0, 0);
			gridBagConstraints50.gridy = 0;
			jLabel28 = new JLabel();
			jLabel28.setText("IF Baiano – Campus Santa Inês");
			jLabel28.setFont(new Font("Dialog", Font.PLAIN, 10));
			jPanel10 = new JPanel();
			jPanel10.setLayout(new GridBagLayout());
			jPanel10.setBackground(new Color(204, 255, 204));
			jPanel10.add(jLabel28, gridBagConstraints50);
			jPanel10.add(jLabel29, gridBagConstraints51);
			jPanel10.add(jLabel30, gridBagConstraints52);
		}
		return jPanel10;
	}

	/**
	 * This method initializes jMoneyTextField_vencimentoBasico2	
	 * 	
	 * @return com.g5.JMoneyTextField	
	 */
	public JMoneyTextField getJMoneyTextField_vencimentoBasico2() {
		if (jMoneyTextField_vencimentoBasico2 == null) {
			jMoneyTextField_vencimentoBasico2 = new JMoneyTextField();
			BackgroundFocusField.requestFocus(jMoneyTextField_vencimentoBasico2);
			keyPressed.vkEnter(jMoneyTextField_vencimentoBasico2);
			jMoneyTextField_vencimentoBasico2.setText("R$ 0,00");
		}
		return jMoneyTextField_vencimentoBasico2;
	}

	/**
	 * This method initializes jMoneyTextField_valorPassagem	
	 * 	
	 * @return com.g5.JMoneyTextField	
	 */
	public JMoneyTextField getJMoneyTextField_valorPassagem() {
		if (jMoneyTextField_valorPassagem == null) {
			jMoneyTextField_valorPassagem = new JMoneyTextField();
			jMoneyTextField_valorPassagem.setText("R$ 0,00");
			BackgroundFocusField.requestFocus(jMoneyTextField_valorPassagem);
			keyPressed.vkEnter(jMoneyTextField_valorPassagem);
		}
		return jMoneyTextField_valorPassagem;
	}

	/**
	 * This method initializes jMoneyTextField_valorDescontado	
	 * 	
	 * @return com.g5.JMoneyTextField	
	 */
	public JMoneyTextField getJMoneyTextField_valorDescontado() {
		if (jMoneyTextField_valorDescontado == null) {
			jMoneyTextField_valorDescontado = new JMoneyTextField();
			jMoneyTextField_valorDescontado.setEnabled(false);
			jMoneyTextField_valorDescontado.setText("R$ 0,00");
		}
		return jMoneyTextField_valorDescontado;
	}

	/**
	 * This method initializes jMoneyTextField_valorAuxilio	
	 * 	
	 * @return com.g5.JMoneyTextField	
	 */
	public JMoneyTextField getJMoneyTextField_valorAuxilio() {
		if (jMoneyTextField_valorAuxilio == null) {
			jMoneyTextField_valorAuxilio = new JMoneyTextField();
			jMoneyTextField_valorAuxilio.setEnabled(false);
			jMoneyTextField_valorAuxilio.setText("R$ 0,00");
		}
		return jMoneyTextField_valorAuxilio;
	}

	/**
	 * This method initializes jMoneyTextField_valorReceber2	
	 * 	
	 * @return com.g5.JMoneyTextField	
	 */
	public JMoneyTextField getJMoneyTextField_valorReceber2() {
		if (jMoneyTextField_valorReceber2 == null) {
			jMoneyTextField_valorReceber2 = new JMoneyTextField();
			jMoneyTextField_valorReceber2.setEnabled(false);
			jMoneyTextField_valorReceber2.setText("R$ 0,00");
		}
		return jMoneyTextField_valorReceber2;
	}

	/**
	 * This method initializes jTextField_qtdDeslocamento2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJTextField_qtdDeslocamento2() {
		if (jTextField_qtdDeslocamento2 == null) {
			jTextField_qtdDeslocamento2 = new JTextField();
			jTextField_qtdDeslocamento2.setHorizontalAlignment(JTextField.RIGHT);
			BackgroundFocusField.requestFocus(jTextField_qtdDeslocamento2);
			jTextField_qtdDeslocamento2.setDocument(new IntegerDocument(2));
			keyPressed.vkEnter(jTextField_qtdDeslocamento2);
			jTextField_qtdDeslocamento2.setText("22");
			
			//selecionar todo texto ao receber focus
			jTextField_qtdDeslocamento2.addFocusListener(new java.awt.event.FocusAdapter() {   
				public void focusLost(java.awt.event.FocusEvent e) {
					
					try {
						int qtd = Integer.parseInt(jTextField_qtdDeslocamento2.getText());
						
						if (qtd <= 0){
							jTextField_qtdDeslocamento2.setText("22");
						}
					} catch (NumberFormatException e1) {
						jTextField_qtdDeslocamento2.setText("22");
					}
				}
				public void focusGained(java.awt.event.FocusEvent e) {
					jTextField_qtdDeslocamento2.selectAll();
				}
			});
		}
		return jTextField_qtdDeslocamento2;
	}

	/**
	 * This method initializes jButton_imprimir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButton_imprimir() {
		if (jButton_imprimir == null) {
			jButton_imprimir = new JButton();
			jButton_imprimir.setIcon(new ImageIcon(getClass().getResource("/br/edu/ifbaiano/calculadora/img/nav_imprimir.png")));
			jButton_imprimir.setText("Imprimir");
		}
		return jButton_imprimir;
	}

	/**
	 * This method initializes jLabel_imgMEC	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	private JLabel getJLabel_imgMEC() {
		if (jLabel_imgMEC == null) {
			jLabel_imgMEC = new JLabel();
			jLabel_imgMEC.setText("");
			jLabel_imgMEC.setIcon(new ImageIcon(getClass().getResource("/br/edu/ifbaiano/calculadora/img/ministerio_da_educacao_90x30.jpg")));
			
			/**
			 * só executa apartir da versão 1.3 do java
			 */
			/*File logo;
			try {
				logo = new File(getClass().getResource("/br/edu/ifbaiano/calculadora/img/1268245122.jpg").toURI());
				BufferedImage imgMEC = ImageIO.read(logo); 
				
				Image imagemMenor = imgMEC.getScaledInstance(90, 30, Image.SCALE_SMOOTH);
				jLabel_imgMEC.setIcon(new ImageIcon(imagemMenor));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		return jLabel_imgMEC;
	}

	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			GridBagConstraints gridBagConstraints25 = new GridBagConstraints();
			gridBagConstraints25.gridx = 0;
			gridBagConstraints25.insets = new Insets(0, 10, 10, 10);
			gridBagConstraints25.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints25.weightx = 1.0;
			gridBagConstraints25.gridy = 1;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.anchor = GridBagConstraints.NORTHWEST;
			gridBagConstraints1.insets = new Insets(10, 10, 10, 10);
			gridBagConstraints1.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints1.gridy = 0;
			jPanel1 = new JPanel();
			jPanel1.setLayout(new GridBagLayout());
			jPanel1.setBounds(new Rectangle(11, 11, 350, 285));
			jPanel1.add(getJPanel_formulario(), gridBagConstraints1);
			jPanel1.add(getJPanel_resultado_calc_porDia(), gridBagConstraints25);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jPanel11	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel11() {
		if (jPanel11 == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 0;
			gridBagConstraints2.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints2.insets = new Insets(0, 10, 10, 10);
			gridBagConstraints2.weightx = 1.0;
			gridBagConstraints2.gridy = 1;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 0;
			gridBagConstraints3.anchor = GridBagConstraints.NORTHWEST;
			gridBagConstraints3.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints3.insets = new Insets(10, 10, 10, 10);
			gridBagConstraints3.gridy = 0;
			jPanel11 = new JPanel();
			jPanel11.setLayout(new GridBagLayout());
			jPanel11.setBounds(new Rectangle(11, 11, 350, 285));
			jPanel11.add(getJPanel_formulario1(), gridBagConstraints3);
			jPanel11.add(getJPanel_resultado_calc_porMes(), gridBagConstraints2);
		}
		return jPanel11;
	}

	/**
	 * This method initializes jPanel811	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel811() {
		if (jPanel811 == null) {
			GridBagConstraints gridBagConstraints221 = new GridBagConstraints();
			gridBagConstraints221.insets = new Insets(0, 5, 0, 0);
			gridBagConstraints221.gridy = 0;
			gridBagConstraints221.gridx = 1;
			GridBagConstraints gridBagConstraints4011 = new GridBagConstraints();
			gridBagConstraints4011.anchor = GridBagConstraints.EAST;
			gridBagConstraints4011.insets = new Insets(0, 0, 0, 0);
			gridBagConstraints4011.gridwidth = 1;
			gridBagConstraints4011.gridx = 0;
			gridBagConstraints4011.gridy = 0;
			gridBagConstraints4011.ipadx = 0;
			gridBagConstraints4011.ipady = 0;
			gridBagConstraints4011.weightx = 1.0;
			gridBagConstraints4011.weighty = 0.0;
			gridBagConstraints4011.fill = GridBagConstraints.NONE;
			GridBagConstraints gridBagConstraints4111 = new GridBagConstraints();
			gridBagConstraints4111.anchor = GridBagConstraints.EAST;
			gridBagConstraints4111.insets = new Insets(0, 5, 0, 0);
			gridBagConstraints4111.gridx = 2;
			gridBagConstraints4111.gridy = 0;
			gridBagConstraints4111.ipadx = 0;
			gridBagConstraints4111.ipady = 0;
			gridBagConstraints4111.weightx = 0.0;
			gridBagConstraints4111.weighty = 1.0;
			gridBagConstraints4111.fill = GridBagConstraints.VERTICAL;
			jPanel811 = new JPanel();
			jPanel811.setLayout(new GridBagLayout());
			jPanel811.setBackground(Color.white);
			jPanel811.add(getJButton_limpar2(), gridBagConstraints4111);
			jPanel811.add(getJButton_calcular1(), gridBagConstraints4011);
			jPanel811.add(getJButton_imprimir1(), gridBagConstraints221);
		}
		return jPanel811;
	}

	/**
	 * This method initializes jButton_limpar2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButton_limpar2() {
		if (jButton_limpar2 == null) {
			jButton_limpar2 = new JButton();
			jButton_limpar2.setToolTipText("Limpar campos [F4]");
			jButton_limpar2.setText("Limpar");
			jButton_limpar2.setIcon(new ImageIcon(getClass().getResource("/br/edu/ifbaiano/calculadora/img/edit-clear.png")));
		}
		return jButton_limpar2;
	}

	/**
	 * This method initializes jButton_calcular1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButton_calcular1() {
		if (jButton_calcular1 == null) {
			jButton_calcular1 = new JButton();
			jButton_calcular1.setToolTipText("");
			jButton_calcular1.setText("Calcular");
			jButton_calcular1.setIcon(new ImageIcon(getClass().getResource("/br/edu/ifbaiano/calculadora/img/ok 16x16.png")));
		}
		return jButton_calcular1;
	}

	/**
	 * This method initializes jButton_imprimir1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButton_imprimir1() {
		if (jButton_imprimir1 == null) {
			jButton_imprimir1 = new JButton();
			jButton_imprimir1.setIcon(new ImageIcon(getClass().getResource("/br/edu/ifbaiano/calculadora/img/nav_imprimir.png")));
			jButton_imprimir1.setText("Imprimir");
		}
		return jButton_imprimir1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				aplicacao thisClass = new aplicacao();
				thisClass.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public aplicacao() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(650, 555);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/edu/ifbaiano/calculadora/img/LogoIF.jpg")));
		this.setContentPane(getJContentPane());
		this.setTitle("Calculadora");
		this.setLocationRelativeTo(null);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			e.setStackTrace(null);
		}
		
		defaultBotton();
		
	}

	private void defaultBotton() {
		/**
		 *  botao padrao da tela  
		 */
		/*this.getRootPane().setDefaultButton(getJButton());
		UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE);*/
		
		/**
		 *  evento da tecla Esc 
		 *  fecha a janela  
		 */
		getJButton_fechar().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ESCAPE"), "actionName");
		getJButton_fechar().getActionMap().put("actionName",new AbstractAction("actionName") 
			{
				public void actionPerformed(ActionEvent evt) {
					dispose();
				}
			}
		);
	}

	
	
	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJPanel_topo(), BorderLayout.NORTH);
			jContentPane.add(getJPanel_rodape(), BorderLayout.SOUTH);
			jContentPane.add(getJPanel_conteudo(), BorderLayout.CENTER);
		}
		return jContentPane;
	}	

}  //  @jve:decl-index=0:visual-constraint="10,10"
