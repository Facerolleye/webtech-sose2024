package htwberlin.webtech.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class Controller {

    @GetMapping(path = "/")
    public ModelAndView showHelloWorldPage(){
        return new ModelAndView("HelloWorld");
    }
    @GetMapping(path= "/Inventur")
        public List<NotebookEntry> NotebookInventur() {
            NotebookEntry entry = new NotebookEntry("Notebook Maurice", "Lenovo", "Maurice");
            NotebookEntry entry1 = new NotebookEntry("Notebook Lara", "HP", "Lara");
            NotebookEntry entry2 = new NotebookEntry("Notebook Max", "Microsoft", "Max");
            NotebookEntry entry3 = new NotebookEntry("Notebook Moritz", "DELL", "Moritz");
            NotebookEntry entry4 = new NotebookEntry("Notebook Anna", "Alienware", "Anna");
            return List.of(entry, entry1, entry2, entry3, entry4);
        }
    }

