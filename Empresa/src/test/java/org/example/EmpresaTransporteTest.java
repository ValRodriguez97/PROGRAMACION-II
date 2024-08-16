package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmpresaTransporteTest {
    private static final Logger LOG = Logger.getLogger(EmpresaTransporteTest.class.getName());

    @Test
            public void EmpresaTransporteTest (){
                LOG.info("Inicio test creacion de empresa");
                var EmpresaTransporte = new EmpresaTransporte();
                var Usuario = new Usuario("Valentina", "19");
                var Propietario = new Propietario("Valentina", "123456789", "val@gmail.com", "123456");
                var VehiculoCarga = new VehiculoCarga(12, 4);
                var VehiculoTransporte = new VehiculoTransporte(34);
                assertEquals("Valentina", Usuario.getNombre());
                assertEquals("123456789", Propietario.getCedula());
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
}