package pe.edu.upc.llamapaytf.dtos;

import java.sql.Timestamp;
import java.util.Date;

public class UsuarioInfoDTO {
    private int userId;
    private String nameUser;
    private String lastnameUser;
    private String emailUser;
    private Date birthdayUser;
    private Timestamp registrationDateUser;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastnameUser() {
        return lastnameUser;
    }

    public void setLastnameUser(String lastnameUser) {
        this.lastnameUser = lastnameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public Date getBirthdayUser() {
        return birthdayUser;
    }

    public void setBirthdayUser(Date birthdayUser) {
        this.birthdayUser = birthdayUser;
    }

    public Timestamp getRegistrationDateUser() {
        return registrationDateUser;
    }

    public void setRegistrationDateUser(Timestamp registrationDateUser) {
        this.registrationDateUser = registrationDateUser;
    }
}
