package chapter8;

public class PasswordValidatorAgain {

    /**1. Define the method signature - Returns true if new password is strong
     *
     * @param newPassword - password user wants to set
     * @param oldPassword - previous password
     * @param username - username (for checking if it is inside the newPassword)
     * @return
     */
    public static boolean isStrongPassword(String newPassword, String oldPassword, String username) {
        //Check length
        if (newPassword.length() < 8) {
            return false;
        }

        // Check for uppercase letter - loops through each character
        boolean hasUppercase = false;
        for (char c : newPassword.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            return false;
        }

        //Check for special characters
        String specialCharacters = "!@#$%^&*()_+=<>?[]|";
        boolean hasSpecial = false;
        for (char c : newPassword.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(c))) {
                hasSpecial = true;
                break;
            }
        }
        if (!hasSpecial) {
            return false;
        }

        //Check if password contains username
        if (newPassword.toLowerCase().contains(username.toLowerCase())) {
            return false;
        }

        //Check if new password is same as old one
        if (newPassword.equals(oldPassword)) {
            return false;
        }
        // If all checks passed, it's a strong password
        return true;
    }

    public static void main(String[] args) {
        //Example usage
        System.out.println(isStrongPassword("Strong@123", "Weak123", "user")); // true
        System.out.println(isStrongPassword("weakpass", "Weak123", "user")); // false
        System.out.println(isStrongPassword("NoSpecial123", "Weak123", "user")); // false
        System.out.println(isStrongPassword("User@Pass", "Weak123", "user")); // false
        System.out.println(isStrongPassword("Strong@123", "Strong@123", "user")); // false

    }
}
