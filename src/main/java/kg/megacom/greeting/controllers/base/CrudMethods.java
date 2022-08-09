package kg.megacom.greeting.controllers.base;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CrudMethods <T>{

    @GetMapping("/all")
    List<T> findAll();


    @GetMapping("/{id}")
    T getById(@PathVariable long id);


    @PostMapping("/{save}")
    T save(@RequestBody T t);


    @PutMapping
    T update (@RequestBody T t);


    @DeleteMapping("/remove/{id}")
    T remove(@PathVariable Long id);

    }



