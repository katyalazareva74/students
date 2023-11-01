package students;

import java.util.*;

public class Main {
    /**
     * Метод  main формирует массив студентов, оставляет только студентов, у которых специализация "Информатика",
     * оставляет только  пять студентов, оставляет студентов, у которых средний балл выше чем 4,5, сортирует
     * выборку студентов по уменьшению среднего балла и выводит эту информацию в консоль.
     * @param args
     */
    public static void main(String[] args) {
        Student st1 = new Student("Иван", "Информатика", List.of(new Double[]{4.0, 5.0, 5.0, 5.0, 5.0}));
        Student st2 = new Student("Анна", "Математика", List.of(new Double[]{4.0, 4.0, 4.0, 4.0}));
        Student st3 = new Student("Мария", "Информатика", List.of(new Double[]{5.0, 5.0, 5.0, 5.0, 4.0}));
        Student st4 = new Student("Андрей", "Информатика", List.of(new Double[]{5.0, 5.0, 5.0, 5.0}));
        Student st5 = new Student("Сергей", "Математика", List.of(new Double[]{5.0, 4.0, 5.0, 3.0}));
        Student st6 = new Student("Светлана", "Информатика", List.of(new Double[]{4.0, 5.0, 5.0, 3.0}));
        Student st7 = new Student("Григорий", "Информатика", List.of(new Double[]{5.0, 4.0, 5.0, 5.0}));
        Student st8 = new Student("Константин", "Информатика", List.of(new Double[]{5.0, 5.0, 5.0, 5.0}));
        List<Student> students = Arrays.asList(st1, st2, st3, st4, st5, st6, st7, st8);
        students.stream()
                .filter(n -> n.getSpeciality().equals("Информатика"))
                .limit(5)
                .filter(n -> n.getAverageGrade() > 4.5)
                .sorted((a, b) -> Student.compare(a, b))
                .forEach(System.out::println);
    }

}
