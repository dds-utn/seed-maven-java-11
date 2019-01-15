package ar.edu.utn.frba.dds;

import org.junit.Assert;
import org.junit.Test;

public class SaludadorTest {

    @Test
    public void deberiaSaludarCorrectamente() {
        Assert.assertEquals(new Saludador().saludar(), "¡Hola Mundo!");
    }

}
