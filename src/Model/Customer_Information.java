package Model;

import java.util.List;

public class Customer_Information {
    private String id, name, phone, address, password;
    private int kr_balance = 0;
    private int jp_balance = 0;
    private int cn_balance = 0;
    private int usa_balance = 0;
    private int eu_balance = 0;
    private List<String> transactionHistory;

    public void setId(String id)    {
        this.id = id;
    }

    public void setName(String name)    {
        this.name = name;
    }

    public void setPhone(String phone)    {
        this.phone = phone;
    }

    public void setAddress(String address)    {
        this.address = address;
    }

    public void setPassword(String password)    {
        this.password = password;
    }

    public void set_Kr_Balance(int amount)    {
        this.kr_balance = amount;
    }

    public void set_Jp_Balance(int amount)    {
        this.jp_balance = amount;
    }

    public void set_Cn_Balance(int amount)    {
        this.cn_balance = amount;
    }

    public void set_Usa_Balance(int amount)    {
        this.usa_balance = amount;
    }

    public void set_Eu_Balance(int amount)    {
        this.eu_balance = amount;
    }

    public String getId()  {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPassword() {
        return this.password;
    }

    public int getKr_balance()  {
        return this.kr_balance;
    }

    public int getJp_balance()  {
        return this.jp_balance;
    }

    public int getCn_balance()  {
        return this.cn_balance;
    }

    public int getUsa_balance()  {
        return this.usa_balance;
    }

    public int getEu_balance()  {
        return this.eu_balance;
    }

    public int[] getAllBalances() {
        return new int[]{kr_balance, jp_balance, cn_balance, usa_balance, eu_balance};
    }
}
