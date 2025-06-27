import java.sql.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/Gcash";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private static boolean isValidEmail(String email) {
        return Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$", email);
    }

    private static boolean isValidNumber(String number) {
        return Pattern.matches("^09\\d{9}$", number);
    }

    private static boolean isValidPin(String pin) {
        return pin.length() == 4 && pin.matches("\\d+");
    }

    // Register user with alphanumeric ID
    public static void registerUser(String id, String name, String email, String number, String pin) {
        if (id.isEmpty() || name.isEmpty() || email.isEmpty() || number.isEmpty() || pin.isEmpty()) {
            System.out.println("❌ All fields are required.");
            return;
        }

        if (!isValidEmail(email)) {
            System.out.println("❌ Invalid email format.");
            return;
        }

        if (!isValidNumber(number)) {
            System.out.println("❌ Invalid mobile number. Must start with 09 and be 11 digits.");
            return;
        }

        if (!isValidPin(pin)) {
            System.out.println("❌ PIN must be 4 digits.");
            return;
        }

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String checkSql = "SELECT * FROM userauthencation WHERE ID = ? OR Email = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setString(1, id);
            checkStmt.setString(2, email);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                System.out.println("⚠️ A user with the same ID or Email already exists.");
                return;
            }

            String sql = "INSERT INTO userauthencation (ID, Name, Email, Number, PIN) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);
            stmt.setString(2, name);
            stmt.setString(3, email);
            stmt.setString(4, number);
            stmt.setString(5, pin);
            stmt.executeUpdate();
            System.out.println("✅ Registration successful!");

        } catch (SQLException e) {
            System.out.println("❌ Database error during registration: " + e.getMessage());
        }
    }

    // Login with alphanumeric ID
    public static String loginUser(String id, String pin) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String sql = "SELECT ID FROM userauthencation WHERE ID = ? AND PIN = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);
            stmt.setString(2, pin);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("✅ Login successful. Welcome user ID: " + id);
                return id;
            } else {
                System.out.println("❌ Login failed. Invalid ID or PIN.");
                return null;
            }
        } catch (SQLException e) {
            System.out.println("❌ Database error during login: " + e.getMessage());
            return null;
        }
    }

    public static void changePin(String userId, String newPin) {
        if (!isValidPin(newPin)) {
            System.out.println("❌ New PIN must be 4 digits.");
            return;
        }

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String sql = "UPDATE userauthencation SET PIN = ? WHERE ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, newPin);
            stmt.setString(2, userId);
            stmt.executeUpdate();
            System.out.println("✅ PIN updated successfully.");
        } catch (SQLException e) {
            System.out.println("❌ Error updating PIN: " + e.getMessage());
        }
    }

    public static void logout(String userId) {
        System.out.println("🔒 User with ID " + userId + " has logged out.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- GCashApp Menu ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter ID (letters and/or numbers): ");
                String id = scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                System.out.print("Enter Mobile Number: ");
                String number = scanner.nextLine();
                System.out.print("Enter 4-digit PIN: ");
                String pin = scanner.nextLine();

                registerUser(id, name, email, number, pin);

            } else if (choice == 2) {
                System.out.print("Enter your ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter PIN: ");
                String pin = scanner.nextLine();

                String userId = loginUser(id, pin);
                if (userId != null) {
                    boolean loggedIn = true;
                    while (loggedIn) {
                        System.out.println("\n--- Logged In Menu ---");
                        System.out.println("1. Change PIN");
                        System.out.println("2. Logout");
                        System.out.print("Choose option: ");
                        int subChoice = scanner.nextInt();
                        scanner.nextLine();

                        if (subChoice == 1) {
                            System.out.print("Enter new 4-digit PIN: ");
                            String newPin = scanner.nextLine();
                            changePin(userId, newPin);
                        } else if (subChoice == 2) {
                            logout(userId);
                            loggedIn = false;
                        } else {
                            System.out.println("❌ Invalid option. Try again.");
                        }
                    }
                }

            } else if (choice == 3) {
                System.out.println("👋 Exiting app. Goodbye!");
                break;
            } else {
                System.out.println("❌ Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
