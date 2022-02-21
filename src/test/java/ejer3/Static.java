package ejer3;

import ejer2_CRUD_Mock.Helpers;
import ejer2_CRUD_Mock.RolesUsuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class Static {
    Helpers helpersMock= Mockito.mock(Helpers.class);
    MockedStatic<Helpers>mock=Mockito.mockStatic(Helpers.class);


    @Test
    public void verifyBadUser(){
        Mockito.when(helpersMock.correctUser("Manu123","aefsef")).thenReturn(false);
        RolesUsuario roles= new RolesUsuario(helpersMock);
        String expected="Incorrect USER and PWD";
        String actual=roles.roles("Manu123","aefsef");
        Assertions.assertEquals(expected,actual,"Error bad mmessage");
        Mockito.verify(helpersMock).correctUser("Manu123","aefsef");


    }
    @Test
    public void verifyCRUD(){
        Mockito.when(helpersMock.correctUser("Manu","manu123")).thenReturn(true);
        Mockito.when(helpersMock.givePermissions("Manu")).thenReturn("CRUD");
        RolesUsuario roles= new RolesUsuario(helpersMock);
        String expected="Mon Feb 21";
        String actual=roles.roles("Manu","manu123");
        Assertions.assertTrue(actual.contains(expected));
        Mockito.verify(helpersMock).correctUser("Manu","manu123");
        Mockito.verify(helpersMock).givePermissions("Manu");
    }

    @Test
    public void verifyCD(){
        Mockito.when(helpersMock.correctUser("Ale","ale123")).thenReturn(true);
        Mockito.when(helpersMock.givePermissions("Ale")).thenReturn("CD");
        RolesUsuario roles= new RolesUsuario(helpersMock);
        String expected="PERMISSION ROLE : CD - Mon Feb 21";
        String actual=roles.roles("Ale","ale123");
        Assertions.assertTrue(actual.contains(expected));
        Mockito.verify(helpersMock).correctUser("Ale","ale123");
        Mockito.verify(helpersMock).givePermissions("Ale");
    }


    @Test
    public void verifyCUD(){
        Mockito.when(helpersMock.correctUser("Lucky","lucky123")).thenReturn(true);
        Mockito.when(helpersMock.givePermissions("Lucky")).thenReturn("CUD");
        RolesUsuario roles= new RolesUsuario(helpersMock);
        String expected="PERMISSION ROLE : CUD - Mon Feb 21";
        String actual=roles.roles("Lucky","lucky123");
        Assertions.assertTrue(actual.contains(expected));
        Mockito.verify(helpersMock).correctUser("Lucky","lucky123");
        Mockito.verify(helpersMock).givePermissions("Lucky");
    }
}
