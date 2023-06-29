import java.time.LocalDate;
import java.time.Year;

public class Maas {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Maas(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int yearsOfWork = Year.now().getValue() - hireYear;

        if (yearsOfWork < 10) {
            return salary * 0.05;
        } else if (yearsOfWork >= 10 && yearsOfWork < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    @Override
    public String toString() {
        double totalSalary = salary + bonus() - tax() + raiseSalary();

        return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax() +
                "\nBonus: " + bonus() +
                "\nMaaş Artışı: " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş: " + (totalSalary - salary) +
                "\nToplam Maaş: " + totalSalary;
    }

    public static void main(String[] args) {
        Maas employee = new Maas("kemal", 2000.0, 45, 1985);
        System.out.println(employee.toString());
    }
}
