package net.chunxie.pgsqldataimpl;

import org.openide.util.NbPreferences;

import javax.swing.JPanel;
import java.util.prefs.Preferences;

/**
 * @author chun.xie
 * @todo Write some documentation!
 * @created 08/02/13 14:10
 */
public final class DataSourceConfigurationPanel extends JPanel {

    private final DataSourceConfigurationOptionsPanelController controller;
    private Preferences pref = NbPreferences.forModule(DataSourceConfigurationPanel.class);

    DataSourceConfigurationPanel(DataSourceConfigurationOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        driverLabel = new javax.swing.JLabel();
        urlLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        pwdLabel = new javax.swing.JLabel();
        driverTextField = new javax.swing.JTextField();
        urlTextField = new javax.swing.JTextField();
        userNameTextField = new javax.swing.JTextField();
        pwdTextField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        forumLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        messageContentLabel = new javax.swing.JLabel();
        messagePointLabel = new javax.swing.JLabel();
        pointLabel = new javax.swing.JLabel();
        replyLabel = new javax.swing.JLabel();
        threadLabel = new javax.swing.JLabel();
        forumTextField = new javax.swing.JTextField();
        messageTextField = new javax.swing.JTextField();
        messageContentTextField = new javax.swing.JTextField();
        messagePointTextField = new javax.swing.JTextField();
        pointTextField = new javax.swing.JTextField();
        replyTextField = new javax.swing.JTextField();
        threadTextField = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.jPanel1.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(driverLabel, org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.driverLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(urlLabel, org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.urlLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(userNameLabel, org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.userNameLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(pwdLabel, org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.pwdLabel.text")); // NOI18N

        driverTextField.setText(org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.driverTextField.text")); // NOI18N

        urlTextField.setText(org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.urlTextField.text")); // NOI18N

        userNameTextField.setText(org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.userNameTextField.text")); // NOI18N

        pwdTextField.setText(org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.pwdTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(resetButton, org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.resetButton.text")); // NOI18N
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(forumLabel, org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.forumLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(messageLabel, org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.messageLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(messageContentLabel, org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.messageContentLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(messagePointLabel, org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.messagePointLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(pointLabel, org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.pointLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(replyLabel, org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.replyLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(threadLabel, org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.threadLabel.text")); // NOI18N

        forumTextField.setText(org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.forumTextField.text")); // NOI18N

        messageTextField.setText(org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.messageTextField.text")); // NOI18N

        messageContentTextField.setText(org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.messageContentTextField.text")); // NOI18N

        messagePointTextField.setText(org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.messagePointTextField.text")); // NOI18N

        pointTextField.setText(org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.pointTextField.text")); // NOI18N

        replyTextField.setText(org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.replyTextField.text")); // NOI18N

        threadTextField.setText(org.openide.util.NbBundle.getMessage(DataSourceConfigurationPanel.class, "DataSourceConfigurationPanel.threadTextField.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(driverLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(driverTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(urlLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(urlTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(userNameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(userNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(pwdLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pwdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(forumLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(forumTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(messageLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(messageTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(messageContentLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(messageContentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(messagePointLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(messagePointTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(pointLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pointTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(replyLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(replyTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(threadLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(threadTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                        .addComponent(resetButton))
                                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {driverLabel, forumLabel, messageContentLabel, messageLabel, messagePointLabel, pointLabel, pwdLabel, replyLabel, threadLabel, urlLabel, userNameLabel});

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(driverLabel)
                                        .addComponent(driverTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(urlLabel)
                                        .addComponent(urlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(userNameLabel)
                                        .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pwdLabel)
                                        .addComponent(pwdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(forumLabel)
                                        .addComponent(forumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(messageLabel)
                                        .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(messageContentLabel)
                                        .addComponent(messageContentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(messagePointLabel)
                                        .addComponent(messagePointTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pointLabel)
                                        .addComponent(pointTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(replyLabel)
                                        .addComponent(replyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(threadLabel)
                                        .addComponent(threadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(resetButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        driverTextField.setText("org.postgresql.Driver");
        urlTextField.setText("jdbc:postgresql://localhost:5432/riskvis");
        userNameTextField.setText("postgres");
        pwdTextField.setText("postgres");

        forumTextField.setText("forums");
        messageTextField.setText("messages");
        messageContentTextField.setText("messagecontent");
        messagePointTextField.setText("message_points");
        pointTextField.setText("points");
        replyTextField.setText("replies");
        threadTextField.setText("threads");
    }

    void load() {
        driverTextField.setText(pref.get("driver", ""));
        urlTextField.setText(pref.get("dburl", ""));
        userNameTextField.setText(pref.get("username", ""));
        pwdTextField.setText(pref.get("password", ""));

        forumTextField.setText(pref.get("forum", ""));
        messageTextField.setText(pref.get("message", ""));
        messageContentTextField.setText(pref.get("messagecontent", ""));
        messagePointTextField.setText(pref.get("messagepoint", ""));
        pointTextField.setText(pref.get("point", ""));
        replyTextField.setText(pref.get("reply", ""));
        threadTextField.setText(pref.get("thread", ""));
    }

    void store() {
        pref.put("driver", driverTextField.getText());
        pref.put("dburl", urlTextField.getText());
        pref.put("username", userNameTextField.getText());
        pref.put("password", pwdTextField.getText());

        pref.put("forum", forumTextField.getText());
        pref.put("message", messageTextField.getText());
        pref.put("messagecontent", messageContentTextField.getText());
        pref.put("messagepoint", messagePointTextField.getText());
        pref.put("point", pointTextField.getText());
        pref.put("reply", replyTextField.getText());
        pref.put("thread", threadTextField.getText());
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel driverLabel;
    private javax.swing.JTextField driverTextField;
    private javax.swing.JLabel forumLabel;
    private javax.swing.JTextField forumTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel messageContentLabel;
    private javax.swing.JTextField messageContentTextField;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel messagePointLabel;
    private javax.swing.JTextField messagePointTextField;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JLabel pointLabel;
    private javax.swing.JTextField pointTextField;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JTextField pwdTextField;
    private javax.swing.JLabel replyLabel;
    private javax.swing.JTextField replyTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel threadLabel;
    private javax.swing.JTextField threadTextField;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JTextField urlTextField;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration
}
