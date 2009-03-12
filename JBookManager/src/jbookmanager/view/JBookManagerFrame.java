/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JBookManagerFrame.java
 *
 * Created on 26.02.2009, 19:37:49
 */
package jbookmanager.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import jbookmanager.model.JBookManagerConfiguration;
import jbookmanager.model.Library;
import jbookmanager.controller.LibraryManager;
import jbookmanager.controller.LibraryTableModel;

/**
 *
 * @author uli
 */
public class JBookManagerFrame extends javax.swing.JFrame
{

    /** Creates new form JBookManagerFrame */
    public JBookManagerFrame()
    {
        initComponents();
        bookViewTable.setLibrary(library);

        fc.setFileFilter(new FileFilter()
        {

            @Override
            public boolean accept(File f)
            {
                try
                {
                    if (f.isDirectory())
                    {
                        return true;
                    }
                    return f.getCanonicalPath().endsWith(".lgz");
                }
                catch (IOException ex)
                {
                    Logger.getLogger(JBookManagerFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                return false; //File is not accessible so don't accept it
            }

            @Override
            public String getDescription()
            {
                return "Library data files";
            }
        });

        initLibrary();
    }

    private void initLibrary()
    {
        try
        {
            String libraryFilename = config.getProperty("LibraryFile");
            if ((!libraryFilename.isEmpty()) && (new File(libraryFilename).exists()))
            {
                library = LibraryManager.readLibrary(libraryFilename);
            }
            else //Create a new library
            {
                library = new Library();
            }
        }
        catch (IOException ex)
        {
            Logger.getLogger(JBookManagerFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        bookViewTable = new jbookmanager.view.BookViewTable();
        newBookButton = new javax.swing.JButton();
        filterLabel = new javax.swing.JLabel();
        filterColumnComboBox = new javax.swing.JComboBox();
        filterTypeComboBox = new javax.swing.JComboBox();
        filterStringField = new javax.swing.JTextField();
        filterOkButton = new javax.swing.JButton();
        filterDeleteButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newLibraryMenuItem = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();
        saveLibraryMenuItem = new javax.swing.JMenuItem();
        saveCopyMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle( i18n.getString("JBookManagerFrame.title")); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bookViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(bookViewTable);

        newBookButton.setText( i18n.getString("JBookManagerFrame.newBookButton.text")); // NOI18N
        newBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBookButtonActionPerformed(evt);
            }
        });

        filterLabel.setText( i18n.getString("JBookManagerFrame.filterLabel.text")); // NOI18N

        filterColumnComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ISBN", "Title", "Price", "Count", "Comment" }));

        filterTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Contains", "Is", "Regex" }));
        filterTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterTypeComboBoxActionPerformed(evt);
            }
        });

        filterOkButton.setText( i18n.getString("JBookManagerFrame.filterOkButton.text")); // NOI18N
        filterOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterOkButtonActionPerformed(evt);
            }
        });

        filterDeleteButton.setText( i18n.getString("JBookManagerFrame.filterDeleteButton.text")); // NOI18N
        filterDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterDeleteButtonActionPerformed(evt);
            }
        });

        fileMenu.setText( i18n.getString("JBookManagerFrame.fileMenu.text")); // NOI18N
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

        newLibraryMenuItem.setText( i18n.getString("JBookManagerFrame.newLibraryMenuItem.text")); // NOI18N
        newLibraryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLibraryMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(newLibraryMenuItem);

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem.setText( i18n.getString("JBookManagerFrame.openMenuItem.text")); // NOI18N
        fileMenu.add(openMenuItem);

        saveLibraryMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveLibraryMenuItem.setText( i18n.getString("JBookManagerFrame.saveLibraryMenuItem.text")); // NOI18N
        saveLibraryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveLibraryMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveLibraryMenuItem);

        saveCopyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveCopyMenuItem.setText( i18n.getString("JBookManagerFrame.saveCopyMenuItem.text")); // NOI18N
        saveCopyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCopyMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveCopyMenuItem);

        menuBar.add(fileMenu);

        editMenu.setText( i18n.getString("JBookManagerFrame.editMenu.text")); // NOI18N
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(filterLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterColumnComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterStringField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterColumnComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterStringField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterOkButton)
                    .addComponent(filterLabel)
                    .addComponent(newBookButton)
                    .addComponent(filterDeleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveCopyMenuItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveCopyMenuItemActionPerformed
    {//GEN-HEADEREND:event_saveCopyMenuItemActionPerformed
        fc.setDialogTitle(i18n.getString("Save copy"));
        fc.showSaveDialog(this);
        String filename = fc.getSelectedFile().getAbsolutePath();
        LibraryManager.writeLibrary(library, filename);
    }//GEN-LAST:event_saveCopyMenuItemActionPerformed

    private void saveLibraryMenuItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveLibraryMenuItemActionPerformed
    {//GEN-HEADEREND:event_saveLibraryMenuItemActionPerformed
        LibraryManager.writeLibrary(library, config.getProperty("LibraryFile"));
    }//GEN-LAST:event_saveLibraryMenuItemActionPerformed

    private void newLibraryMenuItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newLibraryMenuItemActionPerformed
    {//GEN-HEADEREND:event_newLibraryMenuItemActionPerformed
        int sel = JOptionPane.showConfirmDialog(this,
                                                i18n.getString("Save the current library?"),
                                                "Save current library",
                                                JOptionPane.YES_NO_OPTION,
                                                JOptionPane.QUESTION_MESSAGE);
        //Save the library if the user clicked "Yes"
        if (sel == JOptionPane.YES_OPTION)
        {
            LibraryManager.writeLibrary(library, config.getProperty("LibraryFile"));
        }
        library = new Library();
    }//GEN-LAST:event_newLibraryMenuItemActionPerformed

    private void newBookButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newBookButtonActionPerformed
    {//GEN-HEADEREND:event_newBookButtonActionPerformed
        NewBookDialog newBookDialog = new NewBookDialog(this, true);
        newBookDialog.setLibrary(library);
        newBookDialog.setVisible(true);
        ((LibraryTableModel) bookViewTable.getModel()).update();
    }//GEN-LAST:event_newBookButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        try
        {
            config.save();
        }
        catch (IOException ex)
        {
            Logger.getLogger(JBookManagerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fileMenuActionPerformed
    {//GEN-HEADEREND:event_fileMenuActionPerformed
        try
        {
            fc.showOpenDialog(this);
            library =
                    LibraryManager.readLibrary(fc.getSelectedFile().getAbsolutePath());
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(JBookManagerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fileMenuActionPerformed

    private void filterOkButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_filterOkButtonActionPerformed
    {//GEN-HEADEREND:event_filterOkButtonActionPerformed
        /**
         * Get the parameters
         */
        int column = filterColumnComboBox.getSelectedIndex();
        String pattern = filterStringField.getText();
        int type = filterTypeComboBox.getSelectedIndex();
        /**
         * Call the appropriate filter option depending on the type selection
         */
        if(type == 0) //contains
        {
            bookViewTable.containsFilter(pattern, column);
        }
        else if (type == 1) //Is
        {

        }
        else //if (type == 2) //Regex
        {
            
        }
    }//GEN-LAST:event_filterOkButtonActionPerformed

    private void filterDeleteButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_filterDeleteButtonActionPerformed
    {//GEN-HEADEREND:event_filterDeleteButtonActionPerformed
        bookViewTable.deleteFilter();
    }//GEN-LAST:event_filterDeleteButtonActionPerformed

    private void filterTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_filterTypeComboBoxActionPerformed
    {//GEN-HEADEREND:event_filterTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterTypeComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
                new JBookManagerFrame().setVisible(true);
            }
        });
    }
    public static Library library = new Library();
    private JFileChooser fc = new JFileChooser();
    private JBookManagerConfiguration config = new JBookManagerConfiguration();
    private ResourceBundle i18n = ResourceBundle.getBundle("jbookmanager/view/Bundle");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jbookmanager.view.BookViewTable bookViewTable;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JComboBox filterColumnComboBox;
    private javax.swing.JButton filterDeleteButton;
    private javax.swing.JLabel filterLabel;
    private javax.swing.JButton filterOkButton;
    private javax.swing.JTextField filterStringField;
    private javax.swing.JComboBox filterTypeComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton newBookButton;
    private javax.swing.JMenuItem newLibraryMenuItem;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveCopyMenuItem;
    private javax.swing.JMenuItem saveLibraryMenuItem;
    // End of variables declaration//GEN-END:variables
}
