import javax.swing.*;

class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        int confirm;
        String IName;

        do {
            String NAME = JOptionPane.showInputDialog(null, "Please enter your name:");

            if (NAME == null) {
                JOptionPane.showMessageDialog(null, "No name entered. Exiting program.");
                System.exit(0);
            }

            IName = NAME;

            confirm = JOptionPane.showConfirmDialog(
                null,
                "Do you want your name to be displayed?",
                "Confirm",
                JOptionPane.YES_NO_CANCEL_OPTION
            );

            if (confirm == JOptionPane.CANCEL_OPTION || confirm == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Operation cancelled. Exiting program.");
                System.exit(0);
            }

        } while (confirm != JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(
            null,
            "Your name is: " + IName
        );
    }
}
