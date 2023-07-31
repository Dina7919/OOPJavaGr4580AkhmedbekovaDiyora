package SRP;
public class CalculateNetSalary {
protected int baseSalary;
    public void calculateNetSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
        }
    }
    

