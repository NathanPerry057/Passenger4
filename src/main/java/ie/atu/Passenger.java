package ie.atu;

public class Passenger {
    private String title;
    private String name;
    private int id;
    private int phone;
    private int age;
    public static String titleCheck(String title) {
        if(title.contains("MR"))
        {
            return title ;

        }
        else if (title.contains("MRS"))
        {
            return title;
        }
        else if (title.contains("MS"))
        {
            return title;
        }
        else {
            throw new IllegalArgumentException("Invalid input");
        }


    }
}
