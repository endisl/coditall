package ood.behavior.med.ex2;

public class SignUpDialogBox {
    private TextBox usernameTextBox = new TextBox();
    private TextBox passwordTextBox = new TextBox();
    private CheckBox agreeCheckBox = new CheckBox();
    private Button signUpButton = new Button();

    public SignUpDialogBox() {
        //method reference
        usernameTextBox.addEventHandler(this::controlChanged);
        passwordTextBox.addEventHandler(this::controlChanged);
        agreeCheckBox.addEventHandler(this::controlChanged);

        //lambda
        //agreeCheckBox.addEventHandler(() -> controlChanged());

        //inner class
       /* agreeCheckBox.addEventHandler(new EventHandler() {
            @Override
            public void handle() {
                controlChanged();
            }
        });*/
    }

    private void controlChanged() {
        signUpButton.setEnabled(isFormValid());
    }

    public void simulateUserInteraction() {
        usernameTextBox.setContent("John");
        System.out.println("Sign Up: " + signUpButton.isEnabled());
        passwordTextBox.setContent("Doe");
        System.out.println("Sign Up: " + signUpButton.isEnabled());
        agreeCheckBox.setChecked(true);
        System.out.println("Username: " + usernameTextBox.getContent());
        System.out.println("Password: " + passwordTextBox.getContent());
        System.out.println("Agree terms: " + agreeCheckBox.isChecked());
        System.out.println("Sign Up: " + signUpButton.isEnabled());
        //System.out.println(agreeCheckBox.eventHandlers.size());
    }

    private boolean isFormValid() {
        return !usernameTextBox.isEmpty() && !passwordTextBox.isEmpty() && agreeCheckBox.isChecked();
    }
}
