package gui;

import dao.ClienteDAO;
import model.Cliente;
import utils.GerenteDeImagens;

	public class ClienteGUI extends javax.swing.JFrame {

		private static final long serialVersionUID = 1L;
		GerenteDeImagens gerenteDeImagens = new GerenteDeImagens();
	    ClienteDAO clienteDAO = new ClienteDAO();

	    public ClienteGUI() {
	        initComponents();
	    }
	    
	    private void initComponents() {

	        buttonGroup1 = new javax.swing.ButtonGroup();
	        jPanel1 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jPanel2 = new javax.swing.JPanel();
	        campoSangue1 = new javax.swing.JRadioButton();
	        campoSangue2 = new javax.swing.JRadioButton();
	        campoNome = new javax.swing.JTextField();
	        campoEmail = new javax.swing.JTextField();
	        campoTelefone = new javax.swing.JTextField();
	        campoImagemCliente = new javax.swing.JLabel();
	        jPanel3 = new javax.swing.JPanel();
	        botaoSalvar = new javax.swing.JButton();
	        botaoExcluir = new javax.swing.JButton();
	        campoPesquisar = new javax.swing.JTextField();
	        jLabel6 = new javax.swing.JLabel();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jTable1 = new javax.swing.JTable();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Tela de Clientes");
	        setResizable(false);

	        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

	        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); 
	        jLabel1.setForeground(new java.awt.Color(65, 132, 234));
	        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabel1.setText("Cadastro de Clientes");
	        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

	        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11));
	        jLabel2.setText("Nome");

	        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11));
	        jLabel3.setText("Telefone");

	        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11));
	        jLabel4.setText("e-mail");

	        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
	        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sangue", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 1, 11))); 

	        campoSangue1.setBackground(new java.awt.Color(255, 255, 255));
	        buttonGroup1.add(campoSangue1);
	        campoSangue1.setText("A, B");

	        campoSangue2.setBackground(new java.awt.Color(255, 255, 255));
	        buttonGroup1.add(campoSangue2);
	        campoSangue2.setText("AB, O");
	        campoSangue2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                campoSangue2ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addContainerGap(20, Short.MAX_VALUE)
	                .addComponent(campoSangue1)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(campoSangue2)
	                .addGap(16, 16, 16))
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                .addComponent(campoSangue1)
	                .addComponent(campoSangue2))
	        );

	        campoNome.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                campoNomeActionPerformed(evt);
	            }
	        });

	        campoImagemCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        campoImagemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cliente.png"))); 
	        campoImagemCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
	        campoImagemCliente.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                campoImagemClienteMouseClicked(evt);
	            }
	        });

	        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
	        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

	        botaoSalvar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); 
	        botaoSalvar.setText("Salvar");
	        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                botaoSalvarActionPerformed(evt);
	            }
	        });

	        botaoExcluir.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); 
	        botaoExcluir.setText("Excluir");
	        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                botaoExcluirActionPerformed(evt);
	            }
	        });

	        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pesquisar.png"))); 

	        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
	        jPanel3.setLayout(jPanel3Layout);
	        jPanel3Layout.setHorizontalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel3Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(botaoSalvar)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(botaoExcluir)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jLabel6)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(campoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap())
	        );
	        jPanel3Layout.setVerticalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(botaoExcluir)
	                        .addComponent(botaoSalvar))
	                    .addComponent(campoPesquisar, javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap())
	        );

	        jTable1.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null}
	            },
	            new String [] {
	                "Nome", "Telefone", "e-mail", "Sangue"
	            }
	        ) {
	          
				private static final long serialVersionUID = 1L;
				boolean[] canEdit = new boolean [] {
	                false, false, false, false
	            };

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit [columnIndex];
	            }
	        });
	        jScrollPane1.setViewportView(jTable1);

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(19, 19, 19)
	                        .addComponent(campoImagemCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addComponent(jLabel2)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(jLabel3)
	                                .addGap(80, 80, 80))
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jLabel4)
	                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                        .addComponent(campoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
	                                        .addComponent(campoNome)))
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                    .addComponent(campoTelefone)
	                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                                .addContainerGap())))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE))
	                        .addContainerGap())))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(32, 32, 32)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel2)
	                            .addComponent(jLabel3))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(campoTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
	                            .addComponent(campoNome))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addComponent(jLabel4)
	                                .addGap(7, 7, 7)
	                                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                    .addComponent(campoImagemCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        pack();
	    }

	    private void campoSangue2ActionPerformed(java.awt.event.ActionEvent evt) {
	    }

	    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {
	    }

	    private void campoImagemClienteMouseClicked(java.awt.event.MouseEvent evt) {
	        if (evt.getClickCount() == 2) {
	            gerenteDeImagens.escolherImagem(campoImagemCliente);

	        }
	    }

	    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {
	        Cliente cliente = new Cliente();
	        cliente.setNome(campoNome.getText());
	        cliente.setEmail(campoEmail.getText());
	        cliente.setTelefone(campoTelefone.getText());
	        cliente.setImagem(gerenteDeImagens.getUrlImagem());
	        if (campoSangue1.isSelected()) {
	            cliente.setSangue("A, B");
	        } else if (campoSangue2.isSelected()) {
	            cliente.setSangue("AB, O");
	        }
	        clienteDAO.saveOrUpdate(cliente);
	    }

	    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {
	        Cliente cliente = new Cliente();
	        clienteDAO.delete(cliente);

	    }

	    public static void main(String args[]) {
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Windows".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }

	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new ClienteGUI().setVisible(true);
	            }
	        });
	    }

	    
	    private javax.swing.JButton botaoExcluir;
	    private javax.swing.JButton botaoSalvar;
	    private javax.swing.ButtonGroup buttonGroup1;
	    private javax.swing.JTextField campoEmail;
	    private javax.swing.JRadioButton campoSangue2;
	    private javax.swing.JLabel campoImagemCliente;
	    private javax.swing.JRadioButton campoSangue1;
	    private javax.swing.JTextField campoNome;
	    private javax.swing.JTextField campoPesquisar;
	    private javax.swing.JTextField campoTelefone;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	    private javax.swing.JPanel jPanel3;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JTable jTable1;
	}
