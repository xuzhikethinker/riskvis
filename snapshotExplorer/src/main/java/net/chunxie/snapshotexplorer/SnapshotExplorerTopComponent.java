package net.chunxie.snapshotexplorer;

import net.chunxie.networkdata.api.SnapshotService;
import net.chunxie.networkdata.entity.Snapshot;
import net.chunxie.snapshotexplorer.action.AcquireDataAction;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.explorer.view.BeanTreeView;
import org.openide.util.Lookup;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chun.xie
 * @todo Write some documentation!
 * @created 07/02/13 14:09
 */
@ConvertAsProperties(dtd = "-//net.chunxie.snapshotexplorer//SnapshotExplorer//EN",
        autostore = false)
@TopComponent.Description(preferredID = "SnapshotExplorerTopComponent",
        iconBase = "net/chunxie/snapshotexplorer/snapshot_16.png",
        persistenceType = TopComponent.PERSISTENCE_ONLY_OPENED)
@TopComponent.Registration(mode = "explorer", openAtStartup = false)
@ActionID(category = "Window",
        id = "net.chunxie.snapshotexplorer.SnapshotExplorerTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(displayName = "#CTL_SnapshotExplorerAction",
        preferredID = "SnapshotExplorerTopComponent")
@Messages({
        "CTL_SnapshotExplorerAction=SnapshotExplorer",
        "CTL_SnapshotExplorerTopComponent=Snapshot Explorer",
        "HINT_SnapshotExplorerTopComponent=Snapshot Explorer presents forum threads and messages in a hierarchical structure. It should be noticed that the tree view only displays messages which are awarded some points."
})
public final class SnapshotExplorerTopComponent extends TopComponent implements ExplorerManager.Provider {

    public static Map<String, Snapshot> snapshotMap = new HashMap<String, Snapshot>();
    public SnapshotService service = null;
    public BeanTreeView treeview = new BeanTreeView();
    private ExplorerManager em = new ExplorerManager();

    public SnapshotExplorerTopComponent() {
        initData();
        initComponents();
        setName(Bundle.CTL_SnapshotExplorerTopComponent());
        setToolTipText(Bundle.HINT_SnapshotExplorerTopComponent());
        initTreeview();
        associateLookup(ExplorerUtils.createLookup(em, getActionMap()));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        forumCombo = new javax.swing.JComboBox();
        yearCombo = new javax.swing.JComboBox();
        monthCombo = new javax.swing.JComboBox();
        loadButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        durationCombo = new javax.swing.JComboBox();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(SnapshotExplorerTopComponent.class, "SnapshotExplorerTopComponent.jPanel1.border.title"))); // NOI18N

        yearCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2010", "2009", "2008", "2007", "2006", "2005" }));

        monthCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "Febrary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        loadButton.setFont(new java.awt.Font("Tahoma", 0, 16));
        loadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/chunxie/snapshotexplorer/load_32.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(loadButton, org.openide.util.NbBundle.getMessage(SnapshotExplorerTopComponent.class, "SnapshotExplorerTopComponent.loadButton.text")); // NOI18N
        loadButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        loadButton.setIconTextGap(6);
        loadButton.setMargin(new java.awt.Insets(2, 4, 2, 4));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(SnapshotExplorerTopComponent.class, "SnapshotExplorerTopComponent.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(SnapshotExplorerTopComponent.class, "SnapshotExplorerTopComponent.jLabel2.text")); // NOI18N

        durationCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(forumCombo, 0, 368, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(durationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                                .addComponent(loadButton)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(9, 9, 9)
                                .addComponent(forumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(durationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(loadButton))
                                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.NORTH);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox durationCombo;
    private javax.swing.JComboBox forumCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loadButton;
    private javax.swing.JComboBox monthCombo;
    private javax.swing.JComboBox yearCombo;
    // End of variables declaration//GEN-END:variables

    @Override
    protected void componentOpened() {
        initForumCombo();
    }

    @Override
    protected void componentClosed() {

    }

    public JComboBox getForumCombo() {
        return forumCombo;
    }

    public JButton getLoadButton() {
        return loadButton;
    }

    public JComboBox getMonthCombo() {
        return monthCombo;
    }

    public JComboBox getYearCombo() {
        return yearCombo;
    }

    public JComboBox getDurationCombo() {
        return durationCombo;
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

    @Override
    public ExplorerManager getExplorerManager() {
        return em;
    }

    private void initData() {
        Collection<? extends SnapshotService> allFilters = Lookup.getDefault().lookupAll(SnapshotService.class);
        for (SnapshotService obj : allFilters) {
            service = obj;
        }
    }

    private void initTreeview() {
        treeview.setVisible(false);
        treeview.setRootVisible(false);
        add(treeview, BorderLayout.CENTER);

        loadButton.addActionListener(new AcquireDataAction(this));
    }

    private void initForumCombo() {
        ForumComboBoxModel model = new ForumComboBoxModel(service);
        if (model.getSize() > 0) {
            forumCombo.setModel(model);
            forumCombo.setSelectedIndex(0);
        }
    }
}
