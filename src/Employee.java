public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int bonusAmount;
    int yearRaiseAmount;
    int yearWorked;
    double taxAmount;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }
    double tax(){
        if (this.salary <= 1000){
            return salary;
        }else if (this.salary > 1000){
            taxAmount = this.salary *  0.03;
            this.salary -= taxAmount;
            System.out.println("Vergi alındıktan sonraki maaş miktarı => " + salary);
            return salary;

        }
        return salary;
    }

    double bonus(){
        if (workHours >= 40){
           bonusAmount = (workHours-40) * 30;
           salary += bonusAmount;
           System.out.println("Bonuslar ile birlikte maaş miktarı => " + salary + "\n");
        }
        return salary;
    }

    double raiseSalary(){

        yearWorked = 2021 - hireYear;
        if (yearWorked < 10){
            yearRaiseAmount = (int)(this.salary * 0.05);
            salary += yearRaiseAmount;
            System.out.println("Çalışanın maaşı %5 zamlanmıştır. => " + salary + "\n");
        }else if (yearWorked > 9 && yearWorked < 20){
            yearRaiseAmount = (int)(this.salary * 0.10);
            salary += yearRaiseAmount;
            System.out.println("Çalışanın maaşı %10 zamlanmıştır. => " + salary + "\n");
        }else if (yearWorked > 19){
            yearRaiseAmount = (int)(this.salary * 0.15);
            salary += yearRaiseAmount;
            System.out.println("Çalışanın maaşı %15 zamlanmıştır. => " + salary + "\n");

        }
        return salary;
    }

    double totalSalary(){
        System.out.println(this.name + "'in Maaş Bordrosu ===>\n ");
        System.out.println("-----------------------\n");
        tax();
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-\n");
        bonus();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-\n");
        raiseSalary();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-\n");
        System.out.println("Her şey ile birlikte toplam maaş => " + salary + "\n");
        System.out.println("-----------------------");
        toString();
        return salary;
    }

    @Override
    public String toString() {
        System.out.println("Employee ===> " +
                "name = " + name + "\n" +
                "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-" + "\n" +
                " salary = " + salary + "\n" +
                "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-" + "\n" +
                " workHours = " + workHours + "\n"+
                "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-" + "\n" +
                " hireYear = " + hireYear + "\n"+
                "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-" + "\n" +
                " bonusAmount = " + bonusAmount + "\n"+
                "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-" + "\n" +
                " yearRaiseAmount = " + yearRaiseAmount + "\n"+
                "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-" + "\n" +
                " yearWorked = " + yearWorked + "\n"+
                "");
        return name;
    }
}
