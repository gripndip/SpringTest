package ru.malkov.MySpringBoot2Dbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.malkov.MySpringBoot2Dbase.service.DisciplineService;
import ru.malkov.MySpringBoot2Dbase.entity.Discipline;
import ru.malkov.MySpringBoot2Dbase.service.StudentService;
import ru.malkov.MySpringBoot2Dbase.entity.Student;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<?> allStudents() {
        try {
            List<Student> allStudents = studentService.getAllStudents();
            return new ResponseEntity<>(allStudents, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<?> getStudent(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<>(studentService.getStudent(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/students")
    public ResponseEntity<?> saveStudent(@RequestBody Student student) {
        try {
            return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/students")
    public ResponseEntity<?> updateStudent(@RequestBody Student student) {
        try {
            return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable("id") int id) {
        try {
            studentService.deleteStudent(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Autowired
    private DisciplineService disciplineService;

    @GetMapping("/disciplines")
    public ResponseEntity<?> allDisciplines() {
        try {
            List<Discipline> allDisciplines = disciplineService.getAllDisciplines();
            return new ResponseEntity<>(allDisciplines, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/disciplines/{id}")
    public ResponseEntity<?> getDiscipline(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<>(disciplineService.getDiscipline(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/disciplines")
    public ResponseEntity<?> saveDiscipline(@RequestBody Discipline discipline) {
        try {
            return new ResponseEntity<>(disciplineService.saveDiscipline(discipline), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/disciplines")
    public ResponseEntity<?> updateDiscipline(@RequestBody Discipline discipline) {
        try {
            return new ResponseEntity<>(disciplineService.saveDiscipline(discipline), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/disciplines/{id}")
    public ResponseEntity<?> deleteDiscipline(@PathVariable("id") int id) {
        try {
            disciplineService.deleteDiscipline(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}