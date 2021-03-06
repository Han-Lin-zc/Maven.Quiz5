package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    private List<Student> studentList;

    public ZipCodeWilmington() {
        this.studentList = new ArrayList<>();
    }

    public void enroll(Student student) {
        studentList.add(student);
    }

    public Boolean isEnrolled(Student student) {
        if (studentList.isEmpty()) return false;
        return studentList.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student student: studentList) {
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new LinkedHashMap<>();
        for (Student student : studentList) {
            map.put(student, student.getTotalStudyTime());
        }
        return map;
    }
}
