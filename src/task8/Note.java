package task8;

public class Note {
    private String studentName;
    private String subjectName;
    private int pagesNumber;
    private int year;
    private String coverColor;
    private String universityName;

    public Note(String studentName, String subjectName, int pagesNumber, int year, String coverColor, String universityName) {
        this.studentName = studentName;
        this.subjectName = subjectName;
        this.pagesNumber = pagesNumber;
        this.year = year;
        this.coverColor = coverColor;
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Note{" +
                "Имя студента: " + studentName +
                ", название предмета: " + subjectName  +
                ", количество страниц: " + pagesNumber +
                ", год: " + year +
                ", цвет обложки: " + coverColor  +
                ", название университета: " + universityName +
                '}';
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public int getYear() {
        return year;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public String getUniversityName() {
        return universityName;
    }

    public static void main(String[] args) {
        Note mainNote = new Note("Кирилл", "QA", 1, 2024, "Black", "DAN.IT");
        System.out.println(mainNote.toString());
    }
}
