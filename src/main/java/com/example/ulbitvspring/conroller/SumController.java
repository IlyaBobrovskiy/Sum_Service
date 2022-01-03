package com.example.ulbitvspring.conroller;

import com.example.ulbitvspring.Views;
import com.example.ulbitvspring.exception.SumNotFoundException;
import com.example.ulbitvspring.model.SumModel;
import com.example.ulbitvspring.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class SumController {

    @Autowired
    private SumService userService;

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody SumModel sumModel) {
        try {
            userService.add(sumModel.getName(), sumModel.getValue());
            return ResponseEntity.ok(new Views());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PostMapping("/remove")
    public ResponseEntity delete(@PathVariable String name) {
        try {
            userService.delete(name);
            return ResponseEntity.ok(new Views());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PostMapping("/sum")
    public ResponseEntity calcSum(@RequestBody String first, @RequestBody String second) throws SumNotFoundException {
        SumModel firstModel = userService.getOne(first);
        SumModel secondModel = userService.getOne(second);

        if (firstModel == null || secondModel == null) {
            throw new SumNotFoundException("Сущности не найдены");
        }

        Integer firstValue = firstModel.getValue();
        Integer secondValue = secondModel.getValue();

        if (firstValue == null || secondValue == null) {
            throw new SumNotFoundException("Значения не найдены");
        }

        try {
            return ResponseEntity.ok(new Views(firstValue + secondValue));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}

