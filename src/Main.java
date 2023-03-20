public class Main {
    public static void main(String[] args) {
        AccManage application = new AccManage();
        do {
            application.getStart();
            switch (application.option) {
                case 1 -> application.addAccount();
                case 2 -> {
                    System.out.println(" Delete User Account");
                    System.out.print("=> Enter user id to delete : ");
                    Integer deleteId = application.input.nextInt();
                    application.removeUser(deleteId);
                }
                case 3 -> {
                    System.out.println("Edit User information ");
                    System.out.print(" Enter user id to Edit: ");
                    Integer editId = application.input.nextInt();
                    application.editUser(editId);
                }
                case 4 -> application.showAccounts();
                case 5 -> application.exit();
                default -> {
                    application.messageError("The Application is Error!!!");
                    application.getStart();
                }
            }
        }while (application.option != 5);
    }
}
