public class Client {
    private int clientId;
    private String clientName;
    private static int count = 0;

    {
        count++;
        clientId = count;
        System.out.println("Initialization block called");
    }

    // Default constructor
    public Client() {
        this.clientName = "empty";
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public Client(String clientName) {
        this.clientName = clientName;
        System.out.println("Parameterized constructor called");
    }

    
    public String getName() {
        return clientName;
    }

    
    public int getID() {
        return clientId;
    }

    // Print method
    public void print() {
        System.out.println("Client ID: " + clientId + ", Client Name: " + clientName);
    }

    
    public static int countClients() {
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Main method called");

        Client client1 = new Client("Alice");
        Client client2 = new Client("Bob");
        Client client3 = new Client();

        
        System.out.println("Client count: " + Client.countClients());

        // Test getName, getID, and print
        System.out.println("Client 1 Name: " + client1.getName());
        System.out.println("Client 2 ID: " + client2.getID());
        client3.print();
    }
}
