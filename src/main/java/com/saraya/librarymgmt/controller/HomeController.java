//package com.saraya.librarymgmt.controller;
//
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController // = (@Controller + @ResponseBody)
//public class HomeController {
//
//    @GetMapping("/")// =@RequestMapping(value = "/", method = RequestMethod.GET)
//    public String hello(){
//        return "Hello From Restful Service";
//    }
//
//    @GetMapping("/person")
//    public Person getPerson(){
//        return new Person("Ous", "Capo");
//    }
//
//    @GetMapping(value = "/persons", produces = "application/html",
//        consumes = MediaType.APPLICATION_XML_VALUE)
//    public List<Person> getPersons(){
//        return List.of(
//                new Person("Ndeye", "Ndour"),
//                new Person("Anna", "Silva"),
//                new Person("Daouda", "Prezy")
//        );
//    }
//
//    //@GetMapping(value = "/person/adress", produces = "application/xml")
//    @GetMapping(value = "/person/adress", produces = MediaType.APPLICATION_XML_VALUE)
//    public Person getPersonWithAdress(){
//        return new Person(
//                "Sougou",
//                "Kagna",
//                new Adress(
//                        "Djibouti",
//                        "Djibouti"
//                ));
//    }
//
//}
