import java.util.Arrays;

class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person() {}

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }
    public String getGender()    { return gender; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName)   { this.lastName = lastName; }
    public void setGender(String gender)       { this.gender = gender; }

    @Override
    public String toString() {
        return "Person [" + firstName + " " + lastName + ", " + gender + "]";
    }

    public boolean equals(Person p) {
        if (p == null) return false;
        return firstName.equalsIgnoreCase(p.firstName) &&
               lastName.equalsIgnoreCase(p.lastName) &&
               gender.equalsIgnoreCase(p.gender);
    }
}

class Teacher extends Person {
    private String department;
    private String[] courses;

    public Teacher() {}

    public Teacher(String firstName, String lastName, String gender,
                   String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment()   { return department; }
    public String[] getCourses()    { return courses; }

    public void setDepartment(String department) { this.department = department; }
    public void setCourses(String[] courses)     { this.courses = courses; }

    @Override
    public String toString() {
        return "Teacher [" + getFirstName() + " " + getLastName() +
               ", " + getGender() +
               ", Dept: " + department +
               ", Courses: " + Arrays.toString(courses) + "]";
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;
        return super.equals(t) && department.equalsIgnoreCase(t.department) && Arrays.equals(courses, t.courses);
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Person p1 = new Person("Nigar", "Karimova", "Female");
        Person p2 = new Person("Nigar", "Karimova", "Female");
        Person p3 = new Person("Elvin", "Aliyev", "Male");

        System.out.println(p1);
        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 equals p3: " + p1.equals(p3));

        System.out.println();

        Teacher t1 = new Teacher("Rashad", "Mammadli", "Male", "Physics",
                        new String[]{"Mechanics", "Thermodynamics"});
        Teacher t2 = new Teacher("Rashad", "Mammadli", "Male", "Physics",
                        new String[]{"Mechanics", "Thermodynamics"});
        Teacher t3 = new Teacher("Sabina", "Huseynova", "Female", "Chemistry",
                        new String[]{"Organic Chemistry", "Biochemistry"});

        System.out.println(t1);
        System.out.println("t1 equals t2: " + t1.equals(t2));
        System.out.println("t1 equals t3: " + t1.equals(t3));
    }
}
