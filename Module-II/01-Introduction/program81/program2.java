import java.util.Scanner;

public class program2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("file name ");
        String fileName = sc.next();

        System.out.println("location");
        String location = sc.next();

        System.out.println("type  ");
        String type = sc.nextLine();

        System.out.println("size ");
        double size = sc.nextDouble();

     File f1 = new File(fileName, location, type, size);
     f1.display();

        sc.close();
    }
}




class File {
    String fileName ;
    String location;
    String type;
    double size;

    

    public File(String fileName, String location, String type, double size) {
        this.fileName = fileName;
        this.location = location;
        this.type = type;
        this.size = size;
    }



    void display(){
        System.out.println("File Name  : " + fileName);
        System.out.println("File location  : " + location);
        System.out.println("File type  : " + type);
        System.out.println("File size  : " + size );
          
    }

}
