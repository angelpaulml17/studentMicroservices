package com.example.examservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;
@RequestMapping("/exams")
@RestController
public class ExamController {
    private final List<Exam> exams = Arrays.asList(
            new Exam(1, 1, "English", 99 ),
            new Exam(2, 1, "Hindi", 89),
            new Exam(3, 2, "Maths", 99));

    @GetMapping
    public List<Exam> getAllExams() {
        return exams;
    }

    @GetMapping("/{id}")
    public Exam getExamById(@PathVariable int id) {
        return exams.stream()
                     .filter(order -> order.getId() == id)
                     .findFirst()
                     .orElseThrow(IllegalArgumentException::new);
    }
}