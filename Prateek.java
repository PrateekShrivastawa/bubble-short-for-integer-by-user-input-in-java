import java.util.*;
public class collegeprogram {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        String[] name = new String[n];
        Double[] rollno = new Double[n];
        Double[] cpi = new Double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the "+(i+1)+" name");
            name[i] = sc.next();
            System.out.println("Enter the "+(i+1)+ " roll no");
            rollno[i] = sc.nextDouble();
            System.out.println("Enter the "+(i+1)+" cpi");
            cpi[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (cpi[i]==cpi[j]) {
                    if (name[i].compareTo(name[j]) == 0) {
                        if (rollno[i] > rollno[j]) {

                            double t = rollno[i];
                            rollno[i] = rollno[j];
                            rollno[j] = t;

                        }
                    }
                    else if (name[i].compareTo(name[j]) > 0) {
                        double t = cpi[i];
                        cpi[i] = cpi[j];
                        cpi[j] = t;

                        t = rollno[i];
                        rollno[i] = rollno[j];
                        rollno[j] = t;

                        StringBuilder s = new StringBuilder(name[i]);
                        name[i] = new String(name[j]);
                        name[j] = new String(s);
                    }
                } else if (cpi[i] < cpi[j]) {
                    double t = cpi[i];
                    cpi[i] = cpi[j];
                    cpi[j] = t;

                    t = rollno[i];
                    rollno[i] = rollno[j];
                    rollno[j] = t;

                    StringBuilder s = new StringBuilder(name[i]);
                    name[i] = new String(name[j]);
                    name[j] = new String(s);
                }
            }
        }
        System.out.println("The sorted data is given below");
        for (int i=0;i<n;i++)
        {
            System.out.println(name[i]+" "+rollno[i]+" "+cpi[i]);
        }

    }
}
