class Student {
    private String motto;
    private String name;
    private String section;

    public Student(String motto, String name, String section) {
        this.motto = motto;
        this.name = name;
        this.section = section;
    }
    public String getMotto() {
        return motto;
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public static void main(String[] args) {
        Student student = new Student("I'm not here to be perfect, I'm here to be real.", "Evarine B. Rayon", "IT24C");

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Section: " + student.getSection());
        System.out.println("Motto: " + student.getMotto());
    }
}