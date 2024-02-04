import java.util.*;

public class Store {
    private List<Client> customerList;

    public Store() {
        customerList = new ArrayList<>();
    }

    // Add a new client
    public void add(Client aClient) {
        customerList.add(aClient);
    }

    // Display all customers in the store
    public void print() {
        System.out.println("Customers in the store:");
        for (Client client : customerList) {
            client.print();
        }
    }

    // Find a client by ID
    public Client find(int ID) {
        for (Client client : customerList) {
            if (client.getID() == ID) {
                return client;
            }
        }
        
        return null;
    }

    
        public static void main(String[] args) {
            Store store = new Store();
            Scanner scanner = new Scanner(System.in);
    
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Add Client");
                System.out.println("2. Find Client");
                System.out.println("3. Display All Customers");
                System.out.println("4. Exit");
                System.out.print("Enter your choice (1-4): ");
    
                int choice = scanner.nextInt();
    
                switch (choice) {
                    case 1:
                        System.out.print("Enter the client name: ");
                        scanner.nextLine(); 
                        String clientName = scanner.nextLine();
                        Client newClient = new Client(clientName);
                        store.add(newClient);
                        System.out.println("Client added successfully.");
                        break;
                    case 2:
                        System.out.print("Enter the client ID to find: ");
                        int searchID = scanner.nextInt();
                        Client foundClient = store.find(searchID);
                        if (foundClient != null) {
                            System.out.println("Client found:");
                            foundClient.print();
                        } else {
                            System.out.println("No client found with ID " + searchID);
                        }
                        break;
                    case 3:
                        store.print();
                        break;
                    case 4:
                        System.out.println("Exiting the program.");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a valid option (1-4).");
                }
            }
        }
    
}
