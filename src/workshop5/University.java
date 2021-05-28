package workshop5;

public class University extends Organization{
    public String name;

    public University() {
    }

    public University(int size, String name) {
        super(size);
        this.name = name;
    }

    @Override
    public void communicateByTool() {
        System.out.println("The university, people communicate by voice.");
    }

    public void enroll(){
        System.out.println("The registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees.");
    }

    public void educate(){
        System.out.println("Provide education at university standard.");
    }

    @Override
    public String toString() {
        return "Encourage the advancement and development of knowledge.";
    }
}