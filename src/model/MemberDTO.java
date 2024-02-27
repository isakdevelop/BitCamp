package model;

public class MemberDTO {
    private double height;
    private double weight;
    private String userName;
    private String password;
    private String confirmPassword;
    private String name;
    private String socialSecurityNumber;
    private String tell;
    private String address;
    private String job;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public MemberDTO(String userName, String password, String confirmPassword, String name, String socialSecurityNumber, String tell, String address, String job, double height, double weight) {
        this.userName = userName;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.tell = tell;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "height=" + height +
                ", weight=" + weight +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", tell='" + tell + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
