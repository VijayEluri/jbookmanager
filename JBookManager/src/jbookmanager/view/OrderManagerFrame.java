/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OrderManagerFrame.java
 *
 * Created on 02.03.2009, 15:05:50
 */
package jbookmanager.view;

import java.util.ResourceBundle;
import jbookmanager.controller.LibraryManager;
import jbookmanager.controller.StaticTableModel;
import jbookmanager.controller.OrderManager;
import jbookmanager.model.Order;

/**
 *
 * @author uli
 */
public class OrderManagerFrame extends javax.swing.JFrame
{

    /** Creates new form OrderManagerFrame */
    public OrderManagerFrame()
    {
        initComponents();

        updateData(LibraryManager.library.getOrderManager());
    }

    public void updateData(OrderManager manager)
    {
        ((StaticTableModel) orderViewTable.getModel()).setDataVector(manager.getOrders(), tableColumnNames);
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newOrderButton = new javax.swing.JButton();
        deleteOrderButton = new javax.swing.JButton();
        orderViewScrollPane = new javax.swing.JScrollPane();
        orderViewTable = new javax.swing.JTable();
        editOrderButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle( i18n.getString("OrderManagerFrame.title")); // NOI18N

        newOrderButton.setText( i18n.getString("OrderManagerFrame.newOrderButton.text")); // NOI18N
        newOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderButtonActionPerformed(evt);
            }
        });

        deleteOrderButton.setText( i18n.getString("OrderManagerFrame.deleteOrderButton.text")); // NOI18N
        deleteOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrderButtonActionPerformed(evt);
            }
        });

        orderViewTable.setModel(new StaticTableModel());
        orderViewScrollPane.setViewportView(orderViewTable);

        editOrderButton.setText( i18n.getString("OrderManagerFrame.editOrderButton.text")); // NOI18N
        editOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderViewScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newOrderButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteOrderButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editOrderButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newOrderButton)
                    .addComponent(deleteOrderButton)
                    .addComponent(editOrderButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderViewScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteOrderButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deleteOrderButtonActionPerformed
    {//GEN-HEADEREND:event_deleteOrderButtonActionPerformed
        int index = orderViewTable.getSelectedRow();
        LibraryManager.library.getOrderManager().removeOrder(index);
    }//GEN-LAST:event_deleteOrderButtonActionPerformed

    private void newOrderButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newOrderButtonActionPerformed
    {//GEN-HEADEREND:event_newOrderButtonActionPerformed
        EditOrderDialog dialog = new EditOrderDialog(this, true);
        dialog.setVisible(true);
        LibraryManager.library.getOrderManager().addOrder(dialog.getAssocOrder());
    }//GEN-LAST:event_newOrderButtonActionPerformed

    private void editOrderButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_editOrderButtonActionPerformed
    {//GEN-HEADEREND:event_editOrderButtonActionPerformed
        int index = orderViewTable.getSelectedRow();
        Order order = LibraryManager.library.getOrderManager().getOrderAt(index);
        EditOrderDialog dialog = new EditOrderDialog(this, true, order);
        dialog.setVisible(true);
        LibraryManager.library.getOrderManager().setOrderAt(dialog.getAssocOrder(), index);
    }//GEN-LAST:event_editOrderButtonActionPerformed
    private static final String[] tableColumnNames =
    {
        "Name", "Sum"
    };
    private ResourceBundle i18n = ResourceBundle.getBundle("jbookmanager/view/Bundle");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteOrderButton;
    private javax.swing.JButton editOrderButton;
    private javax.swing.JButton newOrderButton;
    private javax.swing.JScrollPane orderViewScrollPane;
    private javax.swing.JTable orderViewTable;
    // End of variables declaration//GEN-END:variables
}