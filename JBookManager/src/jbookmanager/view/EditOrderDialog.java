/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EditOrderDialog.java
 *
 * Created on 02.03.2009, 15:43:08
 */
package jbookmanager.view;

import java.util.ResourceBundle;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import jbookmanager.model.LibraryManager;
import jbookmanager.controller.StaticTableModel;
import jbookmanager.model.Order;

/**
 *
 * @author uli
 */
public class EditOrderDialog extends javax.swing.JDialog
{

    /**
     * Creates new form EditOrderDialog
     * @param parent
     * @param modal 
     */
    public EditOrderDialog(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        //Init the book title list
        updateBookTitleList();
    }

    public EditOrderDialog(java.awt.Frame parent, boolean modal, Order order)
    {
        super(parent, modal);
        this.assocOrder = order;
        initComponents();
        //Init the fields
        nameField.setText(assocOrder.getName());
        //Init the tables
        updateBookTitleList();
        updateSuborderTable();
    }

    public void updateBookTitleList()
    {
        ((DefaultListModel) bookTitleList.getModel()).removeAllElements();
        for (String s : LibraryManager.library.getTitles())
        {
            ((DefaultListModel) bookTitleList.getModel()).addElement(s);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        bookTitleScrollPane = new javax.swing.JScrollPane();
        bookTitleList = new javax.swing.JList();
        suborderScrollPane = new javax.swing.JScrollPane();
        suborderTable = new javax.swing.JTable();
        countLabel = new javax.swing.JLabel();
        countSpinner = new jbookmanager.view.NumberSpinner();
        addButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        sumLabel = new javax.swing.JLabel();
        sumField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle( i18n.getString("EditOrderDialog.title")); // NOI18N

        nameLabel.setText( i18n.getString("EditOrderDialog.nameLabel.text")); // NOI18N

        bookTitleList.setModel(new DefaultListModel());
        bookTitleScrollPane.setViewportView(bookTitleList);

        suborderTable.setModel(new StaticTableModel());
        suborderScrollPane.setViewportView(suborderTable);

        countLabel.setText( i18n.getString("EditOrderDialog.countLabel.text")); // NOI18N

        addButton.setText( i18n.getString("EditOrderDialog.addButton.text")); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        modifyButton.setText( i18n.getString("EditOrderDialog.modifyButton.text")); // NOI18N
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        deleteButton.setText( i18n.getString("EditOrderDialog.deleteButton.text")); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        okButton.setText( i18n.getString("EditOrderDialog.okButton.text")); // NOI18N
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        sumLabel.setText( i18n.getString("EditOrderDialog.sumLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookTitleScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(countLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(countSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(okButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sumField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(suborderScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countLabel)
                            .addComponent(countSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(modifyButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sumLabel)
                            .addComponent(sumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(okButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(suborderScrollPane, 0, 0, Short.MAX_VALUE)
                            .addComponent(bookTitleScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addButtonActionPerformed
    {//GEN-HEADEREND:event_addButtonActionPerformed
        String bookTitle = (String) bookTitleList.getSelectedValue();
        int count = countSpinner.getIntValue();
        getAssocOrder().addAtomicOrder(LibraryManager.library.getBookByTitle(bookTitle).getIsbn(), count);
        updateSuborderTable();
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateSuborderTable()
    {
        ((DefaultTableModel) suborderTable.getModel()).setDataVector(getAssocOrder().getDataVector(), columnNames);
        //If the suborder table has changed, the price may also have changed, so update the sum field
        updateSum();
    }

    /**
     * This is called when the order has changed
     * (in particular in updateSuborderTable())
     * It updates the sum field
     */
    private void updateSum()
    {
        sumField.setText(LibraryManager.currencyFormat.format(assocOrder.getPriceSum()));
    }

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_modifyButtonActionPerformed
    {//GEN-HEADEREND:event_modifyButtonActionPerformed
        int index = suborderTable.getSelectedRow();
        int count = countSpinner.getIntValue();
        assocOrder.setOrderCount(index, count);
        updateSuborderTable();
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deleteButtonActionPerformed
    {//GEN-HEADEREND:event_deleteButtonActionPerformed
        int row = suborderTable.getSelectedRow();
        getAssocOrder().deleteOrder(row);
        updateSuborderTable();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_okButtonActionPerformed
    {//GEN-HEADEREND:event_okButtonActionPerformed
        //Set the name of the order
        assocOrder.setName(nameField.getText());
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed
    private Order assocOrder = new Order();
    private ResourceBundle i18n = ResourceBundle.getBundle("jbookmanager/view/Bundle");
    private static final String[] columnNames =
    {
        "Book", "Count", "Sum"
    };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JList bookTitleList;
    private javax.swing.JScrollPane bookTitleScrollPane;
    private javax.swing.JLabel countLabel;
    private jbookmanager.view.NumberSpinner countSpinner;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JScrollPane suborderScrollPane;
    private javax.swing.JTable suborderTable;
    private javax.swing.JTextField sumField;
    private javax.swing.JLabel sumLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the assocOrder
     */
    public Order getAssocOrder()
    {
        return assocOrder;
    }

    /**
     * @param assocOrder the assocOrder to set
     */
    public void setAssocOrder(Order assocOrder)
    {
        this.assocOrder = assocOrder;
    }
}
