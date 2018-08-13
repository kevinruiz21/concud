package Challenge;

public class Client extends People {

    private bankOperation operation;
    public Client(int id, String name, boolean status, bankOperation operation) {
        super(id, name, status);
        this.operation = operation;
    }

    public bankOperation getOperation() {
        return operation;
    }

    public void setOperation(bankOperation operation) {
        this.operation = operation;
    }
}
