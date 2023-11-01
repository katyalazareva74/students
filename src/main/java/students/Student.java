package students;

import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private String speciality;
    private double averagegrade;
    private List<Double> grades;

    public Student(String name, String speciality, List<Double> grades) {
        this.name = name;
        this.speciality = speciality;
        this.grades = grades;
    }

    /**
     * Метод вычисляет средний балл студента
     * @return - возвращается средний балл студента
     */
    public double getAverageGrade() {
        double ag = this.grades.stream()
                .collect(Collectors.averagingDouble(p->p));
        setAveragegrade(ag);
        return ag;
    }

    @Override
    public String toString() {
        return String.format("Name: " + this.name + "  Speciality: " + this.speciality + "  AverageGrade: " + this.averagegrade);
    }

    /**
     * Метод сравнения двух студентов по величине среднего балла
     * @param - студент a
     * @param  - студент b
     * @return - если метод возвращает 0, то средние баллы студентов одинаковые;
     *         если метод возвращает отрицательное число, то средний балл студента a больше среднего балла студента b;
     *         если метод возвращает положительное число, то средний балл студента b больше среднего балла студента a;
     */
    public static int compare(Student a, Student b) {
        return Double.compare(b.getAveragegrade(), a.getAveragegrade());
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setAveragegrade(double averagegrade) {
        this.averagegrade = averagegrade;
    }

    public double getAveragegrade() {
        return averagegrade;
    }
}
