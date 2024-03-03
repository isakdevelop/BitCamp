package Controller;

import Model.Customer_Information;
import Model.ExchangeRateInformation;
import View.AddUserInformation;
import View.BalanceInquiry;
import View.InformationInquiry;
import View.UpdateUserInformation;

public class Controller {
    private Customer_Information customerInformation;
    private ExchangeRateInformation exchangeRateInformation;

    public Controller(Customer_Information customerInformation) {
        this.customerInformation = customerInformation;
    }

    public void getRequestBalanceInquiry(int krBalance, int jpBalance, int cnBalance, int usaBalance, int euBalance)    {

    }
    public int[] requestAllBalances() {
        return customerInformation.getAllBalances();
    }
    public void updateName(String updateName)   {
        customerInformation.setName(updateName);
    }

    public void updateId(String update1Id)   {
        customerInformation.setId(updateId);
    }

    public void updatePassword(String updatePassword)    {
        customerInformation.setPassword(updatePassword);
    }

    public void updatePhone(String updatePhone) {
        customerInformation.setPhone(updatePhone);
    }

    public void updateAddress(String updateAddress) {
        customerInformation.setAddress(updateAddress);
    }

    public void requestUpdateUserInformation() {
        new UpdateUserInformation(this);
    }

    public void requestAddUserInformation() {
        new AddUserInformation(this);
    }

    public void requestInformationInquiry() {
        new InformationInquiry(this);

        if (customerInformation.getName() == null)  {
            requestAddUserInformation();
            return;
        }
        //ii.InformationInquiryResult(ci.getName(), ci.getId(), ci.getPassword(), ci.getPhone(), ci.getAddress());
    }

    public int requestKrBalance()   {
        return customerInformation.getKr_balance();
    }

    public int requestJpBalance()   {
        return customerInformation.getJp_balance();
    }

    public int requestCnBalance()   {
        return customerInformation.getCn_balance();
    }

    public int requestUsaBalance()  {
        return customerInformation.getUsa_balance();
    }

    public int requestEuBalance()   {
        return customerInformation.getEu_balance();
    }

    public void requestBalanceInquiry() {
        new BalanceInquiry(this);

        if (customerInformation.getName() == null)  {
            requestAddUserInformation();
            return;
        }


    }
}
