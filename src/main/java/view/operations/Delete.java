package view.operations;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import dao.*;
import javax.swing.JDialog;
import model.*;
import service.ModelDeleteService;

public class Delete extends javax.swing.JDialog {

    public Delete(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setWindowProperties();
        setTextFieldProperties();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxModels = new javax.swing.JComboBox<>();
        txtField = new javax.swing.JTextField();
        btnDeleteModel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        comboBoxModels.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customers", "Products", "Orders", "Purchase", "Employees", "Offices" }));
        comboBoxModels.setPreferredSize(new java.awt.Dimension(75, 25));

        txtField.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtField.setPreferredSize(new java.awt.Dimension(75, 28));

        btnDeleteModel.setText("Delete");
        btnDeleteModel.setPreferredSize(new java.awt.Dimension(75, 25));
        btnDeleteModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteModelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxModels, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btnDeleteModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(comboBoxModels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnDeleteModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteModelActionPerformed
        String selectedItem = (String) comboBoxModels.getSelectedItem();
        int id = Integer.parseInt(txtField.getText());
        switch (selectedItem) {
            case "Customers" -> new ModelDeleteService<Customer>().delete(new CustomerDAO(), id);
            case "Products" -> new ModelDeleteService<Product>().delete(new ProductDAO(), id);
            case "Orders" -> new ModelDeleteService<Order>().delete(new OrderDAO(), id);
            case "Purchase" -> new ModelDeleteService<Purchase>().delete(new PurchaseDAO(), id);
            case "Employees" -> new ModelDeleteService<Employee>().delete(new EmployeeDAO(), id);  
            case "Offices" -> new ModelDeleteService<Office>().delete(new OfficeDAO(), id);
        }
        this.dispose();
    }//GEN-LAST:event_btnDeleteModelActionPerformed
    
    private void setWindowProperties() {
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        comboBoxModels.putClientProperty("JComponent.roundRect", true);
    }
    
    private void setTextFieldProperties() {
        txtField.putClientProperty("JComponent.roundRect", true);
        txtField.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("svg/update.svg", 0.5f));
        txtField.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txtField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Please enter the ID you want to delete");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteModel;
    private javax.swing.JComboBox<String> comboBoxModels;
    private javax.swing.JTextField txtField;
    // End of variables declaration//GEN-END:variables
}
