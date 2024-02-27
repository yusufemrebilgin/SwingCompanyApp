package view;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import dao.*;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.LookAndFeel;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.*;
import service.DisplayService;
import service.tableconfigs.*;
import view.operations.*;

public class Dashboard extends javax.swing.JFrame {
    
   
    public Dashboard() {
        initComponents();
        
        setWindowsProperties();
        setButtonProperties();
        setSearchProperties();
        setSearchProperties();
        setComboBoxProperties();
        setTableProperties();
        displayInitialData();
    }
    
    private void handleSelectedItem(String selectedItem) {
        switch (selectedItem) {
            case "Customers"    -> new DisplayService<Customer>().displayData(new CustomerDAO().getAll(), table, new CustomerTableConfig());
            case "Products"     -> new DisplayService<Product>().displayData(new ProductDAO().getAll(), table, new ProductTableConfig());
            case "Orders"       -> new DisplayService<Order>().displayData(new OrderDAO().getAll(), table, new OrderTableConfig());
            case "Purchase"     -> new DisplayService<Purchase>().displayData(new PurchaseDAO().getAll(), table, new PurchaseTableConfig());
            case "Employees"    -> new DisplayService<Employee>().displayData(new EmployeeDAO().getAll(), table, new EmployeeTableConfig());
            case "Offices"      -> new DisplayService<Office>().displayData(new OfficeDAO().getAll(), table, new OfficeTableConfig());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtSearchBar = new javax.swing.JTextField();
        comboBoxModels = new javax.swing.JComboBox<>();
        btnRefresh = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        themeMenu = new javax.swing.JMenu();
        themeLight = new javax.swing.JMenuItem();
        themeDark = new javax.swing.JMenuItem();
        themeArcDark = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setEnabled(false);
        scrollPane.setViewportView(table);

        btnDelete.setIcon(new FlatSVGIcon("svg/delete.svg", 0.8f));
        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(75, 25));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new FlatSVGIcon("svg/update.svg", 0.8f));
        btnUpdate.setText("Update");
        btnUpdate.setPreferredSize(new java.awt.Dimension(75, 25));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new FlatSVGIcon("svg/add.svg", 0.8f));
        btnAdd.setText("Add");
        btnAdd.setPreferredSize(new java.awt.Dimension(75, 25));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtSearchBar.setPreferredSize(new java.awt.Dimension(75, 25));
        txtSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchBarKeyReleased(evt);
            }
        });

        comboBoxModels.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customers", "Products", "Orders", "Purchase", "Employees", "Offices" }));
        comboBoxModels.setMinimumSize(new java.awt.Dimension(75, 25));
        comboBoxModels.setPreferredSize(new java.awt.Dimension(75, 25));

        btnRefresh.setIcon(new FlatSVGIcon("svg/refresh.svg", 0.8f));
        btnRefresh.setMinimumSize(new java.awt.Dimension(75, 25));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        themeMenu.setText("Themes");

        themeLight.setText("FlatLaf Light");
        themeLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themeLightActionPerformed(evt);
            }
        });
        themeMenu.add(themeLight);

        themeDark.setText("FlatLaf Dark");
        themeDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themeDarkActionPerformed(evt);
            }
        });
        themeMenu.add(themeDark);

        themeArcDark.setText("FlatLaf Arc Dark");
        themeArcDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themeArcDarkActionPerformed(evt);
            }
        });
        themeMenu.add(themeArcDark);

        menuBar.add(themeMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxModels, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxModels, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static DefaultTableModel model;
    
    public static DefaultTableModel getModel() {
        if (model == null)
            return new DefaultTableModel();
        return model;
    }
    
    public static void setModel(DefaultTableModel model) {
        Dashboard.model = model;
    }
    
    private void txtSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchBarKeyReleased
        String searchKey = txtSearchBar.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<>(model);
        table.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
        new Thread(() -> {
            comboBoxModels.addActionListener((ActionEvent e) -> {
                tableRowSorter.setRowFilter(null);
            });
        }).start();
    }//GEN-LAST:event_txtSearchBarKeyReleased

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        handleSelectedItem((String) comboBoxModels.getSelectedItem());
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void setLookAndFeel(LookAndFeel lookAndFeel) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(lookAndFeel);
                SwingUtilities.updateComponentTreeUI(this);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    } 
    
    private void themeLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themeLightActionPerformed
        setLookAndFeel(new FlatLightLaf());
    }//GEN-LAST:event_themeLightActionPerformed

    private void themeDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themeDarkActionPerformed
        setLookAndFeel(new FlatDarkLaf());
    }//GEN-LAST:event_themeDarkActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        SwingUtilities.invokeLater(() -> {
            new Add(this, false).setVisible(true);
        });
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        SwingUtilities.invokeLater(() -> {
            new Update(this, false).setVisible(true);
        });
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        SwingUtilities.invokeLater(() -> {
            new Delete(this, false).setVisible(true);
        });
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void themeArcDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themeArcDarkActionPerformed
        setLookAndFeel(new FlatArcDarkIJTheme());
    }//GEN-LAST:event_themeArcDarkActionPerformed

    private void setWindowsProperties() {
        setIconImage(new FlatSVGIcon("svg/company.svg").getImage());
        setTitle("JCompany");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1000, 600));
        setLocationRelativeTo(null);
    }
    
    private void setButtonProperties() {
        JButton[] buttons = {btnAdd, btnDelete, btnUpdate, btnRefresh};
        for (JButton button: buttons)
            button.putClientProperty("JButton.buttonType", "roundRect");
    }
    
    private void setSearchProperties() {
        txtSearchBar.putClientProperty("JComponent.roundRect", true);
        txtSearchBar.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Search");
        txtSearchBar.putClientProperty(FlatClientProperties.TEXT_FIELD_TRAILING_ICON, new FlatSVGIcon("svg/search.svg", 0.8f));
        txtSearchBar.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
    }
    
    private void setComboBoxProperties() {
        comboBoxModels.putClientProperty("JComponent.roundRect", true);
        comboBoxModels.addActionListener((ActionEvent e) -> {
            handleSelectedItem((String) comboBoxModels.getSelectedItem());
        });
    }
    
    private void setTableProperties() {
        table.putClientProperty("JComponent.roundRect", true);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }
    
    private void displayInitialData() {
        new DisplayService<Customer>().displayData(new CustomerDAO().getAll(), table, new CustomerTableConfig());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxModels;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table;
    private javax.swing.JMenuItem themeArcDark;
    private javax.swing.JMenuItem themeDark;
    private javax.swing.JMenuItem themeLight;
    private javax.swing.JMenu themeMenu;
    private javax.swing.JTextField txtSearchBar;
    // End of variables declaration//GEN-END:variables
}