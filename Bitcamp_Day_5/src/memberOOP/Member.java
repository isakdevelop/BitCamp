package memberOOP;

public class Member {
    private String userName;
    private String password;
    private String rePassword;
    private String name;
    private String socialSecurityNumber;
    private String tell;
    private String address;
    private String job;

    public Member(String userName, String password, String rePassword, String name,
                  String socialSecurityNumber,
                  String tell, String address, String job)  {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.rePassword = rePassword;
        this.socialSecurityNumber = socialSecurityNumber;
        this.tell = tell;
        this.address = address;
        this.job = job;
    }

    public void setUserName(String userName)    {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setPassword(String password)    {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setRePassword(String rePassword)    {
        this.rePassword = rePassword;
    }

    public String getRePassword()   {
        return this.rePassword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber

    ) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public void setTell(String tell)    {
        this.tell = tell;
    }

    public String getTell() {
        return this.tell;
    }

    public void setAddress(String address)  {
        this.address = address;
    }

    public String getAddress()  {
        return this.address;
    }

    public void setJob(String job)  {
        this.job = job;
    }

    public String getJob()  {
        return this.job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", rePassword='" + rePassword + '\'' +
                ", name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", tell='" + tell + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
