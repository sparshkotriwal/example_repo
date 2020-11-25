
public class datareader {
    ArrayList<frame> arrayofframe = new ArrayList<frame>();
    int loc = 0;

public void readgps(File framety) throws FileNotFoundException {
    try {
    Scanner sc = new Scanner(framety);
    while(!sc.nextLine().contains("var t")) {
        sc.nextLine();
    }
    sc.nextLine();
    StringBuilder sb = new StringBuilder();
    boolean isDouble = false;











} catch (FileNotFoundException e) {
    e.printStackTrace();
}
}

public void read(File framety) throws FileNotFoundException {
    Scanner sc = new Scanner(framety);
    while(sc.nextLine().contains(";")) {
        sc.nextLine();
    }
    while(sc.hasNextLine() == true) {
    sc.nextLine();
    
    if(sc.hasNext()) {
        float offset = 0;
        String f_id = "";
        sc.next();
        offset = sc.nextFloat();
        sc.next(); 
        f_id = s.next(); 
        if(f_id.equals("0003")) {
            float data = 0;
            sc.next();
            String decode = sc.next();
            decode += sc.next();
            if(f_id.equals("0003")) {
                data = (Float) (Integer.parseInt(decode,16) * 0.5) - 2048;
            }
                    arrayofframe.add(new soln(data, f_id, offset));
        }
        
        if(f_id.equals("0245")) {
            float x = 0;
            float y = 0;
            float z = 0;
            sc.next();
            String x1 = sc.next();
            x1 += sc.next();
            sc.next();
            sc.next();
            String x2 = sc.next(); 
            String z1= sc.next(); 
            x = (float) ((float) (Integer.parseInt(x1,16) * 0.01) - 327.68);
            y = (float) ((float) (Integer.parseInt(x2,16) * 0.08) - 10.24);
            z = (float) ((float) (Integer.parseInt(z1,16) * 0.08) - 10.24);
            arrayofframe.add(new soln(x, y, z, f_id, offset));
        }
    }
    }
    sc.close();
}
}