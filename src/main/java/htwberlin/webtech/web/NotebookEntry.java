package htwberlin.webtech.web;

public class NotebookEntry{

    private String title;
    private String description;
    private String benutzer;


    public NotebookEntry(String title, String hersteller, String benutzer){
        this.title = title;
        this.description = hersteller;
        this.benutzer = benutzer;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String benutzer() {
        return benutzer;
    }
}
