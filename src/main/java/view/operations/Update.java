package view.operations;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import dao.*;
import java.awt.event.ActionEvent;
import java.sql.Date;
import javax.swing.JDialog;
import javax.swing.JTextField;
import model.*;
import service.ModelUpdateService;

public class Update extends javax.swing.JDialog {

    public Update(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setWindowProperties();
        setComboBoxProperties();
        setIdTextField();
        displayInitialPlaceHolders();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxModels = new javax.swing.JComboBox<>();
        txtField1 = new javax.swing.JTextField();
        txtField2 = new javax.swing.JTextField();
        txtField3 = new javax.swing.JTextField();
        txtField4 = new javax.swing.JTextField();
        txtField5 = new javax.swing.JTextField();
        txtField6 = new javax.swing.JTextField();
        txtField7 = new javax.swing.JTextField();
        txtField8 = new javax.swing.JTextField();
        btnUpdateModel = new javax.swing.JButton();
        txtFieldId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        comboBoxModels.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customers", "Products", "Orders", "Purchase", "Employees", "Offices" }));
        comboBoxModels.setPreferredSize(new java.awt.Dimension(75, 25));

        txtField1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtField1.setPreferredSize(new java.awt.Dimension(75, 28));

        txtField2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtField2.setPreferredSize(new java.awt.Dimension(75, 28));

        txtField3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtField3.setPreferredSize(new java.awt.Dimension(75, 28));

        txtField4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtField4.setPreferredSize(new java.awt.Dimension(75, 28));

        txtField5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtField5.setPreferredSize(new java.awt.Dimension(75, 28));

        txtField6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtField6.setPreferredSize(new java.awt.Dimension(75, 28));

        txtField7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtField7.setPreferredSize(new java.awt.Dimension(75, 28));

        txtField8.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtField8.setPreferredSize(new java.awt.Dimension(75, 28));

        btnUpdateModel.setText("Update");
        btnUpdateModel.setPreferredSize(new java.awt.Dimension(75, 25));
        btnUpdateModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateModelActionPerformed(evt);
            }
        });

        txtFieldId.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtFieldId.setPreferredSize(new java.awt.Dimension(75, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFieldId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxModels, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtField2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtField3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtField4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtField5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtField6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtField7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtField8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btnUpdateModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxModels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnUpdateModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateModelActionPerformed
        String selectedItem = (String) comboBoxModels.getSelectedItem();
        switch (selectedItem) {
            case "Customers" -> {
                Customer customer = getCustomerInformationFromTextFields();
                new ModelUpdateService<Customer>().update(new CustomerDAO(), customer);
            }
            case "Products" -> {
                Product product = getProductInformationFromTextFields();
                new ModelUpdateService<Product>().update(new ProductDAO(), product);
            }
            case "Orders" -> {
                Order order = getOrderInformationFromTextFields();
                new ModelUpdateService<Order>().update(new OrderDAO(), order);
            }
            case "Purchase" -> {
                Purchase purchase = getPurchaseInformationFromTextFields();
                new ModelUpdateService<Purchase>().update(new PurchaseDAO(), purchase);
            }
            case "Employees" -> {
                Employee employee = getEmployeeInformationFromTextFields();
                new ModelUpdateService<Employee>().update(new EmployeeDAO(), employee);
            }
            case "Offices" -> {
                Office office = getOfficeInformationFromTextFields();
                new ModelUpdateService<Office>().update(new OfficeDAO(), office);
            }
        }
        this.dispose();
    }//GEN-LAST:event_btnUpdateModelActionPerformed
    
    private Customer getCustomerInformationFromTextFields() {
        return new Customer(
                Integer.parseInt(txtFieldId.getText()),
                txtField1.getText(),
                txtField2.getText(),
                txtField3.getText(),
                txtField4.getText(),
                txtField5.getText(),
                txtField6.getText(),
                txtField7.getText(),
                Integer.parseInt(txtField8.getText()));
    }
    
    private Product getProductInformationFromTextFields() {
        return new Product(
                Integer.parseInt(txtFieldId.getText()),
                txtField1.getText(),
                txtField2.getText(),
                Integer.parseInt(txtField3.getText()),
                Float.parseFloat(txtField4.getText()));
    }
    
    private Order getOrderInformationFromTextFields() {
        return new Order(
                Integer.parseInt(txtFieldId.getText()),
                Date.valueOf(txtField1.getText()),
                Date.valueOf(txtField2.getText()),
                Date.valueOf(txtField3.getText()),
                txtField4.getText(),
                Integer.parseInt(txtField5.getText()));
    }
    
    private Purchase getPurchaseInformationFromTextFields() {
        return new Purchase(
                Integer.parseInt(txtField1.getText()),
                Float.parseFloat(txtField2.getText()),
                Date.valueOf(txtField3.getText()));
    }
    
    private Employee getEmployeeInformationFromTextFields() {
        return new Employee(
                Integer.parseInt(txtFieldId.getText()),
                txtField1.getText(),
                txtField2.getText(),
                txtField3.getText(),
                txtField4.getText(),
                txtField5.getText(),
                Date.valueOf(txtField6.getText()),
                Integer.parseInt(txtField6.getText()));
    }
    
    private Office getOfficeInformationFromTextFields() {
        return new Office(
                Integer.parseInt(txtFieldId.getText()),
                txtField1.getText(),
                txtField2.getText());
    }
    
    private void setWindowProperties() {
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }
    
    private String[] getPlaceHolderTexts(String model) {
        String[] placeHolderTexts = null;
        switch (model) {
            case "Customers" -> placeHolderTexts = new String[] {
                "First Name","Last Name","Email","Phone","Address","City","Country","Postal Code"
            };
            case "Products" -> placeHolderTexts = new String[] {
                "Product Name","Manufacturer","Quantity","Price"
            };
            case "Orders" -> placeHolderTexts = new String[] {
                "Order Date","Estimated Date","Shipped Date","Status","Customer Id"
            };
            case "Purchase" -> placeHolderTexts = new String[] {
                "Customer Id","Total Amount","Purchase Date"
            };
            case "Employees" -> placeHolderTexts = new String[] {
                "First Name","Last Name","Email","Phone","Job Title","Start Date","Office Code"
            };
            case "Offices" -> placeHolderTexts = new String[] {
                "Office Code","Address","Phone"
            };
        }
        return placeHolderTexts;
    }
    
    private void setIdTextField() {
        txtFieldId.putClientProperty("JComponent.roundRect", true);
        txtFieldId.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter ID");
        txtFieldId.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("svg/update.svg", 0.5f));
        txtFieldId.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
    }
    
    private void setTextFieldProperties(String[] holderTexts) {
        JTextField[] textFields = {
            txtField1,txtField2,txtField3,txtField4,txtField5,txtField6,txtField7,txtField8
        };
        for (int i = 0; i < holderTexts.length; i++) {
            textFields[i].setVisible(true);
            textFields[i].putClientProperty("JComponent.roundRect", true);
            textFields[i].putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, holderTexts[i]);
            textFields[i].putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("svg/update.svg", 0.5f));
            textFields[i].putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        }
        for (int i = textFields.length - 1; i >= holderTexts.length; i--) {
            textFields[i].setVisible(false);
        } 
    }
    
    private void setComboBoxProperties() {
        comboBoxModels.putClientProperty("JComponent.roundRect", true);
        comboBoxModels.addActionListener((ActionEvent e) -> {
            setTextFieldProperties(getPlaceHolderTexts((String) comboBoxModels.getSelectedItem()));
        });
    }
    
    private void displayInitialPlaceHolders() {
        setTextFieldProperties(getPlaceHolderTexts("Customers"));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateModel;
    private javax.swing.JComboBox<String> comboBoxModels;
    private javax.swing.JTextField txtField1;
    private javax.swing.JTextField txtField2;
    private javax.swing.JTextField txtField3;
    private javax.swing.JTextField txtField4;
    private javax.swing.JTextField txtField5;
    private javax.swing.JTextField txtField6;
    private javax.swing.JTextField txtField7;
    private javax.swing.JTextField txtField8;
    private javax.swing.JTextField txtFieldId;
    // End of variables declaration//GEN-END:variables
}
