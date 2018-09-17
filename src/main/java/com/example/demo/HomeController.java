package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import java.util.List;

@Controller
public class HomeController {

    @PersistenceUnit
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @GetMapping("/")
    public String home(Model model){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        TypedQuery<Film> query = entityManager.createQuery("select f from Film f", Film.class);
        List<Film> movies = query.getResultList();
        model.addAttribute("movies", movies);
        return "home";
    }
}
