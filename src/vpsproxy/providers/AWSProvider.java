package vpsproxy.providers;

import java.awt.*;
import javax.swing.*;
import vpsproxy.*;

public class AWSProvider implements Provider {
    @Override
    public void startInstance() {
        // implementation for starting a DigitalOcean instance
    }

    @Override
    public void destroyInstance() {
        // implementation for destroying a DigitalOcean instance
    }

    @Override
    public ProxySettings getProxy() {
        // implementation for getting a DigitalOcean proxy
        return new ProxySettings("aws.com", 8080, "user", "password", this);
    }

    @Override
    public JComponent getUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel awsKeyLabel = new JLabel("AWS Key:");
        awsKeyLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JTextField awsKeyTextField = new JTextField();
        awsKeyTextField.setAlignmentX(Component.LEFT_ALIGNMENT);
        awsKeyTextField.setPreferredSize(new Dimension(200, awsKeyTextField.getPreferredSize().height));

        JLabel awsSecretKeyLabel = new JLabel("AWS Secret Key:");
        awsSecretKeyLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JTextField awsSecretKeyTextField = new JTextField();
        awsSecretKeyTextField.setAlignmentX(Component.LEFT_ALIGNMENT);
        awsSecretKeyTextField.setPreferredSize(new Dimension(200, awsSecretKeyTextField.getPreferredSize().height));

        panel.add(awsKeyLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(awsKeyTextField);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(awsSecretKeyLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(awsSecretKeyTextField);

        return panel;
    }
}
