package Challenge;

import java.util.ArrayList;

public class Dispatcher {
    private ArrayList<Cashier> cashiers;
    private ArrayList<Supervisor> supervisors;
    private ArrayList<Director> directors;
    private ArrayList<Client> clients;

    public Dispatcher(ArrayList<Cashier> cashiers, ArrayList<Supervisor> supervisors, ArrayList<Director> directors, ArrayList<Client> clients) {
        this.cashiers = cashiers;
        this.supervisors = supervisors;
        this.directors = directors;
        this.clients = clients;
    }


    public ArrayList<Cashier> getCashiers() {
        return cashiers;
    }

    public void setCashiers(ArrayList<Cashier> cashiers) {
        this.cashiers = cashiers;
    }

    public ArrayList<Supervisor> getSupervisors() {
        return supervisors;
    }

    public void setSupervisors(ArrayList<Supervisor> supervisors) {
        this.supervisors = supervisors;
    }

    public ArrayList<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(ArrayList<Director> directors) {
        this.directors = directors;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public void attend(){

    }
}
