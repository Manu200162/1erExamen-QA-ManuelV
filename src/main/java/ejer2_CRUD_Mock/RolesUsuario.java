package ejer2_CRUD_Mock;

import java.util.Date;

public class RolesUsuario {

    Helpers helpers;

    public RolesUsuario(){
        helpers=new Helpers();
    }

    public RolesUsuario(Helpers objMock){
        helpers=objMock;
    }

    public String roles(String user, String pwd){
        String result;

        if(helpers.correctUser(user,pwd)){
            String permissions=helpers.givePermissions(user);
            result="PERMISSION ROLE : "+permissions+" - "+new Date();
        }else{
            result="Incorrect USER and PWD";
        }
        return result;
    }
}
