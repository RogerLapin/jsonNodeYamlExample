public class Worker {

    Worker(String income, Boolean retired){
        this.income = income;
        this.retired = retired;
    }

    String income;
    Boolean retired;

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public Boolean getRetired() {
        return retired;
    }

    public void setRetired(Boolean retired) {
        this.retired = retired;
    }

}
