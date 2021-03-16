public class Person {

    private String fName, lName, stuId, stuStatus;

    public Person(String fName, String lName, String stuId, String stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getStuId() {
        return stuId;
    }

    public String getStuStatus() {
        return stuStatus;
    }

}
