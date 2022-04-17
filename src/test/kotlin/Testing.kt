import org.junit.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class Testing {

    @Test
    fun testTambah() {
        val data = SebuahClass()
        val hasil = data.menambah(2, 2)
        assertEquals(4, hasil)
    }

    @Test
    fun testArray() {
        val data = SebuahClass()
        val arr = data.sebuahArr()
        assertContains(arr, 4)
    }
}