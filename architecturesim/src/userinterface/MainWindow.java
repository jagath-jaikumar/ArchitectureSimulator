/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import src.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author jjaikumar
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CacheButtons = new javax.swing.ButtonGroup();
        PipelineButtons = new javax.swing.ButtonGroup();
        ProjectNameLabel = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        simulationSettingsPanel = new javax.swing.JPanel();
        PipelineEnabledBox = new javax.swing.JPanel();
        pipelineEnabledButton = new javax.swing.JRadioButton();
        pipelineDisabledButton = new javax.swing.JRadioButton();
        pipelineButtonsLabel = new javax.swing.JLabel();
        CacheEnabledBox = new javax.swing.JPanel();
        cacheEnabledButton = new javax.swing.JRadioButton();
        cacheDisabledButton = new javax.swing.JRadioButton();
        cacheButtonsLabel = new javax.swing.JLabel();
        memoryPanel = new javax.swing.JPanel();
        CacheLevelNameDropDown = new javax.swing.JComboBox<>();
        CacheLevelLabel = new javax.swing.JLabel();
        AddressPageLabel = new javax.swing.JLabel();
        AddressRangeDropDown = new javax.swing.JComboBox<>();
        memoryScrollPane = new javax.swing.JScrollPane();
        MemoryViewer = new javax.swing.JTable();
        RunButtonLabel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ProjectNameLabel.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        ProjectNameLabel.setText("CS 535 Architecture Simulator");

        PipelineButtons.add(pipelineEnabledButton);
        pipelineEnabledButton.setText("Enabled");

        PipelineButtons.add(pipelineDisabledButton);
        pipelineDisabledButton.setText("Disabled");

        pipelineButtonsLabel.setText("Pipeline Settings");

        javax.swing.GroupLayout PipelineEnabledBoxLayout = new javax.swing.GroupLayout(PipelineEnabledBox);
        PipelineEnabledBox.setLayout(PipelineEnabledBoxLayout);
        PipelineEnabledBoxLayout.setHorizontalGroup(
            PipelineEnabledBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PipelineEnabledBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pipelineEnabledButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pipelineDisabledButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PipelineEnabledBoxLayout.createSequentialGroup()
                .addComponent(pipelineButtonsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PipelineEnabledBoxLayout.setVerticalGroup(
            PipelineEnabledBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PipelineEnabledBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pipelineButtonsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(PipelineEnabledBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pipelineEnabledButton)
                    .addComponent(pipelineDisabledButton))
                .addGap(25, 25, 25))
        );

        CacheButtons.add(cacheEnabledButton);
        cacheEnabledButton.setText("Enabled");

        CacheButtons.add(cacheDisabledButton);
        cacheDisabledButton.setText("Disabled");

        cacheButtonsLabel.setText("Cache Settings");

        javax.swing.GroupLayout CacheEnabledBoxLayout = new javax.swing.GroupLayout(CacheEnabledBox);
        CacheEnabledBox.setLayout(CacheEnabledBoxLayout);
        CacheEnabledBoxLayout.setHorizontalGroup(
            CacheEnabledBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CacheEnabledBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cacheEnabledButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cacheDisabledButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(CacheEnabledBoxLayout.createSequentialGroup()
                .addComponent(cacheButtonsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CacheEnabledBoxLayout.setVerticalGroup(
            CacheEnabledBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CacheEnabledBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cacheButtonsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(CacheEnabledBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cacheEnabledButton)
                    .addComponent(cacheDisabledButton))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout simulationSettingsPanelLayout = new javax.swing.GroupLayout(simulationSettingsPanel);
        simulationSettingsPanel.setLayout(simulationSettingsPanelLayout);
        simulationSettingsPanelLayout.setHorizontalGroup(
            simulationSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(simulationSettingsPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(CacheEnabledBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PipelineEnabledBox, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        simulationSettingsPanelLayout.setVerticalGroup(
            simulationSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(simulationSettingsPanelLayout.createSequentialGroup()
                .addGroup(simulationSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(simulationSettingsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PipelineEnabledBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CacheEnabledBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        CacheLevelNameDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L1 Cache", "L2 Cache", "DRAM" }));
        CacheLevelNameDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CacheLevelNameDropDownActionPerformed(evt);
            }
        });

        CacheLevelLabel.setText("Cache Level");

        AddressPageLabel.setText("Address Range");

        AddressRangeDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {" "}));
        AddressRangeDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressRangeDropDownActionPerformed(evt);
            }
        });

        MemoryViewer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Address", "Memory"
            }
        ));
        memoryScrollPane.setViewportView(MemoryViewer);

        javax.swing.GroupLayout memoryPanelLayout = new javax.swing.GroupLayout(memoryPanel);
        memoryPanel.setLayout(memoryPanelLayout);
        memoryPanelLayout.setHorizontalGroup(
            memoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(memoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(memoryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(memoryPanelLayout.createSequentialGroup()
                        .addComponent(CacheLevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CacheLevelNameDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddressPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddressRangeDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        memoryPanelLayout.setVerticalGroup(
            memoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memoryPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(memoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CacheLevelLabel)
                    .addComponent(CacheLevelNameDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressPageLabel)
                    .addComponent(AddressRangeDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(memoryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(memoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simulationSettingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(simulationSettingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(memoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        RunButtonLabel.setText("Run");
        RunButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RunButton(evt);
            }
        });
        RunButtonLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunButtonLabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ProjectNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(RunButtonLabel)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RunButtonLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ProjectNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RunButtonLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunButtonLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RunButtonLabelActionPerformed

    private void RunButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RunButton
        // TODO add your handling code here:
        Driver driver = new Driver();
        // redraw table based on current values in pull down menus for cache and address range
    }//GEN-LAST:event_RunButton

    private void AddressRangeDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressRangeDropDownActionPerformed
        // TODO add your handling code here:
        Object[][] memoryArraySegment;
        int memoryPage = 0;
        String s = (String) AddressRangeDropDown.getSelectedItem();
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);
        while(m.find()) {
            memoryPage = Integer.parseInt(m.group());
        }
        String [] columnNames = {"Address", "Instruction"};
        if (null != (String) CacheLevelNameDropDown.getSelectedItem()) switch ((String) CacheLevelNameDropDown.getSelectedItem()) {
            case "DRAM":
            memoryArraySegment = dm.getMemoryPage(cpu.getMemory().DRAM.getMemArray(), cpu.getMemory().DRAM.getTagArray(), cpu.getMemory().DRAM.getHeirarchy(), memoryPage);
            MemoryViewer.setModel(new javax.swing.table.DefaultTableModel(
                memoryArraySegment,
                columnNames
            )
            {public boolean isCellEditable(int row, int column){return false;}}
        );  break;
        case "L2 Cache":
        memoryArraySegment = dm.getMemoryPage(cpu.getMemory().L2Cache.getMemArray(), cpu.getMemory().L2Cache.getTagArray(), cpu.getMemory().L2Cache.getHeirarchy(), memoryPage);
        MemoryViewer.setModel(new javax.swing.table.DefaultTableModel(
            memoryArraySegment,
            columnNames
        )
        {public boolean isCellEditable(int row, int column){return false;}}
        );  break;
        case "L1 Cache":
        memoryArraySegment = dm.getMemoryPage(cpu.getMemory().L1Cache.getMemArray(), cpu.getMemory().L1Cache.getTagArray(), cpu.getMemory().L1Cache.getHeirarchy(), memoryPage);
        MemoryViewer.setModel(new javax.swing.table.DefaultTableModel(
            memoryArraySegment,
            columnNames
        )
        {public boolean isCellEditable(int row, int column){return false;}}
        );  break;
        default:
        break;
        }
    }//GEN-LAST:event_AddressRangeDropDownActionPerformed

    private void CacheLevelNameDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CacheLevelNameDropDownActionPerformed
        if (null != (String) CacheLevelNameDropDown.getSelectedItem()) switch ((String) CacheLevelNameDropDown.getSelectedItem()) {
            case "DRAM":
            AddressRangeDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(dm.getMemoryPageLabelsForMemoryType("DRAM")));
            break;
            case "L2 Cache":
            AddressRangeDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(dm.getMemoryPageLabelsForMemoryType("L2Cache")));
            break;
            case "L1 Cache":
            AddressRangeDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(dm.getMemoryPageLabelsForMemoryType("L1Cache")));
            break;
            default:
            break;
        }
    }//GEN-LAST:event_CacheLevelNameDropDownActionPerformed

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

    CPU cpu = new CPU();
    DisplayMemory dm = new DisplayMemory();
    // cpu.MemorySet.L1Cache.getMemArray();
    // cpu.MemorySet.L2Cache.getMemArray();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressPageLabel;
    private javax.swing.JComboBox<String> AddressRangeDropDown;
    private javax.swing.ButtonGroup CacheButtons;
    private javax.swing.JPanel CacheEnabledBox;
    private javax.swing.JLabel CacheLevelLabel;
    private javax.swing.JComboBox<String> CacheLevelNameDropDown;
    private javax.swing.JTable MemoryViewer;
    private javax.swing.ButtonGroup PipelineButtons;
    private javax.swing.JPanel PipelineEnabledBox;
    private javax.swing.JLabel ProjectNameLabel;
    private javax.swing.JButton RunButtonLabel;
    private javax.swing.JLabel cacheButtonsLabel;
    private javax.swing.JRadioButton cacheDisabledButton;
    private javax.swing.JRadioButton cacheEnabledButton;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel memoryPanel;
    private javax.swing.JScrollPane memoryScrollPane;
    private javax.swing.JLabel pipelineButtonsLabel;
    private javax.swing.JRadioButton pipelineDisabledButton;
    private javax.swing.JRadioButton pipelineEnabledButton;
    private javax.swing.JPanel simulationSettingsPanel;
    // End of variables declaration//GEN-END:variables
}
