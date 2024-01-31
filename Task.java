public class Task{
    private String title;
    private boolean status;

    public String getTitle(){
        return title;
    }

    public boolean taskStatus(){
        return status;
    }

    public Task(String title, boolean status) {
        this.title = title;
        this.status = status;
    }
}