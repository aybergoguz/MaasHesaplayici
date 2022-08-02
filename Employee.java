public class Employee{

    String name ;
    int salary;
    int workHours;
    int hierYear;

    Employee(String name,int salary,int workHours,int hierYear ){

        this.name =name;
        this.salary=salary;
        this.workHours= workHours;
        this.hierYear=hierYear;
    }

    double tax(){

        double tax =0;
        if(this.salary>=1000){
            tax=salary * 0.03;
        }
        return tax;
    }

    double bonus(){

        double bonus=0;
        if(workHours>40){
            bonus=(workHours-40) * 30;
        }
        return bonus;
    }

    double raiseSalary(){

        double raiseSalary=0;
        if((2021-hierYear)>19){
            raiseSalary=salary * 0.15;
        }
        else if((2021-hierYear)>9 && (2021-hierYear)<20){
            raiseSalary=salary * 0.1;
        }
        else {
            raiseSalary=salary * 0.5 ;
        }
        return raiseSalary;
        
    }

    double netMaas(){
        double netMaas= salary + raiseSalary() + bonus() - tax();
        return netMaas;
    }

    public void toPrint(){

        System.out.println("Adi\t:"+this.name);
        System.out.println("Maasi\t:"+this.salary);
        System.out.println("Çalışma Saati\t:"+this.workHours);
        System.out.println("Başlangıç yılı\t:"+this.hierYear);
        System.out.println("Vergi\t:"+this.tax());
        System.out.println("Bonus\t:"+this.bonus());
        System.out.println("Maaş Artışı\t:"+this.raiseSalary());
        System.out.println("Net Maas\t:"+this.netMaas());
        
    }





}