/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package streamer;

import conf.PropReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.stringtemplate.v4.ST;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author juan
 */
public class MainWindow extends javax.swing.JFrame {

	/**
	 * Creates new form MainWindow
	 */
	public MainWindow() {
		initComponents();
		loadConfiguration();

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		frmVlc = new javax.swing.JFrame();
		puertodestino = new javax.swing.JTabbedPane();
		pnlStreamingSettings = new javax.swing.JPanel();
		txtIPDestino = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		txtIPDestino1 = new javax.swing.JTextField();
		pnlAudioSettings = new javax.swing.JPanel();
		lblAudioEncoder = new javax.swing.JLabel();
		lblAudioCodec = new javax.swing.JLabel();
		lblAudioEncoderParameters = new javax.swing.JLabel();
		pnlAudioEncoderParamters = new javax.swing.JScrollPane();
		tblAudioEncoderParameters = new javax.swing.JTable();
		txtAudioCodec = new javax.swing.JTextField();
		cmbAudioEncoder = new javax.swing.JComboBox();
		txtAudioBitrate = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		btnStream = new javax.swing.JButton();
		frmVlc.setAlwaysOnTop(true);

		pnlVideoSettings = new javax.swing.JPanel();
		lblVideoEncoder = new javax.swing.JLabel();
		lblVideoCodec = new javax.swing.JLabel();
		cmbVideoEncoder = new javax.swing.JComboBox<String>();
		cmbVideoCodec = new JComboBox<String>();
		pnlVideoEncoderParameters = new javax.swing.JScrollPane();
		tblVideoEncoderParameters = new javax.swing.JTable();
		lblVideoEncoderParameters = new javax.swing.JLabel();
		txtVideoBitrate = new javax.swing.JTextField();

		javax.swing.GroupLayout frmVlcLayout = new javax.swing.GroupLayout(frmVlc.getContentPane());
		frmVlc.getContentPane().setLayout(frmVlcLayout);
		frmVlcLayout.setHorizontalGroup(
				frmVlcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 413, Short.MAX_VALUE)
				);
		frmVlcLayout.setVerticalGroup(
				frmVlcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 251, Short.MAX_VALUE)
				);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		txtIPDestino.setText("127.0.0.1");
		txtIPDestino.setName(""); // NOI18N

		jLabel1.setText("IP destino");

		jLabel3.setText("puerto");

		txtIPDestino1.setText("5004");
		txtIPDestino1.setName("puertodestino"); // NOI18N
		pnlEstado = new javax.swing.JPanel();
		
		lblEstado = new JLabel("Estado");
		lblEstadoActual = new JLabel("");
		
		JButton btnPreview = new JButton("Preview");
		btnPreview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String comando = PropReader.getReader().getKey("preview_template");
				Runtime rt = Runtime.getRuntime();
				try {
					Process prVlc = rt.exec(comando);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		javax.swing.GroupLayout pnlEstadoLayout = new javax.swing.GroupLayout(pnlEstado);
		pnlEstadoLayout.setHorizontalGroup(
			pnlEstadoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnlEstadoLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEstado, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblEstadoActual, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addComponent(btnStream)
					.addGap(29)
					.addComponent(btnPreview)
					.addContainerGap(1405, Short.MAX_VALUE))
		);
		pnlEstadoLayout.setVerticalGroup(
			pnlEstadoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnlEstadoLayout.createSequentialGroup()
					.addGap(43)
					.addGroup(pnlEstadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEstado, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEstadoActual, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGroup(pnlEstadoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnStream)
						.addComponent(btnPreview))
					.addContainerGap(188, Short.MAX_VALUE))
		);
		pnlEstado.setLayout(pnlEstadoLayout);
		puertodestino.addTab("Estado", null, pnlEstado, null);
		javax.swing.GroupLayout pnlStreamingSettingsLayout = new javax.swing.GroupLayout(pnlStreamingSettings);
		pnlStreamingSettings.setLayout(pnlStreamingSettingsLayout);
		pnlStreamingSettingsLayout.setHorizontalGroup(
				pnlStreamingSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlStreamingSettingsLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel1)
						.addGap(18, 18, 18)
						.addComponent(txtIPDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txtIPDestino1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(250, Short.MAX_VALUE))
				);
		pnlStreamingSettingsLayout.setVerticalGroup(
				pnlStreamingSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlStreamingSettingsLayout.createSequentialGroup()
						.addGap(46, 46, 46)
						.addGroup(pnlStreamingSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtIPDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1)
								.addComponent(jLabel3)
								.addComponent(txtIPDestino1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(212, Short.MAX_VALUE))
				);

		puertodestino.addTab("Destino", pnlStreamingSettings);

		lblAudioEncoder.setText("Encoder");
		lblAudioCodec.setText("Codec");
		lblAudioEncoderParameters.setText("Parametros Encoder");
		tblAudioEncoderParameters.setModel(new javax.swing.table.DefaultTableModel(
				new Object [][] {

				},
				new String [] {
						"Parametro", "Valor"
				}
				) {
			Class[] types = new Class [] {
					java.lang.String.class, java.lang.String.class
			};
			boolean[] canEdit = new boolean [] {
					false, true
			};

			public Class getColumnClass(int columnIndex) {
				return types [columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit [columnIndex];
			}
		});
		pnlAudioEncoderParamters.setViewportView(tblAudioEncoderParameters);
		txtAudioCodec.setText("mp4a");
		txtAudioCodec.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtAudioCodecActionPerformed(evt);
			}
		});

		txtAudioBitrate.setText("64");
		txtAudioBitrate.setName("txtAudioBitrate"); // NOI18N
		txtAudioBitrate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtAudioBitrateActionPerformed(evt);
			}
		});

		jLabel4.setText("bits/s");

		javax.swing.GroupLayout pnlAudioSettingsLayout = new javax.swing.GroupLayout(pnlAudioSettings);
		pnlAudioSettings.setLayout(pnlAudioSettingsLayout);
		pnlAudioSettingsLayout.setHorizontalGroup(
				pnlAudioSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlAudioSettingsLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(pnlAudioSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(pnlAudioEncoderParamters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(pnlAudioSettingsLayout.createSequentialGroup()
										.addGroup(pnlAudioSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(lblAudioCodec, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lblAudioEncoder, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(pnlAudioSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
														.addComponent(txtAudioCodec)
														.addComponent(cmbAudioEncoder, 0, 161, Short.MAX_VALUE))
														.addGap(53, 53, 53)
														.addComponent(jLabel4)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(txtAudioBitrate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(lblAudioEncoderParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addContainerGap(121, Short.MAX_VALUE))
				);
		pnlAudioSettingsLayout.setVerticalGroup(
				pnlAudioSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlAudioSettingsLayout.createSequentialGroup()
						.addGap(35, 35, 35)
						.addGroup(pnlAudioSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblAudioEncoder)
								.addComponent(cmbAudioEncoder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtAudioBitrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel4))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(pnlAudioSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblAudioCodec)
										.addComponent(txtAudioCodec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(lblAudioEncoderParameters)
										.addGap(18, 18, 18)
										.addComponent(pnlAudioEncoderParamters, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

		txtAudioCodec.getAccessibleContext().setAccessibleParent(tblAudioEncoderParameters);
		txtAudioBitrate.getAccessibleContext().setAccessibleName("");
		txtAudioBitrate.getAccessibleContext().setAccessibleDescription("");

		puertodestino.addTab("Audio", pnlAudioSettings);

		btnStream.setText("Emitir");
		btnStream.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnStreamMouseClicked(evt);
			}
		});
		btnStream.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnStreamActionPerformed(evt);
			}
		});

		

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap(1040, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGap(1606))
						.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
							.addComponent(puertodestino, GroupLayout.PREFERRED_SIZE, 2531, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(puertodestino, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
					)
					.addContainerGap())
		);
		
		

		lblVideoEncoder.setText("Encoder");

		lblVideoCodec.setText("Codec");
		tblVideoEncoderParameters.setModel(new javax.swing.table.DefaultTableModel(
				new Object [][] {

				},
				new String [] {
						"Parametro", "Valor"
				}
				) {
			boolean[] canEdit = new boolean [] {
					false, true
			};

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit [columnIndex];
			}
		});
		
		pnlVideoEncoderParameters.setViewportView(tblVideoEncoderParameters);
		lblVideoEncoderParameters.setText("Parametros Encoder");
		txtVideoBitrate.setName("");
		
		lblVideoKbps = new JLabel("Video KBps");
		txtVideoScale = new JTextField();
		txtVideoScale.setText("0.5");
		txtVideoScale.setName("");
		
		lblVideoScale= new JLabel("Escala");
		javax.swing.GroupLayout pnlVideoSettingsLayout = new javax.swing.GroupLayout(pnlVideoSettings);
		
		pnlVideoSettings.setLayout(pnlVideoSettingsLayout);
		pnlVideoSettingsLayout.setHorizontalGroup(
				pnlVideoSettingsLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnlVideoSettingsLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(pnlVideoSettingsLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblVideoEncoderParameters, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
								.addGroup(pnlVideoSettingsLayout.createSequentialGroup()
										.addGroup(pnlVideoSettingsLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblVideoEncoder)
												.addComponent(lblVideoCodec))
												.addGap(33)
												.addGroup(pnlVideoSettingsLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(pnlVideoSettingsLayout.createSequentialGroup()
																.addComponent(cmbVideoEncoder, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
																.addGap(34)
																.addComponent(lblVideoKbps)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(txtVideoBitrate, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
																.addGroup(pnlVideoSettingsLayout.createSequentialGroup()
																		.addComponent(cmbVideoCodec, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
																		.addGap(24)
																		.addComponent(lblVideoScale, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(txtVideoScale, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))))
																		.addComponent(pnlVideoEncoderParameters, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE))
																		.addContainerGap(1179, Short.MAX_VALUE))
				);
		pnlVideoSettingsLayout.setVerticalGroup(
				pnlVideoSettingsLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnlVideoSettingsLayout.createSequentialGroup()
						.addGroup(pnlVideoSettingsLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(pnlVideoSettingsLayout.createSequentialGroup()
										.addGap(28)
										.addGroup(pnlVideoSettingsLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblVideoEncoder)
												.addComponent(cmbVideoEncoder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblVideoKbps)))
												.addGroup(pnlVideoSettingsLayout.createSequentialGroup()
														.addGap(22)
														.addComponent(txtVideoBitrate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
														.addGroup(pnlVideoSettingsLayout.createParallelGroup(Alignment.LEADING)
																.addGroup(pnlVideoSettingsLayout.createSequentialGroup()
																		.addPreferredGap(ComponentPlacement.UNRELATED)
																		.addGroup(pnlVideoSettingsLayout.createParallelGroup(Alignment.BASELINE)
																				.addComponent(lblVideoCodec)
																				.addComponent(cmbVideoCodec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																				.addGap(26)
																				.addComponent(lblVideoEncoderParameters))
																				.addGroup(pnlVideoSettingsLayout.createSequentialGroup()
																						.addGap(23)
																						.addGroup(pnlVideoSettingsLayout.createParallelGroup(Alignment.BASELINE)
																								.addComponent(txtVideoScale, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																								.addComponent(lblVideoScale))))
																								.addGap(18)
																								.addComponent(pnlVideoEncoderParameters, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
																								.addContainerGap(50, Short.MAX_VALUE))
				);
		
		puertodestino.addTab("Video", pnlVideoSettings);
		/*
		getContentPane().setLayout(layout);
        */
		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnStreamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStreamMouseClicked
		ST vlcTemplate = new ST(PropReader.getReader().getKey("vlc_template"));
		lblEstadoActual.setText("Emitiendo");
		//Video
		vlcTemplate.add("video_encoder",cmbVideoEncoder.getSelectedItem().toString());
		vlcTemplate.add("video_codec", cmbVideoCodec.getSelectedItem().toString());
		vlcTemplate.add("video_scale", txtVideoScale.getText());
		String encoderParameters="";
		for(int i=0; i<tblVideoEncoderParameters.getRowCount();i++){
			if(i>0){
				encoderParameters+=",";
			}
			encoderParameters+=tblVideoEncoderParameters.getValueAt(i, 0)+"="+tblVideoEncoderParameters.getValueAt(i, 1);

		}
		vlcTemplate.add("video_encoder_parameters",encoderParameters );


		encoderParameters="";
		for(int i=0; i<tblAudioEncoderParameters.getRowCount();i++){
			if(i>0){
				encoderParameters+=",";
			}
			encoderParameters+=tblAudioEncoderParameters.getValueAt(i, 0)+"="+tblVideoEncoderParameters.getValueAt(i, 1);

		}
		vlcTemplate.add("audio_encoder_parameters",encoderParameters);
		vlcTemplate.add("stream_destiny","");
		vlcTemplate.add("stream_port","");
		vlcTemplate.add("video_bitrate", txtVideoBitrate.getText());
		vlcTemplate.add("prueba", txtIPDestino.getText());
		vlcTemplate.add("puertodestino", txtIPDestino1.getText());
		vlcTemplate.add("audio_codec", txtAudioCodec.getText());
		vlcTemplate.add("audio_bitrate", txtAudioBitrate.getText());
		System.out.println(vlcTemplate.render());
		Runtime rt = Runtime.getRuntime();
		try{
			String[] cmdArray = {"gnome-terminal","-e",vlcTemplate.render()};
			Process prVlc = rt.exec(cmdArray);
			InputStream is = prVlc.getInputStream(); 
			BufferedReader br = new BufferedReader (new InputStreamReader (is));
			String aux = br.readLine(); 
			// Mientras se haya leido alguna linea 
			while (aux!=null) 
			{ 
				// Se escribe la linea en pantalla 
				System.out.println (aux); 
				// y se lee la siguiente. 
				aux = br.readLine(); 
			} 
		}catch(Exception e){
			System.out.println(e.getMessage());         
		}
	}//GEN-LAST:event_btnStreamMouseClicked

	private void btnStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStreamActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_btnStreamActionPerformed

	private void cmbVideoEncoderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVideoEncoderActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_cmbVideoEncoderActionPerformed

	private void txtAudioCodecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAudioCodecActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_txtAudioCodecActionPerformed

	private void txtAudioBitrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAudioBitrateActionPerformed
		// TODO add your handling code here:0
	}//GEN-LAST:event_txtAudioBitrateActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainWindow().setVisible(true);
			}
		});
	}


	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnStream;
	private javax.swing.JComboBox cmbAudioEncoder;
	private javax.swing.JComboBox cmbVideoEncoder;
	private javax.swing.JFrame frmVlc;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel lblAudioCodec;
	private javax.swing.JLabel lblAudioEncoder;
	private javax.swing.JLabel lblAudioEncoderParameters;
	private javax.swing.JLabel lblVideoCodec;
	private javax.swing.JLabel lblVideoEncoder;
	private javax.swing.JLabel lblVideoEncoderParameters;
	private javax.swing.JScrollPane pnlAudioEncoderParamters;
	private javax.swing.JPanel pnlAudioSettings;
	private javax.swing.JPanel pnlEstado;
	private javax.swing.JPanel pnlStreamingSettings;
	private javax.swing.JScrollPane pnlVideoEncoderParameters;
	private javax.swing.JPanel pnlVideoSettings;
	private javax.swing.JTabbedPane puertodestino;
	private javax.swing.JTable tblAudioEncoderParameters;
	private javax.swing.JTable tblVideoEncoderParameters;
	private javax.swing.JTextField txtAudioBitrate;
	private javax.swing.JTextField txtAudioCodec;
	private javax.swing.JTextField txtIPDestino;
	private javax.swing.JTextField txtIPDestino1;
	private javax.swing.JTextField txtVideoBitrate;
	private JLabel lblEstado;
	private JLabel lblEstadoActual;
	private JComboBox cmbVideoCodec;
	private JLabel lblVideoKbps;
	private JTextField txtVideoScale;
	private JLabel  lblVideoScale;
	// End of variables declaration//GEN-END:variables

	private void loadConfiguration() {
		PropReader pr = PropReader.getReader();
		String[] columnas = {"Parametro","Valor"};
		String videoEncoders = pr.getKey("video_encoders");
		String videoScale = pr.getKey("video_scale");
		txtVideoScale.setText(videoScale);
		for(String encoder : videoEncoders.split(";")){
			cmbVideoEncoder.addItem(encoder);
		}

		String videoCodecs = pr.getKey("video_codec");
		for(String codec : videoCodecs.split(";")){
			cmbVideoCodec.addItem(codec);
		}
		String destiny=pr.getKey("destinty");
		txtIPDestino.setText(destiny);
		txtVideoBitrate.setText(pr.getKey("video_bitrate"));
		txtAudioCodec.setText(pr.getKey("audio_codec"));
		String audioEncoders = pr.getKey("audio_encoders");
		for(String encoder : audioEncoders.split(";")){
			cmbAudioEncoder.addItem(encoder);
		}
		String videoEncoderParameters=pr.getKey(cmbVideoEncoder.getSelectedItem().toString()+"_parameters");
		int i = 0;
		DefaultTableModel tm = (DefaultTableModel)tblVideoEncoderParameters.getModel();
		for(String videoParameterValue : videoEncoderParameters.split(";")){
			String parameter = videoParameterValue.split("=")[0];
			String value=videoParameterValue.split("=")[1];
			if(tm.getRowCount()<=i){
				((DefaultTableModel)tm).insertRow(i, new Vector<String>());
			}
			tm.setValueAt(parameter, i, 0);
			tm.setValueAt(value, i, 1);
			i++;
		}

	}
}