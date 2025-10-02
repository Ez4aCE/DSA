import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        int total = 0;
        for(int i=1;i<=len;i++){
            String str = sc.nextLine();
            switch(str){
                case "Tetrahedron" : total +=4;break;
                case "Cube" : total +=6;break;
                case "Octahedron" : total+=8;break;
                case "Dodecahedron" : total+=12;break;
                case "Icosahedron" : total +=20;break;
            }
        }
        System.out.println(total);
    }
}
