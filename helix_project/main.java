package helix_project;


import helix_project.excel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        jComboBox2.setVisible(false);
        jComboBox1.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Analytics of Ground Water (Minor Irrigation Census)");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Period" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type" }));
        jComboBox2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox2FocusLost(evt);
            }
        });
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jComboBox2MouseExited(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Statistical Table", "National", "State", "Key Parameters" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Analytics Type", "Line Graph", "Total Estimation", "Comparision: Pucca/Kutcha/Dug-cum-Bore", "Map", "Final Data Analytics", "Excel", "GIS Map" }));
        jComboBox4.setEnabled(false);
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jButton1.setText("Show Analytics");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setMaximumSize(new java.awt.Dimension(870, 510));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jButton2.setText("Info");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }                       

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(jComboBox3.getSelectedIndex()==1){
            switch (jComboBox1.getSelectedIndex()) {
                case 0:
                    jComboBox2.setVisible(false);
                    break;
                case 1:
                    jComboBox2.setVisible(true);
                    jComboBox2.removeAllItems();
                    jComboBox2.addItem("Select Type");
                    jComboBox2.addItem("Dugwell");
                    jComboBox2.addItem("Shallow Tubewell");
                    jComboBox2.addItem("Medium Tubewell");
                    jComboBox2.addItem("Deep Tubewell");
                    jComboBox2.addItem("Surface Flow Schemes Report");
                    jComboBox2.addItem("Surface Lift Schemes Report");
                    jComboBox2.addItem("Integrated Reports");
                    break;
                case 2:
                    jComboBox2.setVisible(true);
                    jComboBox2.removeAllItems();
                    jComboBox2.addItem("Select Type");
                    jComboBox2.addItem("Dugwell");
                    jComboBox2.addItem("Shallow Tubewell");
                    jComboBox2.addItem("Deep Tubewell");
                    jComboBox2.addItem("Surface Flow Schemes Report");
                    jComboBox2.addItem("Surface Lift Schemes Report");
                    jComboBox2.addItem("Integrated Reports");
                    break;
                case 3:
                    jComboBox2.setVisible(true);
                    jComboBox2.removeAllItems();
                    jComboBox2.addItem("Select Type");
                    jComboBox2.addItem("Dugwell");
                    jComboBox2.addItem("Shallow Tubewell");
                    jComboBox2.addItem("Deep Tubewell");
                    jComboBox2.addItem("Surface Flow Schemes Report");
                    jComboBox2.addItem("Surface Lift Schemes Report");
                    jComboBox2.addItem("Integrated Reports");
                    break;
                case 4:
                    jComboBox2.setVisible(true);
                    jComboBox2.removeAllItems();
                    jComboBox2.addItem("Select Type");
                    jComboBox2.addItem("Dugwell");
                    jComboBox2.addItem("Shallow Tubewell");
                    jComboBox2.addItem("Deep Tubewell");
                    jComboBox2.addItem("Surface Flow Schemes Report");
                    jComboBox2.addItem("Surface Lift Schemes Report");
                    jComboBox2.addItem("Integrated Reports");
                    break;
                case 5:
                    jComboBox2.setVisible(true);
                    jComboBox2.removeAllItems();
                    jComboBox2.addItem("Select Type");
                    jComboBox2.addItem("Dugwell");
                    jComboBox2.addItem("Shallow Tubewell");
                    jComboBox2.addItem("Deep Tubewell");
                    jComboBox2.addItem("Surface Flow Schemes Report");
                    jComboBox2.addItem("Surface Lift Schemes Report");
                    jComboBox2.addItem("Integrated Reports");
                    break;
                default:
                    break;
            }
        }
        else if(jComboBox3.getSelectedIndex()==2){
            jComboBox2.setVisible(true);
            jComboBox1.setVisible(true);
            jComboBox2.removeAllItems();
            jComboBox2.addItem("Select Type");
            jComboBox2.addItem("Dugwell");
            jComboBox2.addItem("Shallow Tubewell");
            jComboBox2.addItem("Medium Tubewell");
            jComboBox2.addItem("Deep Tubewell");
            jComboBox2.addItem("Surface Flow Schemes Report");
            jComboBox2.addItem("Surface Lift Schemes Report");
            jComboBox2.addItem("Integrated Reports");
        }
    }                                          

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        switch (jComboBox3.getSelectedIndex()) {
            case 0:
                jComboBox2.setVisible(false);
                jComboBox1.setVisible(false);
                jComboBox4.setEnabled(false);
                break;
            case 1:
                jComboBox1.setVisible(true);
                jComboBox2.setVisible(false);
                jComboBox1.removeAllItems();
                jComboBox1.addItem("Select Period");
                jComboBox1.addItem("Fifth MI Census (2013-2014)");
                jComboBox1.addItem("Fourth MI Census (2006-2007)");
                jComboBox1.addItem("Third MI Census (2000-2001)");
                jComboBox1.addItem("Second MI Census (1993-1994)");
                jComboBox1.addItem("First MI Census (1986-1987)");
                break;
            case 2:
                jComboBox1.setVisible(true);
                jComboBox2.setVisible(false);
                jComboBox1.removeAllItems();
                jComboBox1.addItem("Andaman Nicobar");
                jComboBox1.addItem("Andhra Pradesh");
                jComboBox1.addItem("Arunanchal Pradesh");
                jComboBox1.addItem("Assam");
                jComboBox1.addItem("Bihar");
                jComboBox1.addItem("Chhatisgarh");
                jComboBox1.addItem("Goa");
                jComboBox1.addItem("Gujarat");
                jComboBox1.addItem("Haryana");
                jComboBox1.addItem("Himachal Pradesh");
                jComboBox1.addItem("Jammu & Kashmir");
                jComboBox1.addItem("Jharkhand");
                jComboBox1.addItem("Karnataka");
                jComboBox1.addItem("Kerala");
                jComboBox1.addItem("Madhya Pradesh");
                jComboBox1.addItem("Maharahtra");
                jComboBox1.addItem("Meghalya");
                jComboBox1.addItem("Nagaland");
                jComboBox1.addItem("Odisha");
                jComboBox1.addItem("Puducherry");
                jComboBox1.addItem("Rajasthan");
                jComboBox1.addItem("Tamil Nadu");
                jComboBox1.addItem("Telangana");
                jComboBox1.addItem("Tripura");
                jComboBox1.addItem("Uttrakhand");
                jComboBox1.addItem("Uttar Pradesh");
                jComboBox1.addItem("West Bengal");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Key Parameters"+"\n"+"\n1. Number of Schemes"+"\n2. CCA, IPC, IPU"+"\n3. Social Group: ST, SC, OBC, Other"+"\n4. Water Distribution System:\n - Lined\n - Unlined\n - Underground Pipe\n - Surface Pipe\n - Drip\n - Sprinkler\n - Other"+"\n\nAccording to 5th Minor Irrigation Census");
                jComboBox3.setSelectedIndex(0);
                break;
            default:
                break;
        }
    }                                          

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(jComboBox2.getSelectedIndex()==0){
            jComboBox4.setEnabled(false);
        }
        else{
            jComboBox4.setEnabled(true);
        }
    }                                          

    private void jComboBox2FocusLost(java.awt.event.FocusEvent evt) {                                     

    }                                    

    private void jComboBox2MouseExited(java.awt.event.MouseEvent evt) {                                       

    }                                      

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int o = jComboBox4.getSelectedIndex();
        int t = jComboBox2.getSelectedIndex();
        int h = jComboBox1.getSelectedIndex();
        int T = jComboBox3.getSelectedIndex();
        String f_name = Integer.toString(T)+Integer.toString(h)+Integer.toString(t)+Integer.toString(o);
        switch (jComboBox4.getSelectedIndex()) {
            case 6:
                new excel(f_name).setVisible(true);
                break;
            default:
                //ImageIcon image1 = new ImageIcon("C:\\Users\\ishaa\\Documents\\NetBeansProjects\\Helix\\src\\"+ f_name +".PNG");
                String currentDirectory = System.getProperty("user.dir");
                //JOptionPane.showMessageDialog(null, currentDirectory);
                ImageIcon image1 = new ImageIcon(currentDirectory +"\\resources\\"+ f_name +".PNG");
                jLabel2.setIcon(image1);
                break;
        }
    }                                        

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }                                          

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        JOptionPane.showMessageDialog(null, "Tool used for visualization:\nMicrosoft Power BI\nwhich works on Python and R scripts\n(MatlPlotLib, Panda, Excel & R GG Plot respectively)");
    }                                        

   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
                
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
                
}
