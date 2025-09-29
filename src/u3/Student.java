package u3;

public class Student{
    private String name;
    private String lastName;
    private String course;
    private int note;

    public void showInfo() {
        System.out.println("Name: "+this.name+ ", Last name: "+ this.lastName+", Course: "+this.course
        + ", Note: " + this.note
        );
    }

    public void incrementNote(int newNote){
        if(newNote >0 && newNote <11){
            this.note += newNote;
        }
    }
    public void decrementNote(int newNote){
        if(newNote >0 && newNote <11){
            this.note -= newNote;
        }
    }
    public void setName(String name, String lastName){
            this.name = name;
            this.lastName= lastName;

    }
}