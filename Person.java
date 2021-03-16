public class Person {
//    Langkah 1 : Bikin Variabel yang diperlukan

    private String fName, lName, stuId, stuStatus;

//    Langkah 2 : Bikin constructor (Alt + insert)

    public Person(String fName, String lName, String stuId, String stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }

//    Langkah 3 : bikin Getter (alt + Insert)
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
