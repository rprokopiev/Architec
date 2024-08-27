/*
 * Билет
 */

import java.sql.Date;


public class Ticket {

    private int id;
    private int customerId;
    private Date date;
    private String qrcode;
    private boolean enable = true;

    
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
    
    public int getId() {
        return id;
    }
    public int getCustomerId() {
        return customerId;
    }
    public Date getDate() {
        return date;
    }
    public String getQrcode() {
        return qrcode;
    }
    public boolean isEnable() {
        return enable;
    }
    
}
