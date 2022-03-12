package com.itRegistration;

public class Db {

    // Создаём соединение с БД
//    private Connection connect() {
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(
//                    Identification.URL.getValue(),
//                    Identification.USER.getValue(),
//                    Identification.PASSWORD.getValue());
//            System.out.println("Connected");
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return conn;
//    }

    // Получаем всю информацию из нашей БД и заносим в лист
//    public List<Account> getRegistrationAccounts() {
//        List<Account> accounts = new ArrayList<>();
//        try (Connection conn = connect();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(Queries.SELECT_ALL.getValue())) {
//            int i = 0;
//            while (rs.next()) {
//                Account account = new Account(
//                        rs.getString("login"),
//                        rs.getString("password"),
//                        rs.getString("email"),
//                        rs.getString("phone")
//                );
//                accounts.add(account);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return accounts;
//    }

    // Добавляем новый аккаунт в БД
//    public void addAccount(Account account) {
//        try (
////                Connection conn = connect();
////                PreparedStatement preparedStatement = conn.prepareStatement("SELECT *");
//        ) {
//            preparedStatement.setString(1, account.getLogin());
//            preparedStatement.setString(2, account.getPassword());
//            preparedStatement.setString(3, account.getEmail());
//            preparedStatement.setString(4, account.getPhone());
//            int countOfAdded = preparedStatement.executeUpdate();
//            // сколько строчек в таблице было затронуто
//            if (countOfAdded > 0) System.out.println("Success");
//            else System.out.println("Error countOfAdded > 0");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

}
//
//
//    public void getAccountRegistration() {
//
//    }
//}
