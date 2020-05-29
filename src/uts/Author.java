package uts;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    void setEmail(String email){
        this.email = email;
    }
    char getGender(){
        return gender;
    }
    String viewAuthor(){
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Gender: " + this.gender);
        return "";
    }
}
