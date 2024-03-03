import Controller.Controller;
import Model.Customer_Information;
import Model.ExchangeRateInformation;
import View.MainForm;

public class Currency_Exchange_System {
    public static void main(String[] args) {
        Customer_Information customerInfo = new Customer_Information();
        ExchangeRateInformation exchangeRateInformation = new ExchangeRateInformation();
        Controller controller = new Controller(customerInfo);
        MainForm mainForm = new MainForm(controller);
    }
}
