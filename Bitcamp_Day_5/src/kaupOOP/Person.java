package kaupOOP;

public class Person {
    private String name;
    private double height;
    private double weight;
    private double bmi;
    private String bodyMass;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getHeight()   {
        return this.height;
    }

    public double getWeight()   {
        return this.weight;
    }

    public double getBmi()  {
        return this.bmi;
    }

    public String getBodyMass() {
        return this.bodyMass;
    }

    public void createBmi() {
        this.bmi = this.weight / ((this.height / 100) * (this.height / 100));
    }

    public void createBodyMass()    {
        String bodyMass = "";

        if (this.bmi < 18.5) {
            bodyMass = "저체중";
        }

        if (this.bmi > 18.5 && this.bmi < 23) {
            bodyMass = "정상";
        }

        if (this.bmi > 23 && this.bmi < 25)   {
            bodyMass = "과체중";
        }

        if (this.bmi > 25)   {
            bodyMass = "비만";
        }

        this.bodyMass = bodyMass;
    }

    public void createRandomHeight()    {
        this.height = Math.floor(((150 + Math.random() * 50) * 10) / 10);
    }

    public void createRandomWeight()  {
        this.weight = Math.floor(((30 + Math.random() * 70) * 10) / 10);
    }
}
