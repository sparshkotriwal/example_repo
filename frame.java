
public class frame {
    private String fr_id;
    private float offset;
    private String unit;
    
    public frame(String fr_id, float offset, String unit) {
        this.fr_id = fr_id;
        this.offset = offset;
        this.unit = unit;
    }
    

    public String getFr_id() {
        return fr_id;
    }

    public void setFr_id(String fr_id) {
        this.fr_id = fr_id;
    }

    public float getOffset() {
        return offset;
    }

    public void setOffset(float offset) {
        this.offset = offset;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
   
    @Override
    public String toString() {
        return "frame" + "fr_id= " + fr_id + ", offset= " + offset + "unit= " + unit + "\n";
    }
    
    public String getun(String frameid, int n) {
            //if(frameid.equals("0003") && n==1)
            //return " ";
            //return " km/h";
            //return " m/s²";
            //return null;
	    return unit;
    }
}
