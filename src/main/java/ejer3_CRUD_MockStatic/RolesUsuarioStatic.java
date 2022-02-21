package ejer3_CRUD_MockStatic;

import java.util.Date;

public class RolesUsuarioStatic {



    public String roles(String user, String pwd){
        String result;

        if(HelepersStatic.correctUser(user,pwd)){
            String permissions= HelepersStatic.givePermissions(user);
            result="PERMISSION ROLE : "+permissions+" - "+new Date();
        }else{
            result="Incorrect USER and PWD";
        }
        return result;
    }
}
