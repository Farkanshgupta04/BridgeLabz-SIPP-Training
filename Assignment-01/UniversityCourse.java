abstract class CourseType {
    String title;
    CourseType(String title) { this.title = title; }
    public String toString() { return title; }
}

class ExamCourse extends CourseType {
    ExamCourse(String title) { super(title); }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String title) { super(title); }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String title) { super(title); }
}

class Course<T extends CourseType> {
    T type;
    Course(T type) { this.type = type; }

    static void showAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses)
            System.out.println(course);
    }
}