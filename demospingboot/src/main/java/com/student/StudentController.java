package com.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {

	@GetMapping
	public List<Student> getStudents() {
		return List.of(
					 new Student(1L,"S Mohan", "smohan0305@gmail.com", LocalDate.of(2001, 5, 3), 22),
					 new Student(2L, "R Manoj", "rmanoh123@gmail.com", LocalDate.of(2000, 4, 18), 23)
				) ;
	}
}
