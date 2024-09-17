import com.mycompany.parcial1.Principal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
    // TODO Adiciona tus pruebas unitarias aquí.
    // Los métodos deben estar anotados con la anotación @Test. Por ejemplo:
    //
    
//Prueba unitaria de Procesar pedido
    
    @Test
    public void agregarProducto() {
        boolean valorEsperado = true;
        Principal producto = new Principal();
        boolean valorActual = producto.agragarProducto(new Telefono());
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void agregarProducto() {
        boolean valorEsperado = false;
        Principal producto = new Principal();
        boolean valorActual = producto.agragarProducto(new Telefono());
        assertEquals(valorEsperado, valorActual);
    }
    
//Prueba unitaria de Eliminar Producto
    
    @Test
    public void eliminarProducto() {
        boolean valorEsperado = true;
        Principal producto = new Principal();
        int valorActual = producto.Eliminaproducto();
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void eliminarProducto() {
        boolean valorEsperado = false;
        Principal producto = new Principal();
        int valorActual = producto.Eliminaproducto();
        assertEquals(valorEsperado, valorActual);
    }
    
//Prueba unitaria de Procesar Pedido
    
    @Test
    public void Procesarpedido() {
        boolean valorEsperado = true ;
        Principal producto = new Principal();
        boolean valorActual = producto.Procesarpedido();
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void Procesarpedido() {
        boolean valorEsperado = false ;
        Principal producto = new Principal();
        boolean valorActual = producto.Procesarpedido();
        assertEquals(valorEsperado, valorActual);
    }
    
    //Prueba unitaria de Vender producto
    
    @Test
    public void venderproducto() {
        boolean valorEsperado = true ;
        Principal producto = new Principal();
        boolean valorActual = producto.venderproducto();
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void Procesarpedido() {
        boolean valorEsperado = false ;
        Principal producto = new Principal();
        boolean valorActual = producto.venderproducto();
        assertEquals(valorEsperado, valorActual);
    }
}
