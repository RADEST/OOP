package Modul_8;
import java.util.Date;
public class OverloadingConstructor {
    int idUser;
    String userName;
    int level;
    Date lastLogin;
    public OverloadingConstructor(int idUser,String userName){
        this.idUser = idUser;
        this.userName = userName;
    }
}
